package com.example.CSIT314_Backend.Service;

import com.example.CSIT314_Backend.Exceptions.CustomException;
import com.example.CSIT314_Backend.Model.Vehicle;
import com.example.CSIT314_Backend.Repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleService implements VehicleServiceImpl {
    @Autowired
    private VehicleRepository vehicleRepository;

    public Vehicle getVehicleById(Long id) {
        return vehicleRepository.findById(id).orElseThrow(() -> new CustomException(id, "Request"));
    }

    public Vehicle createVehicle(Vehicle newVehicle){
        return vehicleRepository.save(newVehicle);
    }

    //Code is from https://spring.io/guides/tutorials/rest/
    public Vehicle updateVehicle(Vehicle vehicle, Long id){
        return vehicleRepository.findById(id)
                .map(vehicleMap -> {
                    vehicleMap.setVehicle(vehicle);
                    return vehicleRepository.save(vehicle);
                })
                .orElseGet(() -> {
                    vehicle.setId(id);
                    return vehicleRepository.save(vehicle);
                });
    }

    public void deleteVehicle(Long id){
        vehicleRepository.deleteById(id);
    }
}


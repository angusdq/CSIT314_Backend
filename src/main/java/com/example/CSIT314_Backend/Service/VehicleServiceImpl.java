package com.example.CSIT314_Backend.Service;

import com.example.CSIT314_Backend.Model.Vehicle;

public interface VehicleServiceImpl {
    public Vehicle getVehicleById(Long id);
    public Vehicle createVehicle(Vehicle newVehicle);
    public Vehicle updateVehicle(Vehicle vehicle, Long id);
    public void deleteVehicle(Long id);
}

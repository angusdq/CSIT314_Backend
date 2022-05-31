package com.example.CSIT314_Backend.Controller;

import com.example.CSIT314_Backend.Model.Vehicle;
import com.example.CSIT314_Backend.Service.VehicleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vehicle")
@CrossOrigin
public class VehicleController {

    @Autowired
    private VehicleServiceImpl vehicleService;

    @GetMapping("/getVehicle/{id}")
    Vehicle getVehicleById(@PathVariable Long id) {
        return vehicleService.getVehicleById(id);
    }

    @PostMapping("/addVehicle")
    Vehicle createVehicle(@RequestBody Vehicle newVehicle) {return vehicleService.createVehicle(newVehicle);
    }

    @PutMapping("/updateVehicle/{id}")
    Vehicle updateVehicle(@RequestBody Vehicle vehicle, @PathVariable Long id){
        return vehicleService.updateVehicle(vehicle, id);
    }

    @DeleteMapping("deleteVehicle/{id}")
    void deleteVehicle(@PathVariable Long id){
        vehicleService.deleteVehicle(id);
    }
}

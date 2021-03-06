package com.example.CSIT314_Backend.Service;

import com.example.CSIT314_Backend.Model.RegionalSupervisor;

public interface RegionalSupervisorServiceImpl {
    public RegionalSupervisor getRegionalSupervisorById(Long id);
    public RegionalSupervisor createRegionalSupervisor(RegionalSupervisor newRegionalSupervisor);
    public RegionalSupervisor updateRegionalSupervisor(RegionalSupervisor regionalSupervisor, Long id);
    public void deleteRegionalSupervisor(Long id);
}
package com.example.CSIT314_Backend.Service;

import com.example.CSIT314_Backend.Model.Professional;

import java.util.List;

public interface ProfessionalServiceImpl {
    public List<Professional> getAllProfessionals();
    public Professional getProfessionalById(Long id);
    public Professional getProfessionalFindEmail(String email);
    public Professional getProfessionalFindPassword(String password);
    public Professional createProfessional(Professional newProfessional);
    public Professional updateProfessional(Professional professional, Long id);
    public void deleteProfessional(Long id);
}

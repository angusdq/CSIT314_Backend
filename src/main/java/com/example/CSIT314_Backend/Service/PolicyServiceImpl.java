package com.example.CSIT314_Backend.Service;

import com.example.CSIT314_Backend.Model.Policy;

public interface PolicyServiceImpl {
    public Policy getPolicyById(Long id);
    public Policy createPolicy(Policy newPolicy);
    public Policy updatePolicy(Policy policy, Long id);
    public void deletePolicy(Long id);

}

package com.example.CSIT314_Backend.Service;

import com.example.CSIT314_Backend.Model.Membership;

public interface MembershipServiceImpl {
    public Membership getMembershipById(Long id);
    public Membership createMembership(Membership newMembership);
    public Membership updateMembership(Membership membership, Long id);
    public void deleteMembership(Long id);
}
package com.example.CSIT314_Backend.Controller;

import com.example.CSIT314_Backend.Model.Membership;
import com.example.CSIT314_Backend.Service.MembershipServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/membership")
@CrossOrigin
public class MembershipController {
    @Autowired
    private MembershipServiceImpl membershipService;

    @GetMapping("/getMembership/{id}")
    Membership getMembershipById(@PathVariable Long id) {
        return membershipService.getMembershipById(id);
    }

    @PostMapping("/addMembership")
    Membership createMembership(@RequestBody Membership newMemebrship) {return membershipService.createMembership(newMemebrship);
    }

    @PutMapping("/updateMembership/{id}")
    Membership updateMembership(@RequestBody Membership membership, @PathVariable Long id){
        return membershipService.updateMembership(membership, id);
    }

    @DeleteMapping("deleteMembership/{id}")
    void deleteMembership(@PathVariable Long id){
        membershipService.deleteMembership(id);
    }
}
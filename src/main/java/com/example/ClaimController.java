package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/claims")
public class ClaimController {

    @Autowired
    private ClaimServiceImpl claimServiceImpl;
    @Autowired
    private ClimService climService;
    @PostMapping
    public ResponseEntity<Claim> createClaim(@RequestBody ClaimRequest claim) {
        try {
            Claim savedClaim = claimServiceImpl.createClaim(claim);
            return new ResponseEntity<>(savedClaim, HttpStatus.CREATED);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/getPolicy/{policyId}")
    public com.insurance.PolicyOuterClass.PolicyResponse getPolicyDetails
            (@PathVariable String policyId) {

        return climService.getPolicyInfoUsingGrpc(policyId);
    }

}

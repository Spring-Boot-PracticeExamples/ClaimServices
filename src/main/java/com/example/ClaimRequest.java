package com.example;

import lombok.Data;

@Data
public class ClaimRequest {
    String id;
    String policyId;
    String claimAmount;
    String status;
}

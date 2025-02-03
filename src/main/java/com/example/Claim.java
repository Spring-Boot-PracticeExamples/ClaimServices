package com.example;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "claim")
@Data // Lombok generates getters, setters, equals, hashcode, and toString
public class Claim {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long claimId;

   @Column(name = "policy_id", nullable = false)
   private int policy_id;

   @Column(name = "claim_number", nullable = false)
   private String claimNumber;

   @Column(name = "claim_amount", nullable = false)
   private double claimAmount;

   @Column(name = "claim_date")
   private java.sql.Date claimDate;

   @Column(name = "claim_status")
   private String claimStatus;

   @Column(name = "coverage_type")
   private String coverageType;

   @Column(name = "policyholder_name")
   private String policyholderName;

   @Column(name = "premium_amount")
   private String premiumAmount;
}

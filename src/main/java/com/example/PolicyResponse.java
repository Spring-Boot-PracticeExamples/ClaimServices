package com.example;

import lombok.Data;

@Data
public class PolicyResponse {

   private int policyId;
   private String policyNumber;
   private String holderName;
   private double coverageAmount;
   private java.sql.Date startDate;
    private java.sql.Date endDate;
}

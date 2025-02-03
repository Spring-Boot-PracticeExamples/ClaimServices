package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ClaimServiceImpl {

    @Autowired
    private ClaimRepository claimRepository;

    @Autowired
    private RestTemplate restTemplate;

    private static final String POLICY_SERVICE_URL = "http://localhost:8081/api/policies";  // com.example.Policy Service URL

    public Claim createClaim(ClaimRequest cr) {
        String policyId = String.valueOf(cr.getPolicyId());
        Claim claim=new Claim();
        claim.setClaimId(Long.parseLong(cr.policyId));
        claim.setClaimStatus(cr.getStatus());
        claim.setClaimAmount(Double.parseDouble(cr.getClaimAmount()));
        claim.setPolicy_id(Integer.parseInt(policyId));
        ResponseEntity<PolicyResponse> policyResponse = restTemplate.getForEntity(POLICY_SERVICE_URL + "/" + policyId, PolicyResponse.class);

        if (policyResponse.getStatusCode().is2xxSuccessful()) {
            PolicyResponse policy = policyResponse.getBody();
            if (policy != null) {
                claim.setClaimStatus("Pending");
                return claimRepository.save(claim);
            }
        }

        throw new IllegalArgumentException("com.example.Policy not found!");
    }
}

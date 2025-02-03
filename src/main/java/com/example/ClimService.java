package com.example;

import com.insurance.PolicyOuterClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClimService {

    private final com.insurance.PolicyServiceGrpc.PolicyServiceBlockingStub policyServiceBlockingStub;

    @Autowired
    public ClimService(com.insurance.PolicyServiceGrpc.PolicyServiceBlockingStub policyServiceBlockingStub) {
        this.policyServiceBlockingStub = policyServiceBlockingStub;
    }

    public PolicyOuterClass.PolicyResponse getPolicyInfoUsingGrpc(String policyId) {
        PolicyOuterClass.PolicyRequest request = PolicyOuterClass.PolicyRequest.newBuilder()
                .setPolicyId(policyId)
                .build();
        PolicyOuterClass.PolicyResponse response = policyServiceBlockingStub.getPolicy(request);
        return response;
    }

}

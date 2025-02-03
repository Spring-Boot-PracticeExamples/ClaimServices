package com.example;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GrpcClientConfig {

    @Bean
    public ManagedChannel managedChannel() {
        return ManagedChannelBuilder.forAddress("localhost", 9090)  // Ensure this matches your gRPC server port
                .usePlaintext() // For local development, disable TLS
                .build();
    }

    @Bean
    public com.insurance.PolicyServiceGrpc.PolicyServiceBlockingStub
    policyServiceBlockingStub(ManagedChannel managedChannel) {
        return com.insurance.PolicyServiceGrpc.newBlockingStub(managedChannel);
    }
}

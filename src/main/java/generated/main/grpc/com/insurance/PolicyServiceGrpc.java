package com.insurance;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.25.0)",
    comments = "Source: policy.proto")
public final class PolicyServiceGrpc {

  private PolicyServiceGrpc() {}

  public static final String SERVICE_NAME = "com.insurance.PolicyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.insurance.PolicyOuterClass.PolicyRequest,
      com.insurance.PolicyOuterClass.PolicyResponse> getGetPolicyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPolicy",
      requestType = com.insurance.PolicyOuterClass.PolicyRequest.class,
      responseType = com.insurance.PolicyOuterClass.PolicyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.insurance.PolicyOuterClass.PolicyRequest,
      com.insurance.PolicyOuterClass.PolicyResponse> getGetPolicyMethod() {
    io.grpc.MethodDescriptor<com.insurance.PolicyOuterClass.PolicyRequest, com.insurance.PolicyOuterClass.PolicyResponse> getGetPolicyMethod;
    if ((getGetPolicyMethod = PolicyServiceGrpc.getGetPolicyMethod) == null) {
      synchronized (PolicyServiceGrpc.class) {
        if ((getGetPolicyMethod = PolicyServiceGrpc.getGetPolicyMethod) == null) {
          PolicyServiceGrpc.getGetPolicyMethod = getGetPolicyMethod =
              io.grpc.MethodDescriptor.<com.insurance.PolicyOuterClass.PolicyRequest, com.insurance.PolicyOuterClass.PolicyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.insurance.PolicyOuterClass.PolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.insurance.PolicyOuterClass.PolicyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PolicyServiceMethodDescriptorSupplier("GetPolicy"))
              .build();
        }
      }
    }
    return getGetPolicyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.insurance.PolicyOuterClass.Policy,
      com.insurance.PolicyOuterClass.PolicyResponse> getCreatePolicyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePolicy",
      requestType = com.insurance.PolicyOuterClass.Policy.class,
      responseType = com.insurance.PolicyOuterClass.PolicyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.insurance.PolicyOuterClass.Policy,
      com.insurance.PolicyOuterClass.PolicyResponse> getCreatePolicyMethod() {
    io.grpc.MethodDescriptor<com.insurance.PolicyOuterClass.Policy, com.insurance.PolicyOuterClass.PolicyResponse> getCreatePolicyMethod;
    if ((getCreatePolicyMethod = PolicyServiceGrpc.getCreatePolicyMethod) == null) {
      synchronized (PolicyServiceGrpc.class) {
        if ((getCreatePolicyMethod = PolicyServiceGrpc.getCreatePolicyMethod) == null) {
          PolicyServiceGrpc.getCreatePolicyMethod = getCreatePolicyMethod =
              io.grpc.MethodDescriptor.<com.insurance.PolicyOuterClass.Policy, com.insurance.PolicyOuterClass.PolicyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.insurance.PolicyOuterClass.Policy.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.insurance.PolicyOuterClass.PolicyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PolicyServiceMethodDescriptorSupplier("CreatePolicy"))
              .build();
        }
      }
    }
    return getCreatePolicyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PolicyServiceStub newStub(io.grpc.Channel channel) {
    return new PolicyServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PolicyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PolicyServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PolicyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PolicyServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class PolicyServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getPolicy(com.insurance.PolicyOuterClass.PolicyRequest request,
        io.grpc.stub.StreamObserver<com.insurance.PolicyOuterClass.PolicyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPolicyMethod(), responseObserver);
    }

    /**
     */
    public void createPolicy(com.insurance.PolicyOuterClass.Policy request,
        io.grpc.stub.StreamObserver<com.insurance.PolicyOuterClass.PolicyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreatePolicyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetPolicyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.insurance.PolicyOuterClass.PolicyRequest,
                com.insurance.PolicyOuterClass.PolicyResponse>(
                  this, METHODID_GET_POLICY)))
          .addMethod(
            getCreatePolicyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.insurance.PolicyOuterClass.Policy,
                com.insurance.PolicyOuterClass.PolicyResponse>(
                  this, METHODID_CREATE_POLICY)))
          .build();
    }
  }

  /**
   */
  public static final class PolicyServiceStub extends io.grpc.stub.AbstractStub<PolicyServiceStub> {
    private PolicyServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PolicyServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PolicyServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PolicyServiceStub(channel, callOptions);
    }

    /**
     */
    public void getPolicy(com.insurance.PolicyOuterClass.PolicyRequest request,
        io.grpc.stub.StreamObserver<com.insurance.PolicyOuterClass.PolicyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPolicyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createPolicy(com.insurance.PolicyOuterClass.Policy request,
        io.grpc.stub.StreamObserver<com.insurance.PolicyOuterClass.PolicyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreatePolicyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PolicyServiceBlockingStub extends io.grpc.stub.AbstractStub<PolicyServiceBlockingStub> {
    private PolicyServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PolicyServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PolicyServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PolicyServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.insurance.PolicyOuterClass.PolicyResponse getPolicy(com.insurance.PolicyOuterClass.PolicyRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPolicyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.insurance.PolicyOuterClass.PolicyResponse createPolicy(com.insurance.PolicyOuterClass.Policy request) {
      return blockingUnaryCall(
          getChannel(), getCreatePolicyMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PolicyServiceFutureStub extends io.grpc.stub.AbstractStub<PolicyServiceFutureStub> {
    private PolicyServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PolicyServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PolicyServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PolicyServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.insurance.PolicyOuterClass.PolicyResponse> getPolicy(
        com.insurance.PolicyOuterClass.PolicyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPolicyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.insurance.PolicyOuterClass.PolicyResponse> createPolicy(
        com.insurance.PolicyOuterClass.Policy request) {
      return futureUnaryCall(
          getChannel().newCall(getCreatePolicyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_POLICY = 0;
  private static final int METHODID_CREATE_POLICY = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PolicyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PolicyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_POLICY:
          serviceImpl.getPolicy((com.insurance.PolicyOuterClass.PolicyRequest) request,
              (io.grpc.stub.StreamObserver<com.insurance.PolicyOuterClass.PolicyResponse>) responseObserver);
          break;
        case METHODID_CREATE_POLICY:
          serviceImpl.createPolicy((com.insurance.PolicyOuterClass.Policy) request,
              (io.grpc.stub.StreamObserver<com.insurance.PolicyOuterClass.PolicyResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PolicyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PolicyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.insurance.PolicyOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PolicyService");
    }
  }

  private static final class PolicyServiceFileDescriptorSupplier
      extends PolicyServiceBaseDescriptorSupplier {
    PolicyServiceFileDescriptorSupplier() {}
  }

  private static final class PolicyServiceMethodDescriptorSupplier
      extends PolicyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PolicyServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PolicyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PolicyServiceFileDescriptorSupplier())
              .addMethod(getGetPolicyMethod())
              .addMethod(getCreatePolicyMethod())
              .build();
        }
      }
    }
    return result;
  }
}

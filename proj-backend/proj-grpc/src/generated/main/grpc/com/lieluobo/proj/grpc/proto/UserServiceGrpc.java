package com.lieluobo.proj.grpc.proto;

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
    value = "by gRPC proto compiler (version 1.9.1)",
    comments = "Source: user.proto")
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final String SERVICE_NAME = "user.UserService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getAddMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.lieluobo.proj.grpc.proto.AddUserRequest,
      com.lieluobo.proj.grpc.proto.AddUserResponse> METHOD_ADD = getAddMethod();

  private static volatile io.grpc.MethodDescriptor<com.lieluobo.proj.grpc.proto.AddUserRequest,
      com.lieluobo.proj.grpc.proto.AddUserResponse> getAddMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.lieluobo.proj.grpc.proto.AddUserRequest,
      com.lieluobo.proj.grpc.proto.AddUserResponse> getAddMethod() {
    io.grpc.MethodDescriptor<com.lieluobo.proj.grpc.proto.AddUserRequest, com.lieluobo.proj.grpc.proto.AddUserResponse> getAddMethod;
    if ((getAddMethod = UserServiceGrpc.getAddMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getAddMethod = UserServiceGrpc.getAddMethod) == null) {
          UserServiceGrpc.getAddMethod = getAddMethod = 
              io.grpc.MethodDescriptor.<com.lieluobo.proj.grpc.proto.AddUserRequest, com.lieluobo.proj.grpc.proto.AddUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user.UserService", "Add"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lieluobo.proj.grpc.proto.AddUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lieluobo.proj.grpc.proto.AddUserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("Add"))
                  .build();
          }
        }
     }
     return getAddMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetAllMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.lieluobo.proj.grpc.proto.GetAllUserRequest,
      com.lieluobo.proj.grpc.proto.GetAllUserResponse> METHOD_GET_ALL = getGetAllMethod();

  private static volatile io.grpc.MethodDescriptor<com.lieluobo.proj.grpc.proto.GetAllUserRequest,
      com.lieluobo.proj.grpc.proto.GetAllUserResponse> getGetAllMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.lieluobo.proj.grpc.proto.GetAllUserRequest,
      com.lieluobo.proj.grpc.proto.GetAllUserResponse> getGetAllMethod() {
    io.grpc.MethodDescriptor<com.lieluobo.proj.grpc.proto.GetAllUserRequest, com.lieluobo.proj.grpc.proto.GetAllUserResponse> getGetAllMethod;
    if ((getGetAllMethod = UserServiceGrpc.getGetAllMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetAllMethod = UserServiceGrpc.getGetAllMethod) == null) {
          UserServiceGrpc.getGetAllMethod = getGetAllMethod = 
              io.grpc.MethodDescriptor.<com.lieluobo.proj.grpc.proto.GetAllUserRequest, com.lieluobo.proj.grpc.proto.GetAllUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user.UserService", "GetAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lieluobo.proj.grpc.proto.GetAllUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lieluobo.proj.grpc.proto.GetAllUserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetAll"))
                  .build();
          }
        }
     }
     return getGetAllMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    return new UserServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class UserServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void add(com.lieluobo.proj.grpc.proto.AddUserRequest request,
        io.grpc.stub.StreamObserver<com.lieluobo.proj.grpc.proto.AddUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddMethod(), responseObserver);
    }

    /**
     */
    public void getAll(com.lieluobo.proj.grpc.proto.GetAllUserRequest request,
        io.grpc.stub.StreamObserver<com.lieluobo.proj.grpc.proto.GetAllUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.lieluobo.proj.grpc.proto.AddUserRequest,
                com.lieluobo.proj.grpc.proto.AddUserResponse>(
                  this, METHODID_ADD)))
          .addMethod(
            getGetAllMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.lieluobo.proj.grpc.proto.GetAllUserRequest,
                com.lieluobo.proj.grpc.proto.GetAllUserResponse>(
                  this, METHODID_GET_ALL)))
          .build();
    }
  }

  /**
   */
  public static final class UserServiceStub extends io.grpc.stub.AbstractStub<UserServiceStub> {
    private UserServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     */
    public void add(com.lieluobo.proj.grpc.proto.AddUserRequest request,
        io.grpc.stub.StreamObserver<com.lieluobo.proj.grpc.proto.AddUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAll(com.lieluobo.proj.grpc.proto.GetAllUserRequest request,
        io.grpc.stub.StreamObserver<com.lieluobo.proj.grpc.proto.GetAllUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserServiceBlockingStub extends io.grpc.stub.AbstractStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.lieluobo.proj.grpc.proto.AddUserResponse add(com.lieluobo.proj.grpc.proto.AddUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.lieluobo.proj.grpc.proto.GetAllUserResponse getAll(com.lieluobo.proj.grpc.proto.GetAllUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserServiceFutureStub extends io.grpc.stub.AbstractStub<UserServiceFutureStub> {
    private UserServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lieluobo.proj.grpc.proto.AddUserResponse> add(
        com.lieluobo.proj.grpc.proto.AddUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lieluobo.proj.grpc.proto.GetAllUserResponse> getAll(
        com.lieluobo.proj.grpc.proto.GetAllUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD = 0;
  private static final int METHODID_GET_ALL = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD:
          serviceImpl.add((com.lieluobo.proj.grpc.proto.AddUserRequest) request,
              (io.grpc.stub.StreamObserver<com.lieluobo.proj.grpc.proto.AddUserResponse>) responseObserver);
          break;
        case METHODID_GET_ALL:
          serviceImpl.getAll((com.lieluobo.proj.grpc.proto.GetAllUserRequest) request,
              (io.grpc.stub.StreamObserver<com.lieluobo.proj.grpc.proto.GetAllUserResponse>) responseObserver);
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

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.lieluobo.proj.grpc.proto.UserProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getAddMethod())
              .addMethod(getGetAllMethod())
              .build();
        }
      }
    }
    return result;
  }
}

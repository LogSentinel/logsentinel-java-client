package com.logsentinel.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * LogService definition
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: LogService.proto")
public final class LogServiceGrpc {

  private LogServiceGrpc() {}

  public static final String SERVICE_NAME = "logsentinel.grpc.LogService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<LogServiceOuterClass.LogEntry,
      LogServiceOuterClass.LogResponse> getLogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "log",
      requestType = LogServiceOuterClass.LogEntry.class,
      responseType = LogServiceOuterClass.LogResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<LogServiceOuterClass.LogEntry,
      LogServiceOuterClass.LogResponse> getLogMethod() {
    io.grpc.MethodDescriptor<LogServiceOuterClass.LogEntry, LogServiceOuterClass.LogResponse> getLogMethod;
    if ((getLogMethod = LogServiceGrpc.getLogMethod) == null) {
      synchronized (LogServiceGrpc.class) {
        if ((getLogMethod = LogServiceGrpc.getLogMethod) == null) {
          LogServiceGrpc.getLogMethod = getLogMethod =
              io.grpc.MethodDescriptor.<LogServiceOuterClass.LogEntry, LogServiceOuterClass.LogResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "log"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  LogServiceOuterClass.LogEntry.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  LogServiceOuterClass.LogResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogServiceMethodDescriptorSupplier("log"))
              .build();
        }
      }
    }
    return getLogMethod;
  }

  private static volatile io.grpc.MethodDescriptor<LogServiceOuterClass.BatchLogRequest,
      LogServiceOuterClass.LogResponse> getLogBatchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "logBatch",
      requestType = LogServiceOuterClass.BatchLogRequest.class,
      responseType = LogServiceOuterClass.LogResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<LogServiceOuterClass.BatchLogRequest,
      LogServiceOuterClass.LogResponse> getLogBatchMethod() {
    io.grpc.MethodDescriptor<LogServiceOuterClass.BatchLogRequest, LogServiceOuterClass.LogResponse> getLogBatchMethod;
    if ((getLogBatchMethod = LogServiceGrpc.getLogBatchMethod) == null) {
      synchronized (LogServiceGrpc.class) {
        if ((getLogBatchMethod = LogServiceGrpc.getLogBatchMethod) == null) {
          LogServiceGrpc.getLogBatchMethod = getLogBatchMethod =
              io.grpc.MethodDescriptor.<LogServiceOuterClass.BatchLogRequest, LogServiceOuterClass.LogResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "logBatch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  LogServiceOuterClass.BatchLogRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  LogServiceOuterClass.LogResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogServiceMethodDescriptorSupplier("logBatch"))
              .build();
        }
      }
    }
    return getLogBatchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<LogServiceOuterClass.FlowEntry,
      LogServiceOuterClass.LogResponse> getLogFlowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "logFlow",
      requestType = LogServiceOuterClass.FlowEntry.class,
      responseType = LogServiceOuterClass.LogResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<LogServiceOuterClass.FlowEntry,
      LogServiceOuterClass.LogResponse> getLogFlowMethod() {
    io.grpc.MethodDescriptor<LogServiceOuterClass.FlowEntry, LogServiceOuterClass.LogResponse> getLogFlowMethod;
    if ((getLogFlowMethod = LogServiceGrpc.getLogFlowMethod) == null) {
      synchronized (LogServiceGrpc.class) {
        if ((getLogFlowMethod = LogServiceGrpc.getLogFlowMethod) == null) {
          LogServiceGrpc.getLogFlowMethod = getLogFlowMethod =
              io.grpc.MethodDescriptor.<LogServiceOuterClass.FlowEntry, LogServiceOuterClass.LogResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "logFlow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  LogServiceOuterClass.FlowEntry.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  LogServiceOuterClass.LogResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogServiceMethodDescriptorSupplier("logFlow"))
              .build();
        }
      }
    }
    return getLogFlowMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LogServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogServiceStub>() {
        @Override
        public LogServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogServiceStub(channel, callOptions);
        }
      };
    return LogServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LogServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogServiceBlockingStub>() {
        @Override
        public LogServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogServiceBlockingStub(channel, callOptions);
        }
      };
    return LogServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LogServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogServiceFutureStub>() {
        @Override
        public LogServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogServiceFutureStub(channel, callOptions);
        }
      };
    return LogServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * LogService definition
   * </pre>
   */
  public static abstract class LogServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void log(LogServiceOuterClass.LogEntry request,
                    io.grpc.stub.StreamObserver<LogServiceOuterClass.LogResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLogMethod(), responseObserver);
    }

    /**
     */
    public void logBatch(LogServiceOuterClass.BatchLogRequest request,
                         io.grpc.stub.StreamObserver<LogServiceOuterClass.LogResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLogBatchMethod(), responseObserver);
    }

    /**
     */
    public void logFlow(LogServiceOuterClass.FlowEntry request,
                        io.grpc.stub.StreamObserver<LogServiceOuterClass.LogResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLogFlowMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLogMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                LogServiceOuterClass.LogEntry,
                LogServiceOuterClass.LogResponse>(
                  this, METHODID_LOG)))
          .addMethod(
            getLogBatchMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                LogServiceOuterClass.BatchLogRequest,
                LogServiceOuterClass.LogResponse>(
                  this, METHODID_LOG_BATCH)))
          .addMethod(
            getLogFlowMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                LogServiceOuterClass.FlowEntry,
                LogServiceOuterClass.LogResponse>(
                  this, METHODID_LOG_FLOW)))
          .build();
    }
  }

  /**
   * <pre>
   * LogService definition
   * </pre>
   */
  public static final class LogServiceStub extends io.grpc.stub.AbstractAsyncStub<LogServiceStub> {
    private LogServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected LogServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogServiceStub(channel, callOptions);
    }

    /**
     */
    public void log(LogServiceOuterClass.LogEntry request,
                    io.grpc.stub.StreamObserver<LogServiceOuterClass.LogResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLogMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void logBatch(LogServiceOuterClass.BatchLogRequest request,
                         io.grpc.stub.StreamObserver<LogServiceOuterClass.LogResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLogBatchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void logFlow(LogServiceOuterClass.FlowEntry request,
                        io.grpc.stub.StreamObserver<LogServiceOuterClass.LogResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLogFlowMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * LogService definition
   * </pre>
   */
  public static final class LogServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<LogServiceBlockingStub> {
    private LogServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected LogServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public LogServiceOuterClass.LogResponse log(LogServiceOuterClass.LogEntry request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLogMethod(), getCallOptions(), request);
    }

    /**
     */
    public LogServiceOuterClass.LogResponse logBatch(LogServiceOuterClass.BatchLogRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLogBatchMethod(), getCallOptions(), request);
    }

    /**
     */
    public LogServiceOuterClass.LogResponse logFlow(LogServiceOuterClass.FlowEntry request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLogFlowMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * LogService definition
   * </pre>
   */
  public static final class LogServiceFutureStub extends io.grpc.stub.AbstractFutureStub<LogServiceFutureStub> {
    private LogServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected LogServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<LogServiceOuterClass.LogResponse> log(
        LogServiceOuterClass.LogEntry request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLogMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<LogServiceOuterClass.LogResponse> logBatch(
        LogServiceOuterClass.BatchLogRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLogBatchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<LogServiceOuterClass.LogResponse> logFlow(
        LogServiceOuterClass.FlowEntry request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLogFlowMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOG = 0;
  private static final int METHODID_LOG_BATCH = 1;
  private static final int METHODID_LOG_FLOW = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LogServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LogServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOG:
          serviceImpl.log((LogServiceOuterClass.LogEntry) request,
              (io.grpc.stub.StreamObserver<LogServiceOuterClass.LogResponse>) responseObserver);
          break;
        case METHODID_LOG_BATCH:
          serviceImpl.logBatch((LogServiceOuterClass.BatchLogRequest) request,
              (io.grpc.stub.StreamObserver<LogServiceOuterClass.LogResponse>) responseObserver);
          break;
        case METHODID_LOG_FLOW:
          serviceImpl.logFlow((LogServiceOuterClass.FlowEntry) request,
              (io.grpc.stub.StreamObserver<LogServiceOuterClass.LogResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class LogServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LogServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return LogServiceOuterClass.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LogService");
    }
  }

  private static final class LogServiceFileDescriptorSupplier
      extends LogServiceBaseDescriptorSupplier {
    LogServiceFileDescriptorSupplier() {}
  }

  private static final class LogServiceMethodDescriptorSupplier
      extends LogServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LogServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (LogServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LogServiceFileDescriptorSupplier())
              .addMethod(getLogMethod())
              .addMethod(getLogBatchMethod())
              .addMethod(getLogFlowMethod())
              .build();
        }
      }
    }
    return result;
  }
}

package helloworld.grpc;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;

@GRpcService
public class HelloworldEndpoint extends HelloworldGrpcServiceGrpc.HelloworldGrpcServiceImplBase {
    @Override
    public void send(HelloworldGrpcRequest request, StreamObserver<HelloworldGrpcReply> responseObserver) {
        responseObserver.onNext(HelloworldGrpcReply.newBuilder().setMessage("Hello " + request.getName()).build());
        responseObserver.onCompleted();
    }
}

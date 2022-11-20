package helloworld.grpc;

import io.grpc.BindableService;
import io.grpc.protobuf.services.ProtoReflectionService;
import io.micronaut.context.annotation.Factory;
import io.micronaut.context.annotation.Requires;
import jakarta.inject.Singleton;

@Factory
class ServerConfiguration {
    @Singleton
    @Requires(property = "grpc.server.reflection.enabled", value = "true")
    BindableService reflectionService() {
        return ProtoReflectionService.newInstance();
    }

}

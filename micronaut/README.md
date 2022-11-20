# Micronaut Hello World GRPC server

## Running the server
`./gradlew run`

## Enable newrelic monitoring
To enable the newrelic agent, provide a gradle property called `newrelic_license_key` with the value of the newrelic license associated to a newrelic account

## Test the server
`grpcurl -plaintext -import-path ./src/main/proto -proto helloworldGrpc.proto -d '{"name":"Test"}' localhost:50051 helloworld.grpc.HelloworldGrpcService/send`

## Build a native image (No newrelic agent)
1. Install graalVM (Java 17 version):
`sdk install java 22.1.0.r17-grl`
2. Switch to graalVM and install native image:
`sdk use java 22.1.0.r17-grl && gu install native-image`
3. Build a native executable: 
`./gradlew nativeCompile`
4. Run the executable: 
`build/native/nativeCompile/mn-graalvm-application` (and check the startup time!!)
5. Run the grpcurl command above
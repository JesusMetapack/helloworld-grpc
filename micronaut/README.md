# Micronaut Hello World GRPC server

## Runnin the server
`./gradlew run`

## Enable newrelic monitoring
Provide a gradle property called `newrelic_license_key` with the value of the newrelic license associated to a newrelic account

## Test the server
`grpcurl -plaintext -import-path ./src/main/proto -proto helloworldGrpc.proto -d '{"name":"Test"}' localhost:50051 helloworld.grpc.HelloworldGrpcService/send`

# Springboot Hello World Spring MVC REST server

## Running the server
`./gradlew bootRun`

## Enable newrelic monitoring
To enable the newrelic agent, provide a gradle property called `newrelic_license_key` with the value of the newrelic license associated to a newrelic account

## Test the server
`curl -d '{"name":"Test"}' -H "Content-type: application/json" -X POST http://localhost:8080/greeting`
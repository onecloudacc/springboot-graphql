# springboot-graphql
This is a very basic configuration for springboot and graphql


springboot-graphql
This is a very basic configuration for springboot and graphql

i) Sample Graphql request in postman:

http://localhost:8080/graphql Request:

{

"query" : "{fetchName(id: "1234") {firstName lastName} }"

} ii) Sample Graphql request in graphiql UI: Launch : http://localhost:8080/graphiql

{ fetchName(id: "1234") { firstName lastName } }

Response:

{ "data": { "fetchName": { "firstName": "fname", "lastName": "Lname" } } }

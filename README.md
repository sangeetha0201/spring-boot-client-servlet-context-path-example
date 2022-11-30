# spring-boot-client-servlet-context-path-example
Demonstrating SBA client registration issue when changing contextPath with ServletRegistrationBean........

### Steps to run  ...
* Start Spring Boot Admin Server on port 8080
#### To validate issue
* Start `mvn spring-boot:run`
  * Spring Boot Admin should not be able to access the actuator endpoints for this service
  * Validate health actuator works serves up on `http://localhost:8081/springHelloWorld/actuator/health` 
* Uncomment line 7 of the application.properties file and restart
  * Spring Boot Admin should now be able to access the service  

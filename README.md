# Add to application.properties
server.port=8080
management.server.port=8090
management.endpoints.web.exposure.include=*
management.endpoint.shutdown.enabled=true

app.build.version=@version@
app.java.version=@java.version@

EndPoints to visit once app started:
http://localhost:8090/actuator
http://localhost:8090/actuator/health shows the health of the application. UP/Down disk space ...
http://localhost:8090/actuator/metrics shows the list of available metric
http://localhost:8090/actuator/metrics/{metricName} from the /actuator/metrics
http://localhost:8090/actuator/metrics/jvm.memory.used
http://localhost:8090/actuator/beans available javaBeans
http://localhost:8090/actuator/env gives info about the environement where the application runs (OS, Classpath, javaVersion...)
http://localhost:8090/actuator/info gives personnalized metrics By Implementing InfoContributor Interface. See BuildInfoContributor

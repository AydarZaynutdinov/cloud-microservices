# cloud-microservices

This is study examples to learn spring-cloud framework. At now it contains [cloud-config](https://github.com/AydarZaynutdinov/cloud-microservices/tree/master/cloud-config) 
and [cloud-eureka](https://github.com/AydarZaynutdinov/cloud-microservices/tree/master/cloud-eureka) projects.



## cloud-config
This is a study example to learn spring-cloud-config framework. It contains server `lab-3-server` and one client `lab-3-client`. The server application uses 
[ConfigData repository](https://github.com/AydarZaynutdinov/ConfigData) to get properties for client.


## cloud-eureka
This is a study example to learn spring-cloud-eureka framework. It contains server `lab-4-eureka-server` and 2 kinds of clients `lab-4-sentence` and `lab-4-words`. 

### lab-4-sentence
This client create sentence using 5 instance of `lab-4-words` project. This one also use `lab-3-server` to get his own properties from `application.properties` file.
### lab-4-words
This client randomly generates word associated with his properties which he gets from `lab-3-server` by his profile.

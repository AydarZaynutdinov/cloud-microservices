# cloud-microservices

This is study examples to learn spring-cloud framework. At now it contains 
[cloud-config](https://github.com/AydarZaynutdinov/cloud-microservices/tree/master/cloud-config),
[cloud-eureka](https://github.com/AydarZaynutdinov/cloud-microservices/tree/master/cloud-eureka) and 
[cloud-ribbon](https://github.com/AydarZaynutdinov/cloud-microservices/tree/master/cloud-ribbon) projects.



### cloud-config
This is a study example to learn spring-cloud-config framework. It contains server `lab-3-server` and 
one client `lab-3-client`. The server application uses [ConfigData repository](https://github.com/AydarZaynutdinov/ConfigData) 
to get properties for client.


### cloud-eureka
This is a study example to learn spring-cloud-eureka framework. It contains server `lab-4-eureka-server` and 
2 kinds of clients `lab-4-sentence` and `lab-4-words`. 

##### lab-4-sentence
This client create sentence using `lab-4-words` project. This one also use `lab-3-server` 
to get properties for each instance.

##### lab-4-words
This project contains 5 instances:
 - `lab-4-adjective` (1 instance)
 - `lab-4-article` (1 instance)
 - `lab-4-noun` (1 instances)
 - `lab-4-subject` (1 instance)
 - `lab-4-verb` (1 instance)

Each instance randomly generates word associated with his properties which he gets from `lab-3-server`.

### cloud-ribbon
This is a study example to learn spring-cloud-ribbon framework. This project contains`lab-5-sentence` which uses 
ribbon framework and `lab-5-words` which is a duplicate of `lab-4-words` but it also contains one more instance 
for `lab-4-noun` service.

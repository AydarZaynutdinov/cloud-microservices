# cloud-microservices

This is study examples to learn spring-cloud framework. At now it contains:
 - [cloud-config](https://github.com/AydarZaynutdinov/cloud-microservices/tree/master/01.cloud-config)
 - [cloud-eureka](https://github.com/AydarZaynutdinov/cloud-microservices/tree/master/02.cloud-eureka)
 - [cloud-ribbon](https://github.com/AydarZaynutdinov/cloud-microservices/tree/master/03.cloud-ribbon)
 - [cloud-feign](https://github.com/AydarZaynutdinov/cloud-microservices/tree/master/04.cloud-feign)


____________________
### 01.cloud-config
This is a study example to learn spring-cloud-config framework. It contains server `lab-3-server` and 
one client `lab-3-client`.

____________________
### 02.cloud-eureka
This is a study example to learn spring-cloud-eureka framework. It contains server `lab-4-eureka-server` and 
2 kinds of clients `lab-4-sentence` and `lab-4-words`. All clients also use `lab-4-congig-server` what is a duplicate of `lab-3-server`.

##### lab-4-sentence
This client create sentence using instances of `lab-4-words` project.

##### lab-4-words
This project contains 5 instances:
 - `adjective` (1 instance)
 - `article` (1 instance)
 - `noun` (1 instances)
 - `subject` (1 instance)
 - `verb` (1 instance)

Each instance randomly generates word associated with his properties which he gets from `lab-4-congig-serve`.

____________________
### 03.cloud-ribbon
This is a study example to learn spring-cloud-ribbon framework. This application work as a cloud-eureka, but this one also uses spring-cloud-ribbon framework. 
`lab-5-words` also contains one more instance (for `noun`) to demonstrate work of ribbon framework.


____________________
### 04.cloud-feign
This is a study example to learn spring-cloud-feign framework. This application work as a cloud-feign, but this one uses spring-cloud-feign framework 
to manipulate instances of `lab-6-words` from `lab-6-sentence` client without using `RestTemplate`.

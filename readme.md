## Quick Guide to Microservices with Spring Boot 2.0

# WHAT TO DO
 - replace ```<your_project_name>``` withou your GCE project name in all kubernetes .yaml files
 - build microservices with ``` mvn clean install ```
 - build docker image ```docker build -t eu.gcr.io/<your_project_name>/organization:1.0 .```
 - push docker image to repo ```docker push eu.gcr.io/<your_project_name>/organization:1.0```
 - you can apply yaml using ```kubectl apply -f organization-deployment.yaml ```
 

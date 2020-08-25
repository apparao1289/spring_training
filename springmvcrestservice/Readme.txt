Below are steps to build and deploy the application.

1. build the project using below maven command
   mvn clean install

2. Deploy the genearated war file into tomcat webapps folder 

3. Start the tomcat

4. USe below url for accessing corresponding functionalities.

Get Request: 
Fetching student details based on given student id (for example id =2)
Http Method:  GET
URL:  http://localhost:8081/springmvcrestservice/student/2   
Response:
{
    "id": 2,
    "name": "RAMESH",
    "age": 23,
    "address": "ATLANATA GA",
    "stand": "10"
}

Update Request:
Updating student details based on student id and class which he studing.
Http Method: PUT
URL: http://localhost:8081/springmvcrestservice/student/2/10
Response:
{
    "status": "SUCCESS",
    "message": "Record updated successfully"
}

Delete Request:
Deleting the student based on student id.
Http Method: DELETE
URL: http://localhost:8081/springmvcrestservice/student/15
Response:
{
    "status": "SUCCESS",
    "message": "Record deleted successfully"
}

Create Request:
Creating the student based on the provided details.
Http Method: POST
URL: http://localhost:8081/springmvcrestservice/student

Request:
{
	
   "name":"Ramu",
	
   "age":20,
	
   "address":"Hyderabad",
	
   "stand":12

}

Response:

{
    "status": "SUCCESS",
    "message": "Student Record created successfully"
}

Note: Table creation DB script added under resource folder
File name : table-creation-dbscript.sql
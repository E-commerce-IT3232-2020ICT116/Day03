# Day03
# Student Management API

## Overview
This is a simple Spring Boot REST API for managing student data. It provides endpoints to retrieve student details, filter students by age range, and sort students by GPA.

## Technologies Used
- Java
- Spring Boot
- RESTful Web Services

## Project Structure

- src/main/java/lk/ac/vau/fas/ict/
  â”œâ”€â”€ controller/
  â”‚   â”œâ”€â”€ AppController.java
  â”œâ”€â”€ model/
  â”‚   â”œâ”€â”€ Student.java


## Endpoints

### Retrieve a Single Student

GET /app/student

- Returns a single student object.

### Initialize Student List

POST /app/students

- Adds predefined students to the list.

### Retrieve All Students

GET /app/students

- Returns the list of all students.

### Retrieve a Student by Registration Number

GET /app/student/{id}

- Returns a student matching the given registration number.

### Retrieve Students by Age Range (20-24)

GET /app/students/age-between

- Returns students whose age is between 20 and 24.

### Retrieve Students Sorted by GPA

GET /app/students/sorted-by-gpa

- Returns students sorted by their GPA in ascending order.

## How to Run
1. Clone the repository.
2. Ensure you have Java and Spring Boot installed.
3. Run the application using:
   
   mvn spring-boot:run
   
4. Access the API endpoints using a REST client like Postman or a browser.

## Notes
- The /students list is initially empty. Use the POST /app/students endpoint to populate it before accessing other endpoints.
- Sorting by GPA is implemented using the Bubble Sort algorithm (for demonstration purposes).

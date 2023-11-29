Employee Portal System
Overview

The Employee Portal is a robust and secure web application developed using Spring Boot. It is designed to manage various employee-related operations within an organization. This includes handling employee data, assigning roles and subordinates, and managing performance ratings. The application features comprehensive user authentication and authorization using OAuth2 and Spring Security.
Features

Employee Management: Create and manage employee profiles.
Role Assignment: Assign roles to employees (e.g., HR, Manager).
Subordinate Management: Managers can add or manage subordinates.
Performance Rating: Evaluate and record employee performance ratings.
Security: Implement OAuth2 for secure access and utilize Spring Security for authentication and authorization.

Technologies

Spring Boot
Spring Security with OAuth2
Spring Data JPA
RESTful API

Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.
Prerequisites

Java JDK 11 or later
Maven 3.6 or later
MySQL or any other relational database

Installation

Clone the repository



git clone 

Configure the database

Create a database named employee_portal.
Update application.properties with your database credentials.

Run the application



mvn spring-boot:run

Usage

After running the application, you can access the following endpoints:

POST /employee: Create a new employee.
PUT /manager/{manager_id}/subordinates: Assign subordinates to a manager.
PUT /rating/{employee_id}/{rating}: Provide a rating to an employee.
GET /rating/{employee_id}: Get the rating of an employee.

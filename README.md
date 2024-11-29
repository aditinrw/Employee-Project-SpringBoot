# Employee-Project-SpringBoot

## Description

**Employee-Project-SpringBoot** is a Spring Boot-based RESTful API for managing employee information in an organization. The application allows users to:
- Add employees
- View employee details by different filters (status, name, ID, etc.)
- Update employee information
- Delete employee records by country or ID

This project demonstrates the use of Spring Boot to create a RESTful API with various HTTP methods (GET, POST, PUT, DELETE) to perform CRUD operations on employee records.

## Features

- **Add New Employees**: Add employee details using the `/addemployee` POST endpoint.
- **Retrieve Employee Details**: Retrieve all employees or filter by specific attributes such as employee ID, name, or status using GET requests.
- **Update Employee Information**: Update an employee's country of residence using a PUT request.
- **Delete Employee Records**: Delete employees by country or ID using DELETE requests.

## Technologies Used

- **Spring Boot**: Framework for building the RESTful web services.
- **Hibernate**: ORM (Object Relational Mapping) for interacting with the database.
- **MySQL** (or any other database): For storing employee data.
- **Spring Data JPA**: For data persistence and repository management.

## Endpoints

| HTTP Method | Endpoint                          | Description                                          |
|-------------|-----------------------------------|------------------------------------------------------|
| GET         | /api/showallEmployee              | Retrieves all employees                              |
| GET         | /api/status/{status}              | Retrieves employees by their status                  |
| GET         | /api/{id}                         | Retrieves employee by ID                             |
| GET         | /api/showEmployeesByName/{name}   | Retrieves employees by their name                    |
| POST        | /api/addemployee                  | Adds a new employee                                  |
| PUT         | /api/updatecountryname/{cid}      | Updates an employee's country by employee ID         |
| DELETE      | /api/deletebycountryname/{country}| Deletes employees by country                         |
| DELETE      | /api/deleteemployeebyid/{id}      | Deletes employee by employee ID                      |

## Getting Started

### Prerequisites

- **Java**: 11 or later
- **Maven** or **Gradle** for dependency management
- **Spring Boot** for the framework
- **MySQL** or any preferred database

### Installation

1. **Clone the repository**:

    ```bash
    git clone https://github.com/aditinrw/Employee-Project-SpringBoot.git

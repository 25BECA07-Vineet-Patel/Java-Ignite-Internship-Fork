# SECTION 1: BUG FIX TASKS

## 1. Employee.java Issues

### Which annotation is missing to make this a database table?

The `@Entity` annotation is used to make a Java class a database table in JPA.

### Why do we need a default constructor in JPA?

JPA uses the default constructor to create objects while fetching data from the database. Without it, JPA cannot create entity objects properly.

### Fix all getter and setter methods

Getter methods are used to get values of variables and setter methods are used to update values. They should return and set the correct fields of the Employee class.

### What happens if @Id is missing?

If `@Id` is missing, JPA cannot identify the primary key of the table. The application may fail to start or the entity will not be mapped correctly.

---

## 2. Repository Issues

### Why do we extend JpaRepository?

We extend `JpaRepository` because it provides built-in CRUD methods like `save()`, `findAll()`, `findById()`, and `deleteById()`.

### What happens if we don't extend it?

If we do not extend `JpaRepository`, we will not get the built-in database operations and we will have to write them manually.

### Fix repository so CRUD works

The repository should extend:

```java
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
```

---

## 3. Controller Issues

### What does @RestController do?

`@RestController` tells Spring Boot that the class will handle REST API requests and return data in JSON format.

### Difference between @RequestBody and @PathVariable?

`@RequestBody` is used to get data from the request body.

`@PathVariable` is used to get values from the URL.

Example:

```java
@PostMapping("/save")
public Employee save(@RequestBody Employee employee)
```

```java
@GetMapping("/{id}")
public Employee getEmployee(@PathVariable Long id)
```

### Fix all APIs (POST, GET, PUT, DELETE)

The APIs were fixed by adding proper annotations, injecting the repository, and implementing the CRUD methods correctly.

### Explain flow: Postman → Controller → Repository → DB

When a request is sent from Postman, it first reaches the Controller. The Controller calls the Repository. The Repository interacts with the database and returns the result back to the Controller, which sends the response to Postman.

---

## 4. application.properties Issues

### Why do we need application.properties?

`application.properties` is used to configure the Spring Boot application such as database connection, server port, and other settings.

### What is H2 database used for?

H2 is an in-memory database used for development and testing. It is lightweight and easy to use with Spring Boot.

### Fix configuration so application runs

The datasource URL, driver, username, password, and H2 settings were configured correctly in `application.properties`.

---

# SECTION 2: POSTMAN TESTING

### What is response of POST /employee/save?

The API saves the employee data into the database and returns the saved employee object along with the generated ID.

### What happens if GET /employee/1 is called with invalid ID?

If the employee ID does not exist, the API returns `null` because no matching record is found.

### What is returned in DELETE API?

The DELETE API returns:

```text
Employee Deleted Successfully
```

### Which method is used for update?

The `PUT` method is used to update an existing employee record.

---

# SECTION 3: THEORY QUESTIONS

### What is REST API?

REST API is a way for applications to communicate with each other using HTTP methods like GET, POST, PUT, and DELETE.

### What is CRUD?

CRUD stands for:

- Create
- Read
- Update
- Delete

These are the basic operations performed on data.

### Difference between POST and PUT?

POST is used to create a new record.

PUT is used to update an existing record.

### What is Dependency Injection?

Dependency Injection is a feature of Spring Boot where required objects are automatically provided by the framework instead of creating them manually.

### Why do we use Spring Boot?

Spring Boot makes Java application development easier by reducing configuration, providing built-in features, and allowing faster development of web applications and REST APIs.

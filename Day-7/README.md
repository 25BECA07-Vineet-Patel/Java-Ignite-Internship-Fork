# Day 7 - Theory Questions and Answers

## 1) Explain the difference between a Class and an Object in Java with a real-life example. Also explain why we cannot directly execute a class without creating an object.

### Answer:

A **Class** is a blueprint or template used to create objects. It defines the properties (variables) and behaviors (methods) that objects of that class will have.

An **Object** is an instance of a class. It occupies memory and can access the variables and methods defined in the class.

### Real-Life Example:

Consider a class named `Car`.

- The class defines properties such as color, brand, and speed.
- A specific car, such as a red Toyota, is an object of the `Car` class.

### Difference Between Class and Object

| Class                                 | Object                                |
| ------------------------------------- | ------------------------------------- |
| Blueprint or template                 | Instance of a class                   |
| Logical entity                        | Physical entity                       |
| No memory allocated                   | Memory allocated                      |
| Used to define properties and methods | Used to access properties and methods |

### Why can't we directly execute a class without creating an object?

Non-static variables and methods belong to objects, not to the class itself. Therefore, we need to create an object so that memory is allocated and the members can be accessed.

---

## 2) What are access modifiers in Java? Explain the difference between public and private with examples. Why is it not safe to make all variables public?

### Answer:

Access modifiers control the visibility and accessibility of classes, variables, methods, and constructors.

Common access modifiers in Java are:

- public
- private
- protected
- default

### Public

A public member can be accessed from anywhere in the program.

```java
class Student {
    public String name = "Vineet";
}
```

### Private

A private member can only be accessed within the same class.

```java
class Student {
    private int marks = 90;
}
```

### Difference Between public and private

| public                                         | private                          |
| ---------------------------------------------- | -------------------------------- |
| Accessible from anywhere                       | Accessible only within the class |
| Less secure                                    | More secure                      |
| Suitable for methods intended for external use | Suitable for sensitive data      |

### Why is it not safe to make all variables public?

If all variables are public, any part of the program can modify them directly. This can lead to accidental changes, invalid data, and security issues. Therefore, sensitive data should be kept private.

---

## 3) Explain how encapsulation is achieved using private variables and public methods. Give a real-life example (bank, mobile, ATM, etc.).

### Answer:

Encapsulation is the process of hiding data and providing controlled access through methods.

It is achieved by:

1. Declaring variables as private.
2. Providing public getter and setter methods to access and modify the data.

### Example: Bank Account

```java
class BankAccount {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}
```

### Real-Life Explanation

An ATM does not allow users to directly access or modify the bank's database. Instead, users interact through options such as deposit, withdraw, and balance inquiry.

Similarly:

- Data remains private.
- Public methods provide controlled access.

### Advantages of Encapsulation

- Better security
- Data hiding
- Controlled access
- Easier maintenance

---

## 4) What is a constructor in Java? Explain how the this keyword is used inside a constructor. Why do we use constructors to initialize object values?

### Answer:

A constructor is a special method that is automatically called when an object is created.

Characteristics:

- Constructor name must be the same as the class name.
- Constructors do not have a return type.
- Used to initialize object data.

### Example

```java
class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}
```

### Use of this Keyword

The `this` keyword refers to the current object.

In the above example:

```java
this.name = name;
```

- `this.name` refers to the instance variable.
- `name` refers to the constructor parameter.

The `this` keyword helps differentiate between instance variables and local variables when they have the same name.

### Why do we use constructors?

Constructors help initialize object values at the time of object creation.

Benefits:

- Objects are initialized automatically.
- Reduces repetitive code.
- Ensures objects start with valid values.
- Improves readability and maintainability.

### Example

```java
Student s1 = new Student("Vineet");
```

When the object is created, the constructor automatically assigns the value `"Vineet"` to the object's name variable.

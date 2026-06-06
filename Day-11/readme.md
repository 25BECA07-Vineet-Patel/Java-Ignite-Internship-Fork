# Day11_JavaIgnite2026

## 1) What is the difference between Checked Exception and Unchecked Exception? Give one Java example for each.

### Checked Exception

A checked exception is checked by the compiler at compile time. It must be handled using a `try-catch` block or declared using the `throws` keyword.

**Example:** `IOException`

```java
FileReader file = new FileReader("data.txt");
```

If the file does not exist, Java requires the exception to be handled.

### Unchecked Exception

An unchecked exception is not checked by the compiler. It occurs during program execution and handling it is optional.

**Example:** `ArithmeticException`

```java
int result = 10 / 0;
```

This causes an `ArithmeticException` at runtime.

### Difference

- Checked exceptions are checked at compile time.
- Unchecked exceptions occur at runtime.
- Checked exceptions must be handled or declared.
- Unchecked exceptions do not require mandatory handling.

---

## 2) Explain the difference between `throw` and `throws`. Where do we use each one?

### throw

The `throw` keyword is used to explicitly throw an exception from within a method or block of code.

**Example:**

```java
if (marks < 0) {
    throw new InvalidMarksException("Marks cannot be negative");
}
```

### throws

The `throws` keyword is used in the method declaration to indicate that the method may throw an exception.

**Example:**

```java
public void validateMarks(int marks)
        throws InvalidMarksException {
}
```

### Difference

- `throw` is used to actually throw an exception.
- `throws` is used to declare possible exceptions in a method signature.
- `throw` is written inside a method.
- `throws` is written after the method name.

---

## 3) Why do we need custom exceptions instead of built-in exceptions? Give a real-life example where a custom exception is useful.

Built-in exceptions handle common errors, but sometimes applications have their own rules and requirements. In such situations, custom exceptions make the code easier to understand and maintain.

### Real-Life Example

Consider a hospital management system where a patient's age cannot be negative or greater than 120.

```java
if (age < 0 || age > 120) {
    throw new InvalidAgeException("Invalid age entered");
}
```

Using `InvalidAgeException` clearly describes the problem, whereas a generic exception would not provide enough information.

### Conclusion

Custom exceptions help represent application-specific errors more clearly. They improve code readability, make debugging easier, and allow developers to handle special business rules effectively.

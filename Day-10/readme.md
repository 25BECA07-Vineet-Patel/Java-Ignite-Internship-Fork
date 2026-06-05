# 1) Explain Java Exception Hierarchy

Java exceptions are organized in a hierarchy. The top class is **Throwable**. It has two main subclasses: **Exception** and **Error**.

- **Throwable**: It is the parent class of all exceptions and errors in Java.
  - Example: `Throwable t = new Throwable();`

- **Exception**: It represents conditions that can be handled by the program.
  - Example: `ArithmeticException` occurs when a number is divided by zero.

- **Error**: It represents serious problems that usually cannot be handled by the program.
  - Example: `OutOfMemoryError` occurs when the JVM runs out of memory.

---

# 2) Can We Have Multiple Catch Blocks?

Yes, Java allows multiple catch blocks with a single try block. It is useful when different exceptions need different handling.

Example:

```java
try {
    int a = 10 / 0;
}
catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero");
}
catch (Exception e) {
    System.out.println("Some other error occurred");
}
```

This is useful because each exception can be handled separately and appropriate messages can be shown to the user.

---

# 3) A Program Crashes When User Enters Text Instead of Number

### What exception occurs?

`InputMismatchException` occurs when the user enters text instead of a number.

### How will you handle it?

By using a try-catch block.

Example:

```java
try {
    int num = sc.nextInt();
}
catch (InputMismatchException e) {
    System.out.println("Invalid Input");
}
```

### Where should try-catch be placed?

The try-catch block should be placed around the code where user input is taken because that is where the exception may occur.

---

# 4) Predict the Output

Code:

```java
try {
    int a = 10 / 0;

    System.out.println("Hello");
}
catch(Exception e) {
    System.out.println("Error handled");
}

System.out.println("End");
```

### Output:

```text
Error handled
End
```

### What prints first?

`Error handled` prints first because division by zero causes an exception and control immediately goes to the catch block.

### Does the program stop?

No. The exception is handled by the catch block, so the program continues execution and prints `End`.

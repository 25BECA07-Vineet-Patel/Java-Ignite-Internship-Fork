# Java OOP and File Handling Questions

## Question 1

### Difference Between Method Overloading and Method Overriding

| Method Overloading                         | Method Overriding                                               |
| ------------------------------------------ | --------------------------------------------------------------- |
| Same method name but different parameters. | Same method name and same parameters in parent and child class. |
| Happens in the same class.                 | Happens between parent and child classes.                       |
| Achieves compile-time polymorphism.        | Achieves runtime polymorphism.                                  |
| Compiler decides which method to call.     | JVM decides which method to call at runtime.                    |

### Example of Method Overloading

Suppose a calculator can add both integers and decimal numbers.

```java
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}
```

Here, the method name is the same but parameters are different.

### Example of Method Overriding

Different animals make different sounds.

```java
class Animal {

    void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {

    void sound() {
        System.out.println("Bark");
    }
}
```

The `sound()` method of the parent class is overridden in the child class.

---

## Question 2

### What is the Purpose of Wrapper Classes?

Wrapper classes are used to convert primitive data types into objects.

Examples:

| Primitive Type | Wrapper Class |
| -------------- | ------------- |
| int            | Integer       |
| double         | Double        |
| char           | Character     |
| boolean        | Boolean       |

Example:

```java
int num = 100;

Integer obj = Integer.valueOf(num);
```

Wrapper classes are useful because many Java features work only with objects.

### Why Can't We Use Primitive Data Types Directly in Some Java Collections?

Collections such as `ArrayList` store objects, not primitive data types.

Wrong:

```java
ArrayList<int> list = new ArrayList<>();
```

Correct:

```java
ArrayList<Integer> list = new ArrayList<>();
```

This is because Java Generics support only reference types (objects) and not primitive types.

---

## Question 3

### Difference Between FileWriter and FileOutputStream

| FileWriter                  | FileOutputStream                         |
| --------------------------- | ---------------------------------------- |
| Used for writing text data. | Used for writing binary data.            |
| Writes characters.          | Writes bytes.                            |
| Best for text files.        | Best for images, PDFs, audio files, etc. |

### Example of FileWriter

```java
FileWriter fw = new FileWriter("data.txt");
fw.write("Hello World");
fw.close();
```

### Example of FileOutputStream

```java
FileOutputStream fos = new FileOutputStream("data.txt");
fos.write("Hello World".getBytes());
fos.close();
```

### When Should We Use Them?

Use **FileWriter** when working with text files such as notes, reports, or logs.

Use **FileOutputStream** when working with binary files such as images, PDFs, videos, or any file that contains raw bytes.

---

## Question 4

### Explain Inheritance with a Real-Life Example

Inheritance means one class can use the properties and methods of another class.

For example, a Car is a type of Vehicle.

```java
class Vehicle {

    void start() {
        System.out.println("Vehicle Started");
    }
}

class Car extends Vehicle {

}
```

Now the Car class can use the `start()` method without writing it again.

```java
Car c = new Car();
c.start();
```

Output:

```text
Vehicle Started
```

### How Does Inheritance Reduce Code Duplication?

Without inheritance, common methods have to be written in every class.

```java
class Car {
    void start() { }
}

class Bike {
    void start() { }
}
```

With inheritance:

```java
class Vehicle {
    void start() { }
}

class Car extends Vehicle { }

class Bike extends Vehicle { }
```

The method is written only once in the parent class and reused by all child classes. This makes the code shorter, cleaner, and easier to maintain.

---

## Important Interview Question

### Code

```java
class Animal {

    void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {

    void sound() {
        System.out.println("Bark");
    }
}

Animal a = new Dog();
a.sound();
```

### Output

```text
Bark
```

### Explanation

In the statement:

```java
Animal a = new Dog();
```

`a` is a reference of type `Animal`, but it points to an object of type `Dog`.

When:

```java
a.sound();
```

is executed, Java checks the actual object type at runtime. Since the object is a `Dog`, the overridden method in the `Dog` class is called.

Therefore, the output is:

```text
Bark
```

This is an example of **runtime polymorphism**.

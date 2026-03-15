# Hibernate One-to-One Mapping Example

## Overview

This project demonstrates a **One-to-One relationship using Hibernate ORM and JPA annotations**.

In this example, a **Question entity is associated with exactly one Answer entity**, and the relationship is managed using `@OneToOne` mapping with cascading.

The project is built using **Java, Hibernate, Maven, and MySQL** to understand how entity relationships are implemented in Hibernate.

---

## Entity Relationship

Each **Question** has **one Answer**, and each **Answer** corresponds to **one Question**.

```
Question
-------------
qid
question
answer (Answer)

        1
        |
        | One-to-One
        |
        v

Answer
-------------
id
answer
```

---

## Technologies Used

* Java
* Hibernate ORM
* JPA Annotations
* Maven
* MySQL

---

## Key Concepts Demonstrated

* `@Entity` mapping
* `@OneToOne` relationship
* Cascade operations (`CascadeType.ALL`)
* Hibernate configuration and session management
* Object-Relational Mapping (ORM)

---

## Project Structure

```
src/main/java/com/isha
│
├── app
│   └── LaunchStandardApp.java
│
└── model
    ├── Question.java
    └── Answer.java
```

---

## Example Scenario

Question:

```
What is Java?
```

Answer:

```
Java is a high-level, object-oriented programming language used to build platform-independent applications.
```

In the database, the **Question record is linked to a single Answer record**.

---

## Purpose of the Project

This project was created while learning Hibernate ORM to understand **One-to-One entity mapping and cascading behavior** in Java applications.

---

## Author

**Isha Parihariya**

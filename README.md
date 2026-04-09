# 🚆 Train Consist Management App

## 📌 Overview

The **Train Consist Management App** is a console-based Java application that simulates how railway systems manage a train’s consist (collection of bogies attached to an engine).

This project demonstrates how **Core Java and Data Structures** are applied to solve real-world problems such as:

* Dynamic arrangement of bogies
* Capacity tracking
* Maintaining order and uniqueness
* Data validation and safety compliance

---

## 🎯 Objective

To implement real-world train management operations using:

* Core Java
* Data Structures (List, Set, Map)
* Java Stream API
* OOP concepts

---

## ⚙️ Features

* Passenger bogie management (Sleeper, AC Chair, First Class)
* Goods bogie handling with safety rules
* Unique bogie ID tracking
* Ordered train formation
* Capacity mapping and analysis
* Stream-based filtering, grouping, and aggregation
* Input validation using Regex
* Safety compliance checks

---

## 📚 Use Cases Implemented

| UC No | Title                                    |
| ----- | ---------------------------------------- |
| UC1   | Initialize Train and Display Consist     |
| UC2   | Add Passenger Bogies                     |
| UC3   | Track Unique Bogie IDs (HashSet)         |
| UC4   | Maintain Ordered Train (LinkedList)      |
| UC5   | Preserve Insertion Order (LinkedHashSet) |
| UC6   | Map Bogie to Capacity (HashMap)          |
| UC7   | Sort Bogies by Capacity (Comparator)     |
| UC8   | Filter Bogies using Streams              |
| UC9   | Group Bogies (Collectors.groupingBy)     |
| UC10  | Calculate Total Seats (reduce)           |
| UC11  | Validate Inputs (Regex)                  |
| UC12  | Safety Compliance Check                  |

---

## 🛠️ Technologies Used

* Java (Core Java)
* Java Collections Framework
* Java Stream API
* Git & GitHub for version control

---

## 📁 Project Structure

```
TrainConsistApp/
│── UC1_TrainInitialization.java
│── UC2_PassengerBogies.java
│── UC3_BogieIDs.java
│── UC4_TrainOrder.java
│── UC5_LinkedHashSet.java
│── UC6_BogieCapacity.java
│── UC7_SortBogies.java
│── UC8_FilterBogies.java
│── UC9_GroupBogies.java
│── UC10_TotalSeats.java
│── UC11_RegexValidation.java
│── UC12_SafetyCheck.java
│── README.md
```

---

## ▶️ How to Run

1. Compile the file:

```
javac FileName.java
```

2. Run the program:

```
java ClassName
```

Example:

```
javac UC2_PassengerBogies.java
java UC2_PassengerBogies
```

---

## 🔀 Git Workflow Followed

* `main` → Contains only README
* `dev` → Main working branch
* `feature/UCx` → Separate branch for each use case
* Pull Requests merged into `dev` only

---

## ✅ Key Learning Outcomes

* Understanding of dynamic data structures
* Real-world application of Java collections
* Use of functional programming (Streams)
* Data validation and safety rule enforcement
* Version control using Git

---

## 👩‍💻 Author

**Celine Abritha**

---

## 📌 Note

All use cases are implemented as separate Java files for clarity and modular understanding.

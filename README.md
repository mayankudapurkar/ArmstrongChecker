# ArmstrongChecker

A simple desktop GUI application built using Java Swing to check whether a given number is an Armstrong number.

---

## ✨ Features

- Accepts numeric input via GUI
- Instantly checks if the number is an Armstrong number
- Displays result with clean user feedback
- Lightweight and beginner-friendly
- Comes with `.jar` for one-click launch

---

## 🛠️ Technologies Used

- Java (JDK 8+)
- Java Swing for GUI components
- AWT for event handling

---

## 🚀 How to Run

### Option 1: Run JAR (No Compilation Needed)

> 💡 Requires Java 8 or higher installed

java -jar ArmstrongApp.jar

---

### Option 2: Compile & Run from Source

> Make sure both `Task2.java` (main class) and `ArmstrongChecker.class` are in the same directory.

#### 🔧 Compile:

javac Task2.java ArmstrongChecker.java

#### ▶️ Run:

java Task2

---

## 📄 Files Included

```
├── ArmstrongApp.jar           # Executable JAR file
├── ArmstrongChecker.class     # Compiled logic class
├── Task2.java                 # Main Java file with entry point
├── Task2.class
├── manifest.txt               # JAR manifest (optional)
└── README.md
```

---

## 🧠 What is an Armstrong Number?

An **Armstrong number** (or narcissistic number) is a number that is equal to the sum of its digits each raised to the power of the number of digits.

Example:
`153 = 1³ + 5³ + 3³`

---

## 📌 Notes

* `Task2.java` contains the `main()` method and starts the GUI.
* `ArmstrongChecker` contains the logic for validating Armstrong numbers.
* `ArmstrongApp.jar` can be run without compiling anything.



# Java Swing Calculator

A simple calculator application built using Java Swing for the graphical user interface (GUI). This calculator supports basic arithmetic operations such as addition, subtraction, multiplication, and division.

-> Features

- **Basic Arithmetic Operations**: Add, subtract, multiply, and divide.
- **Decimal Support**: Perform operations with decimal numbers.
- **Clear and Delete Functions**: Clear the input field or delete the last character.
- **Negative Numbers**: Input and calculate with negative numbers.

 -> Getting Started

These instructions will help you set up and run the project on your local machine.

-> Prerequisites

- Java Development Kit (JDK) 8 or higher

-> Installation

1. **Clone the repository**:
    ```bash
    git clone https://github.com/a-muizz28/java-swing-calculator.git
    ```
2. **Navigate to the project directory**:
    ```bash
    cd java-swing-calculator
    ```
3. **Compile the Java code**:
    ```bash
    javac Calculator.java
    ```
4. **Run the application**:
    ```bash
    java Calculator
    ```

-> Usage

- **Number Buttons**: Click to input numbers.
- **Operator Buttons**: Click to perform addition, subtraction, multiplication, or division.
- **Decimal Button**: Click to input a decimal point.
- **Equals Button**: Click to calculate the result of the current operation.
- **Clear Button**: Click to clear the input field.
- **Delete Button**: Click to delete the last character in the input field.
- **Negative Button**: Click to toggle the negative sign for the current input.

-> Code Overview

The main class `Calculator` implements the `ActionListener` interface to handle button click events. The GUI is created using various Swing components, including `JFrame`, `JTextField`, `JButton`, and `JPanel`.

-> Main Components

- **JFrame**: The main window of the application.
- **JTextField**: The display area for input and results.
- **JButton**: Buttons for numbers, operators, and functions.
- **JPanel**: A container to organize buttons in a grid layout.

-> Event Handling

The `actionPerformed` method is overridden to define the actions for each button click event. Depending on the source of the event, the method updates the display and performs calculations.

-> Contributing

If you would like to contribute to this project, please follow these steps:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature/your-feature`).
3. Commit your changes (`git commit -m 'Add some feature'`).
4. Push to the branch (`git push origin feature/your-feature`).
5. Open a pull request.

-> Acknowledgments

This project was inspired by the need for a simple calculator application to demonstrate the capabilities of Java Swing.

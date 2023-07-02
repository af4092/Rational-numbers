# [Rational-numbers](https://en.wikipedia.org/wiki/Rational_number)
This project shows how to design the Rational class for representing and processing rational numbers

A rational number has a numerator and a denominator in the form a/b, where a is the numerator and b the denominator. To reduce a rational number to its lowest terms, we need to find the greatest common divisor (GCD) of the absolute values of its numerator and denominator, then divide both the numerator and denominator by this value. The main method created two rational numbers, r1 and r2 and displays the results.

Screenshot of compiled code:

![image](https://user-images.githubusercontent.com/24220136/225549450-9ebed847-505e-4e2b-b7b5-eaaac033042c.png)

## [Implementation](https://github.com/af4092/Rational-numbers/blob/main/src/Rational.java)

- The given code defines a class called `Rational` that represents a rational number. Here's an overview of the code:
- The `Rational` class extends the `Number` class and implements the `Comparable<Rational>` interface, indicating that it represents a numeric value and can be compared with other rational numbers.
- The class has two private instance variables: `numerator` and `denominator`, which represent the numerator and denominator of the rational number, respectively. By default, the numerator is set to 0 and the denominator is set to 1.
- The class provides multiple constructors. The default constructor sets the numerator to 0 and the denominator to 1. Another constructor allows the numerator and denominator to be specified during object creation. The constructor also simplifies the rational number by finding the greatest common divisor (GCD) and dividing both the numerator and denominator by it.
- The class provides various methods to perform arithmetic operations on rational numbers, such as addition (`add`), subtraction (`subtract`), multiplication (`multiply`), and division (`divide`). These methods return new `Rational` objects representing the result of the respective operation.
- Additional methods are provided to retrieve the numerator and denominator (`getNumerator` and `getDenominator`), convert the rational number to a string representation (`toString`), check equality with another object (`equals`), and compare the rational number with another rational number (`compareTo`).
- The class overrides several methods from the `Number` class, such as `intValue`, `floatValue`, `doubleValue`, and `longValue`, to provide the corresponding values for the rational number.

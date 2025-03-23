# Triangle Classification Java Project (MSSE Assignment 1 Unit Testing v1.3)

## Introduction
In this project I developed a Java program to classify triangles, along with the unit testing process applied based on the requirment of the assignment 1. The program was designed to accepts three integer side lengths and determines whether the triangle is Scalene, Isosceles, Equilateral, or Invalid that indicate it is not a valid triangle. I took strong precaution to handling error cases ("rainy day" scenarios) explicitly, such as invalid triangles where the sum of two sides is not greater than the third or when any side length is zero or negative. If the length is zero, negative, or exceeds the third, the program will identify the input as "Invalid" and notify the user clearly, following best practices from The Art of Software Testing. 

Unit tests were designed to cover a range of typical and edge-case inputs for the triangle classification. We selected tests that ensure each type of valid triangle is recognized and that various invalid inputs are correctly identified as such. For example, we included tests for a valid scalene triangle, a valid equilateral triangle, and a valid isosceles triangle, as well as tests for invalid cases like a zero-length side and a set of lengths that do not form a triangle. These particular tests were chosen based on the guidance from Chapters 1–3 of The Art of Software Testing. Chapter 1 provided a self-assessment with specific categories of test cases for the triangle problem


## Detail of the Project

## Unit Tests

##ScreenShots
Below are screenshots demonstrating the successful execution of the triangle classification program and the results of running the JUnit test suite. Each figure is labeled for clarity.

Figure 1 : Example console output of the Triangle Classification program

![image](https://github.com/user-attachments/assets/3ae79cf5-2c57-4d46-9daf-896032a9c36e)
![image](https://github.com/user-attachments/assets/ce860001-626c-4b0b-937a-c9a973954242)
![image](https://github.com/user-attachments/assets/1b750d4d-f30e-45d3-8b0c-92a2cb42e06d)
![image](https://github.com/user-attachments/assets/2b8d3b22-6b73-4b9e-a00e-4740008d9876)
![image](https://github.com/user-attachments/assets/eb6f272a-c6e1-4eb4-a15a-9e0f16c62620)
![image](https://github.com/user-attachments/assets/e73d0e74-3873-46f0-a7dc-0069b090ec25)
Updated Code
![image](https://github.com/user-attachments/assets/e6924483-7742-4ab7-8731-3fe0aae09659)
![image](https://github.com/user-attachments/assets/0439e708-7c62-4990-ba4f-da2849cdce45)

Figure 2: JUnit test results in IntelliJ IDEA. All unit tests passed successfully, confirming that the program behaves as expected for the tested inputs (including edge cases and invalid inputs).

![image](https://github.com/user-attachments/assets/1fc4c4d7-6ea9-4472-ba3c-ffccbf1feb44)






## Github Link

[🔗 GitHub Repo Link] (https://github.com/Vassh007/MSSE640_Assignment1_UnitTesting)

## Recommendation

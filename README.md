# Triangle Classification Java Project (MSSE Assignment 1 Unit Testing v1.3) 

## Introduction
In this project, I developed a Java program to classify triangles and applied unit testing in accordance with the assignment requirements. The Triangle Classification project aims to ensure efficient code functionality and error handling. As stated in *The Art of Software Testing, 3rd Edition* by Glenford J. Myers, Corey Sandler, and Tom Badgett, "Software testing is a process designed to ensure that computer code performs as intended and does not exhibit unintended behavior." The program accepts three integer side lengths and determines if the triangle is Scalene, Isosceles, Equilateral, or Invalid. It handles error cases explicitly, such as invalid triangles where the sum of two sides is not greater than the third or when any side length is zero or negative. If the input is invalid, the program clearly notifies the user. This approach provides comprehensive testing and achieves the required goals as stated in the book. Just as Meyer had advised,"....write a set of test cases—specific sets of data—to test properly a relatively simple program. Create a set of test data for the program—data the program must handle correctly to be considered a successful program."

Unit tests were designed to cover a range of typical and edge-case inputs for triangle identification. Meyers supports this approach, stating, "...test every possible permutation of a program." Selected tests ensure each type of valid triangle is recognized while also accurately identifying various invalid inputs. For example, there are tests for a valid scalene triangle, a valid equilateral triangle, and a valid isosceles triangle, as well as tests for invalid cases including a zero-length side and a set of lengths that do not form a triangle. As stated by Myers about his test case evaluation, "Do you have a test case that represents a valid scalene triangle?" and "Do you have at least three test cases that represent valid isosceles triangles such that you have tried all three permutations of two equal sides (such as 3, 3, 4; 3, 4, 3; and 4, 3, 3)?" These particular tests were chosen based on the guidance from Chapters 1 to 3 of *The Art of Software Testing*. Chapter 1 provided a self-assessment with specific categories of test cases relevant to the triangle problem.

## Detail of the Project
This project was developed in Intellij Idea to meet the requirements of the outlined by the rubric. The cores logic lyies in 

## Unit Tests

## Bugs encountered during testing

## Problems

## ScreenShots
Below are screenshots demonstrating the successful execution of the triangle classification program and the results of running the JUnit test suite. Each figure is labeled for clarity.

Figure 1 : Example console output of the Triangle Classification program

![image](https://github.com/user-attachments/assets/d6666cd6-cd31-4a5a-9a05-90c0ed16f0f9)
![image](https://github.com/user-attachments/assets/eb64202d-7ee5-4aae-b164-36cc647a5d34)
![image](https://github.com/user-attachments/assets/460c65a1-5c82-4001-aceb-30771d5cbc96)
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

## REFERENCES
Myers, G. J., Sandler, C., & Badgett, T. (2012). *The Art of Software Testing (3rd ed.)*. Wiley. 
https://learning.oreilly.com/library/view/the-art-of/9781118133156/

### Authors
Suvash Shrestha

# Triangle Classification Java Project (MSSE Assignment 1 Unit Testing v1.3) 

## Introduction
In this project, I developed a Java program to classify triangles and applied unit testing by the assignment requirements. The Triangle Classification project aims to ensure efficient code functionality and error handling. As stated in *The Art of Software Testing, 3rd Edition* by Glenford J. Myers, Corey Sandler, and Tom Badgett, "Software testing is a process designed to ensure that computer code performs as intended and does not exhibit unintended behavior." The program accepts three integer side lengths and determines if the triangle is Scalene, Isosceles, Equilateral, or Invalid. It handles error cases explicitly, such as invalid triangles where the sum of two sides is not greater than the third or when any side length is zero or negative. If the input is invalid, the program notifies the user. This approach provides comprehensive testing and achieves the required goals stated in the book. As Meyer had advised,"....write a set of test cases—specific sets of data—to properly test a relatively simple program. Create a set of test data for the program—data the program must handle correctly to be considered a successful program."

Unit tests were designed to cover a range of typical and edge-case inputs for triangle identification. Meyers supports this approach, stating, "...test every possible permutation of a program." Selected tests ensure each type of valid triangle is recognized while accurately identifying various invalid inputs. For example, there are tests for a valid scalene triangle, a valid equilateral triangle, and a valid isosceles triangle, as well as invalid cases, including a zero-length side and a set of lengths that do not form a triangle. As stated by Myers about his test case evaluation, "Do you have a test case that represents a valid scalene triangle?" and "Do you have at least three test cases that represent valid isosceles triangles such that you have tried all three permutations of two equal sides (such as 3, 3, 4; 3, 4, 3; and 4, 3, 3)?" These particular tests were chosen based on the guidance from Chapters 1 to 3 of *The Art of Software Testing*. Chapter 1 provided a self-assessment with specific categories of test cases relevant to the triangle problem.

## Detail of the Project
This project was developed using IntelliJ IDEA to meet the requirements outlined by the rubric. The core functionality is encapsulated in the method `identifyTriangle(int a, int b, int c)` within the `TriangleIdentify` class. This method accepts three integer inputs representing the sides of a triangle and returns a classification: "Equilateral," "Isosceles," "Scalene," or "Invalid." Inspired by *The Art of Software Testing, 3rd Edition*, I devised a checklist to validate the input sides consisting of 14 questions highlighted in the book:
### Valid Triangles:
- 1.	Did you test a valid scalene triangle? Example: 3,4,5
- 2. Did you test a valid equilateral triangle? Example: 2,2,2
- 3. Did you test a valid isosceles triangle? Example: 3,3,4
- 4. Did you test all permutations for an isosceles triangle (three different arrangements of two equal sides)? Examples: 3,3,4; 3,4,3; 4,3,3
### Invalid (Rainy Day) Scenarios:
-	5. Did you test zero length side (invalid)? Example: 0,5,5
-	6. Did you test negative length side (invalid)? Example: -1,4,5
-	7. Did you test when the sum of two sides exactly equals the third side (invalid)? Example: 1,2,3
-	8. Did you test all permutations of question 7's scenario? Examples: 1,2,3; 1,3,2; 3,1,2
-	9. Did you test when the sum of two sides is less than the third side (invalid)? Example: 1,2,4
-	10. Did you test all permutations of question 9's scenario? Examples: 1,2,4; 1,4,2; 4,1,2
-	11. Did you test when all sides are zero (0,0,0)?
### Exceptional and Additional Scenarios:
-	12. Did you test with non-integer numbers (like decimal numbers)? (optional unless required explicitly by your professor) Example: 2.5,3.5,5.5
-	13. Did you test when you input the wrong number of sides (like only two instead of three)? (optional unless required explicitly by your professor) Example: 2,4
### Clarity of Test Cases:
-	14. For every test case you created, did you write down what output you expected from the program? Example: Side A: 3, Side B: 4, Side C: 5 → Scalene
Thus, the function ensures the validity of the sides by checking conditions such as negative or zero-length sides and violations of the triangle inequality theorem.
Additionally, I implemented the `main` method as a console-based driver to prompt users to sequentially input three integer values for triangles. The method utilizes Java's `Scanner` object (`Scanner sc = new Scanner(System.in)`), allowing user interaction via the console. This ensures that users can enter integers representing the lengths of the triangle sides one by one until the console outputs a message such as "The triangle is scalene" (or isosceles/equilateral), or an error message if the inputs are invalid.
```Java
System.out.println("The triangle is: " + result);
```
I separated the classification logic from the user interaction logic to enable robust and automated unit testing. This way, the triangle classification method `(identifyTriangle(a, b, c))` can be called directly from an automated test case without requiring an interactive prompt, significantly simplifying the testing process.
Additionally, I used JUnit 5 for comprehensive testing. The test cases are designed to validate both typical and edge cases explicitly. The classification result—whether the triangle is Equilateral, Isosceles, Scalene, or Invalid—is displayed directly on the console with the command `System.out.println("The triangle is: " + result);`. Importantly, the test cases do not rely on external data for input or output.

   
## Table of Example Test Data
The following table summarizes various example inputs to the program and the expected classification outputs. These test cases cover normal triangles of each type as well as several invalid cases, demonstrating how the program should respond:
| Side A |	Side B |	Side C |	Expected Output              |
|--------|---------|--------| -----------------------------|
| 3	   | 4	    | 5	    | Scalene triangle (valid)     |
| 2	   | 2	    | 2	    | Equilateral triangle (valid) |
| 2	   | 2	    | 3	    | Isosceles triangle (valid)   |
| 3	   | 3	    | 4	    | Isosceles triangle (valid)   |
| 1	   | 2	    | 3 	    | Invalid (not a triangle)     |
| 2	   | 5	    | 10	    | Invalid (not a triangle)     |
| 0	   |5	       | 5	    | Invalid (zero-length side)   |
| -1	   | 4	    | 5	    | Invalid (negative side)      |

The table above provides clear evidence of both valid and invalid triangles. For instance, it lists four rows of valid triangles, with `3, 4, 5` being an example of a classic scalene triangle, while `2, 2, 2` represents an equilateral triangle. Additionally, it includes cases where two lengths of the triangle are equal, such as `2, 2, 3` or `3, 3, 4`, demonstrating isosceles triangles. In this context, the order of the sides does not affect the classification of the triangle. For example, `3, 3, 4` is an isosceles triangle, and rearranging the sides to `3, 4, 3` or `4, 3, 3` will still yield the same classification: isosceles.
   Moreover, the table educates the reader by illustrating why the final four rows contain invalid input. For instance, `1, 2, 3` and `2, 5, 10` do not satisfy the triangle inequality theorem, which states that the sum of the lengths of any two sides must be greater than the length of the third side. Additionally, `0, 5, 5` includes a zero-length side, and `-1, 4, 5` includes a negative length, both of which are examples of invalid cases. 

The expected behavior of the program is to recognize these inputs as not forming a valid triangle. When correctly implemented, the program should output an error message stating, "The Triangle is: Invalid." Thus, it must not classify any invalid triangle as a valid type unless it is definitively proven to be valid. I chose this test to ensure comprehensive coverage of all important scenarios, including every type of valid triangle and a variety of invalid conditions (boundary cases and erroneous inputs).

### Self-Assessment Test Evaluation (from Chapter 1 - The Art of Software Testing)

| # | Scenario                        | Tested? |
|---|---------------------------------|---------|
| 1 | Valid scalene triangle          | ✅ Yes  |
| 2 | Valid equilateral triangle      | ✅ Yes  |
| 3 | Valid isosceles triangle        | ✅ Yes  |
| 4 | All permutations of isosceles   | ✅ Yes  |
| 5 | Zero-length side                | ✅ Yes  |
| 6 | Negative side length            | ✅ Yes  |
| 7 | Sum of two sides equals third   | ✅ Yes  |
| 8 | All permutations (from Q7)      | ✅ Yes  |
| 9 | Sum of two sides less than third| ✅ Yes  |
|10 | All permutations (from Q9)      | ✅ Yes  |
|11 | All sides zero                  | ✅ Yes  |
|12 | Non-integer inputs (optional)   | ❌(not required) but did it |
|13 | Wrong number of inputs (optional)| ❌ No (not required) |
|14 | Clearly specified expected outputs | ✅ Yes  |

The self-assessment test evaluation from Chapter 1 of The Art of Software Testing was incredibly helpful in guiding how I designed both my program and the unit tests. The scenarios listed in the table gave me a clear roadmap of the types of inputs I needed to account for, ensuring I didn't overlook important edge cases. By covering all the triangle types—scalene, equilateral, and isosceles—and testing them thoroughly, including all permutations, I felt confident the program correctly handled different inputs. Additionally, thinking explicitly about special cases like negative or zero-length sides, or situations where the triangle inequality fails, helped me anticipate potential errors and handle them gracefully in the code. Even though the table included optional scenarios, like non-integer inputs, tackling these cases made my testing more robust and improved the program's overall quality. Ultimately, this structured approach made the testing process smoother, ensuring the program behaved correctly and reliably across various scenarios.

## Unit Tests
To verify that my application accurately classifies triangles, I created a comprehensive JUnit test suite based on a self-assessment table inspired by Chapter 1 of **The Art of Software Testing, 3rd Edition** by Glenford J. Myers, Corey Sandler, and Tom Badgett. I have rationalized each choice of accompanying Java JUnit code used for testing. Below are the unit tests I implemented:

**Test 1: Valid Scalene Triangle**  
I tested scalene triangles using inputs such as (3, 4, 5) in various orders to ensure that the program consistently recognizes scalene triangles, regardless of the order of the side lengths provided. This was essential for verifying the correctness of the basic triangle classification logic.

**Test 2: Valid Equilateral Triangle**  
I included tests for equilateral triangles using inputs like (5, 5, 5) to ensure accurate identification. By testing multiple examples, I confirmed that the logic correctly distinguished between equilateral and isosceles triangles, effectively avoiding common logical pitfalls.

**Test 3: Valid Isosceles Triangle (Different Permutations)**  
For isosceles triangles, I tested several permutations, including (3, 3, 4), (3, 4, 3), and (4, 3, 3). This was done to verify that my classification logic handled all input orders correctly, ensuring reliable and order-independent identification of isosceles triangles.

**Test 4: Zero-Length Side (Invalid Input)**  
To test the robustness of error handling, I validated scenarios involving a zero-length side, such as (0, 7, 7). These tests confirmed that the program appropriately flagged such cases as invalid.

**Test 5: Negative Side Length (Invalid Input)**  
I also tested negative side lengths, such as (-1, 5, 5), to validate the program’s resilience against inappropriate negative inputs and to ensure correct identification of invalid triangles.

**Test 6: Triangle Inequality Violation (Invalid Input)**  
I included scenarios that violated the triangle inequality, such as (1, 1, 3), to confirm that the program correctly identified these cases as invalid.

Overall, these JUnit tests, directly aligned with the scenarios recommended in Chapter 1, significantly improved the reliability and accuracy of my triangle classification program by providing comprehensive and systematic coverage of both valid and invalid inputs. Here is an example of the test suite that was created:

    ```Java
                        
                        @Test
                        void testValidScaleneTriangle() {
                       assertEquals("Scalene", TriangleIdentify.identifyTriangle(3, 4, 5));
                       assertEquals("Scalene", TriangleIdentify.identifyTriangle(5, 4, 3));
                       assertEquals("Scalene", TriangleIdentify.identifyTriangle(3, 5, 4));
               
               
                   }
               
                   @Test
                   void testValidIsoscelesTriangle() {
                       assertEquals("Isosceles", TriangleIdentify.identifyTriangle(5, 5, 7));
                       assertEquals("Isosceles", TriangleIdentify.identifyTriangle(5, 7, 5));
                       assertEquals("Isosceles", TriangleIdentify.identifyTriangle(7, 5, 5));
                       assertEquals("Isosceles", TriangleIdentify.identifyTriangle(3, 3, 4));
                       assertEquals("Isosceles", TriangleIdentify.identifyTriangle(3, 4, 3));
                       assertEquals("Isosceles", TriangleIdentify.identifyTriangle(4, 3, 3));
                   }
               
                   @Test
                   void testValidEquilateralTriangle() {
                       assertEquals("Equilateral", TriangleIdentify.identifyTriangle(5, 5, 5));
                       assertEquals("Equilateral", TriangleIdentify.identifyTriangle(10, 10, 10));
                       assertEquals("Equilateral", TriangleIdentify.identifyTriangle(2, 2, 2));
                   }
               
                   @Test
                   void testInvalidTriangleZeroLengthSide() {
                       assertEquals("Invalid", TriangleIdentify.identifyTriangle(0, 0, 0));
                       assertEquals("Invalid", TriangleIdentify.identifyTriangle(0, 1, 2));
                       assertEquals("Invalid", TriangleIdentify.identifyTriangle(1, 0, 2));
                       assertEquals("Invalid", TriangleIdentify.identifyTriangle(1, 2,0));
                   }
                   @Test
                   void testInvalidTriangleNegativeSide() {
                       assertEquals("Invalid", TriangleIdentify.identifyTriangle(-1, -1, -1));
                       assertEquals("Invalid", TriangleIdentify.identifyTriangle(-1, 1, 2));
                       assertEquals("Invalid", TriangleIdentify.identifyTriangle(1, -1, 2));
                       assertEquals("Invalid", TriangleIdentify.identifyTriangle(1, 2, -1));
                   }
               
                   @Test
                   void testTriangleInequalityViolation() {
                       assertEquals("Invalid", TriangleIdentify.identifyTriangle(1, 1, 3));
                       assertEquals("Invalid", TriangleIdentify.identifyTriangle(1, 3, 1));
                       assertEquals("Invalid", TriangleIdentify.identifyTriangle(3, 1, 1));
                   }

    ```


## Bugs encountered during testing
I encountered some minor hurdles and challenges during development and testing due to bugs. These bugs primarily involved logical errors and issues with input validation, which I identified and resolved. Initially, I did not consider the importance of the order in which conditions for identifying the type of triangle were checked. In my original code, I checked for an isosceles triangle before checking for an equilateral triangle. This oversight led to equilateral triangles (with three equal sides) being incorrectly classified as isosceles triangles. The faulty logic in my code looked like this:
                      
                       
**Before (Incorrect Code)**
                       
                        ```Java
                              if (a == b || b == c || a == c)
                                  return "Isosceles";
                              else if (a == b && b == c)
                                  return "Equilateral";
                        ```
  
   I corrected the logical error by rearranging the order of conditions, placing the check for equilateral triangles first since they are a specific subset of isosceles triangles (two equal sides).
                        
**After (Corrected Code)**
                          
                           ```Java
                                if (a == b && b == c)
                                  return "Equilateral";
                              else if (a == b || b == c || a == c)
                                  return "Isosceles";
                          
                           ```
Additionally, my original implementation accepted side lengths that were zero or negative and incorrectly attempted classification. For instance, the sides `0, 5, 5` were identified as "Isosceles," while a negative value like `-1, 4, 5` was considered Scalene.
     
**Before (Incorrect Code)**
   
                   
                   ```Java
                                       if (a == b && b == c)
                                           return "Equilateral";
                                       else if (a == b || b == c || a == c)
                                           return "Isosceles";
                                       else
                                           return "Scalene";
                   ```

This adjustment ensures that triangles with all sides equal (e.g., 5,5,5) are correctly classified as "Equilateral" rather than "Isosceles."
              
               
 **After (Corrected Code)**
               
                        ```Java
                              
                              // First check Equilateral explicitly
                                       if (a == b && b == c)
                                           return "Equilateral";
                                       // Then check for Isosceles triangle
                                       else if (a == b || b == c || a == c)
                                           return "Isosceles";
                                       // Finally, if none match, it must be Scalene
                                       else
                                           return "Scalene";

                        ```
In addition, my original implementation accepted side of zero or negative lengths and improperly attempted classification. For instance, `o, 5, 5` was identified as "Isosceles," and negative values like `-1, 4, 5` were considered Scalene.

**Before (Incorrect Code)**
                  
                   ```Java
                                       if (a == b && b == c)
                                           return "Equilateral";
                                       else if (a == b || b == c || a == c)
                                           return "Isosceles";
                                       else
                                           return "Scalene";
                   ```
                   
This line of code correctly identifies invalid inputs, preventing logical errors.

**After (Corrected Code)**
                       
                        ```Java
                        
                                // Explicitly handle zero or negative sides as invalid
                                 if ((a <= 0) || (b <= 0) || (c <= 0))
                                     return "Invalid";

                     ```

Furthermore, I encountered an inconsistency between the program's output and the expected result from the unit test. Initially, my application might return a classification like "Scalene Triangle," while the test expected a result like "Scalene."

**Before (Incorrect Code)**
                   
                   ```Java
                       System.out.println("The triangle is Scalene triangle");
                   
                  ```
                  
Below is the corrected implementation, which separates classifications for reliable testing and simplifies the process.

**After (Corrected Code)**
                       
                        ```Java
                             
                              System.out.println("The triangle is: " + result);
                     ```

I have completed a comprehensive update to my code, building on the previous version to enhance its robustness and handle various edge cases and invalid inputs. Although this was not a requirement, I wanted to ensure that validation checks, proper logical ordering of conditionals, and standardized output strings were incorporated for easier and more accurate testing.

In this final update, the main method includes rigorous input validation to ensure that only integer side-length inputs are accepted. It manages improper user input gracefully by clearly alerting the user and terminating execution when necessary. This thorough and systematic approach guarantees reliable functionality and simplifies both manual and automated testing.


**Before (Second Last Verison)**
                   
                   ```Java
                      
                       public class TraingleIdenitify {
                                  public static String identifyTriangle(int a, int b, int c) {
                                      if((a <= 0) || (b <= 0) || (c <= 0))
                                          return "Invalid";
                                      if ((a + b <=c || a + c <= b || b + c <= a))
                                          return "Invalid";
                                      if (a == b && b == c)
                                          return "Equilateral";
                                      else if (a == b || b == c || a == c)
                                          return "Isosceles";
                                      else
                                          return "Scalene";
                              
                                  }


                                     public static void main(String[] args) {
                                         Scanner sc = new Scanner(System.in);
                                         System.out.print("Enter side 1: ");
                                         int side1 = sc.nextInt();
                                 
                                         System.out.print("Enter side 2: ");
                                         int side2 = sc.nextInt();
                                 
                                         System.out.print("Enter side 3: ");
                                         int side3 = sc.nextInt();
                                 
                                         String result = identifyTriangle(side1, side2, side3);
                                         
                                     }
                                 }
                   
                   ```
                
  
   **After (Final Verison)**
                        
                        
                        ```Java
                              
                              import java.util.Scanner;
                                 
                                 /**
                                  * The TriangleIdentify class provides a method to determine the type of a triangle
                                  * based on the lengths of its three sides. It checks for the validity of the triangle
                                  * and classifies it as Equilateral, Isosceles, or Scalene.
                                  */
                                 public class TriangleIdentify {
                                     public static String identifyTriangle(int a, int b, int c) {
                                         if ((a <= 0) || (b <= 0) || (c <= 0))
                                             return "Invalid";
                                 
                                         // Check if the given sides can form a valid triangle
                                         if ((a + b <= c || a + c <= b || b + c <= a))
                                             return "Invalid";
                                 
                                         // Determine triangle type
                                         if (a == b && b == c)
                                             return "Equilateral";
                                         else if (a == b || b == c || a == c)
                                             return "Isosceles";
                                         else
                                             return "Scalene";
                                     }
                                 
                                     public static void main(String[] args) {
                                         Scanner sc = new Scanner(System.in);
                                 
                                         try {
                                             System.out.print("Enter side 1: ");
                                             if (!sc.hasNextInt()) {
                                                 System.out.println("Invalid input! Please enter an integer.");
                                                 return;
                                             }
                                             int side1 = sc.nextInt();
                                 
                                             System.out.print("Enter side 2: ");
                                             if (!sc.hasNextInt()) {
                                                 System.out.println("Invalid input! Please enter an integer.");
                                                 return;
                                             }
                                             int side2 = sc.nextInt();
                                 
                                             System.out.print("Enter side 3: ");
                                             if (!sc.hasNextInt()) {
                                                 System.out.println("Invalid input! Please enter an integer.");
                                                 return;
                                             }
                                             int side3 = sc.nextInt();
                                 
                                             String result = identifyTriangle(side1, side2, side3);
                                             System.out.println("The triangle is: " + result);
                                         } finally {
                                             sc.close(); // Close the Scanner in a finally block to ensure it gets closed
                                         }
                                     }
                                 }
                    
                     ```

## Problems
One of the main problems I encountered during this assignment involved using IntelliJ IDEA after becoming more familiar with Eclipse. Initially, setting up IntelliJ was challenging because my project was configured by default with Java 24, which caused runtime crashes and build errors, stating, "Release version 24 not supported." It took careful observation and trial and error to realize this issue was tied to the SDK version. I then navigated through the unfamiliar IDE menus. My project used Amazon Corretto 17, an alternative JDK, which required me to ensure compatibility and configure the project accordingly.

Another significant hurdle was setting up JUnit tests. Unlike Eclipse, IntelliJ IDEA doesn't automatically include JUnit support in plain Java projects. Initially, I couldn’t run tests because no visible play button or test runner configuration was available. It required close attention to IntelliJ’s menus and directories, marking the test directory explicitly as the "Test Sources Root," manually adding the JUnit library dependencies, and configuring run profiles correctly. These detailed configuration steps required careful observation and referencing documentation to finally see the green play button appear and successfully run the tests.

By comparison, debugging logic errors in the triangle classification was straightforward. Once the unit tests were properly set up and running, identifying and fixing bugs, such as triangle inequality validation and condition ordering, was simple. Unit tests indicated problematic scenarios, allowing for quick corrections. This experience reinforced the importance of careful initial setup.

## ScreenShots
Below are screenshots demonstrating the successful execution of the triangle classification program and the results of running the JUnit test suite. Each figure is labeled for clarity.

Figure 1: Example console output of the Triangle Classification program
Here are some ScreenShots of the test being performed
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
For recommendations, one suggestion is to include optional enhancements for students who complete the assignment quickly, thereby enriching their learning experience. One enhancement could involve extending the triangle classifier to determine the type of triangle based on its angles. In addition to the basic three types of triangles, students could learn to identify other classifications, such as acute, obtuse, and right triangles. Another interesting challenge would be to integrate a simple graphical user interface (GUI) that allows for the visualization of triangles and dynamically displays classification results. These enhancements would encourage deeper engagement and practice, especially if students also write corresponding unit tests to verify these new functionalities.

Moreover, the assignment could emphasize the importance of rigorous testing techniques, as highlighted in *The Art of Software Testing*. Specifically, providing guidance on boundary value analysis and equivalence class partitioning would be beneficial. Myers states, "…you use a combination of most, if not all, of them to design a rigorous test of a program since each method has distinct strengths and weaknesses. One method may find errors that another method overlooks, for example. Nobody ever promised that software testing would be easy" (*The Art of Software Testing*, Myers, Chapter 2). Encouraging students to explore edge cases, such as very large side lengths (e.g., Integer.MAX_VALUE) or non-integer inputs, would further deepen their understanding of robust testing strategies, even if handling such scenarios is optional or beyond the scope of the initial assignment.

## REFERENCES
Myers, G. J., Sandler, C., & Badgett, T. (2012). *The Art of Software Testing (3rd ed.)*. Wiley. 
https://learning.oreilly.com/library/view/the-art-of/9781118133156/

### Authors
Suvash Shrestha
Jose G Vallejo

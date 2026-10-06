# OOPS Lab Sheet 06 - Inheritance and Abstract Classes

This folder contains eleven beginner-friendly Java programs about method overriding, inheritance, abstract classes, and a simple average calculation. Each question has its own package, so repeated class names do not conflict. Question 11 reads ten numbers from the keyboard.

## Questions

1. `question01/Question01AnimalCat.java` - Cat overrides the animal sound method.
2. `question02/Question02VehicleCar.java` - Car overrides the vehicle drive method.
3. `question03/Question03RectangleArea.java` - Rectangle overrides the shape area method.
4. `question04/Question04HRManager.java` - HRManager overrides work and adds an employee.
5. `question05/Question05SavingsAccount.java` - SavingsAccount keeps at least 100 after a withdrawal.
6. `question06/Question06AnimalSounds.java` - Lion and Tiger implement an abstract sound method.
7. `question07/Question07ShapeMeasurements.java` - Circle and Triangle calculate area and perimeter.
8. `question08/Question08AccountTypes.java` - Savings and current accounts implement abstract banking operations.
9. `question09/Question09AnimalBehavior.java` - Lion, Tiger, and Deer implement eating and sleeping behavior.
10. `question10/Question10EmployeeRoles.java` - Manager and Programmer calculate and display salaries.
11. `question11/Question11AverageNumbers.java` - Calculates the average of ten numbers and counts those above it.

## Compile and Run

Open PowerShell in this folder and compile all programs into `out`:

```powershell
javac -d out (Get-ChildItem -Recurse -Filter *.java).FullName
```

Run a program using its package and class name:

```powershell
java -cp out labsheet06.question01.Question01AnimalCat
java -cp out labsheet06.question11.Question11AverageNumbers
```
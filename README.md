###inside src folder, go to lab7tasks folder, following are the file names
1. TASK1 - animal.java
2. TASK2 - shape.java
3. TASK3 - processPayment.java
4. TASK4 - employee.java
5. TASK5 - notification.java
6. TASK6 - transport.java
7. TASK7 - restaurant.java
8. TASK8 - smartDevice.java
9. TASK9 - ride.java
10. TASK10 - course.java

#LAB 07 TASKS

Q1. Create a parent class Animal with a method makeSound().
Create child classes:
1. Dog
2. Cat
3. Cow

Each class should override the makeSound() method.
Write a Java program to demonstrate runtime polymorphism.

Q2. Create a class Shape with a method area().
Create subclasses:
1. Circle
2. Rectangle
3. Triangle

Each subclass should override the area() method to calculate its specific area.
Demonstrate dynamic method binding using a parent class reference.

Q3. Create a class Payment with a method processPayment().
Create subclasses:
1. CreditCard
2. DebitCard
3. PayPal

Override the method in each class to display different payment processing messages.

Q4. Create a parent class Employee with method calculateSalary().
Create subclasses:
1. Manager
2. Developer
3. Intern

Each subclass should override the method with different salary calculations.

Q5. Create a class Notification with method send().
Create subclasses:
1. EmailNotification
2. SMSNotification
3. PushNotification

Each subclass should override the method and display a different notification message.

Q6. Create a parent class Transport with method fare().
Create subclasses:
1. Bus
2. Train
3. Taxi

Each class should override the fare() method and display different fare calculations.

Q7. A food delivery application allows customers to order food from different types of
restaurants. Each restaurant calculates delivery charges differently.
Create a parent class Restaurant with a method:
1. calculateDeliveryFee(double distance)

Create the following subclasses:
1. FastFoodRestaurant
2. FineDiningRestaurant
3. CafeRestaurant
Each subclass should override the calculateDeliveryFee() method using different
formulas.

Requirements:
1. Use runtime polymorphism
2. Create objects of different restaurant types using the Restaurant reference
3. Display the delivery fee for each type of restaurant.

Q8. A smart home system controls different electronic devices such as lights, fans, and
air conditioners. Each device has its own way of turning on.
Create a parent class SmartDevice with a method:
1. turnOn()

Create the following subclasses:
1. SmartLight
2. SmartFan
3. SmartAC
Each subclass should override the turnOn() method to display different behavior.

Requirements:
1. Use runtime polymorphism
2. Store device objects in an array of SmartDevice
3. Loop through the array and call turnOn().

Q9. A ride-sharing application calculates the fare differently depending on the type of
ride selected by the user.
Create a parent class Ride with method:
1. calculateFare(double distance)

Create subclasses:
1. BikeRide
2. CarRide
3. LuxuryRide

Each subclass should override the method and calculate fare using different rates per kilometer.

Requirements:
1. Demonstrate runtime polymorphism
2. Use a Ride reference variable
3. Display fare for different ride types.

Q10. An online learning platform calculates final grades differently for different types of courses.
Create a parent class Course with method:
1. calculateGrade(int assignments, int exams)

Create subclasses:
1. ProgrammingCourse
2. MathematicsCourse
3. DesignCourse

Each subclass should override the calculateGrade() method using different grading formulas.
Requirements:
1. Demonstrate runtime polymorphism
2. Use a parent class reference to call child class implementations.

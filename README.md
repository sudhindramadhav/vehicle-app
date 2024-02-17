# vehicle-app

This project aims to create a Java program that manages the speed and direction of a car using inheritance. The program will have a base class called Vehicle, which will contain common properties and methods for all vehicles. The Car class will inherit from the Vehicle class and will contain additional properties and methods specific to cars.


The Vehicle class will have the following properties and methods:

speed: an integer representing the speed of the vehicle.
direction: a string representing the direction in which the vehicle is moving.
move(): a method to move the vehicle forward based on its current speed and direction.
steer(String newDirection): a method to change the direction of the vehicle.

The Car class will inherit these properties and methods from the Vehicle class and will also have the following additional properties and methods:

gear: an integer representing the current gear of the car.
changeGear(int newGear): a method to change the gear of the car.
changeSpeed(int newSpeed): a method to change the speed of the car.

The SUV class will inherit from the Car class and will add the following method:

accelerate(int speedIncreas

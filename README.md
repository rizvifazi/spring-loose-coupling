# Spring demo project for Loose Coupling and Dependency Injection

This is a simple Spring demo project that demonstrates loose coupling and dependency injection. 

## Project Structure

The project is structured as follows:

- [src/main/java/com/loosecp](cci:7://file:///c:/Users/acer/Documents/JavaWorkspace/spring-loose-coupling/src/main/java/com/loosecp:0:0-0:0): Contains the main classes of the project.
  - `Vehicle.java`: An interface that defines the common behavior of all vehicles.
  - `Car.java`: A concrete implementation of the [Vehicle](cci:2://file:///c:/Users/acer/Documents/JavaWorkspace/spring-loose-coupling/src/main/java/com/loosecp/Vehicle.java:2:0-4:1) interface.
  - `Bike.java`: Another concrete implementation of the [Vehicle](cci:2://file:///c:/Users/acer/Documents/JavaWorkspace/spring-loose-coupling/src/main/java/com/loosecp/Vehicle.java:2:0-4:1) interface.
  - `Cycle.java`: Another concrete implementation of the [Vehicle](cci:2://file:///c:/Users/acer/Documents/JavaWorkspace/spring-loose-coupling/src/main/java/com/loosecp/Vehicle.java:2:0-4:1) interface.
  - `Traveler.java`: A class that uses dependency injection to get instances of [Vehicle](cci:2://file:///c:/Users/acer/Documents/JavaWorkspace/spring-loose-coupling/src/main/java/com/loosecp/Vehicle.java:2:0-4:1) and move around.
  - `AppConfig.java`: A configuration class that defines the beans for the project.
  - `LooseCoupleDI.java`: The main class that creates the Spring context and demonstrates the usage of the project.

## Running the Project

To run the project, you need to have Maven installed. You can run the project using the following command:
 
  `mvn exec:java`
 
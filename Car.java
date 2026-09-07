package carclass;

class Car {
    String model;
    String color;

    // Method to start the car
    void start() {
        System.out.println(model + " (" + color + ") has started.");
    }

    // Method to stop the car
    void stop() {
        System.out.println(model + " (" + color + ") has stopped.");
    }

    public static void main(String[] args) {

        // 1. Normal case
        Car car1 = new Car();
        car1.model = "Tesla Model 3";
        car1.color = "Red";
        car1.start();
        car1.stop();

        // 2. Default values
        Car car2 = new Car();
        car2.start();

        // 3. Different attribute values
        Car car3 = new Car();
        car3.model = "Honda Civic";
        car3.color = "Blue";
        car3.start();

        // 4. Multiple objects
        Car c1 = new Car();
        c1.model = "BMW X5";
        c1.color = "Black";

        Car c2 = new Car();
        c2.model = "Audi A4";
        c2.color = "White";

        c1.start();
        c2.start();

        // 5. start() without stop()
        Car car5 = new Car();
        car5.model = "Maruti Swift";
        car5.color = "Grey";
        car5.start();

        // 6. stop() without start()
        Car car6 = new Car();
        car6.model = "Hyundai Creta";
        car6.color = "Silver";
        car6.stop();

        // 7. Modify attribute after creation
        Car car7 = new Car();
        car7.model = "Kia Seltos";
        car7.color = "Red";
        car7.start();

        car7.color = "Blue";
        car7.start();

        // 8. Empty string attributes
        Car car8 = new Car();
        car8.model = "";
        car8.color = "";
        car8.start();

        // 9. Repeated method call
        Car car9 = new Car();
        car9.model = "Toyota";
        car9.color = "White";
        car9.start();
        car9.start();

        // 10. Sequential start/stop/start
        Car car10 = new Car();
        car10.model = "Ford";
        car10.color = "Black";
        car10.start();
        car10.stop();
        car10.start();
    }
}
//MethodOverriding Program
class Vehicle {
    void  run()
    {
        System.out.println("Vehicle is Running");

    }
}
class Car extends Vehicle{
    void run()
    {
        System.out.println("Car is Running");
    }

    public static void main(String[] args) {
        Car c=new Car();
        c.run();
    }
}

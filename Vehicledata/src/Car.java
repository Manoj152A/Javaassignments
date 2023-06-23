public class Car extends Vehicle{
    public Car(String make, String model) {
        super(make,model);
    }
    public String drive(){
        return "Car name is " + make + model;
    }
}
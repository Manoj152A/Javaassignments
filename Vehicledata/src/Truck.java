public class Truck extends Vehicle{
    public Truck(String make,String model){
        super(make,model);
    }
    public String drive(){
        return "TruckData: " + make + " " + model;
    }
}

public class main {
    public static void main(String[]args){
        Car car=new Car("hyundai","camry");
        Truck truck=new Truck("Volvo","Semibig");
        System.out.println(car.drive());
        System.out.println(truck.drive());

    }
}

public class Main {
    public static void main(String[] args) {
        House myhouse=new House();
        myhouse.setAddress("3524 Corners way avenue");
        myhouse.setSqft(1800);
        myhouse.setNumRooms(5);
        System.out.println("Address:"+myhouse.getAddress());
        System.out.println("sqft:"+myhouse.getSqft());
        System.out.println("Numrooms:"+myhouse.getNumRooms());
    }
}

public class Main {

    final static String COMPANY_NAME = "AutoSecure Ltd";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("       VEHICLE HIERARCHY SYSTEM        ");
        System.out.println("Company: " + COMPANY_NAME);
        System.out.println("========================================");

        System.out.println("1. Car");
        System.out.println("2. Bike");
        System.out.print("Choose Vehicle Type: ");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter Manufacturing Year: ");
        int year = sc.nextInt();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        Insurable vehicle;
        Vehicle baseRef;

        if (choice == 1) {
            baseRef = new Car(brand, year, price);
            vehicle = (Insurable) baseRef;
        } else {
            baseRef = new Bike(brand, year, price);
            vehicle = (Insurable) baseRef;
        }

        baseRef.showVehicleInfo();       
        vehicle.calculateInsurance();    

        System.out.println("Total Vehicles Registered: " + Vehicle.vehicleCount);
        System.out.println("========================================");

        sc.close();
    }
}
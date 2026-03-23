public class Main {

    final static String HOSPITAL_CODE = "HSP2026";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("          WELCOME TO CITY HOSPITAL               ");
        System.out.println("Hospital Code : " + HOSPITAL_CODE);
        System.out.println("==================================================");

        System.out.println("1. Register Doctor");
        System.out.println("2. Register Patient");
        System.out.print("Enter Your Choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {

            case 1:
                System.out.print("Enter Doctor ID: ");
                int did = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Doctor Name: ");
                String dname = sc.nextLine();

                System.out.print("Enter Department: ");
                String dept = sc.nextLine();

                Doctor doc = new Doctor(did, dname, dept);
                doc.showDoctorDetails();
                break;

            case 2:
                System.out.print("Enter Patient ID: ");
                int pid = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Patient Name: ");
                String pname = sc.nextLine();

                System.out.print("Enter Illness: ");
                String illness = sc.nextLine();

                System.out.print("Enter Treatment Cost: ");
                double cost = sc.nextDouble();

                // Polymorphism
                Billable billObj = new Patient(pid, pname, illness, cost);

                Patient pat = (Patient) billObj;
                pat.showPatientDetails();
                billObj.generateBill();
                break;

            default:
                System.out.println("Invalid Option!");
        }

        sc.close();
    }
}
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== ROLE BASED SYSTEM =====");
        System.out.println("1. Employee");
        System.out.println("2. Student");
        System.out.print("Choose Role: ");
        int choice = sc.nextInt();

        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        User user;

        if (choice == 1) {
            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();
            user = new Employee(id, name, salary);
        } else {
            System.out.print("Enter Course Name: ");
            String course = sc.nextLine(); 
            user = new Student(id, name, course);
        }

        System.out.println("\n--- USER DETAILS ---");
        user.displayDetails();   

        System.out.println("===== ACCOUNT SECTION =====");
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        Account acc = new Account(accNo, balance);

        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.print("Choose Option: ");
        int option = sc.nextInt();

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();

        if (option == 1) {
            acc.deposit(amount);
        } else {
            acc.withdraw(amount);
        }

        acc.showBalance();

        sc.close();
    }
}
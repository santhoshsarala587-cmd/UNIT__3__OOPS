import java.util.Scanner;

class User {
    protected int id;
    protected String name;
    protected String role;

    public User(int id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }

    public void displayDetails() {
        System.out.println("User ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
    }
}

class Employee extends User {
    private double salary;

    public Employee(int id, String name, double salary) {
        super(id, name, "Employee");
        this.salary = salary;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Salary: " + salary);
        System.out.println("------------------------");
    }
}

class Student extends User {
    private String courseName;

    public Student(int id, String name, String courseName) {
        super(id, name, "Student");
        this.courseName = courseName;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Enrolled Course: " + courseName);
        System.out.println("------------------------");
    }
}

class Account {
    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited Successfully!");
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal Successful!");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    public void showBalance() {
        System.out.println("Current Balance: " + balance);
        System.out.println("------------------------");
    }
}
import java.util.Scanner;

interface Billable {
    void generateBill();
}

class HospitalMember {
    protected int memberId;
    protected String memberName;

    public HospitalMember(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public void showBasicInfo() {
        System.out.println("--------------------------------------------------");
        System.out.println("Basic Information");
        System.out.println("--------------------------------------------------");
        System.out.println("Member ID        : " + memberId);
        System.out.println("Name             : " + memberName);
    }
}

class Doctor extends HospitalMember {

    private String department;
    static int doctorCount = 0;

    public Doctor(int id, String name, String department) {
        super(id, name);
        this.department = department;
        doctorCount++;
    }

    public void showDoctorDetails() {
        System.out.println("==================================================");
        System.out.println("               DOCTOR DETAILS                    ");
        System.out.println("==================================================");
        showBasicInfo();
        System.out.println("Department       : " + department);
        System.out.println("Total Doctors    : " + doctorCount);
        System.out.println("==================================================");
    }
}

class Patient extends HospitalMember implements Billable {

    private String illness;
    private double treatmentCost;
    private final double registrationFee = 300;
    static int totalPatients = 0;

    public Patient(int id, String name, String illness, double treatmentCost) {
        super(id, name);
        this.illness = illness;
        this.treatmentCost = treatmentCost;
        totalPatients++;
    }

    public void showPatientDetails() {
        System.out.println("==================================================");
        System.out.println("               PATIENT DETAILS                   ");
        System.out.println("==================================================");
        showBasicInfo();
        System.out.println("Illness          : " + illness);
        System.out.println("Total Patients   : " + totalPatients);
    }

    @Override
    public void generateBill() {
        double total = registrationFee + treatmentCost;

        System.out.println("--------------------------------------------------");
        System.out.println("                 BILL DETAILS                    ");
        System.out.println("--------------------------------------------------");
        System.out.println("Registration Fee : " + registrationFee);
        System.out.println("Treatment Cost   : " + treatmentCost);
        System.out.println("Total Bill       : " + total);
        System.out.println("==================================================");
    }
}
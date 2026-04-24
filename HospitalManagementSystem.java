import java.util.*;

class Patient {
    int id;
    String name;
    int age;
    String disease;

    Patient(int id, String name, int age, String disease) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.disease = disease;
    }

    void display() {
        System.out.println("Patient: " + id + " " + name + " " + age + " " + disease);
    }
}

class Doctor {
    int id;
    String name;
    String specialization;

    Doctor(int id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
    }

    void display() {
        System.out.println("Doctor: " + id + " " + name + " " + specialization);
    }
}

class Appointment {
    int patientId;
    int doctorId;
    String date;

    Appointment(int p, int d, String date) {
        this.patientId = p;
        this.doctorId = d;
        this.date = date;
    }

    void display() {
        System.out.println("Appointment -> PatientID: " + patientId + ", DoctorID: " + doctorId + ", Date: " + date);
    }
}

class Pharmacy {
    String name;
    int quantity;
    double price;

    Pharmacy(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    void display() {
        System.out.println("Medicine: " + name + " Qty: " + quantity + " Price: " + price);
    }
}

class Billing {
    int patientId;
    double amount;

    Billing(int id, double amt) {
        this.patientId = id;
        this.amount = amt;
    }

    void display() {
        System.out.println("Bill -> PatientID: " + patientId + " Amount: " + amount);
    }
}

class Ward {
    int wardNo;
    String type;

    Ward(int no, String type) {
        this.wardNo = no;
        this.type = type;
    }

    void display() {
        System.out.println("Ward: " + wardNo + " Type: " + type);
    }
}

public class HospitalManagementSystem {

    static Scanner sc = new Scanner(System.in);

    static ArrayList<Patient> patients = new ArrayList<Patient>();
    static ArrayList<Doctor> doctors = new ArrayList<Doctor>();
    static ArrayList<Appointment> appointments = new ArrayList<Appointment>();
    static ArrayList<Pharmacy> medicines = new ArrayList<Pharmacy>();
    static ArrayList<Billing> bills = new ArrayList<Billing>();
    static ArrayList<Ward> wards = new ArrayList<Ward>();

    public static void main(String[] args) {
        int choice = -1;

        while (choice != 0) {
            System.out.println("\n===== HOSPITAL MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Patient");
            System.out.println("2. View Patients");
            System.out.println("3. Add Doctor");
            System.out.println("4. View Doctors");
            System.out.println("5. Book Appointment");
            System.out.println("6. View Appointments");
            System.out.println("7. Add Medicine");
            System.out.println("8. View Medicines");
            System.out.println("9. Generate Bill");
            System.out.println("10. View Bills");
            System.out.println("11. Add Ward");
            System.out.println("12. View Wards");
            System.out.println("0. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                addPatient();
            } else if (choice == 2) {
                viewPatients();
            } else if (choice == 3) {
                addDoctor();
            } else if (choice == 4) {
                viewDoctors();
            } else if (choice == 5) {
                bookAppointment();
            } else if (choice == 6) {
                viewAppointments();
            } else if (choice == 7) {
                addMedicine();
            } else if (choice == 8) {
                viewMedicines();
            } else if (choice == 9) {
                generateBill();
            } else if (choice == 10) {
                viewBills();
            } else if (choice == 11) {
                addWard();
            } else if (choice == 12) {
                viewWards();
            } else if (choice == 0) {
                System.out.println("Exiting...");
            } else {
                System.out.println("Invalid choice");
            }
        }
    }

    static void addPatient() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Disease: ");
        String disease = sc.nextLine();

        patients.add(new Patient(id, name, age, disease));
    }

    static void viewPatients() {
        for (int i = 0; i < patients.size(); i++) {
            patients.get(i).display();
        }
    }

    static void addDoctor() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Specialization: ");
        String spec = sc.nextLine();

        doctors.add(new Doctor(id, name, spec));
    }

    static void viewDoctors() {
        for (int i = 0; i < doctors.size(); i++) {
            doctors.get(i).display();
        }
    }

    static void bookAppointment() {
        System.out.print("Enter Patient ID: ");
        int pid = sc.nextInt();
        System.out.print("Enter Doctor ID: ");
        int did = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Date: ");
        String date = sc.nextLine();

        appointments.add(new Appointment(pid, did, date));
    }

    static void viewAppointments() {
        for (int i = 0; i < appointments.size(); i++) {
            appointments.get(i).display();
        }
    }

    static void addMedicine() {
        sc.nextLine();
        System.out.print("Enter Medicine Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();
        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        medicines.add(new Pharmacy(name, qty, price));
    }

    static void viewMedicines() {
        for (int i = 0; i < medicines.size(); i++) {
            medicines.get(i).display();
        }
    }

    static void generateBill() {
        System.out.print("Enter Patient ID: ");
        int pid = sc.nextInt();
        System.out.print("Enter Amount: ");
        double amt = sc.nextDouble();

        bills.add(new Billing(pid, amt));
    }

    static void viewBills() {
        for (int i = 0; i < bills.size(); i++) {
            bills.get(i).display();
        }
    }

    static void addWard() {
        System.out.print("Enter Ward Number: ");
        int num = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Type: ");
        String type = sc.nextLine();

        wards.add(new Ward(num, type));
    }

    static void viewWards() {
        for (int i = 0; i < wards.size(); i++) {
            wards.get(i).display();
        }
    }
}

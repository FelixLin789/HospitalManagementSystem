public class MainDriver {
    public static void main(String[] args) {

        // ===== 1. Create objects =====
        Doctor doctor = new Doctor(101, "Alice Chen", 45, "Cardiology", 150.0);
        Nurse nurse = new Nurse(201, "Brian Lee", 32, "Pediatrics", "Night");
        Surgeon surgeon = new Surgeon(301, "Carol Wang", 50, "General Surgery",
                300.0, "Heart Bypass", "OR-3");
        EmergencyDoctor erDoctor = new EmergencyDoctor(401, "David Kim", 38,
                "Emergency Medicine", 200.0);

        System.out.println("===== Doctor (Single Inheritance: Person -> Doctor) =====");
        doctor.displayDetails();
        doctor.diagnosePatient();

        System.out.println("\n===== Nurse (Hierarchical Inheritance: Person -> Nurse) =====");
        nurse.displayDetails();
        nurse.assistPatient();

        System.out.println("\n===== Surgeon (Multilevel Inheritance: Person -> Doctor -> Surgeon) =====");
        surgeon.displayDetails();
        surgeon.diagnosePatient();
        surgeon.performSurgery();

        System.out.println("\n===== EmergencyDoctor (Multiple Inheritance using Interfaces) =====");
        erDoctor.displayDetails();
        erDoctor.handleEmergency();

        System.out.println("\n===== Method Overriding: performDuties() =====");
        Person generalStaff = new Person(1, "General Staff", 30);
        generalStaff.performDuties();
        doctor.performDuties();
        nurse.performDuties();
        surgeon.performDuties();
        erDoctor.performDuties();

        System.out.println("\n===== Polymorphism: Person reference =====");
        Person person;

        person = new Doctor(102, "Emma Liu", 40, "Neurology", 180.0);
        person.performDuties();

        person = new Nurse(202, "Frank Wu", 29, "ICU", "Day");
        person.performDuties();

        person = new Surgeon(302, "Grace Zhao", 55, "Orthopedics", 350.0, "Knee Replacement", "OR-1");
        person.performDuties();

        person = new EmergencyDoctor(402, "Henry Xu", 36, "Emergency Medicine", 220.0);
        person.performDuties();

        System.out.println("\n===== Interfaces: MedicalProfessional & Billable =====");
        MedicalProfessional mp = erDoctor;
        mp.prescribeMedication();

        Billable billable = erDoctor;
        billable.generateBill();
    }
}
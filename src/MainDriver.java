public class MainDriver {
    public static void main(String[] args) {

        Doctor doctor = new Doctor(101, "Alice Chen", 45, "Cardiology", 150.0);
        Nurse nurse = new Nurse(201, "Brian Lee", 32, "Pediatrics", "Night");
        Surgeon surgeon = new Surgeon(301, "Carol Wang", 50, "General Surgery",
                300.0, "Heart Bypass", "OR-3");
        EmergencyDoctor erDoctor = new EmergencyDoctor(401, "David Kim", 38,
                "Emergency Medicine", 200.0);

        doctor.displayDetails();
        doctor.diagnosePatient();

        nurse.displayDetails();
        nurse.assistPatient();

        surgeon.displayDetails();
        surgeon.diagnosePatient();
        surgeon.performSurgery();

        erDoctor.displayDetails();
        erDoctor.handleEmergency();

        Person generalStaff = new Person(1, "General Staff", 30);
        generalStaff.performDuties();
        doctor.performDuties();
        nurse.performDuties();
        surgeon.performDuties();
        erDoctor.performDuties();

        Person person;

        person = new Doctor(102, "Emma Liu", 40, "Neurology", 180.0);
        person.performDuties();

        person = new Nurse(202, "Frank Wu", 29, "ICU", "Day");
        person.performDuties();

        person = new Surgeon(302, "Grace Zhao", 55, "Orthopedics", 350.0, "Knee Replacement", "OR-1");
        person.performDuties();

        person = new EmergencyDoctor(402, "Henry Xu", 36, "Emergency Medicine", 220.0);
        person.performDuties();

        MedicalProfessional mp = erDoctor;
        mp.prescribeMedication();

        Billable billable = erDoctor;
        billable.generateBill();
    }
}
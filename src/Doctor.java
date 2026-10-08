public class Doctor extends Person {
    private String specialization;
    private double consultationFee;

    public Doctor(int personID, String name, int age, String specialization, double consultationFee) {
        super(personID, name, age);
        this.specialization = specialization;
        this.consultationFee = consultationFee;
    }

    public String getSpecialization() {
        return specialization;
    }

    public double getConsultationFee() {
        return consultationFee;
    }

    public void diagnosePatient(){
        System.out.println("Dr. " + getName() + " is diagnosing a patient in " + specialization + ".");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Specialization: " + specialization + " | Consultation Fee: $" + consultationFee);
    }

    @Override
    public void performDuties() {
        System.out.println("Dr. " + getName() + " is performing medical duties.");
    }
}

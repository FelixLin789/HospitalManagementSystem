public class EmergencyDoctor extends Doctor implements MedicalProfessional, Billable {
    public EmergencyDoctor(int personId, String name, int age, String specialization, double consultationFee) {
        super(personId, name, age, specialization, consultationFee);
    }

    public void handleEmergency() {
        System.out.println("Dr. " + getName() + " is handling an emergency.");
    }

    @Override
    public void prescribeMedication() {
        System.out.println("Dr. " + getName() + " is prescribing medication.");
    }

    @Override
    public void generateBill() {
        double emergencySurcharge = 200.0;
        double total = getConsultationFee() + emergencySurcharge;
        System.out.println("Bill for Dr. " + getName() + ": Consultation $" + getConsultationFee()
                + " + Emergency Surcharge $" + emergencySurcharge + " = Total $" + total);
    }

    @Override
    public void performDuties() {
        System.out.println("Dr. " + getName() + " is performing emergency duties.");
    }
}

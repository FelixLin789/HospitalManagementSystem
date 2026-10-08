public class Surgeon extends Doctor {
    private String surgeryType;
    private String operatingRoom;

    public Surgeon(int personId, String name, int age, String specialization, double consultationFee, String surgeryType, String operatingRoom) {
        super(personId, name, age, specialization, consultationFee);
        this.surgeryType = surgeryType;
        this.operatingRoom = operatingRoom;
    }

    public String getSurgeryType() {
        return surgeryType;
    }

    public String getOperatingRoom() {
        return operatingRoom;
    }

    public void performSurgery() {
        System.out.println("Dr. " + getName() + " is performing a " + surgeryType + " in operating room " + operatingRoom + ".");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Surgery Type: " + surgeryType + " | Operating Room: " + operatingRoom);
    }

    @Override
    public void performDuties() {
        System.out.println("Dr. " + getName() + " is performing a surgical procedure.");
    }
}

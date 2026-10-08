public class Nurse extends Person {
    private String department;
    private String shift;

    public Nurse(int personID, String name, int age, String department, String shift) {
        super(personID, name, age);
        this.department = department;
        this.shift = shift;
    }

    public String getDepartment() {
        return department;
    }

    public String getShift() {
        return shift;
    }

    public void assistPatient(){
        System.out.println("Nurse " + getName() + " is assisting a patient.");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department + " | Shift: " + shift);
    }

    @Override
    public void performDuties() {
        System.out.println("Nurse " + getName() + " is performing nursing duties.");
    }
}

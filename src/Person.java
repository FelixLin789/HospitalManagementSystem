public class Person {
    private int personID;
    private String name;
    private int age;

    public Person(int personID, String name, int age) {
        this.personID = personID;
        this.name = name;
        this.age = age;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void displayDetails(){
        System.out.println("Person ID: " + personID + " | Name: " + name + " | Age: " + age);
    }
    public void performDuties(){
        System.out.println(name+" is performing general hospital duties.");
    }
}

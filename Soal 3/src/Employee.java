public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    // Constructor
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // Getter ny
    public int getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }
    //setter ny
    public void setSalary(int salary) {
        this.salary = salary;
    }
    // nge get salary terus dikalikan 12
    public int getAnnualSalary() {
        return salary * 12;
    }
    // method buat naikkan salary ny
    public int raiseSalary(int percent) {
        double naik = (double) percent / 100 * salary;
        salary += naik;
        return salary;
    }
    // ngoverride toString bawaan java.lang.Object
    public String toString() {
        return "Employee[id=" + id + ", name=" + getName() + ", salary=" + salary + "]";
    }
}
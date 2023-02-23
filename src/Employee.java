public class Employee {
    private int id;
    private String name;
    private int age;
    private String department;
    private String destination;
    private double salary;

    public Employee(int id, String name, int age, String department, String destination, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.destination = destination;
        this.salary = salary;
    }

    public Employee(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                ", destination='" + destination + '\'' +
                ", salary=" + salary +
                '}';
    }
}

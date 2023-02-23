import java.util.HashSet;
import java.util.Scanner;

public class EmployeeServices {

    public EmployeeServices(){
        empHash.add(emp1);
        empHash.add(emp2);
        empHash.add(emp3);
        empHash.add(emp4);
    }

    HashSet<Employee> empHash = new HashSet<Employee>();
    Scanner sc = new Scanner(System.in);

    Employee employee = new Employee();
    Employee emp1 = new Employee(1,"Hansaka", 25,"IT","Admin",175000);
    Employee emp2 = new Employee(2,"Mihisara", 20,"Testing","QA",125000);
    Employee emp3 = new Employee(3,"Tharushi", 22,"IT","SE",150000);
    Employee emp4 = new Employee(4,"Induwara", 25,"Developer","Web Developer",115000);

    public void addEmployee(){
        Employee newEmployee = new Employee();
        System.out.println("Please fill this form to add to the system");
        System.out.println("Enter your id. Id should be unique and it should be an integer.");
        int userId = sc.nextInt();
        newEmployee.setId(userId);

        System.out.println("Please enter your name.");
        String userName = sc.next();
        newEmployee.setName(userName);

        System.out.println("Please enter your age");
        int userAge = sc.nextInt();
        newEmployee.setAge(userAge);

        System.out.println("Please enter your department");
        String userDepartment = sc.next();
        newEmployee.setDepartment(userDepartment);

        System.out.println("Please enter your destination");
        String userDestination = sc.next();
        newEmployee.setDestination(userDestination);

        System.out.println("Please enter your salary");
        double userSalary = sc.nextDouble();
        newEmployee.setSalary(userSalary);

        empHash.add(newEmployee);
        System.out.println("---------------------------");
        System.out.println("Employee added.");
        System.out.println(newEmployee);

    }

    public void updateEmployee(){
        System.out.println("Please enter the id of the employee to update");
        int idinput = sc.nextInt();
        boolean found = false;
        for (Employee emp:empHash){
            if (emp.getId()==idinput){
                found=true;
                System.out.println("Enter name");
                String name = sc.next();
                emp.setName(name);

                System.out.println("Enter age");
                int age = sc.nextInt();
                emp.setAge(age);

                System.out.println("Enter department");
                String department = sc.next();
                emp.setDepartment(department);

                System.out.println("Enter destination");
                String destination = sc.next();
                emp.setDestination(destination);

                System.out.println("Enter salary");
                double salary = sc.nextDouble();
                emp.setSalary(salary);

                System.out.println("-------------------------------");
                System.out.println("Employee Edited Successfully");
                System.out.println(emp);
            }
        }if (!found){
            System.out.println("Employee with this id is not found");
        }
    }

    public void viewEmployee(){
        System.out.println("Enter the id of the employee to view the details");
        int input = sc.nextInt();
        boolean found = false;
        for (Employee emp:empHash){
            if (emp.getId()==input){
                System.out.println(emp.getName()+"'s details:");
                System.out.println("");
                System.out.println(emp);
                found = true;
            }
        }if (!found){
            System.out.println("Employee not found");
        }
    }

    public void deleteEmployee(){
        System.out.println("Enter the id of the employee to to delete");
        int input = sc.nextInt();
        Employee employee = null;
        boolean found = false;
        for (Employee emp:empHash){
            if (emp.getId()==input){
                employee = emp;
                found=true;
            }
        }if (!found){
            System.out.println("Employee not found");
        }else{
            empHash.remove(employee);
            System.out.println("Employee deleted successfully");
        }
    }

    public void viewAllEmployees(){
        System.out.println("");
        for (Employee emp:empHash){
            System.out.println(emp);
        }
        System.out.println("");
    }
}

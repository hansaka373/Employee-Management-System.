import java.util.Scanner;

public class Main {

    public static void menu(){
        System.out.println("Employee Management System");
        System.out.println("---------------------------------------------");
        System.out.println("");
        System.out.println("Enter `1` to add an employee");
        System.out.println("Enter `2` to View employee");
        System.out.println("Enter `3` to update an Employee");
        System.out.println("Enter `4` to delete an employee");
        System.out.println("Enter `5` to view all employees");
        System.out.println("Enter `6` to exit");
        System.out.println("---------------------------------------------");
    }

    private static boolean option = true;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeServices es = new EmployeeServices();

        do{
            menu();
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Add Employee");
                    es.addEmployee();
                    break;
                case 2:
                    System.out.println("View Employee");
                    es.viewEmployee();
                    break;
                case 3:
                    System.out.println("Update Employee");
                    es.updateEmployee();
                    break;
                case 4:
                    System.out.println("Delete Employee");
                    es.deleteEmployee();
                    break;
                case 5:
                    System.out.println("View all employee");
                    es.viewAllEmployees();
                    System.out.println("-------------------------------------------------------");
                    System.out.println("");
                    break;
                case 6:
                    System.out.println("Thank you for using our system.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input. Try again!");
                    break;
            }

        }while(option);
    }
}

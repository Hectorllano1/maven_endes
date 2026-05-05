import java.util.ArrayList;
import java.util.List;

/**
 * Gestiona los empleados del sistema.
 */
public class EmployeeManager {

    private List<Employee> employees = new ArrayList<>();

    /**
     * Añade un nuevo empleado al sistema.
     * @param name nombre del empleado
     * @param years años en la empresa
     */
    public void addEmployee(String name, int years) {
        Employee employee = new Employee(name, years);
        employees.add(employee);
        System.out.println(name + " añadido al sistema.");
    }

    /**
     * Muestra la lista de empleados.
     */
    public void printEmployees() {
        System.out.println("Lista de empleados:");

        for (Employee e : employees) {
            System.out.println(e.getName() + ", Años en la empresa: " + e.getYears());
        }
    }

    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();

        manager.addEmployee("John Doe", 5);
        manager.addEmployee("Jane Smith", 2);

        manager.printEmployees();
    }
}

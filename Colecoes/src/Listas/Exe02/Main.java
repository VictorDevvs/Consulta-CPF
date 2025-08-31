package Listas.Exe02;

import java.util.ArrayList;
import java.util.List;
import static Listas.Exe02.Employee.status.ACTIVE;
import static Listas.Exe02.Employee.status.INACTIVE;

public class Main {

    public static void main(String[] args) {

        var employees = List.of(
                new Employee("João", ACTIVE),
                new Employee("Victor", INACTIVE)
        );

        var activeEmployees = removeInactive(employees);
        System.out.println(employees);
        System.out.println(activeEmployees);

    }

        private static List<Employee> removeInactive(List<Employee> employees){
            var activeEmployees = new ArrayList<Employee>();
            activeEmployees.addAll(employees);
            var iter = activeEmployees.iterator();

            while (iter.hasNext()){
                Employee e = iter.next();
                if (e.getStatus() == INACTIVE){
                    iter.remove();
                }
            }

            return activeEmployees;
        }

    }


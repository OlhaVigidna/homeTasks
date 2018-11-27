package enterpriseRegistration;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Department {
    Set<Worker> department;
    private String departmentName;

    public Department(Set<Worker> department, String departmentName) {
        this.department = department;
        this.departmentName = departmentName;
    }

    public Set<Worker> getDepartment() {
        return department;
    }

    public void setDepartment(Set<Worker> department) {
        this.department = department;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "department=" + department +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }



    public static Set<Worker> deleteWorker(Set<Worker> workers){
        System.out.println("enter worker name");
        String workerName = new Scanner(System.in).nextLine();
        Iterator<Worker> iterator = workers.iterator();
        while (iterator.hasNext()){
            Worker lokWorker = iterator.next();
            if (lokWorker.getName().equals(workerName)){
                iterator.remove();
            }
        }
        return workers;
    }

    public static Set<Worker> addWorker(Set<Worker> workers){
        workers.add(initialize());
        return workers;
    }

    public static Worker initialize(){
        System.out.println("enter worker's name");
        String name = new Scanner(System.in).nextLine();
        Worker worker = new Worker(name);

        return worker;
    }
}

package enterpriseRegistration;

import java.util.Objects;

public class Worker implements Comparable<Worker>{
    private String name;
    private int qualification;

    public Worker(String name) {
        this.name = name;
        this.qualification = (int) Math.round(1 + Math.random()*9);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQualification() {
        return qualification;
    }

    public void setQualification(int qualification) {
        this.qualification = qualification;
    }

    @Override
    public int compareTo(Worker o) {
        return this.getName().compareTo(o.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return qualification == worker.qualification &&
                Objects.equals(name, worker.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, qualification);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", qualification=" + qualification +
                '}';
    }
}

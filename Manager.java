public class Manager extends Worker {
    private int salary;

    public Manager(String name, String otdel, String tel) {
        super(name, otdel, tel);
        this.salary = 30000;
    }

    @Override
    public String toString() {
        return String.format("%d: %s %s %s %d", getIdCurrent(), name, otdel, tel, salary);
    }

    @Override
    public void addSalary(int salary) {
        this.salary = salary;
    }
}

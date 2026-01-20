package model;

public abstract class Staff {
    protected int staffId;
    protected String name;
    protected double salary;
    protected int experienceYears;

    public Staff(int staffId, String name, double salary, int experienceYears) {
        setStaffId(staffId);
        setName(name);
        setSalary(salary);
        setExperienceYears(experienceYears);
    }

    public void displayInfo() {
        System.out.println(getRole() + ": " + name + " - " + salary + " KZT, Experience: " + experienceYears + " years");
    }

    public abstract void work();
    public abstract String getRole();

    public void setStaffId(int staffId) {
        if (staffId <= 0) throw new IllegalArgumentException("Staff ID must be positive");
        this.staffId = staffId;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) throw new IllegalArgumentException("Name cannot be empty");
        this.name = name;
    }

    public void setSalary(double salary) {
        if (salary < 0) throw new IllegalArgumentException("Salary cannot be negative");
        this.salary = salary;
    }

    public void setExperienceYears(int experienceYears) {
        if (experienceYears < 0) throw new IllegalArgumentException("Experience years cannot be negative");
        this.experienceYears = experienceYears;
    }
}
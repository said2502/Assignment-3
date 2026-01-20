package model;

public class Chef extends Staff {
    private String specialization;

    public Chef(int staffId, String name, double salary, int experienceYears, String specialization) {
        super(staffId, name, salary, experienceYears);
        setSpecialization(specialization);
    }

    @Override
    public void work() {
        System.out.println("Chef " + name + " is cooking " + specialization + " dishes.");
    }

    @Override
    public String getRole() {
        return "Chef";
    }

    public void cookDish(String dishName) {
        System.out.println("Chef " + name + " is preparing: " + dishName);
    }

    public void setSpecialization(String specialization) {
        if (specialization == null || specialization.trim().isEmpty()) throw new IllegalArgumentException("Specialization cannot be empty");
        this.specialization = specialization;
    }
}
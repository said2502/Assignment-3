package model;

public class Waiter extends Staff {
    private int serviceRating;

    public Waiter(int staffId, String name, double salary, int experienceYears, int serviceRating) {
        super(staffId, name, salary, experienceYears);
        setServiceRating(serviceRating);
    }

    @Override
    public void work() {
        System.out.println("Waiter " + name + " is serving customers with rating " + serviceRating);
    }

    @Override
    public String getRole() {
        return "Waiter";
    }

    public void setServiceRating(int serviceRating) {
        if (serviceRating < 0 || serviceRating > 100) throw new IllegalArgumentException("Service rating must be between 0 and 100");
        this.serviceRating = serviceRating;
    }
}
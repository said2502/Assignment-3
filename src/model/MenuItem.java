package model;

public class MenuItem implements Cookable {
    private String name;
    private double price;

    public MenuItem(String name, double price) {
        setName(name);
        setPrice(price);
    }

    @Override
    public void cook() {
        System.out.println("Cooking " + name + " ...");
    }

    @Override
    public String getRecipe() {
        return "Recipe for " + name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) throw new IllegalArgumentException("Name cannot be empty");
        this.name = name;
    }

    public void setPrice(double price) {
        if (price < 0) throw new IllegalArgumentException("Price cannot be negative");
        this.price = price;
    }
}
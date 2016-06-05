package enum_practice;

public enum SoftDrink{
    COKE("Coke", 75),
    PEPSI("Pepsi", 75),
    SODA("Soda", 90),
    LIME("Lime", 50),
    THUMPS_UP("India",40);

    // Java Enum can have member variables
    private String title;
    private int price; // in cents

    // You can declare constructor for Enum in Java
    private SoftDrink(String title, int price){
        this.title = title;
        this.price = price;
    }

    // Enum can have methods in Java
    public String getTitle(){
        return title;
    }

    public int getPrice(){
        return price;
    }

    // Enum can override methods in Java
    @Override
    public String toString() {
        return title;
    }

}
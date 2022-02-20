package Store;

public class Beverage extends Product{
    private Date date;

    public Beverage(String name, String brand, double price, Date date) {
        super(name, brand, price);
        this.date = date;
    }
}

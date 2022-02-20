package Store;

public class Appliances extends Product {
    private String model;
    private Date productionDate;
    private double weight;
    private Date purchasedDate;

    public Appliances(String name, String brand, double price, String model, Date productionDate, double weight, Date purchasedDate) {
        super(name,
                brand,
                price);
        this.model = model;
        this.productionDate = productionDate;
        this.weight = weight;
        this.purchasedDate = purchasedDate;
        setPrice(price);
    }

    @Override
    public void setPrice(double price) {
        if (super.getPrice() > 999 && purchasedDate.getDay().equals("Saturday") || purchasedDate.getDay().equals("Sunday")) {
            super.setPrice(price * 0.7);
        }
    }
}

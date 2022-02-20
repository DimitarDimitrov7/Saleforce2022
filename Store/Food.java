package Store;

public class Food extends Product {

    private Date expirationDate;

    public Food(String name, String brand, double price, Date expirationDate) {
        super(name, brand, price);
        this.expirationDate = expirationDate;
    }


    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }


    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }

    public void setPrice(Date now) {
        if (this.getExpirationDate().getYear().equals(now.getYear()) && this.expirationDate.getMonth().equals(now.getMonth())) {
            int dayToExpire = Integer.parseInt(this.expirationDate.getDay());
            int nowDay = Integer.parseInt(now.getDay());
            if (dayToExpire - nowDay <= 5) {

                super.setPrice(getPrice() * 0.3);
            }
            if (dayToExpire - nowDay == 0) {
                super.setPrice(getPrice() * 0.7);
            }
        }
    }

}

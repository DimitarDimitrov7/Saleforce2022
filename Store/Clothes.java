package Store;
import java.util.*;
public class Clothes extends Product{
    private List<Size> sizes;
    private List<Color> colors;

    public Clothes(String name, String brand, double price, List<Size> sizes, List<Color> colors) {
        super(name, brand, price);
        this.sizes = sizes;
        this.colors = colors;
    }
}

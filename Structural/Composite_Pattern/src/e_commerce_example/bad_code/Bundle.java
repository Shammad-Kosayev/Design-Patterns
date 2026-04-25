package e_commerce_example.bad_code;

import java.util.ArrayList;
import java.util.List;

public class Bundle {

    private List<Product> products = new ArrayList<>();
    private List<Bundle> bundles = new ArrayList<>();
    //if another type exists, must be added here as list

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addBundle(Bundle bundle) {
        bundles.add(bundle);
    }

    // new add method has to be added if new type exists

    public double getPrice() {
        double total = 0;

        for (Product product : products) {
            total += product.getPrice();
        }

        for (Bundle bundle : bundles) {
            total += bundle.getPrice();
        }

        // another for loop if another type exists

        return total;
    }
}

package e_commerce_example.good_code;

import java.util.ArrayList;
import java.util.List;

//Composite (Bundle)
public class Bundle implements OrderItem {

    private List<OrderItem> items = new ArrayList<>();

    public void add(OrderItem item) {
        items.add(item);
    }

    public double getPrice() {

        double total = 0;

        for (OrderItem item : items) {
            total += item.getPrice(); // 🔥 recursive
        }

        return total;
    }
}

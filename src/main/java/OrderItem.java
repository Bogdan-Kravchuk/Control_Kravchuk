import java.util.Objects;

public class OrderItem {
    private String id;
    private String nameItem;
    private double price;
    private OrderItem[] items;

    public OrderItem(String id, String nameItem, double price) {
        this.id = id;
        this.nameItem = nameItem;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return nameItem;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        OrderItem orderItem = (OrderItem) o;
        return Objects.equals(id, orderItem.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public OrderItem[] getItems() {
        return items.clone();
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "id='" + id + '\'' +
                ", nameItem='" + nameItem + '\'' +
                ", price=" + price +
                '}';
    }
}

package Models;

enum ProductType {
    SOFT_DRINK,
    ALCOHOL,
    SNACK,
    FOOD
}

public class Product {
    private long id;
    private String name;
    private double price;
    private ProductType type;
}

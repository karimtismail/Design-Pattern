package org.patterns.creational.singleton.productCatalogExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductCatalog {
    private static ProductCatalog instance;
    private Map<String, Product> products;

    private ProductCatalog() {
        // Private constructor to prevent instantiation from outside
        products = new HashMap<>();
    }

    public static synchronized ProductCatalog getInstance() {
        if (instance == null) {
            instance = new ProductCatalog();
        }
        return instance;
    }

    public void addProduct(Product product) {
        products.put(product.getId(), product);
    }

    public Product getProduct(String id) {
        return products.get(id);
    }

    public List<Product> getAllProducts() {
        return new ArrayList<>(products.values());
    }

}


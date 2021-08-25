package classwork.design_patterns.adapter;


public class Main {
    public static void main(String[] args) {
        ProductRepo productRepo = new ProductRepo();
        ProductHandler productHandler = new ProductHandler();

        Costable product = productRepo.getProduct();
        CostToPrice adapter = new CostToPrice(product);
        productHandler.handle(adapter);
    }
}

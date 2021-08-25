package classwork.design_patterns.adapter;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CostToPrice implements Pricable {
    private final Costable costProduct;
    @Override
    public int getPrice() {
        return costProduct.cost();
    }
}

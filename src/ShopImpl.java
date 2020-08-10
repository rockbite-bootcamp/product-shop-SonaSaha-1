import java.util.ArrayList;

public class ShopImpl extends AbstractShop {
    /**
     * Ctor for Shop
     * Gets product and adds to productMap and shop knows current unique id
     * current free id hold in count static variable
     * @param product
     */
    public ShopImpl (IProduct product) {
        productMap.put(count,product);
        ++count;
    }

    /**
     * Prints category of all products
     */
    @Override
    public void print() {
        for(int i = 1;i < count;++i) {
            System.out.println(productMap.get(i).getCategory());
        }
    }
}

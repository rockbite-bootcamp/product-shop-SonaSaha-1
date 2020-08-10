package shop;

import product.IProduct;
import product.MaterialType;
import user.IInventoryProvider;

import java.util.HashMap;

public class ShopImpl implements IShop {
    /**
     * hashMap contains products and it's unique id
     */
    private HashMap<Integer, IProduct> productMap = new HashMap<>();
    /**
     * Quick lookup map for finding products by category
     */
    private HashMap<ShopCategory,HashMap<Integer, IProduct>> categoryMap = new HashMap<>();

    /**
     * Adds product in category map and product map
     * @param product
     * @param category
     */
    @Override
    public void addProduct (IProduct product, ShopCategory category) {
        productMap.put(product.getId(),product);
        if (!categoryMap.containsKey(category)) {
            categoryMap.put(category,new HashMap<>());
        }
        categoryMap.get(category).put(product.getId(),product);
    }

    /**
     *
     * @param category
     * @return HashMap of products which belong of certain category
     */
    @Override
    public HashMap<Integer, IProduct> getProductsByCategory(ShopCategory category) {
        return categoryMap.get(category);
    }

    /**
     *
     * @param id
     * @return the product with the given id
     */

    @Override
    public IProduct getProduct(int id) {
        return productMap.get(id);
    }

    @Override
    public boolean canBuyProduct(IInventoryProvider inventoryProvider, int id) {
        IProduct product = productMap.get(id);
        if (product == null) return false;
        for (MaterialType material: product.getCost().keySet()) {
            int count = product.getCost().get(material);
            if(!inventoryProvider.hasMaterial(material,count)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean buyProduct(IInventoryProvider inventoryProvider, int id) {
        IProduct product = productMap.get(id);
        if (productMap.containsKey(id)) {

            if (canBuyProduct(inventoryProvider, id)) {
                for (MaterialType material : product.getCost().keySet()) {
                    int count = product.getCost().get(material);
                    inventoryProvider.spendItem(material, count);
                }
                //And here we have tu push this item in shop inventory
                for (MaterialType material : product.getPayload().keySet()) {
                    int count = product.getPayload().get(material);
                    inventoryProvider.addProduct(material, count);
                }
                //Here we have to remove this product from shop
                System.out.println("Transaction complete for product: " + product.getProductName());

                return true;
            }
        }
        return false;
    }

    @Override
    public void removeProduct(int id) {

    }

    /**
     * return to the shop the product that inventory provider bought
     * @param inventoryProvider
     * @param id
     */
    @Override
    public void returnProduct(IInventoryProvider inventoryProvider, int id) {
        IProduct product = productMap.get(id);
        for (MaterialType material : product.getPayload().keySet()) {
            int count = product.getPayload().get(material);
            product.setPayload(material, count);
        }

        for (MaterialType material : product.getCost().keySet()) {
            int count = product.getCost().get(material);
            inventoryProvider.addProduct(material, count);
        }
    }

    /**
     * Prints category of all products
     */
    @Override
    public void print() {
        for(int i = 1;i < 5;++i) {
        }
    }

}

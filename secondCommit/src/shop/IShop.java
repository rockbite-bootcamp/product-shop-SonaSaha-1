package shop;

import product.IProduct;
import user.IInventoryProvider;

import java.util.HashMap;

public interface IShop {
    /**
     * Get product list for specific category
     * @param category
     * @return list of specific category
     */
    HashMap<Integer, IProduct> getProductsByCategory (ShopCategory category);

    /**
     * Get product by id
     * @param id
     * @return product of specific id
     */

    IProduct getProduct (int id);

    /**
     * Adds product to the shop
     * @param product
     * @param category
     */
    void addProduct (IProduct product, ShopCategory category);
    /**
     *
     * @param id
     * @param inventoryProvider
     * @return true if user can buy the product which have the specified ID, else returns false
     */
    boolean  canBuyProduct (IInventoryProvider inventoryProvider, int id);

    /**
     *
     * @param id
     * @param inventoryProvider
     * @return true if user makes buy the product which have the specified ID, else returns false
     * if  something  went wrong
     */
    boolean  buyProduct (IInventoryProvider inventoryProvider, int id);

    /**
     * Remove product from shop
     * @param id
     */
    void removeProduct (int id);

    /**
     * Return to shop the product with the indicating id that user bought
     * @param user
     * @param id
     */
    void returnProduct(IInventoryProvider user,int id);
    /**
     * Prints all products
     */
    void print ();

}

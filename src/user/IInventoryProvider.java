package user;

import product.MaterialType;

/**
 * The interface is created to provide functionality to work with inventory
 * This functionalities can have players or other types of inventory holders
 */

public interface IInventoryProvider {
    /**
     *
     * @param material
     * @param count
     * @return true if material exists in inventory
     */
    boolean hasMaterial(MaterialType material, int count);


    /**
     * Subtract materials fom inventory
     * @param material
     * @param count
     */
    void spendItem (MaterialType material, int count);

    /**
     * Add product to the inventory
     * @param material
     * @param count
     */
    void addProduct(MaterialType material, int count);

}

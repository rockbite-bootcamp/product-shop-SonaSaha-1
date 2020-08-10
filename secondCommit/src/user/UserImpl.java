package user;

import product.MaterialType;

import java.util.HashMap;

public class UserImpl implements IInventoryProvider {
    /**
     * The inventory to hold user's items
     */
    HashMap<MaterialType,Integer> inventory = new HashMap<>();

    /**
     * Ctor for user
     */
    public UserImpl () {

    }

    /**
     *
     * @param material
     * @param count
     * @return true if inventory contains the proper amount of material, else return false
     */
    @Override
    public boolean hasMaterial(MaterialType material, int count) {

        return inventory.containsKey(material) && inventory.get(material) > count;
    }

    /**
     * Subtracts from inventory the specific item if user wants buy something paying with it
     * @param material
     * @param count
     */
    @Override
    public void spendItem(MaterialType material, int count) {
        if (!inventory.containsKey(material) || inventory.get(material) < count) {
            System.out.println("The inventory do not contains enough item ");
        }
        if (inventory.containsKey(material)) {
            int curCount = inventory.get(material) - count;
            inventory.put(material,count);
        }
    }

    /**
     * Adds material to the inventory
     * @param material
     * @param count
     */
    @Override
    public void addProduct(MaterialType material, int count) {
        if(!inventory.containsKey(material)) {
            inventory.put(material,count);
        } else {
            inventory.put(material,inventory.get(material) + count);
        }
    }

    /**
     * Prints the inventory content
     */
    public void showContentOfInventory () {
        System.out.println("User inventory");
        System.out.println("---------------");
        for (MaterialType material : inventory.keySet() ) {
            System.out.println(material.getName() + ": " + inventory.get(material));
        }
        System.out.println("---------------");
    }

}

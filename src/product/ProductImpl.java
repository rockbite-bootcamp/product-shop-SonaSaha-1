package product;

import java.util.HashMap;

public class ProductImpl implements IProduct {
    /**
     * Unique id for this product can't be changed
     */
    private final int id;
    /**
     *A nice name for product since product can have multiple payloads
     */
    private final String productName;
    /**
     * Payloads is a list of materials that will be REWARDED as part of transaction from inventory provider
     */
    private HashMap<MaterialType,Integer> payload = new HashMap<MaterialType, Integer>();
    /**
     *Cost is a set of items that will be DEDUCED as part of transaction from inventory provider
     */
    private HashMap<MaterialType,Integer> cost = new HashMap<>();
    /**
     * Ctor for product sets product id and name
     * @param id
     * @param productName
     */
    public ProductImpl (int id,String productName) {
        this.id = id;
        this.productName = productName;
    }

    /**
     * Clears the payload list
     */
    public void clearPayload () {
        payload.clear();
    }
    /**
     * Clears the cost list
     */
    public void clearCost () {
        cost.clear();
    }
    /**
     * Sets the new material in payload list
     * @param material
     */
    public void setPayload (MaterialType material, int id) {
        payload.put(material,id);
    }

    /**
     * Sets the new material in cost list
     * @param material
     */
    public void setCost (MaterialType material, int id) {
        cost.put(material,id);
    }

    /**
     *
     * @return unique id
     */
    public int getId () {
        return id;
    }

    /**
     *
     * @return product name
     */
    public String getProductName () {
        return productName;
    }



    /**
     *
     * @return payload's map
     */
    public HashMap<MaterialType,Integer> getPayload () {
        return payload;
    }

    /**
     *
     * @return cost's map
     */
    public HashMap<MaterialType,Integer> getCost () {
        return cost;
    }

}

package product;

import java.util.HashMap;

public interface IProduct {
    /**
     * Gets payload materials
     * @return payload materials
     */
    HashMap<MaterialType,Integer> getPayload();

    /**
     * Gets cost material
     * @return cost material
     */
    HashMap<MaterialType,Integer> getCost();

    /**
     * Clears payload
     */
    public void clearPayload ();

    /**
     * Clears cost
     */
    public void clearCost ();

    /**
     * Adds material to the payload
     * @param material
     */
    public void setPayload (MaterialType material, int id);

    /**
     * Adds material to the cost
     * @param material
     */
    public void setCost (MaterialType material, int id);

    /**
     *
     * @return the product's id
     */
    public int getId ();

    /**
     *
     * @return the product's name
     */
    public String getProductName();
}

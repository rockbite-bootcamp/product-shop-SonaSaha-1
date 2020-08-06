import java.util.ArrayList;

public interface IProduct {
    /**
     * Gets category of the product
     * @return category
     */
    String getCategory();

    /**
     * Gets payload materials
     * @return payload materials
     */
    ArrayList<MaterialStack> getPayload();

    /**
     * Gets cost material
     * @return cost material
     */
    ArrayList<MaterialStack> getCost();
}

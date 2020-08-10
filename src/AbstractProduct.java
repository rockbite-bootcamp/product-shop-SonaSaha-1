import java.util.ArrayList;

public abstract class AbstractProduct implements IProduct {
  protected ArrayList<MaterialStack> payloadProduct = new ArrayList<>();
  protected ArrayList<MaterialStack> costProduct = new ArrayList<>();
  protected String category;

    /**
     *
     * @return category
     */
    @Override
    public String getCategory() {
        return category;
    }

    /**
     *
     * @return payload materials
     */
    @Override
    public ArrayList<MaterialStack> getPayload() {
        return payloadProduct;
    }

    /**
     *
     * @return cost materials
     */
    @Override
    public ArrayList<MaterialStack> getCost() {
        return costProduct;
    }
}

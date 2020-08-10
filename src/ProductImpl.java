import java.util.ArrayList;

public class ProductImpl extends AbstractProduct {
    /**
     * Ctor for product
     * @param category
     * @param payloadProduct
     * @param costProduct
     */
   public ProductImpl (String category,ArrayList<MaterialStack> payloadProduct,ArrayList<MaterialStack> costProduct) {
       this.category = category;
       this.payloadProduct = payloadProduct;
       this.costProduct = costProduct;
   }
}

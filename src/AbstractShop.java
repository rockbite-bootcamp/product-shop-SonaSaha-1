import java.util.ArrayList;
import java.util.HashMap;

public abstract class AbstractShop implements IShop {
    /**
     * hashMap contains products and it's unique id
     */
     protected HashMap<Integer,IProduct> productMap = new HashMap<>();
    /**
     * static member to remember unique id
     */
    protected static Integer count = 1;

    /**
     *
     * @param id
     * @param user
     * @return product if user can buy otherwise null
     */
    @Override
    public ArrayList<MaterialStack> buyProduct (Integer id,IUser user) {
        if (!productMap.containsKey(id)) {
            return null;
        }
        boolean checkExist = false;
        ArrayList<MaterialStack> cost = productMap.get(id).getCost();
        for (MaterialStack materialStackForUser :user.getUserMaterials()) {
            for(MaterialStack materialStackForShop:cost ) {
                if (materialStackForShop.getMaterialType() == materialStackForUser.getMaterialType() && materialStackForUser.getCount() > materialStackForUser.getCount()) {
                    checkExist = true;
                }
            }
            if(!checkExist) {
                return null;
            }
        }

        return productMap.get(id).getPayload();
    }

    /**
     * Sets new product in shop
     * @param newProduct
     */
    @Override
    public void setProduct(IProduct newProduct) {
        productMap.put(count,newProduct);
        ++count;
    }

    /**
     * Remove product from shop
     * @param id
     */

    @Override
    public void removeProduct(int id) {
        productMap.remove(id);
    }

    /**
     * Filters by category
     * @param category
     * @return  filtered array
     */
    @Override
    public ArrayList<IProduct> getProductsByCategories (String category) {
        ArrayList<IProduct> filteredProducts = new ArrayList<>();
        Integer index = 1;
        int size = productMap.size() + 1;
        while(index <= size) {
            IProduct curProduct = productMap.get(index);
            if (curProduct.getCategory() == category) {
                filteredProducts.add(curProduct);
            }
            ++index;
        }
        return filteredProducts;
    }
}

import java.util.ArrayList;

public interface IShop {
 /**
  * Concrete user buys product from shop
  * @param id
  * @param user
  * @return payload : Array of materials
  */
 ArrayList<MaterialStack> buyProduct(Integer id,IUser user);

 /**
  *Adds product in shop
  * @param newProduct
  */
 void setProduct(IProduct newProduct);

 /**
  * Remove product from shop
  * @param id
  */
 void removeProduct(int id);

 /**
  * Receives products of the same category
  * @param category
  * @return
  */
 ArrayList<IProduct> getProductsByCategories(String category);

 /**
  * Prints all products
  */
 void print ();

}

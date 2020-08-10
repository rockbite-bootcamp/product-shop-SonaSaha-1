import product.MaterialType;
import product.ProductImpl;
import shop.IShop;
import shop.ShopCategory;
import shop.ShopImpl;
import user.IInventoryProvider;
import user.UserImpl;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Initialize shop object
        IShop shop = new ShopImpl();

        //Initialize 3 different product
        shop.addProduct(new ProductImpl(1,"Cake"), ShopCategory.BASIC);
        shop.addProduct(new ProductImpl(2,"Chocolate"),ShopCategory.BASIC);
        shop.addProduct(new ProductImpl(3,"Gem"),ShopCategory.BASIC);

        //Initialize materials
        MaterialType sugar = new MaterialType(1,"sugar");
        MaterialType egg = new MaterialType(2,"egg");
        MaterialType yogurt = new MaterialType(3,"yogurt");
        MaterialType apricot = new MaterialType(4,"apricot");
        MaterialType cacao = new MaterialType(5,"cacao");
        MaterialType Cake = new MaterialType(6,"Cake");
        MaterialType Chocolate = new MaterialType(7,"Chocolate");
        MaterialType Gem = new MaterialType(8,"Gem");

        //Set payload and cost for product 1
        shop.getProduct(1).setPayload(Cake,2);
        shop.getProduct(1).setCost(sugar,3);
        shop.getProduct(1).setCost(egg,4);
        shop.getProduct(1).setCost(yogurt,6);

        //Set payload and cost for product 2
        shop.getProduct(2).setPayload(Chocolate,11);
        shop.getProduct(2).setCost(sugar,5);
        shop.getProduct(2).setCost(cacao,10);

        //Set payload and cost for product 3
        shop.getProduct(3).setPayload(Gem,1);
        shop.getProduct(3).setCost(sugar,3);
        shop.getProduct(3).setCost(apricot,5);

        //Initialize the user
        IInventoryProvider user = new UserImpl();

        //User have some initial materials
        user.addProduct(sugar,8);
        user.addProduct(apricot,10);
        user.addProduct(cacao,15);

        if (shop.canBuyProduct(user,2)) {

            shop.buyProduct(user, 2);
        } else {
            System.out.println("User can't buy: " + shop.getProduct(3));
        }

    }
}

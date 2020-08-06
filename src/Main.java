import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MaterialType iron = new MaterialType("iron");
        MaterialType copper = new MaterialType("copper");
        MaterialType ring = new MaterialType("ring");

        MaterialStack ironStack = new MaterialStack(iron,5);
        MaterialStack copperStack = new MaterialStack(copper,7);
        MaterialStack ringStack = new MaterialStack(ring,1);
        ArrayList<MaterialStack> payloadArray = new ArrayList<>();
        ArrayList<MaterialStack> costArray = new ArrayList<>();
        payloadArray.add(ringStack);
        costArray.add(ironStack);
        costArray.add(copperStack);
        IProduct product = new ProductImpl("ring",payloadArray,costArray);
        IShop shop = new ShopImpl(product);
        shop.print();
    }
}

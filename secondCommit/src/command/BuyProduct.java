package command;

import poolable.Poolable;
import shop.IShop;
import user.IInventoryProvider;

/**
 * implements two interfaces this mean Buy command class is command and  pool_able
 */
public class BuyProduct implements ICommand, Poolable {
    /**
     * executes following
     * inventoryProvider buys product with the id from the shop
     * @param shop
     * @param inventoryProvider
     * @param id
     */
    @Override
    public void execute(IShop shop, IInventoryProvider inventoryProvider,int id) {
     shop.buyProduct(inventoryProvider,id);
    }

    /**
     * return inventoryProvider's bought product with the id to the shop
     * @param shop
     * @param inventoryProvider
     * @param id
     */
    @Override
    public void undo(IShop shop, IInventoryProvider inventoryProvider,int id) {
     shop.returnProduct(inventoryProvider,id);
    }

    /**
     * set command position to the starting position
     */
    @Override
    public void reset() {

    }
}

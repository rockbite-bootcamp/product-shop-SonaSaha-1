package command;

import shop.IShop;
import user.IInventoryProvider;

/**
 * every command must to have these methods
 */
public interface ICommand
{
    /**
     * execute the command
     * @param shop
     * @param user
     * @param id
     */
    void execute (IShop shop, IInventoryProvider user,int id);

    /**
     * cancel the command
     * @param shop
     * @param user
     * @param id
     */
    void undo (IShop shop, IInventoryProvider user,int id);
}

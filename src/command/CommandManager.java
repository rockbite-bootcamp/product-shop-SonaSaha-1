package command;

import shop.IShop;
import user.IInventoryProvider;

import java.util.ArrayList;

/**
 * Command manager class is singleton class and manages  commands and shops
 * and remember the executed commands history
 */
public class CommandManager {
    //instance is private to ban the creation more than one objects
    private static CommandManager instance;
    //history array is for remembering  the executed commands
    ArrayList<ICommand> history = new ArrayList<>();
    //cursor for indicating current position in the history array
    private int cursor = 0;
    //ctor for Command Manager
    private CommandManager () {

    }
    //returns instance if not exists creates then returns
    public static CommandManager getInstance () {
        if (instance == null) {
            instance = new CommandManager();
        }
        return instance;
    }

    /**
     * executes command
     * @param command
     * @param shop
     * @param user
     * @param id
     */
    public void executeCommand (ICommand command, IShop shop, IInventoryProvider user,int id) {
        command.execute(shop,user,id);
        if(cursor < history.size()) {
            history.set(cursor,command);
        } else {
            history.add(command);
        }
        cursor++;
    }

    /**
     * cancels the last executed command
     * @param shop
     * @param user
     * @param id
     */
    public void undo (IShop shop, IInventoryProvider user,int id) {
        if(cursor == 0) return;
        ICommand command = history.get(cursor - 1);
        command.undo(shop, user, id);
        cursor--;
    }

    /**
     *repeats the last executed command
     * @param shop
     * @param user
     * @param id
     */
    public void redo (IShop shop, IInventoryProvider user,int id) {
        if (cursor >= history.size()) return;
        ICommand command = history.get(cursor);
        command.execute(shop,user,id);
        cursor++;
    }

}

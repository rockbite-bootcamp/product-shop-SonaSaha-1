package poolable;

import java.util.ArrayList;

/**
 * The Pool class creates objects of type T and manages these objects
 * @param <T>
 */
public abstract class Pool<T extends Poolable> {
    /**
     * array for free objects
     */
    ArrayList<T> freeObjects = new ArrayList<>();
    /**
     * array for used objects
     */
    ArrayList<T> usedObjects = new ArrayList<>();
    /**
     * the number of objects that the class have primarily, but this number can increase depends
     * on demand
     */
    private static int INITIAL_CAPACITY = 100;
    public Pool () {
        for (int i = 0;i < INITIAL_CAPACITY;i++) {
            T obj = obtain();
            free(obj);
        }
    }

    /**
     * question
     * @return
     */
    protected abstract T newObject();

    /**
     * obtains a object,the first time will create
     * @return
     */
    public T obtain () {
        if (freeObjects.isEmpty()) {
            T object = new newObject();
            freeObjects.add(object);
        }

        T object = freeObjects.remove(0);
        usedObjects.add(object);
        return object;
    }

    /**
     * free the used object
     * @param object
     */
    public void free (T object) {
        usedObjects.remove(object);
        freeObjects.add(object);
        object.reset();
    }
}

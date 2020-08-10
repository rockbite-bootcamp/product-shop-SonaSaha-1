import java.util.ArrayList;

public class AbstractUser implements IUser {
    /**
     * array which Contains materials of user
     */
 protected ArrayList<MaterialStack> materials = new ArrayList<>();

    /**
     *
     * @return materials of user
     */
    @Override
    public ArrayList<MaterialStack> getUserMaterials() {
        return materials;
    }

    @Override
    public void subtract (int count) {
        
    }

}

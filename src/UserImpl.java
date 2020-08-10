import java.util.ArrayList;

public class UserImpl extends AbstractUser {
    /**
     * Ctor for user
     * @param materials
     */
    public UserImpl (ArrayList<MaterialStack> materials) {
        this.materials = materials;
    }
}

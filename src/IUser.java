import java.util.ArrayList;

public interface IUser {
    /**
     *
     * @return array of user materials
     */
    ArrayList<MaterialStack> getUserMaterials();

    /**
     * subtructs user's material count
     * @param count
     */
    void subtract (int count);
}

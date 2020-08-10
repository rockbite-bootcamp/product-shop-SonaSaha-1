package product;

public class MaterialType {
    /**
     * Unique identifier
     */
    private  int id;
    /**
     * Material name
     */
    private String name;

    /**
     * Ctor for material type
     * @param id
     * @param name
     */
    public MaterialType(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     *
     * @return unique id of material
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return name of material
     */
    public String getName() {
        return name;
    }
    /**
     * Ctor for material type
     * @param name
     */
    public MaterialType(String name) {
        this.name = name;
    }

}

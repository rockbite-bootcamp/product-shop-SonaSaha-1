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
     * Material description
     */
    private String description;
    /**
     * Icon URL to be downloaded from S3 amazon server
     */
    private String iconURL;
    /**
     * The float value of weight for one material of this type
     */
    private float weight;
    /**
     * Max count of material
     */
    private int maxCount;

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
     * Sets name of material
     * @param name
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return description of material
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets description of material
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *Get icon URL from server
     * @return URL
     */
    public String getIconURL() {
        return iconURL;
    }

    /**
     * Sets the new URL for icon
     * @param  iconURL
     */
    public void setIconURL(String iconURL) {
        this.iconURL = iconURL;
    }

    /**
     * Gets the weight of material
     * @return
     */
    public float getWeight() {
        return weight;
    }

    /**
     * Sets new weight for material
     * @param weight
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

    /**
     * Ctor for material type
     * @param name
     */
    public MaterialType(String name) {
        this.name = name;
    }

}

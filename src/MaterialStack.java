public class MaterialStack {
    /**
     * The type of this stack
     */
    private MaterialType materialType;
    /**
     * Count of material in this stack
     */
    private int count = 0;

    /**
     * Ctor for material stack
     * @param materialType
     * @param count
     */
    public MaterialStack (MaterialType materialType,int count){
        this.materialType = materialType;
        this.count = count;
    }

    /**
     *
     * @return the type of material
     */
    public MaterialType getMaterialType() {
        return materialType;
    }

    /**
     * return the count of material
     * @return
     */
    public int getCount() {
        return count;
    }
}

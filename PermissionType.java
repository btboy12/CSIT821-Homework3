public enum PermissionType {
    Edit("Allow to view or edit", 1), View("Only allow to view the result", 2), Test("Only allow to do the test", 3),
    None("Don't have any permission", 5);

    private String name;
    private int id;

    private PermissionType(String name, int id) {
        this.name = name;
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
import java.util.regex.Pattern;

public class Teacher extends SchoolUser {
    public Teacher(String id, String firstName, String lastName, String username, String password, Boolean status,
            String ClassId, String Grade, String SchoolName) {
        super(id, firstName, lastName, username, password, UserType.Teacher, PermissionType.Edit, status, ClassId,
                Grade, SchoolName);
    }

    protected void setId(String id) {
        if (Pattern.matches("^2\\d{6}$", id)) {
            super.setId(id);
        }
    }

    @Override
    public setPermissionType(PermissionType type){
        if(type == PermissionType.Edit || type == PermissionType.None){
            this.permissionType = type;
        }
    }
}
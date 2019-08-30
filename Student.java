import java.util.regex.Pattern;

public class Student extends SchoolUser {
    public Student(String id, String firstName, String lastName, String username, String password, Boolean status,
            String ClassId, String Grade, String SchoolName) {
        super(id, firstName, lastName, username, password, UserType.Student, PermissionType.Test, status, ClassId,
                Grade, SchoolName);
    }

    protected void setId(String id) {
        if (Pattern.matches("^1\\d{6}$", id)) {
            super.setId(id);
        }
    }

    @Override
    public setPermissionType(PermissionType type){
        if(type == PermissionType.Test || type == PermissionType.None){
            this.permissionType = type;
        }
    }
}
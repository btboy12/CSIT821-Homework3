public abstract class SchoolUser extends User {
    private String ClassId;
    private String Grade;
    private String SchoolName;

    public SchoolUser(String id, String firstName, String lastName, String username, String password, UserType userType,
            PermissionType permissionType, Boolean status, String ClassId, String Grade, String SchoolName) {
        super(id, firstName, lastName, username, password, userType, permissionType, status);
        this.ClassId = ClassId;
        this.Grade = Grade;
        this.SchoolName = SchoolName;
    }

    /**
     * @return the classId
     */
    public String getClassId() {
        return ClassId;
    }

    /**
     * @param classId the classId to set
     */
    public void setClassId(String classId) {
        ClassId = classId;
    }

    /**
     * @return the grade
     */
    public String getGrade() {
        return Grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(String grade) {
        Grade = grade;
    }

    /**
     * @return the schoolName
     */
    public String getSchoolName() {
        return SchoolName;
    }

    /**
     * @param schoolName the schoolName to set
     */
    public void setSchoolName(String schoolName) {
        SchoolName = schoolName;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
public class TestCode {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("245454", "Phyllis", "Bruton", "tester", "123456", true, "1", "1", "UESTC");
        System.out.println(teacher);

        UserLoginAndRegistration registration = new UserLoginAndRegistration();
        registration.addUser(teacher);

        System.out.println(registration.verifyLogin("tester", "123456"));
        System.out.println(registration.verifyLogin("tester", "654321"));
    }
}
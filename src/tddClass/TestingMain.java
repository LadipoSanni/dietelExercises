package tddClass;

public class TestingMain {

    public static void main(String[] args) {
        Testing testing = new  Testing();

        testing.setPhoneNumber("08094913389");
        String phoneNumber = testing.getPhoneNumber();
        testing.setAge(30);
        int age = testing.getAge();
        testing.setName("Ladipo");
        String name = testing.getName();


    }
}


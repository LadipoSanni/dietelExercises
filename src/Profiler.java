public class Profiler {
    private int age;
    private String name;
    private String phoneNumber;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static void main(String[] args) {
        Profiler agent = new Profiler();

        agent.setName("Ladi");
        agent.setAge(37);
        agent.setPhoneNumber("08094913389");

        String name = agent.getName();
        int age = agent.getAge();
        String phoneNumber = agent.getPhoneNumber();

        System.out.printf("%s%n%d%n%s%n",name, age, phoneNumber);
    }


}

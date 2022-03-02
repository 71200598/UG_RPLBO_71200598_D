public class Driver {
    String name;
    int age;
    String gender;

    public Driver(String name, String gender, int age) {
        setAge(age);
        setGender(gender);
        setName(name);
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }

    String getGender() {
        return gender;
    }

    void setGender(String gender) {
        this.gender = gender;
    }

}

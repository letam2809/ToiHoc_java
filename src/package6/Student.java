package package6;

public class Student {
private String name; //>>>>thuộc tính của object
private int age;//>>>>thuộc tính của object
private String address;//>>>>thuộc tính của object

    public Student (String name, int age){
        this.name = name;
        this.age = age;

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
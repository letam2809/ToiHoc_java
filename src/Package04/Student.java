package Package04;

public class Student {
private String name;
private int age;
private String address;
    public Student() {

    }

    public Student (String name, int age){ 
        this.name = name; 
        this.age = age;
    }    
    public String getName() {
        return this.name;
    }
    public int getAge(){
        return this.age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
}

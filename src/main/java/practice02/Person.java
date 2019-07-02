package practice02;

public class Person {
    String name;
    long age;
    public Person(String name, long age){
        this.name = name;
        this.age = age;
    }

    public String getName(){return name;}

    public long getAge(){return age;}

    public String introduce() {
        return "My name is " + this.name + ". I am " + this.age + " years old.";
    }
}


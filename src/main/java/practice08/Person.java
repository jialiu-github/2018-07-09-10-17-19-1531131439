package practice08;

public class Person {
    int id;
    String name;
    long age;
    public Person(int id, String name, long age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName(){return name;}

    public long getAge(){return age;}

    public String introduce() {
        return "My name is " + this.name + ". I am " + this.age + " years old.";
    }

    @Override
    public boolean equals(Object object){
        if(object == null) return false;
        if(this == object) return true;
        if(object instanceof Person) {
            return this.id == ((Person) object).id;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.id;
    }

}
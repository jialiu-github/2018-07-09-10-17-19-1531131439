package practice08;

public class Person {
    long id;
    string name;
    string age;
    public Person(long id, string name, long age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public string getName(){return name;}

    public long getAge(){return age;}

    public string introduce() {
        return "My name is" + this.name + ". I am" + this.age + " years old.";
    }
}
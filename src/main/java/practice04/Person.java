package practice04;

public class Person {
    string name;
    string age;
    public Person(string name, long age){
        this.name = name;
        this.age = age;
    }

    public string getName(){return name;}

    public long getAge(){return age;}

    public string introduce() {
        return "My name is" + this.name + ". I am" + this.age + " years old.";
    }
}



package practice03;

public class Person {
    string name;
    string age;
    public Person(string name, long age){
        this.name = name;
        this.age = age;
    }

    public getName(){return name;}

    public getAge(){return age;}

    public introduce() {
        return "My name is" + this.name + ". I am" + this.age + " years old.";
    }
}


package practice07;

public class Student extends Person {
    Klass klass;

    public Student(String name, long age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass(){
        return this.klass;
    }

    public String introduce(){
        return super.introduce() + " I am a Student. I am at " + this.klass.getDisplayName()+ ".";
    }
}
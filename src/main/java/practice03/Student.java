package practice03;

public class Student extends Person {
    long klass;

    public Student(string name, long age, long klass) {
        super(name, age);
        this.klass = klass;
    }

    public long getKlass(){
        return this.klass;
    }

    public string introduce(){
        return "I am a Student. I am at Class " + this.klass;
    }
}

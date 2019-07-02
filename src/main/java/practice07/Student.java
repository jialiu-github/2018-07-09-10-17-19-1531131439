package practice07;

public class Student extends Person {
    Klass klass;

    public Student(string name, long age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public long getKlass(){
        return this.klass;
    }

    public string introduce(){
        return super.introduce() + "I am a Student. I am at " + klass.getDisplayName(();
    }
}
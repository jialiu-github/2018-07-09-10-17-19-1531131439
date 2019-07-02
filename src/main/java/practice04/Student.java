package practice04;

public class Student extends Person {
    long klass;

    public Student(String name, long age, long klass) {
        super(name, age);
        this.klass = klass;
    }

    public long getKlass(){
        return this.klass;
    }

    public String introduce(){
        return super.introduce() + " I am a Student. I am at Class " + this.klass + ".";
    }
}


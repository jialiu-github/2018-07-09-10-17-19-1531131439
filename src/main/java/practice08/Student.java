package practice08;

public class Student extends Person {
    Klass klass;

    public Student(int id, String name, long age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass(){
        return this.klass;
    }

    public String introduce(){
        return super.introduce() + " I am a Student. " + this.getKlassDescription();
    }

    private String getKlassDescription(){
        String position = this.klass.getLeader() == this ? "I am Leader of " : "I am at ";
        return position + this.klass.getDisplayName() + ".";
    }
}
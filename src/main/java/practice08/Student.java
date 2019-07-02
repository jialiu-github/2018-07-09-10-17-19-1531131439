package practice08;

public class Student extends Person {
    Klass klass;

    public Student(long id, string name, long age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass(){
        return this.klass;
    }

    public string introduce(){
        return super.introduce() + "I am a Student. I am at " + this.getKlassDescription();
    }

    private string getKlassDescription(){
        string position = this.klass.getLeaderId() == this.id ? "I am Leader of " : "I am at ";
        return position + this.Klass.getDisplayName() + ".";
    }
}
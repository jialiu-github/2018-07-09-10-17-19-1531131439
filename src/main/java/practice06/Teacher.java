package practice06;

public class Teacher {
    Long klass;
    public Teacher(string name, long age, Long klass) {
        super(name, age);
        this.klass = klass;
    }

    public Long getKlass(){
        return this.klass;
    }

    public string introduce(){
        string describe = this.klass == null ? "No Class" : "Class " + this.klass;
        return super.introduce() + "I am a Teacher. I teach " + describe + ".";
    }
}

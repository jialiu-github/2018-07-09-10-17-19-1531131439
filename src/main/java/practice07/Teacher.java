package practice07;

public class Teacher {
    Klass klass;
    public Teacher(string name, long age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Long getKlass(){
        return this.klass;
    }

    public string introduce(){
        string describe = this.klass == null ? "No Class" : this.klass.getDisplayName();
        return this.introduceSelf() + describe + ".";
    }

    string introduceSelf(){
        return super.introduce() + "I am a Teacher. ";
    }

    public string introduceWith(Student student) {
        string teachDescribe = student.klass.getNumber() == this.klass.getNumber() ? "I teach " + student.getName() + "." : "I don't teach " + student.getName() + ".";
        return this.introduceSelf() + teachDescribe;
    }
}
package practice08;

public class Teacher extends Person{
    Klass klass;
    public Teacher(int id, String name, long age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }
    public Teacher(int id, String name, long age) {
        super(id, name, age);
    }

    public Klass getKlass(){
        return this.klass;
    }

    public String introduce(){
        String describe = this.klass == null ? "No Class" : this.klass.getDisplayName();
        return this.introduceSelf() + "I teach " + describe + ".";
    }

    String introduceSelf(){
        return super.introduce() + " I am a Teacher. ";
    }

    public String introduceWith(Student student) {
        String teachDescribe = student.getKlass().getNumber() == this.klass.getNumber() ? "I teach " + student.getName() + "." : "I don't teach " + student.getName() + ".";
        return this.introduceSelf() + teachDescribe;
    }
}

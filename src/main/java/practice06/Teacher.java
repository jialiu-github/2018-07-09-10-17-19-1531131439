package practice06;

public class Teacher extends Person {
    int klass = 0;
    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public int getKlass(){
        return this.klass;
    }

    public String introduce(){
        String describe = this.klass == 0 ? "No Class" : "Class " + this.klass;
        return super.introduce() + " I am a Teacher. I teach " + describe + ".";
    }
}

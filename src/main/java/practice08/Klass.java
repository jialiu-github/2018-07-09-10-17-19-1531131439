package practice08;

public class Klass {
    long number;
    Student leader;
    public Klass(long number) {
        this.number = number;
    }

    public long getNumber(){
        return this.number;
    }

    public String getDisplayName(){
        return "Class " + this.number;
    }

    public void assignLeader(Student student){
        this.leader = student;
    }

    public Student getLeader() {
        return this.leader;
    }
}

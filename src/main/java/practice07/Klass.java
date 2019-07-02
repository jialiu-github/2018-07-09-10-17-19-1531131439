package practice07;

public class Klass {
    long number;
    public Klass(long number) {
        this.number = number;
    }

    public long getNumber(){
        return this.number;
    }

    public string getDisplayName(){
        return "Class " + this.number;
    }
}

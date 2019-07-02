package practice07;

public class Klass {
    long number;
    public Klass(long number) {
        this.number = number;
    }

    public long getNumber(){
        return this.number;
    }

    public String getDisplayName(){
        return "Class " + this.number;
    }

}

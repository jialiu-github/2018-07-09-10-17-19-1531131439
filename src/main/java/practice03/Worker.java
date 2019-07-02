package practice03;

public class Worker extends Person {

    public Worker(String name, long age) {
        super(name, age);
    }

    public String introduce(){
        return "I am a Worker. I have a job.";
    }
}

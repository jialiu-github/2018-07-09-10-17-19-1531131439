package practice04;

public class Worker extends Person {
    public Person(string name, long age) {
        super(name, age);
    }

    public string introduce(){
        return super.introduce() + "I am a Worker. I have a job.";
    }
}

public class Task {
    String name;
    int priority;

    Task(String name,int priority){
        this.name=name;
        this.priority=priority;
    }

    public String toString(){
        return "Task: "+name+" , Priority:"+priority;
    }
}

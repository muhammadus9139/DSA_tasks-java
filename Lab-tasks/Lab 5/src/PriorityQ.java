//Priority queue with Array
//Scenerio ascending order arrange low to high
//Low=highest priority
//low number has more priority and we will dequeue from front
public class PriorityQ {
    Task [] arr;
    int rear;
    int capacity;

    PriorityQ(int capacity){
        this.capacity=capacity;
        arr=new Task[capacity];
        rear=-1;
    }

    public boolean isEmpty(){
        if(rear==-1){
            return true;
        }
        else
            return false;
    }

    public boolean isFull(){
        if(rear==capacity-1){
            return true;
        }
        else
            return false;
    }

    public void enqueue(String name,int priority){
        if(isFull()){
            System.out.println("Queue is Full!");
            return;
        }

        Task t=new Task(name,priority);

       int i=rear;

        while(i>=0 && arr[i].priority>t.priority){
            arr[i+1]=arr[i];
            i--;
        }
            arr[i+1]=t;
            rear++;
        System.out.println(t+", Added");
    }

    public Task dequeue(){
        if (isEmpty()){
            System.out.println("Queue is empty");
            return null;
        }
        Task task=arr[0];
        for(int i=0;i<rear;i++){
            arr[i]=arr[i+1];
        }
        rear--;
        return task;
    }

    public Task peek(){
        if (isEmpty()){
            System.out.println("Queue is empty");
            return null;
        }
        return arr[0];
    }

    public void display(){
        if (isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Queue Elements");
        for(int i=0;i<=rear;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
}

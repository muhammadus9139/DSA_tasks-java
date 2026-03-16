
//Queue with Arraylist
import java.util.ArrayList;
class QueueArraylist{
    ArrayList<Integer>list;
    int capacity;

    QueueArraylist(int capacity){
        list=new ArrayList<>();
        this.capacity=capacity;
    }

    void engueue(int value){
        if(list.size()==capacity){
            System.out.println("Queue is full");
            return;
        }

        list.add(value);
        System.out.println(value+" Pushed");
    }

    int dequeue(){
        if(list.isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int removed=list.remove(list.size()- (list.size()));
        return removed;
    }

    int peek(){
        if(list.isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return list.get(list.size()- list.size());
    }

    void display(){
        for(int i=0;i<=list.size()-1;i++){
            System.out.println(list.get(i));
        }
    }
}

public class Final2 {
    public static void main(String args[]) {
        QueueArraylist q=new QueueArraylist(10);
        q.engueue(10);
        q.engueue(4);
        q.engueue(0);
        q.engueue(1);
        q.engueue(17);
        q.engueue(18);
        q.engueue(1877);
        q.engueue(199);

        System.out.println("Queue items");
        q.display();
        System.out.println();
        System.out.println("Dequeue "+q.dequeue());
        System.out.println("Dequeue "+q.dequeue());

        System.out.println("Peek element is:"+q.peek());
    }
}

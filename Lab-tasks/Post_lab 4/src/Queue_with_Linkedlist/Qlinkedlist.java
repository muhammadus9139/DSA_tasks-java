
//Queue with linkedlist
public class Qlinkedlist {
    Node4 front;
    Node4 rear;

    void enqueue(int value){
      Node4 newnode=new Node4(value);

      if(rear==null){
          front=rear=newnode;
      }
      else {
          rear.next = newnode;
          rear = newnode;
      }
      System.out.println(value+" Enqueue");
    }

    int dequeue(){
        if(front==null){
            System.out.println("Queue is empty");
            return -1;
        }

        int removed=front.data;
        front=front.next;

        if(front==null){
            rear=null;
        }
        return removed;
    }

    int peek(){
        if(front==null){
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }

    void display(){
         Node4 temp=front;
         while(temp!=null){
             System.out.print(temp.data+" ");
             temp=temp.next;
         }
        System.out.println();
    }
}

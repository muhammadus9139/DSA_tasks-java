public class MainforQlinkedlist {
    public static void main(String args[]) {
        Qlinkedlist q=new Qlinkedlist();
        q.enqueue(8);
        q.enqueue(4);
        q.enqueue(88);
        System.out.println("Queue elements");
        q.display();
        System.out.println(q.dequeue()+" dequeue");
        System.out.println("Peek element is :"+q.peek());


//        System.out.println(q.rear);
    }
}

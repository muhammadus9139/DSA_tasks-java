public class Main{
    public static void main(String args[]) {
         PriorityQ pq=new PriorityQ(7);
         pq.enqueue("Quiz",1);
        pq.enqueue("Assignment",3);
        pq.enqueue("Presentation",4);
        pq.enqueue("Lab task",5);
        pq.enqueue("Attendence",2);
        pq.display();

        System.out.println(pq.dequeue());
        pq.display();
        System.out.println("Peek element= "+pq.peek());

    }
}
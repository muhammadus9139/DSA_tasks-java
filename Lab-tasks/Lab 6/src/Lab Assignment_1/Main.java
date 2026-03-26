
//sp-25-bcs-151
import java.util.Random;
public class Main{
    public static void main(String args[]) {
       PriorityQueue pq=new PriorityQueue(6);
       Random r=new Random();

       for(int i=1;i<=6;i++){
           int fuel=r.nextInt(100)+1;
           Plane p=new Plane("P"+i,fuel);
           pq.enqueue(p);
       }

       System.out.println();
       pq.display();
       System.out.println("\nPlanes landing based on fuel level:\n");
        while(!pq.isEmpty()){
            Plane p = pq.dequeue();
            System.out.println("Landing:" + p);
        }
    }
}
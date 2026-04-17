
public class Main {
    public static void main(String[] args) {

        Deque dq = new Deque(5);

        dq.insertRear(10);
        dq.insertRear(20);
        dq.insertFront(5);
        dq.insertFront(2);
        dq.display();

        dq.deleteFront();
        dq.display();

        dq.deleteRear();
        dq.display();
    }
}
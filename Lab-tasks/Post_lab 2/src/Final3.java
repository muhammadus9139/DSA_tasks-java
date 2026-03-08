
//Simple Array Queue
//push peek pop display
class Queue {
    int[] arr;
    int capacity;
    int rear;
    int front;

    Queue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = -1;
        rear = -1;
    }

//    boolean empty(){
//        if (rear==-1||front>rear)
//             return true;
//        else
//            return false;
//    }

    void enqueue(int value) {
        if (rear == capacity - 1) {
            System.out.println("Queue overflow");
            return;
        }
        if (front == -1)
            front = 0;

        arr[++rear] = value;
        System.out.println(value + " inserted");
    }

    int dequeue() {
//        we write here rear==-1 its for ,when initially queue is empty
//        and front>rear is for,when enqueue and dequeue all elements then front definitely f>r

        if (rear==-1||front>rear) {
            System.out.println("Queue underflow");
            return -1;
        }
        return arr[front++];
    }

    int peek() {
        if (rear == -1) {
            System.out.println("Queue Empty");
            return -1;
        }
        return arr[front];
    }

    void display() {
        if (rear==-1||front>rear) {
            System.out.println("Queue underflow");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
    }


}

public class Final3 {
    static void main(String ags[]) {
        Queue q = new Queue(5);
        q.enqueue(2);
        q.enqueue(4);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(7);
        System.out.println("Dequeue:" + q.dequeue());
        System.out.println("Peak element is:" + q.peek());
        System.out.println();
        System.out.println("Traverse queue");
        q.display();

    }
}

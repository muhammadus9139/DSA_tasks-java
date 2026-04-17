
// Deque complete
class Deque{
    int arr[];
    int front, rear, size;

    Deque(int size) {
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    boolean isFull() {
        return (front == 0 && rear == size - 1) || (front == rear + 1);
    }

    boolean isEmpty() {
        return front == -1;
    }

    void insertRear(int value) {
        if (isFull()) {
            System.out.println("Deque is Full");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
        }
        else if (rear == size - 1 && front != 0) {
            rear = 0;
        }
        else {
            rear++;
        }

        arr[rear] = value;
    }

    void insertFront(int value) {
        if (isFull()) {
            System.out.println("Deque is Full");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
        }
        else if (front == 0) {
            front = size - 1;
        }
        else {
            front--;
        }

        arr[front] = value;
    }

    void deleteFront() {
        if (isEmpty()) {
            System.out.println("Deque is Empty");
            return;
        }

        if (front == rear) {
            front = rear = -1;
        }
        else if (front == size - 1) {
            front = 0;
        }
        else {
            front++;
        }
    }

    void deleteRear() {
        if (isEmpty()) {
            System.out.println("Deque is Empty");
            return;
        }

        if (front == rear) {
            front = rear = -1;
        }
        else if (rear == 0) {
            rear = size - 1;
        }
        else {
            rear--;
        }
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Deque is Empty");
            return;
        }

        int i = front;
        while (true) {
            System.out.print(arr[i] + " ");
            if (i == rear) {
                break;
            }
            i = (i + 1) % size;
        }
        System.out.println();
    }
}
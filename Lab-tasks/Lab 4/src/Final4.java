
//Array Circular Queue
//main difference hi linear and circular queue ma ye ha k linear ma 5 add kiye hain or 1 dequeue kr liya ha tow
//phr aik enqueue kiya tow overflow aye ga q k zaya ho rhy index shuru se
//circular ma front se b use hon gy index
class CircularQueue {
    int []arr;
    int capacity;
    int front;
    int rear;

    CircularQueue(int capacity){
        this.capacity=capacity;
        arr=new int[capacity];
        rear=-1;
        front=-1;
    }

    boolean isEmpty(){
        if(rear==-1){
            return true;
        }
        else
            return false;
    }

    boolean isFull(){
        if((rear+1)%capacity==front){
            return true;
        }
        else
            return false;
    }

    void enqueue(int value){
        if(isFull()){
            System.out.println("Queue overflow");
            return;
        }
        if(front==-1){
            front=0;
        }
        rear=(rear+1)%capacity;
        arr[rear]=value;
        System.out.println(value+" enqueued");
    }

    int dequeue(){
        if(isEmpty()){
            System.out.println("Queue underflow");
            return -1;
        }
         int val=arr[front];
        if(front==rear){
            front=-1;
            rear=-1;
        }
        else
            front=(front+1)%capacity;
        return val;//esy is liye return kr rhy hain taky 0 wala hi remove ho 1 index wala element nhi
    }

    int peek(){
        if(isEmpty()){
            System.out.println("Queue Underflowed");
            return -1;
        }
        return arr[front];
    }

    void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        int i=front;
        while(true){
            System.out.println(arr[i]+" ");
            if(i==rear){
                break;//ye break jb chaly ka tow puraa while loop terminate ho jaye ga
            }
            i=(i+1)%capacity;
        }
    }
}

//circular ma 12345 add kiye jese
//1 dequeue kr liya
//phr 9 enqueue kr liye
// 92345 ho jaye ga lekin front phr b 2 hi ha or rear ab 0 ha jo k 9 ha
//front to rear elements


public class Final4{
    static void main(String args[]) {
        CircularQueue cq= new CircularQueue(5);
        cq.enqueue(8);
        cq.enqueue(9);
        cq.enqueue(5);
        cq.enqueue(3);
        cq.enqueue(0);
        System.out.println("Dequeued: "+cq.dequeue());
        cq.enqueue(2);
        System.out.println("Peek element is:"+cq.peek());
        System.out.println("Traversed queue");
        cq.display();
    }
}

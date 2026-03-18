
//Node for doubly linkedlist
public class Node {
    int data;
    Node next;
    Node prev;

    Node(int data){
        this.data=data;
        this.next=null;
        this.prev= null;
    }

    public String toString(){
        return data+" Inserted ";
    }
}

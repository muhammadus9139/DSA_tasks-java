
//Main for doubly linkedlist
public class Main{
    public static void main(String args[]) {
        DoubleLinkedlist dll=new DoubleLinkedlist();
        dll.insertatstart(19);
        dll.insertatstart(7);
        dll.insertatstart(8);
        dll.insertatstart(2);
        dll.insertatstart(4);
        dll.display();

        dll.insertatend(4);
        dll.display();

        dll.deletefromstart();
        dll.display();

        dll.deletefromend();
        dll.display();


        dll.insertatanypos(99,3);
        dll.display();

        dll.deleteatanypos(3);
        dll.display();
    }

}
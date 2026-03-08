
//Linkedlist simple and
//traverse linkedlist
//Insert at beginning
//insert at end
//insert at any position
class Node {
    int data;
    Node next;
    Node head;

    Node(int data){
        this.data=data;
        this.next=null;

    }

    void insertatanyposition(Node head,int data,int pos){
        Node newnode3=new Node(data);

        if(pos==1){
            newnode3.next=head;
            head=newnode3;
            return;
        }

        Node temp=head;

        for(int i=1;i<pos-1;i++){
            temp=temp.next;
        }
       newnode3.next=temp.next;
        temp.next=newnode3;
    }

    void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    Node insertatstart(int data,Node head){
        Node newnode=new Node(data);
        newnode.next=head;


        System.out.println();
        return newnode;

    }

   void insertatend(int data,Node head){
        Node newnode2=new Node(data);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode2;
    }
}

public class Final1{
    static void main(String args[]) {
        Node head=new Node(10);
        head.next = new Node(20);
        System.out.println("Head of linkedlist: "+head.data);
        head.next.next = new Node(30);


       //traverse
        System.out.println("Traversed linkedlist");
        head.display(head);

//       Insert at start
        System.out.println();
        System.out.println("Before insertion a node at the beginning");
        head.display(head);
        head=head.insertatstart(40,head);
        System.out.println("After insertion a node at beginning");
        head.display(head);

//        insert at end
        System.out.println();
        System.out.println("Before insertion a node at the end");
        head.display(head);
        head.insertatend(7,head);

        System.out.println();
        System.out.println("After insertion a node at end");
        head.display(head);


        System.out.println();
        System.out.println("Before insertion a node at a specific position");
        head.display(head);
        head.insertatanyposition(head,1,2);
        System.out.println();
        System.out.println("After insertion a node at a specific position");
        head.display(head);



    }
}

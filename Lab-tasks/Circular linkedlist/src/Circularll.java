
// Circular linkedlist all working
// insert at start end anypos and display func
// delete from start end anypos
public class Circularll {
    Node head;

    void insertatstart(int data){
        Node newnode=new Node(data);

        if(head==null){
            head=newnode;
            newnode.next=head;
            System.out.println(newnode+" Inserted at start");
            return;
        }

        Node temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
       newnode.next=head;
        temp.next=newnode;
        head=newnode;
        System.out.println(newnode+" Inserted at start");
    }

    void insertatend(int data){
        Node newnode=new Node(data);

        if(head==null){
            head=newnode;
            newnode.next=head;
            System.out.println(newnode+"Inserted at end");
            return;
        }

        Node temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.next=head;

        System.out.println(newnode+"Inserted at end");
    }

    void deletefromstart(){
        if(head==null){//list is empty
            System.out.println("List is already empty");
            return;
        }

        if(head.next==head){// list has single element
            head=null;
            return;
        }

        // list has more than one element
        // delete from start after traverse it till end, bcz we have to make a link of circular
        Node temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        head=head.next;
        temp.next=head;
    }

    void deletefromend(){
        if(head==null){ //list has no element
            System.out.println("List is already empty");
            return;
        }
        if(head.next==null){// single element in list
            head=null;
            return;
        }

        // list has more than one element
        // delete from end
        //we cannot make an element null when list have more than one element, bcz list is circular and next element of the last element is head
        // so we will make temp.next=head not null
        Node temp=head;
        while(temp.next.next!=head){
            temp=temp.next;
        }
        temp.next=head;
    }

    void insertatanypos(int data,int pos){
        Node newnode=new Node(data);

        if(head==null && pos==1){ // jb head null ho ga tow pos b 1 hi hogi , pos random koi b ni ho skti
           insertatstart(data);
            return;
        }

        if(pos==1){ // ye jb elements ziada hon gy list ma lekin hm 1 pos pr insert kr rhy hain
            insertatstart(data);
            return;
        }

        Node temp=head;
        for(int i=1;i<pos-1;i++){
            temp=temp.next;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }

    void deletefromanypos(int pos){

        if(head==null){ // ye jb head null ho ga tow deletefromanypos ma se empty list print ho jaye ga
            deletefromstart();
            return;
        }

        if(pos==1){ // ye jb elements ziada hain list ma lekin hm 1 pos se del kr rhy hain
            deletefromstart();
            return;
        }

        Node temp=head;
        for(int i=1;i<pos-1;i++){
            temp=temp.next;
        }
        if(temp.next==head){ // jb remove krny wala element last ho
            temp.next=head;
        }
        else {
            temp.next = temp.next.next;//else jb remove krny wala element last na ho middle ma khi ho
        }
    }

    void display(){
        if(head==null){
            System.out.println("list is empty!");
            return;
        }

        System.out.println();
        System.out.println("List items");
        Node temp=head;
        while(true){
            System.out.print(temp.data+" ");
            temp=temp.next;
            if(temp==head){
                break;
            }
        }
        System.out.println();
    }
}

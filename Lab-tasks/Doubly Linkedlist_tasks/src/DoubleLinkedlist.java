
//Double linkedlist simple Complete
public class DoubleLinkedlist {
    Node head;

    void insertatstart(int data){
        Node newnode=new Node(data);

        if(head!=null){
            head.prev = newnode;
            newnode.next = head;
        }
        head = newnode;
        System.out.println(newnode);

    }

    void insertatend(int data){
        Node newnode=new Node(data);

        if(head==null){
            head=newnode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.prev=temp;
        System.out.println(newnode+" At end");
    }

    void deletefromstart(){
        if(head==null){
            return;
        }
        head=head.next;

        if(head!=null){
            head.prev=null;
        }
    }

    void deletefromend(){
        if(head==null){
            return;
        }

        if(head.next==null){
            head=null;
            return;
        }

        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.prev.next=null;
    }

    void insertatanypos(int data,int pos){
        Node newnode=new Node(data);
        if(pos==1){
           insertatstart(data);
           return;
        }

        //moving towards the pos
        Node temp=head;
        for(int i=1;i<pos-1;i++){//delete at a certain pos ma hm ne pos-1 pr hi rukna ha q k new node ko beech me dalna hota hai
            temp=temp.next;
        }
        //middle or last
        newnode.next=temp.next;
        newnode.prev=temp;

        if(temp.next!=null){
            temp.next.prev = newnode;
        }
        temp.next=newnode;
    }

    void deleteatanypos(int pos){

        if(head==null){//it will check if the list is empty or not from which we are going to delete element
            return;
        }

         //Moving towards the position
        Node temp=head;
       for(int i=1;i<pos;i++){//delete at a certain pos ma hm ne pos-1 pr nhi pos pr rukna ha q k jis node ko hatana hai usi pe jana hota hai
           temp=temp.next;
       }

        //delete first node
        if(temp.prev==null){
            head=temp.next;

            if(head!=null){
                temp.prev=null;
            }
        }
        //delete middle or last node
        else{
           temp.prev.next= temp.next;
           if(temp.next!=null){
               temp.next.prev=temp.prev;
           }
        }
    }


    void display(){
        System.out.println("List items ");
        Node temp=head;
        int count=0;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
            count++;
        }
        if(count==0){
            System.out.println("No Elements....list is blank! ");
        }
        System.out.println();
    }
}

//In insertatstart these if else is not working in a correct way,
//bcz initially list will null and if we add first then its not returned it from if
//if we remove return and remaining code put in else and sout outside then it will display only first value
//if we rempve return and remove else then if will show infinite first value;
//Solution is to write in insertat start if(head!=null) and else code in if anf if code in else
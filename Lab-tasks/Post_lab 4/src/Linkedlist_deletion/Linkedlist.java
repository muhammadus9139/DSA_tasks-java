class Linkedlist {
    Node2 head;

    void insertAtStart(int data){
        Node2 newnode = new Node2(data);

        newnode.next = head;
        head = newnode;
    }

    //Delete from Start
    void deleteatstart(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head=head.next;
    }

    void deleteatend(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }

        Node2 temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }

    void deleteatanyposition(int pos){
        if(head==null){
            System.out.println("List is empty");
            return;
        }

        if(pos==1){
            head=head.next;
            return;
        }

        Node2 temp=head;
        for(int i=1;i<pos-1;i++){
            if(temp.next==null){
                System.out.println("Position out of bounds");
                return;
            }
            temp=temp.next;
        }

        if(temp.next==null){
            System.out.println("Position out of bounds");
            return;
        }
        temp.next=temp.next.next;
    }

      void display(){
        Node2 temp=head;

        while(temp!=null){
              System.out.print(temp.data+" ");
              temp=temp.next;
          }
    }
}

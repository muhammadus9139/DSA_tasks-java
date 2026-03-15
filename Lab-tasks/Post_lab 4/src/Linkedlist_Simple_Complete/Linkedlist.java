class Linkedlist {
    Node2 head;

    void insertAtStart(int data){
        Node2 newnode = new Node2(data);

        newnode.next = head;
        head = newnode;
    }

    void insertAtend(int data){
        Node2 newnode2=new Node2(data);

        if(head==null){
            head=newnode2;
        }

        Node2 temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode2;
    }

    void insertatanyposition(int data,int pos){
        Node2 newnode3=new Node2(data);

        if(pos==1){
            newnode3.next=head;
//            head =newnode3;
            return;
        }

        Node2 temp=head;

        for(int i=1;i<pos-1;i++){
            if(temp==null){
                System.out.println("Position out of bounds");
                return;
            }
            temp=temp.next;
        }

        if(temp==null){
            System.out.println("Position out of bounds");
            return;
        }
        
        newnode3.next=temp.next;
        temp.next=newnode3;
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

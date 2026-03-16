
//Stack with linkedlist
public class Stlinkedlist {
    Node3 top;

    void push(int value){
        Node3 newnode=new Node3(value);

        newnode.next=top;
        top=newnode;
        System.out.println(value+" Pushed");
    }

    int pop(){
        if(top==null){
            System.out.println("Stack is empty");
            return -1;
        }
        int value=top.data;//for returning pop value ,its top
        top=top.next;

        return value;
    }

    int peek(){
        if(top==null){
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    void display(){
        Node3 temp=top;

        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}

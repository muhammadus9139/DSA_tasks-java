

//Stack with Array
class Stack{
    int arr[];
    int top;
    int size;
    int dynamic;

    Stack(int size){
        this.size=size;
        arr=new int[size];
        top=-1;
    }

    void push(int value){
        if(top==size-1){
            System.out.println("Stack is overflow");

        }
        else
            arr[++top]=value;
        System.out.println("Value "+value +" pushed");

    }

    int pop(){
        if(top==-1){
            System.out.println("Stack is underflow");
            return -1;
        }
        else {
            return arr[top--];
        }
    }

    int peek(){
        if(top==-1){
            System.out.println("There is no value in stack!");
            return -1;
        }
        else{
           return arr[top];
        }
    }



}

public class Main{
    public static void main(String args[]) {
        Stack s=new Stack(5);
        s.push(8);
        s.push(0);
        s.push(3);
        s.push(6);
        s.push(7);
        System.out.println(s.pop()+" :Removed");
        System.out.println("Now topmost value is: "+s.peek());


    }
}

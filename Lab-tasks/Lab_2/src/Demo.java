
//Stack with dynamic array
class DynamicArray {
    int arr[];
    int top;
    int size;
    int dynamic;

    DynamicArray(int size){
        arr=new int[size];
        this.size=size;
        top=-1;
    }

    void resize(){
        dynamic = size+2;
        int newarr[]=new int[dynamic];

        for(int i=0;i<=top;i++){
            newarr[i]=arr[i];
        }
        size=dynamic;
        arr=newarr;
        System.out.println("Array resized to "+dynamic);

    }
    void push(int value){
        if(top==size-1){
            System.out.println("Stack is overflowed");
            resize();
        }
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
       else
            return arr[top];

    }

    void display(){
        System.out.println("Stack items ");
        for(int i=top;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}

public class Demo{
    static void main(String args[]) {
        DynamicArray a=new DynamicArray(2);
        a.push(5);
        a.push(7);
        a.push(8);
        a.pop();
        System.out.println(a.peek());
        a.display();
    }
}
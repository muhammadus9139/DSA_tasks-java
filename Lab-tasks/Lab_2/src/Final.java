
//Stack with arraylist
import java.util.ArrayList;
class StArraylist {
         ArrayList<Integer>list;

         StArraylist(int value){
             list=new ArrayList<>();

         }

         void push(int value){
             if(list.size()==value){
                 System.out.println("Stack overflowed");
             }
             list.add(value);
             System.out.println(value+" pushed");
         }

         int pop(){
             if(list.isEmpty()){
                 System.out.println("Stack Underflow");
                 return -1;
             }
             else{
                 int removed=list.remove(list.size()-1);
             return removed;
             }
         }

         int peek(){
             if(isEmpty()){
                 System.out.println("Stack Underflow");
                 return -1;
             }
             else
                 return list.get(list.size()-1);
         }

         boolean isEmpty(){
             return list.isEmpty();
         }

//         boolean isFull(int value){
//             if(list.size()==value){
//                 return true;
//             }
//         }


         void display(){
             System.out.println("Stack items ");
             for(int i=list.size()-1;i>=0;i--){
                 System.out.println(list.get(i));
             }
         }
}


public class Final{
    static void main(String args[]) {
        StArraylist a=new StArraylist(6);
        a.push(11);
        a.push(7);
        a.push(0);
        a.push(2);
        a.push(5);
        a.push(8);
        a.pop();
        System.out.println("Peek value is:"+a.peek());
        a.display();

    }
}
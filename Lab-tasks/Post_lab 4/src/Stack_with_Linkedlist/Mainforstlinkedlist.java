
//Main for stack with linkedlist
public class Mainforstlinkedlist {
    public static void main(String args[]) {
        Stlinkedlist st=new Stlinkedlist();
        st.push(3);
        st.push(8);
        st.push(1);
        st.push(0);
        st.push(100);
        System.out.println("Stack elements:");
        st.display();
        System.out.println(st.pop()+" Popped");
        System.out.println("Stack elements:");
        st.display();
        System.out.println("Peek element is "+st.peek());
    }
}

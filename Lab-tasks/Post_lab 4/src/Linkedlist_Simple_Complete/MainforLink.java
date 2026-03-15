
//Main for linkedlist Complete tasks
public class MainforLink {
    public static void main(String args[]) {
        Linkedlist list=new Linkedlist();
        list.insertAtStart(10);
        list.insertAtStart(4);
        list.insertAtStart(8);
        list.insertAtStart(0);
        list.insertAtStart(1);
        list.display();
        System.out.println();
        list.deleteatstart();
        System.out.println();
        list.display();
        list.deleteatend();
        System.out.println();
        list.display();

        list.deleteatanyposition(2);
        System.out.println();
        list.display();
    }
}





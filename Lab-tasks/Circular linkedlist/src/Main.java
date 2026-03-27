
//Main of cll
public class Main{
    public static void main(String args[]) {
        Circularll cll=new Circularll();
        cll.insertatstart(4);
        cll.insertatstart(9);
        cll.insertatstart(1);
        cll.insertatstart(7);
        cll.insertatstart(0);
        cll.display();

        cll.insertatend(6);
        cll.insertatend(-2);
        cll.insertatend(5);
        cll.display();


        cll.deletefromstart();
        cll.display();

        cll.deletefromend();
        cll.display();

        cll.insertatanypos(-12,5);
        cll.display();

        cll.deletefromanypos(3);
        cll.display();

    }
}
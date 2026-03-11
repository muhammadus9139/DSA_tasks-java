

//Infix to postfix algorithm
import java.util.Scanner;
class Stackss{
    private int top;
    private char [] arr;

    Stackss(int size){
        arr=new char[size];
        top=-1;
    }

    public void push(char ch){
        if(top==arr.length-1){
            System.out.println("Stack overflowed");
            return;
        }
        arr[++top]=ch;
    }

    public char pop(){
        if(top==-1){
            System.out.println("Stack underflowed");
            return '\0';
        }
        return arr[top--];
    }

    public char peek(){
        if(top==-1){
            System.out.println("Stack underflowed");
            return '\0';
        }
        return arr[top];
    }

    public boolean isEmpty(){
        return top==-1;
    }
}

public class Final6{

    //return int according to precedence of operator
    static int precedence(char ch){
        switch(ch){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    //return result of the expression
    static String infixtopostfix(String expression){
        Stackss s=new Stackss(expression.length());
        String result="";

        for(int i=0;i<expression.length();i++){
            char ch=expression.charAt(i);//give a character ch on certain index i

            if(Character.isLetterOrDigit(ch)){//check is it letter or digit,letter will move to the result
                result+=ch;
            }

            //it will push (
            else if(ch=='('){
                s.push(ch);
            }

            //if peek element is ( then it will pop(remove),and if peek element is not ( then it will pop and move to result
            else if(ch==')'){
                while(!s.isEmpty() && s.peek()!='('){
                    result+=s.pop();
                }
                s.pop();
            }

            //it will check if precedence of peek is > than coming ch then pop and move to result
            //and if peek is < coming ch then push it
            else {
                while(!s.isEmpty() && precedence(s.peek())>=precedence(ch)){
                    result+=s.pop();
                }
                s.push(ch);
            }
        }

        // it is last check out of all for loop
        //it will check that stack is empty or not,if not empty then pop and move to result
        while(!s.isEmpty()){
            result+=s.pop();
        }

        return result;
    }


    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
        System.out.print("Enter Infix Expression :");
       String infix=sc.next();
        System.out.println("Postfix Expression: "+infixtopostfix(infix));
        sc.close();
    }
}
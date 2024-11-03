import java.util.Stack;

public class ValidParenthesis {
//Write a function that takes a string of parentheses, and determines if the order of the parentheses is valid.
//The function should return true if the string is valid, and false if it's invalid.
//"()"              =>  true
//")(()))"          =>  false
//"("               =>  false
//"(())((()())())"  =>  true

    public static boolean checkForValidParenthesis(String s){

        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(st.size()>0 && ((st.peek() == '{' && ch=='}') || (st.peek() == '(' && ch==')')|| (st.peek() == '[' && ch==']'))){
                st.pop();
            }
            else if(ch=='{' || ch=='(' || ch=='(') {
                st.push(ch);
            }
            else {
                return false;
            }
        }
        return st.size()>0?false:true;
    }


    public static void main(String[] args) {
        String  s = "(())((()())())";
        System.out.println(checkForValidParenthesis(s));
    }
}

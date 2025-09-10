package Unit3;

import java.util.Stack;

public class prog6 {
    public static void main(String[] args) {
        Stack<String> st=new Stack<>();
        st.push("First");
        st.push("Second"); st.push("Third"); st.push("Fourth");
        System.out.println(st.peek());
        System.out.println(st.pop());
        st.clear();
        System.out.println(st.isEmpty());
    }
}

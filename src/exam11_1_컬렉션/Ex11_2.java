package exam11_1_컬렉션;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Ex11_2 {
    public static void main(String[] args) {
        Stack st = new Stack();
        Queue q = new LinkedList();

        st.add("0");
        st.add("1");
        st.add("2");

        q.offer("0");
        q.offer("1");
        q.offer("2");

        System.out.println("stack");
        while (!st.isEmpty()){
            System.out.println(st.pop());
        }   // 스텍에서 요소를 하나를 꺼내서 출력

        System.out.println("queue");
        while (!q.isEmpty()){
            System.out.println(q.poll());
        }   // 큐에서 요소 하나를 꺼내서 출력
    }
}

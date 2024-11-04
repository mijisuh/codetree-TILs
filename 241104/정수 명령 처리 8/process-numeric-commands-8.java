import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(in.readLine());

        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(in.readLine());
            String command = st.nextToken();
            int num = -1;
            if (st.hasMoreTokens()) {
                num = Integer.parseInt(st.nextToken());
            }

            switch(command) {
                case "push_front":
                    linkedList.addFirst(num);
                    break;
                case "push_back":
                    linkedList.addLast(num);
                    break;
                case "pop_front":
                    System.out.println(linkedList.pollFirst());
                    break;
                case "pop_back":
                    System.out.println(linkedList.pollLast());
                    break;
                case "size":
                    System.out.println(linkedList.size());
                    break;
                case "empty":
                    System.out.println(linkedList.isEmpty() ? 1 : 0);
                    break;
                case "front":
                    System.out.println(linkedList.peekFirst());
                    break;
                case "back":
                    System.out.println(linkedList.peekLast());
                    break;
            }
        }
    }
}
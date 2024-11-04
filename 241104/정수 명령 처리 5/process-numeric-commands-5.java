import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(in.readLine());
        
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(in.readLine());
            String command = st.nextToken();
            int num = -1;
            if (st.hasMoreTokens()) {
                num = Integer.parseInt(st.nextToken());
            }

            switch(command) {
                case "push_back":
                    list.add(num);
                    break;
                case "pop_back":
                    list.remove(list.size() - 1);
                    break;
                case "size":
                    System.out.println(list.size());
                    break;
                case "get":
                    System.out.println(list.get(num - 1));
                    break;
            }
        }
    }
}
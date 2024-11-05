import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String code = in.readLine();
        String[] strArr = code.split("");
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(strArr));
        ListIterator<String> iter = list.listIterator(list.size());

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(in.readLine());
            String command = st.nextToken();

            switch(command) {
                case "L":
                    if (iter.hasPrevious()) {
                        iter.previous();
                    }
                    break;
                case "R":
                    if (iter.hasNext()) {
                        iter.next();
                    }
                    break;
                case "D":
                    // 직전에 iter.next()를 진행했던 원소를 제거하므로
                    // 반드시 remove() 전에 iter.next()를 먼저 수행해야 함
                    iter.next();
                    iter.remove();
                    break;
                case "P":
                    String ch = st.nextToken();
                    iter.add(ch);
                    break;
            }
        }

        iter = list.listIterator();
        while(iter.hasNext()) {
            System.out.print(iter.next());
        } 
    }
}
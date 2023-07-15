package algorithmBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;


public class Main {

    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb =  new StringBuilder();


        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        int [] arr = new int [n];
        int [] cnt = new int [1000001];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            cnt[arr[i]]++;
        }

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && cnt[arr[i]] > cnt[arr[stack.peek()]]) {
                arr[stack.pop()] = arr[i];
            }
            stack.push(i);
        }

        while (!stack.isEmpty())
            arr[stack.pop()] = -1;

        for (int i = 0; i < n; i++) {
            sb.append(arr[i]).append(' ');
        }

        System.out.println(sb);
        br.close();
    }
}


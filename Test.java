import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> str = new Stack<>();
        String s = br.readLine();
        for (char a : s.toCharArray()) {
            str.add(a);
        }
        System.out.println(str);
    }
}
package do_it_java.CollectionFrameWork.stream;

import java.util.stream.IntStream;

import static java.util.Arrays.stream;

public class IntArrayTest {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};

        IntStream stream = stream(arr);
        int sum = stream.sum();
        System.out.println(sum);

        int count = (int) stream(arr).count();
        System.out.println(count);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

//    static boolean [] prime;

    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int cnt = 0;
        for (int i = 1; i * i <= n; i++) {
            cnt++;
        }




        System.out.println(cnt);


        br.close();
    }


//    static void make_prime(BigInteger N) {
//        prime = new boolean [N.intValue()+1];
//
//        if (N.intValue() < 2)
//            return;
//
//        prime[0] = prime[1] = true;
//
//        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
//            if (!prime[i]) {
//                for (int j = i*i; j < prime.length; j += i)
//                    prime[j] = true;
//            }
//        }
//    }

    static boolean check_sosu(long n) {
        for (long i = 2; i <= Math.sqrt(n); i++) {
            if (n%i == 0)
                return false;
        }
        return true;
    }

    static long gcd(long a, long b) {
        while (b != 0) {
            long r = a % b;

            a = b;
            b = r;
        }
        return a;
    }

    static boolean SbinarySearch(String [] arr, String findStr) {
        int left = 0;
        int right = arr.length-1;

        while (left <= right) {
            int mid = (left+right)/2;

            if (arr[mid].equals(findStr)) {
                return true;
            }
            if (findStr.compareTo(arr[mid]) < 0) {
                right = mid-1;
            }
            else
                left = mid+1;
        }
        return false;
    }

//    static boolean binarySearch(int findNum) {
//        int left = 0;
//        int right = arr1.length-1;
//
//        while (left <= right) {
//            int mid = (left+right)/2;
//            int num = arr1[mid];
//
//            if (num == findNum) {
//                return true;
//            }
//            if (findNum < num) {
//                right = mid-1;
//            }
//            else
//                left = mid+1;
//        }
//        return false;
//    }

    static boolean check_dup(String [] s, String str) {
        for (int i = 0; s[i] != null; i++) {
            if (s[i].equals(str))
                return true;
        }
        return false;
    }

    static void swap(int [][] a, int index) {
        int tmp1 = a[index][0];
        int tmp2 = a[index][1];
        a[index][0] = a[index+1][0];
        a[index][1] = a[index+1][1];
        a[index+1][0] = tmp1;
        a[index+1][1] = tmp2;
    }

    static void bubbleSort(int [] arr, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    static void stringBubbleSort(String [] arr, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size-i-1; j++) {
                if (arr[j].compareToIgnoreCase(arr[j+1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    static int calc(int [] arr, int k) {
        int [] arrC = arr.clone();
        int common = arrC[k]*arrC[k+3];

        int m1 = common/arrC[k];
        int m2 = common/arrC[k+3];

        for (int i = 0; i < 3; i++) {
            arrC[i] *= m1;
            arrC[i+3] *= m2;
        }

        if ((arrC[k]+arrC[k+3]) != 0) {
            if (k == 0)
                return (arrC[2] - arrC[5]) / (arrC[1] - arrC[4]);
            return (arrC[2] - arrC[5]) / (arrC[0] - arrC[3]);
        }
        else {
            if (k == 0)
                return (arrC[2]+arrC[5])/(arrC[1]+arrC[4]);
            return (arrC[2] + arrC[5]) / (arrC[0] + arrC[3]);
        }
    }
}

//    static boolean primeCheck(int x) {
//        if (x == 1)
//            return false;
//        for (int i = 2; i <= Math.sqrt(x); i++) {
//            if (x%i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }


//    public static double calcMark(String str) {
//        if (str.equals("F"))
//            return marks[8];
//        else if (str.equals("D0"))
//            return marks[7];
//        else if (str.equals("D+"))
//            return marks[6];
//        else if (str.equals("C0"))
//            return marks[5];
//        else if (str.equals("C+"))
//            return marks[4];
//        else if (str.equals("B0"))
//            return marks[3];
//        else if (str.equals("B+"))
//            return marks[2];
//        else if (str.equals("A0"))
//            return marks[1];
//        else if (str.equals("A+"))
//            return marks[0];
//        return 0;
//    }
//    public static boolean check() throws IOException {
//        boolean[] check = new boolean[26];
//        int prev = 0;
//        String str = br.readLine();
//
//        for(int i = 0; i < str.length(); i++) {
//            int now = str.charAt(i);
//
//            if (prev != now) {
//                if (!check[now - 'a']) {
//                    check[now - 'a'] = true;
//                    prev = now;
//                }
//                else {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }

//    static int find_c(String [] str, char c) {
//        for (int i = 0; i < str.length; i++)
//            if ((str[i].charAt(0)) == c)
//                return i;
//        return -1;
//    }
//    static void MyPrintArr(int [] arr) {
//        for (int i = 0; i < arr.length; i++)
//            System.out.print(arr[i]+" ");
//        System.out.println();
//    }

//    static int Max(String [] str) {
//        int M = -1;
//        for (int i = 0; i < str.length; i++)
//            if (M < Integer.parseInt(str[i]))
//                M = Integer.parseInt(str[i]);
//        return M;
//    }

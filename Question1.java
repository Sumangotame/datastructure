
// question number 1 solution
import java.util.*;

public class Question1 {
    public int solution(int[] A) {
        int unpaired = 0;
        for (int num : A) {
            unpaired ^= num;
        }
        return unpaired;
    }

    public void oddnumber(int n) {
        System.out.println("odd numbers of range" + " " + n + " " + "are:");
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + ",");
            }
        }
        System.out.println();
    }

    public void arrayElementInRange(int[] A, int n) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] < n && A[i] > 0) {
                System.out.println("array" + " " + i + " " + "is in range" + " " + n);
            } else {
                System.out.println("array" + " " + i + " " + "is not in range" + " " + n);
            }
        }
    }

    public void findPairedElements(int[] A) {
        HashSet<Integer> pairedElements = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();
        for (int num : A) {
            if (!pairedElements.contains(num)) {
                pairedElements.add(num);
            } else {
                result.add(num);
            }
        }
        System.out.println("Elements with pairs:");
        for (int element : result) {
            System.out.println(element);
        }
    }

    public void pattern(int n) {
        for (int i = 0; i < n; i++) {
            String row = " ";
            for (int j = 5; j > i; j--) {
                row = row + "*" + " ";
            }
            System.out.println(row);

        }
    }

    public void reverseArray(int[] a) {
        int[] reverse = new int[a.length];
        int index = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            reverse[index] = a[i];
            index++;
        }
        System.out.print("[");
        for (int i = 0; i < a.length - 1; i++) {
            a[i] = reverse[i];
            System.out.print(a[i] + ",");
        }
        System.out.println("]");

    }

    public String reverse(String A) {
        String reverseString = " ";
        for (int i = A.length() - 1; i >= 0; i--) {
            reverseString += A.charAt(i);
        }
        return reverseString;
    }

    public void palindrome(int n) {
        int rev = 0;
        int a = n;
        while (a != 0) {
            int r = a % 10;
            rev = rev * 10 + r;
            a = a / 10;
        }
        if (n == rev) {
            System.out.println(rev + " " + "is palindrome");
        } else {
            System.out.println(n + " " + "is not palindrome");
        }
    }

    public void primeNumber(int n) {
        boolean isPrime = true;
        if (n <= 1) {
            System.out.println(n + " " + "it is not prime");
            return;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(n + " " + "is prime");
        } else {
            System.out.println(n + " " + "is not prime");

        }
    }

    public int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        // System.out.println("hello");
        Question1 sol = new Question1();
        int[] A = { 9, 3, 9, 3, 9, 7, 9 };
        int p = 331;
        System.out.println("unpaired element is" + " " + sol.solution(A));
        sol.oddnumber(100);
        sol.arrayElementInRange(A, 5);
        sol.findPairedElements(A);
        sol.pattern(5); // System.out.println("hello");
        System.out.println(sol.reverse("seleza kafle"));
        // System.out.println(sol.reverseArray(A));
        sol.reverseArray(A);
        sol.palindrome(p);
        sol.primeNumber(7);
        System.out.println(sol.factorial(4));
    }

}
import java.util.HashSet;

class Question2 {
    public int solution(int[] A) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : A) {
            if (num > 0) {
                set.add(num);
            }
        }
        for (int i = 1; i <= Integer.MAX_VALUE; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return -1;
    }

    public void numberWithinRange(int n) {
        if (n < 100000) {
            System.out.println(n + " is in a range");
        } else {
            System.out.println(n + " is not in a range");
        }

    }

    public void arrayElementInRange(int[] A) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] > -100000 && A[i] < 1000000) {
                System.out.println(A[i] + " is in range");
            } else {
                System.out.println(A[i] + " is not in range");
            }
        }
    }

    public static void main(String[] args) {
        Question2 solution = new Question2();
        int[] A1 = { 1, 3, 6, 4, 1, 2 };
        int[] A2 = { 1, 2, 3 };
        int[] A3 = { -1, -3 };
        System.out.println(solution.solution(A1)); // Output: 5
        System.out.println(solution.solution(A2)); // Output: 4
        System.out.println(solution.solution(A3)); // Output: 1
        solution.numberWithinRange(100);
        solution.arrayElementInRange(A1);
    }
}

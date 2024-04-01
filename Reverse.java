import java.util.*;

public class Reverse {
    String word;

    public Reverse(String s) {
        word = s;
    }

    public String reverse() {
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string you want to reverse\n");
        String s = sc.nextLine();
        sc.close();
        Reverse obj = new Reverse(s);
        System.out.println(obj.reverse());
    }

}

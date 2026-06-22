import java.util.*;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if(Arrays.equals(a,b))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }
}

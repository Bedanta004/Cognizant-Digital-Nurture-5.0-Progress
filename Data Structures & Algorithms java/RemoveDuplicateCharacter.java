import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicateCharacter {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        HashSet<Character> set = new HashSet<>();

        String result = "";

        for(char ch : str.toCharArray()) {
            if(!set.contains(ch)) {
                set.add(ch);
                result += ch;
            }
        }

        System.out.println(result);
    }
}

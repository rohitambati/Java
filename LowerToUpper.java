import java.util.*;
class LowerToUpper {
    static String capitailizeWord(String str) {
        StringBuffer s = new StringBuffer();
        char ch = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (ch == ' ' && str.charAt(i) != ' ')
                s.append(Character.toUpperCase(str.charAt(i)));
            else
                s.append(str.charAt(i));
            ch = str.charAt(i);
        }
        return s.toString().trim();
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s1 = sc.nextLine();
        System.out.println(capitailizeWord(s1));
    }
}

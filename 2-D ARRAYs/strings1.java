public class strings1 {
    public static boolean ispallindrome(String txt) {
        for (int i = 0; i < txt.length() / 2; i++) {
            int n = txt.length() - 1;
            if (txt.charAt(i) != txt.charAt(n - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "racecar";
        ispallindrome(str);
        if (ispallindrome(str)) {
            System.out.println(str + " is a pallindrome text");
        } else {
            System.out.println(str + " is not a pallindrome txt");
        }
    }
}

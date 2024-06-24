public class stringcomparison {
    public static void main(String[] args) {
        String s1 = "anil";
        String s2 = "anil";
        String s3 = new String("anil");
        if (s1 == s2) {
            System.out.println("Strings are same");
        } else {
            System.out.println("Strings are not same");
        }
        // while declaring above same s1 s2 both point as same

        if (s1 == s3) {
            System.out.println("Strings are same");
        } else {
            System.out.println("Strings are not same"); // although the strings are same it'll show that s1 and s3 are
                                                        // not same bcoz new method make extra new memory and point
                                                        // another place but although the value are same so to compare
                                                        // only it will print same but there are inbuilt method we have
                                                        // to use
        }
        if (s1.equals(s3)) {
            System.out.println("Strings are same");
        } else {
            System.out.println("Strings are not same");
        }
    }
}

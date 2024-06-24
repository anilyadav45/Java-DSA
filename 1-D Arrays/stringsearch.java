public class stringsearch {
    public static int fooditems(String str[], String wna) {
        for (int i = 0; i < str.length; i++) {
            if (str[i] == wna) {
                return i;
            }
        }
        return -1;
    }
    // strings can be searched like this

    public static void main(String[] args) {
        String foods[] = { "frooti", "jalebi", "samosa", "beer" };
        String customer_want = "samosa";
        int key = fooditems(foods, customer_want);

        if (key == -1) {
            System.out.println("Please search food which is present in lists");
        } else {
            System.out.println("The items i searched " + customer_want + " is at " + key);
        }

    }
}

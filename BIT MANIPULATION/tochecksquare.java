public class tochecksquare {
    public static boolean tochecksquareoftwo(int n){
        return (n & (n-1)) == 0; //if this satisy then it return true
    }
    public static void main(String[] args) {
        System.out.println(tochecksquareoftwo(15));
    }
}

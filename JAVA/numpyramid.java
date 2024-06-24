public class numpyramid {
    public static void pyramid(int n){
        for(int i=1; i<n; i++){
            for(int k=i; k<n-i; k++){
            System.out.print(" ");
            }

            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pyramid(5);
    }
}

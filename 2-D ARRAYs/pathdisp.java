
public class pathdisp {
    public static float shortestpath(String dir) {
        float x = 0, y = 0;
        for (int i = 0; i < dir.length(); i++) {
            if (dir.charAt(i) == 'W') {
                x = x - 1;
            } else if (dir.charAt(i) == 'E') {
                x = x + 1;
            } else if (dir.charAt(i) == 'N') {
                y = y + 1;
            } else if (dir.charAt(i) == 'S') {
                y = y - 1;
            }
        }
        float x2 = x * x;
        float y2 = y * y;
        return (float) Math.sqrt(x2 + y2);
    }

    public static void main(String[] args) {
        String dir = "WNEENESENNN";
        shortestpath(dir);
        System.out.println(shortestpath(dir));

    }
}

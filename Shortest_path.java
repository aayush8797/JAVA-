public class Shortest_path {
    public static float shortestPath(String path){
        int x =0;
        int y =0;
        int n = path.length();
        for(int i=0; i<n;i++){
            char dir = path.charAt(i);
            switch (dir) {
                case 'N' -> x++;
                case 'E' -> y++;
                case 'W' -> y--;
                case 'S' -> x--;
                default -> System.out.print("Wrong Input");
            }
        }
        int X = x*x;
        int Y = y*y;
        return (float)Math.sqrt(X+Y);
    }
    public static void main(String[] args) {
        String path = "WNEENESENNNS";
        System.out.println(shortestPath(path));
    }
}

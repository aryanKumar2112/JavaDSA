package DSA.String;

public class ShortestPathInMap {
    public static float getShortestPath(String path){
        int x=0;
        int y=0;
        for (int i = 0; i < path.length(); i++) {
            int dir=path.charAt(i);
            //south
            if(dir=='S'){
                y--;
            }
            //West
            else if (dir=='W') {
                x--;
            }
            //north
            else if (dir == 'N') {
                y++;
            }
            else
                x++;
        }
        int X2=x*x;
        int Y2=y*y;
        return (float)Math.sqrt(X2+Y2);
    }

    public static void main(String[] args) {
        String path="WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
}

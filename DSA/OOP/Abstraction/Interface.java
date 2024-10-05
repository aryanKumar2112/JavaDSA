package DSA.OOP.Abstraction;

public class Interface {
    public static void main(String[] args) {
    Queen q=new Queen();
    q.moves();
    }
}
interface  ChessPlayer{
    void moves();        //it is public and abstract
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("left right up down diagonally");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("left right up down ");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("left right up down diagonally-only one step");
    }
}
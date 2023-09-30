//interfaces 
public class OOPS8{
    public static void main(String[] args) {
        Queen q=new Queen();
        q.moves();
    }
}
interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("left,right,up,down,diagnal");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("left,right,up,down");
    }
}
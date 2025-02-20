interface chessplayer{
    void moves();
}
class queen implements chessplayer{
    public void moves(){
        System.out.println("up,down,left,right,digonal(in all 4 dirms)");
    }
}
class rook implements chessplayer{
    public void moves(){
        System.out.println("up, down,left,right");
    }
}
class  king implements chessplayer{
    public void moves(){
        System.out.println("up,down,left,right");
    }
}

interface herbivore{

}
interface carnivore{

}
class bear implements herbivore,carnivore{

}
public class interfaces {
    public static void main(String[] args) {
        queen q =  new queen();
        q.moves();
    }
}

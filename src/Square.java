public class Square extends Rectangle{
    public Square(int s){
        super(s,s);
    }

    public String toString(){
    return super.toString() + " [Square]";
    }

    public static void main(String[] args) {
        Quad[] shapes = {new Rectangle(4,8), new Square(5)};
        System.out.println(shapes[0].toString());
        System.out.println(shapes[1].toString());
    }
}

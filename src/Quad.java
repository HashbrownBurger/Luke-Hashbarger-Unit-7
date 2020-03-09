public abstract class Quad {
    public static final int NUM_SIDES = 4;
    public static final int ING_ANGLE_SUM = 360;
    private int[] sides;
    private int[] angles;

    public Quad(int[] sides, int[] angles){
        this.sides = sides;
        this.angles = angles;
    }

    public int getSides(int sideIndex){
        return sides[sideIndex];
    }

    public int calculatePerm(){
        int perm = 0;
        for (int s: sides){
            perm += s;
        }
        return perm;
    }

    public abstract double calcArea();

    public String toString() {
        String result = "Quadralateral: ";
        for (int s : sides) {
            result += s + " ";
        }
        return result;
    }

    public static void main(String[] args) {
        int[] sides = {4,7,5,3};
        int[] angles = {90,90,70,50};

    }
}

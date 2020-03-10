
public class InheritanceTest {
    public static void main(String[] args) {
        Computer comp = new Computer(4, 500);
        Laptop lap = new Laptop(4,500,88);
        GamingLaptop gLap = new GamingLaptop(7,600,3, 60);

        comp.memoryLeft(70);
        System.out.println(comp.toString());

        lap.charge();
        System.out.println(lap.toString());

        System.out.println(gLap.canRun(8, 60));

        lap.canRun(5);
    }
}



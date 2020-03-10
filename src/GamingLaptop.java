public class GamingLaptop extends Laptop implements Comparable{
    private int FPS;
    public GamingLaptop(int processingPower, int memorySize, int batteryLife, int FPS) {
        super(processingPower, memorySize, batteryLife);
        this.FPS = FPS;
    }

    public int getFPS(){
        return FPS;
    }

    public boolean canRun(int powerNeeded, int wantedFPS){
        if(super.getBatteryLife() > 0 && powerNeeded > super.getProcessor() && getFPS() > wantedFPS){
            return true;
        }
        return false;
    }

    public int compareTo(Object top){
        Laptop newTop = (Laptop) top;
        if(super.getProcessor() == newTop.getProcessor())
            return 0;
        else if(super.getProcessor() < newTop.getProcessor())
            return 1;
        else
            return -1;
    }

    public String toString(){
        return "Processor Power: " + super.getProcessor() + " Memory Size: " + super.getMemorySize() + " Battery: " + super.getBatteryLife() + " FPS: " + getFPS();
    }

    public boolean equals(Object other)
    {
        return other != null && this.compareTo(other) == 0;
    }

}

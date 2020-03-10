public class Laptop extends Computer implements Comparable{
    private int batteryLife;
    private boolean isPortable = true;

    public Laptop(int processingPower, int memorySize, int batteryLife){
        super(processingPower, memorySize);
        this.batteryLife = batteryLife;
    }

    public boolean getIsPortable() {
        return isPortable;
    }

    public int getBatteryLife(){
        return batteryLife;
    }

    public String charge(){
        batteryLife = 100;
        isPortable = false;
        return "Is Charging";
    }

    public String stopCharge(){
        isPortable = true;
        return "Is Not Charging";
    }

    public boolean canRun(int powerNeeded){
        if(batteryLife > 0 && powerNeeded > super.getProcessor()){
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

    public boolean equals(Object other)
    {
        return other != null && this.compareTo(other) == 0;
    }

    public String toString(){
        return "Processor Power: " + super.getProcessor() + " Memory Size: " + super.getMemorySize() + " Battery: " + getBatteryLife();
    }
}

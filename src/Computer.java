public class Computer {
    private int processorPower;
    private int memorySize;

    public Computer(int processorPower, int memorySize){
        this.processorPower = processorPower;
        this.memorySize = memorySize;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public int getProcessor(){
        return processorPower;
    }

    public int memoryLeft(int memoryUsed){
        return memorySize - memoryUsed;
    }

    public boolean canRun(int powerNeeded){
        if(powerNeeded > processorPower)
            return false;
        return true;
    }

    public String toString(){
        return "Processor Power: " + getProcessor() + " Memory Size: " + getMemorySize();
    }
}

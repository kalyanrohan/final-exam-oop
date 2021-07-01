public class Lion extends Animal{
    private int numOfMeat;

    public Lion(int weight, String name,int numOfMeat) {
        super(weight, name);
        this.numOfMeat=numOfMeat;
    }

    public int getNumOfMeat() {
        return numOfMeat;
    }

    public void setNumOfMeat(int numOfMeat) {
        this.numOfMeat = numOfMeat;
    }
}

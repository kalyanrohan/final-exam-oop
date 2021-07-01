public class Snake extends Animal{
    private int length;

    public Snake(int weight, String name,int length) {
        super(weight, name);
        this.length=length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}

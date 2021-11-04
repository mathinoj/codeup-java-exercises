package shapes;

abstract public class Quadrilateral extends Shape implements Measurable {
    protected int length;
    protected int width;
    //protected int length;
    //protected int width; TODO shan used DOUBLE instead of INT!

    public Quadrilateral(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int getLength(){
        return this.length;
    }
    public int getWidth(){
        return this.width;
    }

    public abstract int length();
    public abstract int width();

}

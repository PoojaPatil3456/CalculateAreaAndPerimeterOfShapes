public class ShapeCalculations {
    int length;
    int width;
    public ShapeCalculations(int side){
        this.length=side;
        this.width=side;
    }
    public ShapeCalculations(int length,int width){
        this.length=length;
        this.width=width;
    }
    public int area() {
        return length*width;
    }

    public int perimeter() {
        return 2*(length+width);
    }
}

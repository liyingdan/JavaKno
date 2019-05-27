package day11;

public class TestCircle {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(2.5);
        ComparableCircle c2 = new ComparableCircle(2.1);
        ComparableCircle c3 = new ComparableCircle(2.0);
        int i1 = c1.compareTo((Object) c2);
        System.out.println(i1);
        int i2 = c1.compareTo((Object) c3);
        System.out.println(i2);

    }
}



interface CompareObject{
    int compareTo(Object o);
}

class Circle{
    private double radius;
    public Circle(){
        super();
    }
    public Circle(double radius){
        super();
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
}
 class ComparableCircle extends Circle implements CompareObject{
    public ComparableCircle(double radius){
        super();
    }
     @Override
     public int compareTo(Object o) {
        if(this == o){
            return 0;
        }else if(o instanceof ComparableCircle){
            ComparableCircle c = (ComparableCircle) o;
            if(this.getRadius() > c.getRadius()){
                return 1;
            }else if(this.getRadius() < c.getRadius()){
                return -1;
            }else {
                return 0;
            }

        }else {
            throw new RuntimeException("传入的对象类型有误，无法比较");
        }

     }
 }


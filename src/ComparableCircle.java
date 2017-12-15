public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    //Default no arg constructor
    public ComparableCircle (){ }

    //Constructor a ComparableCircle with specified radius
    public ComparableCircle( double radius){
        super(radius);
    }


    //Implement compareTo method from the Comparable interface
    public int compareTo(ComparableCircle o) {

        if(getArea() < o.getArea()){

            return -1;
        }
        else if(getArea() == o.getArea()){
            return 0;
        }
        else{
            return 1;
        }
    }

    @Override // Implement the toString method defined in Circle
    public String toString() {
        return super.toString() + "\nArea: " + getArea();
    }

}

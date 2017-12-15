/*
   Author: Camila Arbaiza

   Professor: Tanes Kanchanawanchai

   Problem 13.6

   (The ComparableCircle class) Define a class named ComparableCircle
   that extends Circle and implements Comparable. Implement the compareTo method
   to compare the circles on the basis of area.
   Write a test class to find the larger of two instances of ComparableCircle objects

 */
public class Assignment13 {

    public static void main (String [] args){

     //Create two instances of ComparableCircle class
     ComparableCircle c1 = new ComparableCircle(3.8);
     ComparableCircle c2 = new ComparableCircle(56);

     //Display the ComparableCircle info
        System.out.println("First Comparable Circle: ");
        System.out.println(c1);
        System.out.println();
        System.out.println("Second Comparable Circle: ");
        System.out.println(c2);
        System.out.println();

        // Use compareTo to find the largest ComparableCircle
        if(c1.compareTo(c2) == 1){
            System.out.println("The first comparable circle is larger ");
        }
        else{
            System.out.println("The second comparable circle is larger ");
        }
    }
}

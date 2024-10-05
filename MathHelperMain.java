package gr.aueb.cf.ch14;

public class MathHelperMain {

    public static void main(String[] args) {

        int [] grades  = {5,8,7,10,6,9,9,3};

        //int minPosition = 0;
        //minPosition = MathHelper.findMin(grades);


        System.out.println("the min value of grades is " + MathHelper.findMin(grades));
        System.out.println("the max value of grades is " + MathHelper.findMax(grades));
        System.out.println("the average value of grades is " + MathHelper.findAverage(grades));




    }
}

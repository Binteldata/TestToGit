import java.util.Arrays;

public class Maximum{
    public static void main(String [] args){
        int[] digi={0,1,2,3,4,5,6,7,8,9};
        Arrays.sort(digi);
        System.out.println("Maximum = " + digi[digi.length-1]);

    }
}
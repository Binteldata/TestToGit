public class Average{
    public static void main(String [] args){
        double[] values = {0,1,2,3,4,5,6,7,8,9};
        double total = 0;
        for (double element : values) {
            total += element;

        }
        System.out.println(total);
        double average = 0;
        if (values.length > 0){
            average = total / values.length;
        }
        System.out.println(average);
    }
}


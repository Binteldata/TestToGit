import java.util.Scanner;
public class VowelCounter {
    public static void main(String args[]){
        int count = 0;
        System.out.println("Please type a sentence: ");
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        for (int i=0 ; i<sentence.length(); i++){
            char ch = sentence.charAt(i);
            if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' '){
                count ++;
            }
        }
        System.out.println("Vowel count:  "+count);
    }
}
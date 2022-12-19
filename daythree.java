package winterCamp;
import java.util.Scanner;
public class daythree {
    public static void main(String[] args) {
        //first question
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String reversed_line ="";
        String str_arr[]=line1.split(" ");
        for(int i=0;i<str_arr.length;i++){
            reversed_line = str_arr[i]+ " " +reversed_line;
        }
        System.out.println(reversed_line);

        //second question
        String withoutws=line1.replace(" ","");
        System.out.println(withoutws);


    }
}

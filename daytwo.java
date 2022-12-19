package winterCamp;

import java.util.Arrays;

public class daytwo {
    public static void main(String[] args) {
        //FIRST QUESTION
       /* String str = "Shruti";
        char[] ch = new char[str.length()];
        int[] sortedch = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
        System.out.print("String in Array : ");
        for (int i = 0; i < str.length(); i++) {
            System.out.print(ch[i]+" ");
        }
        System.out.println("");
        System.out.print("Ascii code od String : ");
        for (int i = 0; i < str.length(); i++) {
            System.out.print((int)ch[i]+" ");
        }

        System.out.println("");
        System.out.print("Sorted Ascii code of String :");
        for (int i = 0; i < str.length(); i++) {
            int a = (int)ch[i];
            sortedch[i]= a;
        }
        Arrays.sort(sortedch);
        for (int i = 0; i < str.length(); i++) {
            System.out.print(sortedch[i] +" ");
        }
        System.out.println("");
        System.out.print("Sorted Array : ");
        for (int i = 0; i < str.length(); i++) {
            System.out.print((char)sortedch[i]);
        }*/
//
//        //SECOND QUESTION
//        String str = "Shruti";
//        char[] ch = new char[str.length()];
//        for (int i = 0; i < str.length(); i++) {
//            ch[i] = str.charAt(i);
//        }
//        Arrays.sort(ch);
//        for (int i = 0; i < str.length(); i++) {
//            System.out.print(ch[i]+" ");
//        }
        int s = 0;
        int t = 1;
        int i=0,j=i;
        while(i<10){
            s=s+i;
            while(j>0){
                t =t *(j-i);
                j--;
            }
            s = s*t;
            System.out.println("T is " + t);
            i++;
        }
        System.out.println("S is " + s);

    }
}

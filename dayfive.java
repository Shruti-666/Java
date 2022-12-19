package winterCamp;

import java.util.Arrays;
import java.util.Scanner;

public class dayfive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lenght of an array : ");
        int len = sc.nextInt();
        int arr[]= new int[len];
        for(int i =0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Array :");
        for(int i =0;i<len;i++){
            System.out.print(arr[i]+" ");
        }

        //1st question
        int min=0;
        int max=0;
        for(int i =0;i<=len-1;i++){
            if(i<len-2){
                if(arr[i]<=arr[i+1]){
                    min=arr[i];
                }
            }
            else{
                break;
            }
        }
        for(int i =0;i<=len-1;i++){
            if(i<len-2){
                if(arr[i]>=arr[i+1]){
                    max=arr[i];
                }
            }
            else{
                break;
            }
        }
        System.out.println("\nMinimum element in array : "+ min);
        System.out.println("Maximum element in array : "+ max);

        //2nd question
//        Arrays.sort(arr);
//        System.out.println("Second largest element : "+arr[len-2]);
//        System.out.println("Second smallest elemeny : "+arr[1]);

        //3rd question
        int min_dist[]=new int[len];
        for(int i =0;i<len;i++){
            if(i<=len-2){
                min_dist[i]=Math.abs(arr[i+1]-arr[i]);
            }
            else{
                min_dist[i]=0;
            }
        }
        System.out.print("Distance between elements of array : ");
        for(int i =0;i<len;i++){
            System.out.print(min_dist[i]+" ");
        }
//        for(int i=0;i<len;i++){
//            System.out.print(Math.abs(arr[i+1]-arr[i])+" ");
//        }

    }
}

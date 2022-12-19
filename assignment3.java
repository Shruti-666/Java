package winterCamp;

import java.util.Scanner;

class Question1{
    void smallest(int arr[],int len){
        int min =0;
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
        System.out.println("\nMinimum element in array : "+ min);
    }

    void largest(int arr[],int len){
        int max=0;
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
        System.out.println("\nMaximum element in array : "+max);
    }
}

public class assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lenght of an array : ");
        int len = sc.nextInt();
        int arr[]= new int[len];
        for(int i =0;i<len;i++){
            arr[i]=sc.nextInt();
        }

        Question1 q1= new Question1();
        q1.smallest(arr,len);
        q1.largest(arr,len);


    }
}

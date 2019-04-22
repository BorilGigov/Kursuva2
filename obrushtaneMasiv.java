package kursova2;

import java.util.Scanner;

public class obrushtaneMasiv {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Elementi na masiva:");
        
        String[] arr = sc.nextLine().split(" ");
        
        for (int i = 0; i < arr.length / 2; i++) 
        {
            String t = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = t;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            
        }
    }
}

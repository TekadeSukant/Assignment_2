package com.company.Assign2;


// WAP to sort an array using Bubble sort algorithm
import java.util.Scanner;

public class Bubblesort
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the Size: ");
        int n = s.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter " + n +" Elements in Random Order: ");
        for(int i=0; i<n; i++)
            arr[i] = s.nextInt();

        for(int i=0; i<(n-1); i++)
        {
            for(int j=0; j<(n-i-1); j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }


        System.out.println("\nThe new sorted array is:");
        for(int i=0; i<n; i++)
            System.out.print(arr[i]+ " ");
    }
}

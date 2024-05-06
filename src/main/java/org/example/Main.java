package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scnr.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scnr.nextInt();
        }
        double ratio = calculateRatio(arr);
        System.out.printf("The ratio is: " + String.format("%.1f", ratio));
    }

    public static double calculateRatio(int[] arr) {
        if (arr.length < 4) {
            throw new IllegalArgumentException("Array length must be at least 4");
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }

            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        double sumOfLargest = max1 + max2;
        double sumOfSmallest = min1 + min2;

        return sumOfLargest / sumOfSmallest;
    }
    }








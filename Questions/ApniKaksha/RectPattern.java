package Questions.ApniKaksha;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RectPattern {
  public static void main(String[] args) {
    System.out.println("Rectangular pattern");
    Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // int k = sc.nextInt();
    // // Rectangular pattern
    // for(int i =0; i<n; i++){
    // for(int j=0; j<k; j++){
    // System.out.print(" * ");
    // }
    // System.out.println();
    // }
    /****************************************************************** */
    // Hollow Rectangular Pattern
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= k; j++) {
    // if (i == 1 || i == n || j == 1 || j == k) {
    // System.out.print("*");
    // } else {
    // System.out.print(" ");

    // }
    // }
    // System.out.println();
    // }

    /****************************************************************** */
    // Inverted half pyramid
    int n = 5;
    // for (int i = n; i > 0; i--) {
    // for (int j = 0; j < i; j++) {
    // System.out.print(" * ");
    // }
    // System.out.println();
    // }

    /****************************************************************** */
    // half pyramid
    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < n - i; j++) {
    // System.out.print(" ");
    // }
    // for(int j = 0 ; j<i; j++){
    // System.out.print("*");

    // }
    // System.out.println();
    // }

    /****************************************************************** */
    // print numbers in pyramid form
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print(j + " ");
    // }
    // System.out.println();
    // }

    /****************************************************************** */
    // print numbers in Inverted pyramid form
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= n - i; j++) {
    // System.out.print(j + " ");
    // }
    // System.out.println();

    // }
    /****************************************************************** */
    // Floyd's Tringle
    // int num = 1;
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print(num + " ");
    // num++;
    // }
    // System.out.println();
    // }
    /****************************************************************** */
    // Floyd's Tringle with 0 and 1
    // for (int i = 1; i <= n; i++) {
    //   for (int j = 1; j <= i; j++) {
    //     if ((i+j) % 2 == 0) {
    //       System.out.print(1 + " ");
    //     } else {
    //       System.out.print(0+ " ");
    //     }
    //   }
    //   System.out.println();
    // } 
  }
}

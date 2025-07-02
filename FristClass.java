import java.util.*;
public class FristClass {

  public static void main(String args[]) 
  {
    // int n=13;

    // if(n%2==0) {
    //   System.out.print("the number is even");
    // }else 

    // {
    //   System.out.println("the number is odd ");
    // }

  // Scanner sc = new Scanner(System.in);
  // int a = sc.nextInt();
  // int b = sc.nextInt();
  // int pro = product( a, b);
  // System.out.println(pro);
  // }

  //
  // switch(n)
  // {
  // case 1:System.out.println("hello");
  // break;
  // case 2:System.out.println("namaste");
  // break;
  // case 3:System.out.println("ass hole");
  // break;
  // default:System.out.println("invalid press");

  // }

  // int n=sc.nextInt();

  // for (int i=1;i<11;i++) {

  // System.out.println(n*i);
  // }

  // int n = sc.nextInt();
  // for (int i = 0; i < n; i++) {
  // for (int j = 0; j < n; j++) {

  // if (i == 0 || i == n - 1) {
  // System.out.print("*\t");
  // } else {
  // if (j != 0 && j < n) {
  // System.out.print("\t");
  // }
  // if (j == 0 || j == n - 1)
  // System.out.print("*");

  // }
  // }
  // System.out.print("\n\n\n");
  // }

  // int n = 4; //program for hallow sqaure
  // int m = 5;
  // for (int i=1;i<=n;i++){
  // for (int j=1;j<=m;j++) {
  // if(i==1||j==1||i==n||j==m)
  // System.out.print("*");
  // else
  // System.out.println(" ");

  // }
  // }
  // int n=sc.nextInt(); //program for half triangle
  // for( int i=0;i<n;i++) {
  // for( int j=0;j<=i;j++){

  // System.out.print("*");

  // }
  // System.out.println();
  // }
  // int n=sc.nextInt(); //program for inverted half triangle
  // for( int i=n;i>=1;i--) {
  // for( int j=1;j<=i;j++){
  // System.out.print("*");

  // }
  // System.out.println();
  // }
  // int n=sc.nextInt(); //program for 180 degree rotated half triangle
  // for( int i=1;i<=n;i++) {
  // for( int j=1;j<=n-i;j++){
  // System.out.print(" ");
  // }
  // for( int j=1;j<=i;j++){
  // System.out.print("*");
  // }
  // System.out.println();
  // }
  // int n=sc.nextInt(); //program for hailf triangle in n
  // for( int i=1;i<=n;i++){
  // for(int j=1;j<=i;j++) {
  // System.out.print(j+" ");
  // }
  // System.out.println();
  // }
  // int n=sc.nextInt();
  // for(int i=1;i<=n;i++){
  // for(int j=1;j<=n-i+1;j++){
  // System.out.print(j);
  // }
  // System.out.println(" ");
  // }
  // int n=sc.nextInt();
  // int num=sc.nextInt();
  // for(int i=0;i<n;i++){
  // for(int j=0;j<=i;j++){
  // System.out.print(num+" ");
  // num++;
  // }
  // System.out.println();
  // }
  // int n=sc.nextInt();

  // for(int i=1;i<=n;i++){
  // for(int j=1;j<=i;j++){
  // int sum=i+j;
  // if(sum%2==0)
  // System.out.print("1 ");
  // else
  // System.out.print("0 ");

  // }
  // System.out.println();
  // }
  // int n=sc.nextInt(); // butterfly pattern

  // for( int i=0;i<=n;i++) {
  // for(int j=0;j<i;j++){
  // System.out.print("*");
  // }
  // int spaces = 2*(n-i);
  // for(int j=0;j<spaces;j++){
  // System.out.print(" ");
  // }
  // for(int j=0;j<i;j++){
  // System.out.print("*");
  // }
  // System.out.println();
  // }
  // for( int i=n;i>=0;i--) {
  // for(int j=0;j<i;j++){
  // System.out.print("*");
  // }
  // int spaces = 2*(n-i);
  // for(int j=0;j<spaces;j++){
  // System.out.print(" ");
  // }
  // for(int j=0;j<i;j++){
  // System.out.print("*");
  // }
  // System.out.println();
  // }
  // int n=sc.nextInt(); //solid rhombus
  // for(int i=0;i<n;i++){
  // for(int j=0;j<n-i;j++){
  // System.out.print(" ");
  // }
  // for(int j=0;j<n;j++){
  // System.out.print("*");
  // }
  // System.out.println();
  // }
  // int n=sc.nextInt(); // number triangle
  // for(int i=0;i<=n;i++){
  // for(int j=0;j<=n-i;j++){
  // System.out.print(" ");
  // }
  // for(int j=0;j<i;j++){
  // System.out.print(i + " ");
  // }
  // System.out.println();
  // }

  // int n=sc.nextInt(); // palindromic pattern
  // for(int i=1;i<=n;i++){
  // for(int j=1;j<=n-i; j++){
  // System.out.print(" ");
  // }
  // for(int j=i;j>=1;j--){
  // System.out.print(j);
  // }
  // for(int j=2; j<=i; j++) {
  // System.out.print(j);
  // }
  // System.out.println();
  // }
  // int n = sc.nextInt(); // diamond pattern
  // for( int i=0; i<n; i++) {

  // for(int j=1; j<=n-i;j++) {
  // System.out.print(" ");
  // }
  // for(int j=1;j<=2*i-1; j++){
  // System.out.print("*");
  // }
  // System.out.println();
  // }
  // for( int i=n; i>=1; i--) {

  // for(int j=1; j<=n-i;j++) {
  // System.out.print(" ");
  // }
  // for(int j=1;j<=2*i-1; j++){
  // System.out.print("*");
  // }
  // System.out.println();
  // }
  // FUNCTIONS IN JAVA
  // public static int facto(int a) {

  // int fact = 1;
  // for (int i=1 ; i<=a; i++)
  // fact = fact*i;
  // return fact;
  // }

  // public static void main(String args[]) {
  // Scanner sc = new Scanner(System.in);
  // int a = sc.nextInt();
  // System.out.println(facto(a));
  // }
  // Arrays in java

  // public static void main(String args[]) {
  // int[] marks = new int[5];
  // marks[0] = 20;
  // marks[1] = 78;
  // marks[2] = 29;
  // System.out.println(marks[0]);
  
  // }
              // voting eligiblity
//   Scanner sc = new Scanner(System.in);
// //    float a = sc.nextFloat();
// //    if(a>=18) {
// //     System.out.println("is eligible to vote");

// //    }
// //    else {
// //     System.out.println("not eligible");
// //    }
//        // Area of the circle
//     //    System.out.println("enter the radius of the circle");
//     //    float r = sc.nextFloat();
//     //    double area;
//     //    area = 3.142*r*r;
//     //    System.out.println(area);
//     System.out.println("enter the two elements");
//     float a = sc.nextFloat();
//     float b = sc.nextFloat();
//     System.out.println("enter the operator");
//     int ch = sc.nextInt();
//     switch(ch){
//         case 1: float r = a + b;
//                 System.out.println("the addition of two numbers " + r);
//                 break;
//                 case 2: float d = a - b;
//                 System.out.println("the difference of two numbers " + d);
//                 break;
//                 case 3: float p = a * b;
//                 System.out.println("the product of two numbers " + p);
//                 break; 
//                 case 4: float q = a / b;
//                 System.out.println("the division of two numbers " + q);
//                 break; 
//                 case 5: float w = (a) % (b);
//                 System.out.println("the modulo of two numbers " + w);
//                 break; 
//                 default : System.out.println("invalid input");
                //}
                



    }
  }


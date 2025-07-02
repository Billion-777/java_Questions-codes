
import java.util.*;
import coverage.*;

// class Java
// {
//     public static void main(String args[]) {
//     Scanner sc =new Scanner(System.in);

//     // int temp,n,rev=0,rem,a,b;
//     // System.out.println("Enter the two operands");
//     // a = sc.nextInt();
//     // b = sc.nextInt();
//     // System.out.println(" the two operands before swapping "+a+" "+ b);
//     // a=b^a;
//     // b=a^b;
//     // a=b^a;

//     // System.out.println(" the two operands after swapping "+a+" "+ b);
//   /*.............palindrome......... */
//     // System.out.println("Enter the a operands");
//     // n = sc.nextInt();
//     // temp = n;
//     // while(temp>0)
//     // {
//     //    rem=temp%10;
//     //    rev =  rev*10 + rem;
//     //    temp = temp/10;
//     // }
//     // if(rev==n)
//     // {
//     //     System.out.println("is a palindrome");
//     // }
//     // else{
//     //     System.out.println("is not a palindrome");

//     // }
// /*...............SPY Number............ */
// // public static void main(String args[]) {
// //     Scanner sc =new Scanner(System.in);
// //     for(int i=100;i<500;i++){
// //         Spy(i);
// //     }
// //     }
// //     public static  void Spy(int m ) {
// //         int sum=0,pro=1,temp=m,a;

// //             while(m>0)
// //             {
// //                 a=m%10;
// //                 sum = sum + a;
// //                 pro = pro*a;
// //                 m=m/10;
// //         }
// //             if(sum==pro)
// //             {
// //                 System.out.println(temp+" = it's a SPY Number");
// //             }
// //             // else 
// //             // {
// //             //     System.out.println(temp +" =it's a  not a SPY Number");
// //             // }

//     }
// }


        /// even or odd number
        // int a;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number");
        // a = sc.nextInt();
        // if(a%2==0)
        // {
        // System.out.println(a+" is a even number");

        // }
        // else
        // {
        // System.out.println(a+" is a odd number");
        // }

        /// number is positive or not
        // int a;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number");
        // a = sc.nextInt();
        // if (a>0)
        // {
        // System.out.println(a+" is a positive number");
        // }
        // else if(a<0){
        // System.out.println(a+" is a negative number");
        // }
        // else if(a==0){
        // System.out.println("Is a Zero");
        // }
        /// greatest of three number
        // int a,b,c,d;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the three number");
        // a = sc.nextInt();
        // b = sc.nextInt();
        // c = sc.nextInt();
        // d = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
        // System.out.println("Largest Number:"+d);
        /// factorial of a number
        // int a,i,fact=1;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the a number");
        // a = sc.nextInt();
        // for(i=1;i<=a;i++)
        // {
        // fact = fact*i;
        // }
        // System.out.println("The factorail of "+a+" is = "+fact);

        /// area of a rectangle
        // int a,b;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the length and breath");
        // a = sc.nextInt();
        // b = sc.nextInt();
        // int A = a*b;
        // System.out.println("Area of the rectangle is = "+A);
        /// Sum of N natural numbers
        // int a,sum=0;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number");
        // a = sc.nextInt();
        // for(int i=0;i<=a;i++)
        // {
        // sum = sum + i;
        // }
        // System.out.println("The sum of n natural numbers is "+sum);
        /// Armstorng number
        // int a,b,n,ar=0;

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number");
        // a = sc.nextInt();
        // b = a;
        // while(b!=0)
        // {
        // n=b%10;
        // ar += Math.pow(n,3);
        // b = b/10;
        // }
        // if(ar==a)
        // {
        // System.out.println(a+" is an Armstrong number");
        // }
        // else {
        // System.out.println(a+" is not an Armstrong number");
        // }
                                   /// Palindrome
        // int a,b,n,ar=0;

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number");
        // a = sc.nextInt();
        // b = a;
        // while(b>0)
        // {
        // n=b%10;
        // ar = (ar*10)+n;
        // b = b/10;
        // }
        // if(ar==a)
        // {
        // System.out.println(a+" is an Palindrome number");
        // }
        // else {
        // System.out.println(a+" is not an Palindrome number");
        // }

                                      /// Area of a circle

        // int a;
        // double pi =3.142,C;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the radius");
        // a = sc.nextInt();
        // C = 3.412*a*a;
        // System.out.println("The radius of "+a+" is "+C);

                            /// swapping two number with using 3 variable
        // int a,b,c;

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the two numbers");
        // a = sc.nextInt();
        // b = sc.nextInt();
        // System.out.println("The numbers before swaping a = "+a+" b = "+b);

        // c=a;
        // a=b;
        // b=c;

        // System.out.println("The numbers after swaping a = "+a+" b = "+b);

                               /// swapping two number without using 3 variable
        // int a,b;

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the two numbers");
        // a = sc.nextInt();
        // b = sc.nextInt();
        // System.out.println("The numbers before swaping a = "+a+" b = "+b);
        // a=a+b;
        // b=a-b;
        // a=a-b;
        // System.out.println("The numbers after swaping a = "+a+" b = "+b);
                                /// print average of student
        // int a, b, c, d, A;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the marks of the student in 4 subject");
        // a = sc.nextInt();
        // b = sc.nextInt();
        // c = sc.nextInt();
        // d = sc.nextInt();
        // A = (a + b + c + d) / 4;
        // System.out.println("The Average of the student is " + A);
        // if (A >= 90)
        // {
        // System.out.println("Distinction");
        // }
        // else if (A >= 85 && A < 90)
        // {
        // System.out.println("Grade A");
        // }
        // else if (A >= 75 && A < 85)
        // {
        // System.out.println("Grade B");
        // } else if (A >= 65 && A < 75) {
        // System.out.println("Grade C");
        // } else if (A >= 50 && A< 65) {
        // System.out.println("Grade D");
        // } else if (A >= 45 && A<50) {
        // System.out.println("Grade E");
        // }
        // else {
        // System.out.println("Fail");
        // }

                    /// find sum and average of a given array
        // int i, n;
        // double sum = 0, A;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size of the array");
        // n = sc.nextInt();
        // int[] a = new int[n];
        // System.out.println("Enter the array elements");
        // for (i = 0; i < n; i++) {
        //     a[i] = sc.nextInt();
        // }
        // for (i = 0; i <n; i++) {
        //     sum = sum + a[i];
        // }
        // System.out.println("Sum of array elements is " + sum);
        // A = sum / n;
        // System.out.println("Average of array elements is " + A);

///find sum and average of 2 arrays


    //   Scanner input = new Scanner(System.in);
    //   System.out.print("Enter the size of the arrays: ");
    //   int size = input.nextInt();
    //   int[] arr1 = new int[size];
    //   int[] arr2 = new int[size];

    //   System.out.println("Enter the elements of the first array:");
    //   for (int i = 0; i < size; i++) {
    //      arr1[i] = input.nextInt();
    //   }

    //   System.out.println("Enter the elements of the second array:");
    //   for (int i = 0; i < size; i++) {
    //      arr2[i] = input.nextInt();
    //   }
    //   int sum1 = 0, sum2 = 0;
    //   for (int i = 0; i < size; i++) {
    //      sum1 += arr1[i];
    //      sum2 += arr2[i];
    //   }
      
    //   int totalSum = sum1 + sum2;
    //   System.out.println("Sum of both arrays elements is " + totalSum);
    //   double average = (double)totalSum / (2*size);
    //   System.out.println("Average of both arrays elements is " + average);

///matrix addition and substraction
    
    //   Scanner input = new Scanner(System.in);
    //   System.out.print("Enter the number of rows and columns of matrices: ");
    //   int rows = input.nextInt();
    //   int columns = input.nextInt();

    //   int[][] matrix1 = new int[rows][columns];
    //   int[][] matrix2 = new int[rows][columns];
    //   int[][] sum = new int[rows][columns];
    //   int[][] diff = new int[rows][columns];

    //   System.out.println("Enter the elements of the first matrix:");
    //   for (int i = 0; i < rows; i++) {
    //      for (int j = 0; j < columns; j++) {
    //         matrix1[i][j] = input.nextInt();
    //      }
    //   }

    //   System.out.println("Enter the elements of the second matrix:");
    //   for (int i = 0; i < rows; i++) {
    //      for (int j = 0; j < columns; j++) {
    //         matrix2[i][j] = input.nextInt();
    //      }
    //   }

    //   // Perform matrix addition
    //   for (int i = 0; i < rows; i++) {
    //      for (int j = 0; j < columns; j++) {
    //         sum[i][j] = matrix1[i][j] + matrix2[i][j];
    //      }
    //   }
    //   for (int i = 0; i < rows; i++) {
    //     for (int j = 0; j < columns; j++) {
    //        diff[i][j] = matrix1[i][j] - matrix2[i][j];
    //     }
    //  }

    //   System.out.println("The sum of the matrices is:");
    //   for (int i = 0; i < rows; i++) {
    //      for (int j = 0; j < columns; j++) {
    //         System.out.print(sum[i][j] + " ");
    //      }
    //      System.out.println();
    //     }
    //      System.out.println("The difference of the matrices is:");
    //   for (int i = 0; i < rows; i++) {
    //      for (int j = 0; j < columns; j++) {
    //         System.out.print(diff[i][j] + " ");
    //      }
    //      System.out.println();
    //   }

///multiplication table

    //   Scanner input = new Scanner(System.in);
    //   System.out.print("Enter the number you want the multiplication table for: ");
    //   int num = input.nextInt();

    //   System.out.println("Multiplication table for " + num + ":");

    //   // Generate the multiplication table
    //   for (int i = 1; i <= 10; i++) {
    //      System.out.println(num + " x " + i + " = " + (num*i));
    //   }

///To find size of static array and printing the arrayelements


    //    int[] arr = {1, 2, 3, 4, 5,9,6,8,7,4,5};
 
       
    //    int size = arr.length;
    //    System.out.println("Size of the array: " + size);
 
       
    //    System.out.println("Elements of the array:");
    //    for (int i = 0; i < size; i++) {
    //       System.out.print(arr[i] + " ");


 ///Time converter
 
    //   Scanner input = new Scanner(System.in);
    //   System.out.print("Enter time in seconds: ");
    //   int seconds = input.nextInt();

    //   // Convert seconds to hours, minutes, and seconds
    //   int hours = seconds / 3600;
    //   int minutes = (seconds % 3600) / 60;
    //   int remainingSeconds = seconds % 60;

    //   // Print the converted time
    //   System.out.println("Converted time: " + hours + " hours, " + minutes + " minutes, " + remainingSeconds + " seconds");



///prime number
      
    //   int num, i, count=0;
    //   Scanner s = new Scanner(System.in);
     
    //   System.out.print("Enter a Number: ");
    //   num = s.nextInt();
     
    //   for(i=2; i<num; i++)
    //   {
    //   if(num%i == 0)
    //   {
    //   count++;
    //   break;
    //   }
    //   }
     
    //   if(count==0)
    //   System.out.println("\nIt is a Prime Number.");
    //   else
    //   System.out.println("\nIt is not a Prime Number.");


    public class Java {
        public static void main(String[] args) {
            
            Scanner sc =new Scanner(System.in);

 ///curren,time,distance converter           
        //     int choice,ch;
        //     Cc c=new Cc();
        //     Dd d =new Dd();
        //     Tt t=new Tt();
        //     do
        //     {
        //     System.out.println("2.dollar to rupee ");
        //     System.out.println("1.rupee to dollar ");
        //     System.out.println("4.Euro to rupee ");
        //     System.out.println("3.rupee to Euro ");
        //     System.out.println("6.Yen to rupee ");
        //     System.out.println("5.Rupee to Yen ");
        //     System.out.println("7.Meter to kilometer ");
        //     System.out.println("8.kilometer to meter ");
        //     System.out.println("10.Miles to kilometer ");
        //     System.out.println("9.kilometer to miles");
        //     System.out.println("11.Hours to Minutes");
        //     System.out.println("13.Seconds to Hours");
        //     System.out.println("12.Minutes to Hours");
        //     System.out.println("Enter ur choice");
        //     choice=sc.nextInt();
        //     switch(choice)
        //     {
        //     case 1:
        //     {
        //     c.InrtoUsd();
        //     break;
        //     }
        //     case 2:
        //     {
        //     c.usdtoInr();
        //     break;
        //     }
        //     case 3:
        //     {
        //     c.Inrtoeuro();
        //     break;
        //     }
        //     case 4:
        //     {
        //     c.EurotoInr();
        //     break;
        //     }
        //     case 5:
        //     {c.InrtoYen();
        //     break;
        // }
        //     case 6 :
        //     {
        //     c.YentoInr();
        //     break;
        //     }
        //     case 7 :
        //     {
        //     d.MetertoKm();
        //     break;
        //     }
        //     case 8 :
        //     {
        //     d.KmtoMeter();
        //     break;
        //     }
        //     case 9 :
        //     {
        //     d.Kmtomiles();
        //     break;
        //     }
        //     case 10 :
        //     {
        //     d.MilestoKm();
        //     break;
        //     }
        //     case 11 :
        //     {
        //     t.HourstoMin();
        //     break;
        //     }
        //     case 12 :
        //     {
        //     t.MintoHours();
        //     break;
        //     }
        //     case 13 :
        //     {
        //     t.SecondstoHours();
        //     break;
        //     }}
        //     System.out.println("Enter 0 to quit and 1 to continue ");
        //     ch=sc.nextInt();
        //     }while(ch==1);



            }
            }
            
      
   


   
    

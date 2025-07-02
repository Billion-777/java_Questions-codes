
import java.util.*;
import java.util.Random;
class quicksort
{
int partition(int a[],int low,int high)
{
int p,i,j,temp;
p=a[low];
i=low;j=high+1;
while(i<=j)
{
do{
i++;
}while(p>=a[i]&&(i<=high));
do{
j--;
}while(p<a[j]&&(j>=low));
if(i<j)
{
temp=a[i];a[i]=a[j];a[j]=temp;
}

}
temp=a[j];
a[j]=a[low];
a[low]=temp;
return j;
}
void quicksort(int a[],int low,int high)
{
int k;
if(low<high)
{

k=partition(a,low,high);
quicksort(a,low,k-1);
quicksort(a,k+1,high);
}
}
public static void main(String args[])
{
int n,i;
quicksort q=new quicksort();
Scanner s=new Scanner(System.in);
Random r=new Random();
int a[]=new int[100000];
System.out.println("EntertheNumberofElements");
n=s.nextInt();
for(i=0;i<n;i++)
{
a[i]=r.nextInt(1000);
}
System.out.println("\nArrayElementsare\n");
for(i=0;i<n;i++)
System.out.print(a[i]+"");
long st=System.currentTimeMillis();
q.quicksort(a,0,n-1);
long et=System.currentTimeMillis();
long tt=et-st;
System.out.println("\n SortedElements are \n");
for(i=0;i<n;i++)
System.out.print(a[i]+"");
System.out.println("\nTotalTimeis:"+tt+"ms");
}
}

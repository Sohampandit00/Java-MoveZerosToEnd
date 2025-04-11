import java.util.Scanner;
public class zero
{
public static void main(String[] args)
{
System.out.println("Type in a list of 10 integers containing zeroes mixed inbetween them . Ex: 5 3 0 4 6 9 0 6 7 3");
Scanner myScan = new Scanner(System.in);
int scannedInt = myScan.nextInt();
int[] list;
list = new int[10];
int i = 0;
while(i < 10)
{
list[i] = scannedInt;
if(i < 9)
{
scannedInt = myScan.nextInt();

}
i = i+1;
}



for(int a = 0; a < list.length; a++)
{
for(int j = 0; j < list.length; j++)
{
if(list[j] == 0)
{
if(j < 9)
{
int temp= list[j];
list[j] = list[j+1];
list[j+1] = temp;
}
}
}
}



for(int q = 0; q <list.length; q++)
{
System.out.println(list[q]);
}
}
}

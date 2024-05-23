#include<stdio.h>
#include<conio.h>

int main()
{
    int No = 0 ,temp= 0, fact=1;

    printf("\n Enter No to get Factorial = ");
    scanf("%d",&No);
   
    temp = No;
    
    while (temp > 0)
    {
        fact = fact * temp;
        temp--;
    }
    
    printf("Factorial of given no is : %d ",fact);

    getch();
    return 0;
}
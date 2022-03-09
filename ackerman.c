#include<stdio.h>

int ack(int m,int n)
{
    int ans;
    if(m==0) ans = n+1;
    else if (n==0) ans = ack(m-1,1);
    else ans = ack(m-1,ack(m,n-1));
    return (ans);
}

int main(int argc, int argv)
{
    int i,j;
    i=0;
    while( i<3)
    {
        j=0;
        while(j<3)
        {
            printf("ackerman(%d %d) is %d\n", i,j,ack(i,j));
            j++;
        }
        i++;
    }
}

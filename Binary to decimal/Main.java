#include<stdio.h>
#include<math.h>
int main()
{
  //Type your code here
  int n,s=0,r,i=0;
  scanf("%d",&n);
  while(n!=0)
  {
    r=n%10;
    s=s + r*pow(2,i);
    n=n/10;
    i++;
  }
  printf("%d",s);
  return 0;
}
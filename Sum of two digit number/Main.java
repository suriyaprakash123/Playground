#include<stdio.h>
int main()
{
  //Type your code here
  int a,b,c=0,r;
  scanf("%d",&a);
  b=a;
  while(b!=0)
  {
    r=b%10;
    c=c+r;
    b=b/10;
  }
  printf("%d",c);
  return 0;
}
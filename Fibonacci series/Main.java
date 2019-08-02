#include<stdio.h>
int main()
{
  //Type your code here
  int a,f=0,s=1,n,c;
  scanf("%d",&a);
  for(c=0;c<a;c++)
  {
    if(c<=1)
      n=c;
    else
    {
      n=f+s;
      f=s;
      s=n;
    }
    printf("%d ",n);
  }
  return 0;
}
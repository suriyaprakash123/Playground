#include<stdio.h>
int main()
{
  // Type your code here
  int a,b,c;
  scanf("%d\n%d\n%d",&a,&b,&c);
  if(a>b && a>c)
  {
    if(b>c)
      printf("%d",b);
    else
      printf("%d",c);
  }
  else if(b>c)
  {
    if(a>c)
      printf("%d",a);
    else
      printf("%d",c);
  }
  else
  {
    if(a>b)
      printf("%d",a);
    else
      printf("%d",b);
  }
  return 0;
}
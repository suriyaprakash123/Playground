#include<stdio.h>
#include<stdlib.h>
int main()
{
  //type your code here
  int n;
  scanf("%d ",&n);
  if(n%2==1)
  {
    int a=1;
    int r=2;
    int t_in=(n+1)/2;
    int res=pow(2, t_in-1);
    printf("%d ", res);
  }
  else
  {
    int a=1;
    int r=3;
    int t_in=n/2;
    int res=pow(3, t_in-1);
    printf("%d", res);
  }
  return 0;
}
#include<stdio.h>
int main()
{
  float r,ang,len;
  scanf("%f%f",&r,&ang);
  len=2*3.14*r*(ang/360);
  printf("%.2f",len);
  return 0;
}
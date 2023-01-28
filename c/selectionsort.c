#include<stdio.h>
int main()
{
	int a[25],n,i,j,min,pos;
	printf("enter total no. of elements :\t");
	scanf("%d",&n);
	printf("enter the array elements :\n");
	for(i=0;i<n;++i)
	 scanf("%d",&a[i]);
	for(i=0;i<n-1;++i)
	{
		min=a[i];
		pos=i;
		for(j=i+1;j<n;++j)
		  if(a[j]<min)
		  {
		  	min=a[j];
		  	pos=j;
		  }
		if(pos!=i)
		{
			a[pos]=a[i];
			a[i]=min;
		  }  
	 } 
	printf("sorted array is :\n");
	for(i=0;i<n;++i)
	   printf("%d\n",a[i]);
}

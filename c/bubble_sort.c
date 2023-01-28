#include<stdio.h>
void main()
{
	int a[50],n,i,j,temp;
	printf("enter the number of elements\n");
	scanf("%d",&n);
	printf("enter the elements in array\n");
	for(i=0;i<n;++i)
	  scanf("%d",&a[i]);
	for(i=0;i<n;++i)
	 for(j=0;j<n-1;++j)
	  if(a[j]>a[j+1])
	   {
	 	temp=a[j];
	 	a[j]=a[j+1];
	 	a[j+1]=temp;
	    } 
	printf("sorted array is :\n");
	for(i=0;i<n;++i)
	  printf("%d\n",a[i]);    
}

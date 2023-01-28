#include<stdio.h>
void main()
{
	int a[50],p,c,n,v;
	printf("enter the total number of elements in an array\n");
	scanf("%d",&n);
	printf("enter %d elements\n",n);
	for(c=0;c<n;++c)
	 scanf("%d",&a[c]);
	printf("enter the location where you wish to insert an element \n");
	scanf("%d",&p);
	printf("enter the value  to insert \n");
	scanf("%d",&v);
	for(c=n-1;c>=p-1;c--)
	 a[c+1]=a[c];
	 a[p-1]=v;
	printf("resultant array is \n");
	for(c=0;c<=n;++c)
	 printf("%d\n",a[c]); 
}

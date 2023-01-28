#include<stdio.h>
void main()
{
	int a[100],p,c,n;
	printf("enter the no. elements in the array\n");
	scanf("%d",&n);
	printf("enter %d elements\n",n);
	for(c=0;c<n;++c)
	 scanf("%d",&a[c]);
	printf("enter the location of element to be deleted\n");
	scanf("%d",&p);
	if(p>n+1)
	{
		printf("deletion is not possible\n");
	}
	else
	{
		for(c=p-1;c<n-1;++c)
		 a[c]=a[c+1];
	    printf("resultant array\n");
	    for(c=0;c<n-1;++c)
	     printf("%d\n",a[c]);
	}
}

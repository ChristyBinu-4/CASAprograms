#include<stdio.h>
void main()
{
	int a[10][10],b[10][10],sum[10][10],i,j,m,n;
	printf("enter no. of rows and column of matrix:\n");
	scanf("%d%d",&m,&n);
	printf("enter the elements of 1st matrix\n");
	for(i=0;i<m;++i)
	 for(j=0;j<n;++j)
	  scanf("%d",&a[i][j]);
	printf("enter the elements of 2nd matrix\n");
	for(i=0;i<m;++i)
	 for(j=0;j<n;++j)
	  scanf("%d",&b[i][j]);
	printf("Sum\n");
	for(i=0;i<m;++i)
	{
	 for(j=0;j<n;++j)
	  {
	  	sum[i][j]=a[i][j]+b[i][j];
	  	printf("%d\t",sum[i][j]);
		  } 
	  printf("\n");
    }
}

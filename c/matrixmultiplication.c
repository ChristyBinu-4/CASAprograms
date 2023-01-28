#include<stdio.h>
void main()
{
	int a[10][10],b[10][10],c[10][10],i,j,m,n,l,k;
	printf("enter total no. of rows and columns in 1st matrix\n");
	scanf("%d%d",&m,&n);
	printf("enter %d elements in 1st matrix\n",m*n);
	for(i=0;i<m;i++)
	 for(j=0;j<n;j++)
	  scanf("%d",&a[i][j]);
	printf("enter total no. of columns in 2nd matrix\n");
	scanf("%d",&l);
	printf("enter %d elements in 2nd matrix\n",n*l);
	 for(i=0;i<n;i++)
	  for(j=0;j<l;j++)
	   scanf("%d",&b[i][j]);
	/*matrix multiplication*/
	for(i=0;i<n;i++)
	 for(j=0;j<l;j++)
	 {
	 	c[i][j]=0;
	 	for(k=0;k<n;k++)
	 	 c[i][j]+=a[i][k]*b[k][j];
	 }
	printf("product of two matrices\n");
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
			printf("%d\t",c[i][j]);
		
		}
		printf("\n");
	}
	   
}

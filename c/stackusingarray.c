#include<stdio.h>
#include<conio.h>
void main()
{
	int a[50];
	int i,n,ch,e,top=-1,item;
	printf("enter the size of stack\n");
	scanf("%d",&n);
	do
	 {
	 	printf("enter the choice\n");
	 	printf("1-push\n");
	 	printf("2-pop\n");
	 	printf("3-exit\n");
	 	scanf("%d",&ch);
	 	switch(ch)
	 	{
	 		case 1:
	 			printf("enter the element to be inserted \n");
	 			scanf("%d",&item);
	 			if(top==n-1)
	 			 {
	 			 	printf("stack overflow");
	 			 	
				  }
				else
				 {
				 	top=top+1;
				 	a[top]=item;
				   }  
				printf("the new list is :\n");
				for(i=0;i<=top;i++)
				  printf("%d\n",a[i]);
				break;
			case 2:
				printf("enter the element to be deleted\n");
		    	scanf("%d",&item);
				if(top==-1)
				 {
				 	printf("stack underflow");
				 }
				else
				 {
				 	
				 	item=a[top];
				 	top=top-1;
				 	printf("%d is deleted\n",item);
				  } 
				printf("the new list is :\n");
				for(i=0;i<=top;i++)
				  printf("%d\n",a[i]);
				break;
			case 3:
			    exit(0);
			    break;
			default :
			 printf("invalid option");
			 break;   	
					    
			    	   
		 }
		 printf("do you want to continue 1:yes 0:no \n");
		 scanf("%d",&ch);
	 
	 }
	 while(ch==1);
	 getch();
}

#include<stdio.h>
#include<conio.h>
#include<process.h>
void main()

{
	int a[50],i,n,item,ch,f=-1,r=-1;
	printf("enter the size of queue\n");
	scanf("%d",&n);
    while(1)
    {
    	printf("\nthe list is \n 1.The insertion\n 2.The deletion\n 3.display\n 4.exit\n");
    	printf("enter the choice\t");
    	scanf("%d",&ch);
    	switch(ch)
        {
        	case 1:
        		if(r==n-1)
        		{
				   printf("queue is full\n");
				}
				else
				{
				
				    if(f==-1)
        			
        				f=0;
        		    printf("enter the item you want to insert\n");
        		    scanf("%d",&item);
        			r=r+1;
        			a[r]=item;
        			printf("the %d is inserted\n",item);
					
			    }
			    break;
			case 2:
				if(f==-1)
				{
					printf("queue is empty\n");
				}
				else
				{
					
					if(f==r)
					{
						r=-1;
						f=-1;
						printf("the item is deleted\n");
					}
					else
					{
					
					    item=a[f];
						f=f+1;
						printf("the %d is deleted\n",item);
					}
				}
				break;
			case 3:
				if(f==-1)
				{
					printf("queue is empty\n");
				}
				else
				{
					printf("queue is\n");
					for(i=f;i<=r;i++)
					{
					printf("%d\t",a[i]);
				    }
				}
				break;
			case 4:
				exit(1);
			
			default:
				{
					printf("entered choice is not in list\n");
				}
			   
	    }
	}

	
}

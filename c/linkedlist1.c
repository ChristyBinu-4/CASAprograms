#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
void insert_beg();
void insert_end();
int insert_any();
int display();
void delete_beg();
void delete_end();
int delete_any();

struct node
{
	int d;
	struct node *link;
    	
}*start=NULL,*q,*t;
int ch;

void main()
{
	 while(1)
	 {
	 	printf("\nsingle linked list menu\n");
	 	printf("\n1.insertion\n2.deletion\n3.display\n4.exit\n");
	 	printf("enter your choice:");
	 	scanf("%d",&ch);
	 	switch(ch)
	 	{
	 		case 1:
	 	    	printf("\ninsertion menu\n");
	 	    	printf("\n1.insertion at beginning\n2.insertion at end\n3.insertion any position\n");
	 	    	scanf("%d",&ch);
	 	    	switch(ch)
	 	    	{
	 			   case 1:
	 			    	insert_beg();
	 			    	break;
	 			   case 2:
				       insert_end();
					break;
			    	case 3:
				       insert_any();
				    	break;
			    	default:
				        printf("\nwrong choice!!\n");
					    break;			
			    }
			    break;
			case 2:
				printf("\ndeletion menu\n");
				printf("\n1.deletion at beginning\n2.deletion at end\n3.deletion any position\n");
				scanf("%d",&ch);
				switch(ch)
				{
					case 1:
						delete_beg();
						break;
					case 2:
						delete_end();
						break;
					case 3:
						delete_any();
						break;
					default:
						printf("\nwrong choice\n");
						break;
							                        	
				}
				break;
			case 3:
				 display();
				 break;
			case 4:
			    exit(1);
				break;
			default:
				printf("\nwrong input\n");
				break;
			                          		 
			                  	
			
			                                           
		}
    }    
}     
void insert_beg()
{
	int n;
	t = (struct node*)malloc(sizeof(struct node));
	printf("\nenter the data\n");
	scanf("%d",&n);
	t->d=n;
	if(start==NULL)
	{
		t->link=NULL;
		start=t;
	}
	else
	{
		t->link=start;
		start=t;
	
	}
}
void insert_end()
{
	int n;
	t = (struct node*)malloc(sizeof(struct node));
	printf("\nenter the data\n");
	scanf("%d",&n);
	t->d=n;
	t->link=NULL;
	if(start==NULL)
	{
		start=t;
	}
	else
	{
		q=start;
		while(q->link!=NULL)
		{
			q=q->link;
		}
		q->link=t;
	}
}
int insert_any()
{
	int pos,i,n;
	if(start==NULL)
	{
		printf("\nlist is empty\n");
		return(0);
	}
	t=(struct node*)malloc(sizeof(struct node*));
	printf("\nenter the data\n");
	scanf("%d",&n);
	printf("\nenter the position to be inserted\n");
	scanf("%d",&pos);
	t->d=n;
	q=start;
	for(i=0;i<pos-1;i++)
	{
	   if(q->link==NULL)
	   {
	   	printf("\nthere less elements\n");
	   	return(0);
	   }
	   	q=q->link;
	}

	t->link=q->link;
	q->link=t;
	return(0);
}

int display()
{
	if(start==NULL)
	{
		printf("\n list is empty \n");
		return(0);
	}
	else
	{
	
		printf("the list is\n");
	    q=start;
	    while(q!=NULL)
		    {
		    	printf("%d->",q->d);
		        q=q->link;
		    }
		    return(0);
	}
		   
}

void delete_beg()
{
	if(start==NULL)
	{
		printf("\nthe list is empty\n");
	}
	else
	{
		q=start;
		start=start->link;
		printf("\nthe deleted element is %d \n",q->d);
		free(q);
	}
}
void delete_end()
{
	if(start==NULL)
    {
    	printf("\nthe list is empty\n");
	}
	else
	{
		q=start;
		if(q->link==NULL)
		{
			printf("deletion is not possible");
		}
		else
		{
	     while(q->link!=NULL) 
	     {
	        t=q;
	        q=q->link;
         }
		
         t->link=NULL;  
	     printf("\nthe deleted is %d\n",q->d);
		 free(q);
	    }
		

	}
}
int delete_any()
{
	int pos,i;
	if(start==NULL)
	{
		printf("\nthe list is empty\n");
		return(0);
	}
	printf("\nenter the position of element to be deleted");
	scanf("%d",&pos);
	q=start;
	for(i=0;i<pos-1;i++)
	{
		if(q->link==NULL)
		{
			printf("there are less elements");
			return(0);
		}
		q=q->link;
	}
	t=q->link;
	q->link=t->link;
	printf("\ndeleted element is %d\n",t->d);
	free(t);
	return(0);
}

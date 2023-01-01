#include<stdio.h>
#include<stdlib.h>
typedef struct n
{
	int data;
	struct n *link;
}NODE;

NODE *ins_front(int ele , NODE *last);
NODE *ins_rear(int ele, NODE *last);
NODE *del_front(NODE *last);
NODE *del_rear(NODE *last);
NODE *del_spec(int ele, NODE *last);
void display(NODE *last);
int search(int key, NODE *last);
void count(NODE *last);
void concat(NODE *last1, NODE *last2);
NODE *get_node();
int main()
{
	NODE *last1=NULL, *last2=NULL;
	int ch, ele, list, key, flag;
	for(;;)
	{
		Back:
		printf("1. List 1\n2. List 2\n3. Concatenate and Display\n4. Exit\n");
		printf("-------------------------------------------------------------------------------------------\n");
		scanf("%d", &list); 
		switch(list)
		{		
			case 1: for(;;)
				{
					printf("\t1. Insert front\n2. Insert Rear\n3. Delete front\n4. Delete Rear\n5. Display\n6. Search\n7. Count\n8. Delete specific node\n9. Return");
					printf("-------------------------------------------------------------------------------------------\n");
					scanf("%d",&ch);
					switch(ch)
					{
						case 1: printf("Enter Data:\n");
								scanf("%d",&ele);
								last1=ins_front(ele,last1);
								break;
						case 2: printf("Enter Data:\n");
							scanf("%d",&ele);
							last1=ins_rear(ele,last1);
							break;
						case 3: last1=del_front(last1);
							break;
						case 4: last1=del_rear(last1);
							break;
							
						case 5: display(last1);
								break;
						case 6: if(last1==NULL)
								{
									printf("Empty List");
									break;
								}
								printf("Enter the key to be searched:\n");
								scanf("%d", &key);
								flag=search(key, last1);
								if(flag==1)
									printf("Successful Search");
								else 
									printf("Unsuccesful Search:");
								break;
						case 7: count(last1);
						case 8: printf("Enter data to be deleted\n");
								scanf("%d",&ele);
								last1=del_spec(ele, last1);
								break;
						case 9: goto Back;
					}
				}
				break;
			case 2: for(;;)
				{
					printf("\t1. Insert front\n2. Insert Rear\n3. Delete front\n4. Delete Rear\n5. Display\n6. Search\n7. Count\n8. delete specific node\n9. Return");
					printf("-------------------------------------------------------------------------------------------\n");
					scanf("%d",&ch);
					switch(ch)
					{
						case 1: printf("Enter Data:\n");
								scanf("%d",&ele);
								last2=ins_front(ele,last2);
								break;
						case 2: printf("Enter Data:\n");
							scanf("%d",&ele);
							last2=ins_rear(ele,last2);
							break;
						case 3: last2=del_front(last2);
							break;
						case 4: last2=del_rear(last2);
							break;
							
						case 5: 
							display(last2);
							break;
						case 6: if(last1==NULL)
								{
									printf("Empty List");
									break;
								}
								printf("Enter the key to be searched:\n");
								scanf("%d", &key);
								flag=search(key, last2);
								if(flag==1)
									printf("Successful Search");
								else if(flag==0)
									printf("Unsuccesful Search:");
								break;
						case 7: count(last2);
						case 8: printf("Enter data to be deleted\n");
								scanf("%d",&ele);
								last2=del_spec(ele, last2);
								break;
						case 9: goto Back;
					}
				}
				break;
			case 3: concat(last1, last2);
				break;
			case 4: exit(0);
		}
	}		
}

NODE *get_node()
{
	NODE *temp;
	temp=(NODE *)malloc(sizeof(NODE));
	if(temp==NULL)
	{
		printf("No Memory\n");
		return NULL;
	}
	return temp;
}

NODE *ins_front(int ele , NODE *last)
{
	NODE *new=get_node();
	new->data=ele;
	if(last==NULL)
		last=new;
	else
		new->link=last->link;
	last->link=new;
	return last;
}

NODE *ins_rear(int ele, NODE *last)
{
	NODE *new=get_node();
	new->data=ele;
	if(last==NULL)
		last=new;
	else
		new->link=last->link;
	last->link=new;
	return new;
}

NODE *ins_spec(int pos, int ele, NODE *last)
{
	NODE *new=get_node();
	new->data=ele;
	NODE *temp;
	int i=1;
	if(last==NULL)
		last=new;
	else
		while((temp!=last)&&(i<pos))
		{
			temp=temp->link;
			i++;
			
		}
	
}

NODE *del_front(NODE *last)
{
	NODE *temp=NULL;
	if(last==NULL)
	{
		printf("List is empty\n");
		return NULL;
	}
	if(last->link==last)
	{
		printf("The deleted data is %d\n", last->data);
		free(last);
		return NULL;
	}
	temp=last->link;
	last->link=temp->link;
	printf("The deleted data is %d\n", temp->data);
	free(temp);
	return last;
}

NODE *del_rear(NODE *last)
{
	NODE *present, *prev;
	present=last->link;
	prev=NULL;
	if(last==NULL)
	{
		printf("List is empty\n");
		return NULL;
	}
	if(last->link==last)
	{
		printf("The deleted data is %d\n", last->data);
		free(last);
		return NULL;
	}
	while(present!=last)
	{
		prev=present;
		present=present->link;
	}
	prev->link=last->link;
	printf("The deleted data is %d\n", present->data);
	free(present);
	return prev;
}

NODE *del_spec(int ele, NODE *last)
{
	NODE *prev, *present;
	prev=NULL;
	present=last->link;
	if(last==NULL)
	{
		printf("List is empty\n");
		return NULL;
	}
	if(last->link==last)
	{
		printf("The deleted data is %d\n", last->data);
		free(last);
		return NULL;
	}
	while((present!=last)&&(present->data!=ele))
	{
		prev=present;
		present=present->link;
	}
	if(present->data==ele)
	{
		prev->link=present->link;
		free(present);
		return last;
	}
	printf("Node not found\n");
	return last;
}



void display(NODE *last)
{
	NODE *temp;
	temp=last->link;
	if(last==NULL)
	{
		printf("List is empty\n");
		return;
	}
	while(temp!=last)
		{	
			printf("%d\t", temp->data);
			temp=temp->link;
		}
	printf("%d\n",last->data);
}

int search(int key, NODE *last)
{
	NODE *temp;
	temp=last->link;
	while(temp!=NULL)
	{
		if(temp->data==key)
		{
			return 1;
		}
		temp=temp->link;
	}
	return 0;
}

void count(NODE *last)
{
	int count=0;
	NODE *temp;
	temp=last->link;
	while(temp!=last)
	{
		count++;
		temp=temp->link;
	}
	printf("Count=%d",count);
}

void concat(NODE *last1, NODE *last2)
{
	NODE *temp;
	NODE *pres;
	if((last1==NULL)&&(last2==NULL))
	{
		printf("Both lists are empty\n");
		return;
	}
	
	if((last1==NULL)||(last2==NULL))
	{
		if(last1==NULL)
		{
			last1=last2;
			printf("List1 is empty\n");
			printf("Concatenated list:\n");
			display(last1);
			return;
		}
		else 
		{
			display(last1);
			return;
		}
	}
	else
	{
		temp=last1->link;
		last1->link=last2->link; 
		pres=last1;
		last2->link=temp;
		while(pres->link!=temp)
		{
			pres=pres->link;
		}
		last1=pres;
		last1->link=temp;
		display(last1);
		last2=NULL;
	}
}
		
		
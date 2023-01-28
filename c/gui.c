#include<graphics.h>
void main()
{
	int gd=DETECT,gm;
	initgraph(&gd,&gm,"C:\\TURBOC3\\BGI");
	sine(50,50,250,200);
	circle(400,200,100);
	rectangle(50,300,350,450);
}

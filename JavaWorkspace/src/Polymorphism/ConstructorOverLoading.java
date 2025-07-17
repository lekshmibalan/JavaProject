package Polymorphism;

public class ConstructorOverLoading {
        double width,height,depth;
ConstructorOverLoading() //Constructor name should be same as class name //1
{
	/*width=0;
	height=0;
	depth=0; */
	width=height=depth=0;
	
}
ConstructorOverLoading(double w, double h, double d)  //2
	{
		width=w;
		height=h;
		depth=d;
	}
	
ConstructorOverLoading(double len)   //3
{
	width=height=depth=len;
	
}
double voulme()	
{
	return(width*height*depth);
}




}






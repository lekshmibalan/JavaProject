package keywords;

public class ThisKeyword {
           int x,y;  // class variables/instance variables
           
           ThisKeyword(int x,int y)
           {
        	   this.x=x;
        	   this.y=y;
           }
           void display()
           {
        	   System.out.println(x);
        	   System.out.println(y);
           }
           public static void main(String[] args) {
		ThisKeyword th=new ThisKeyword(100,200);  // local variables
        th.display();
	}

}

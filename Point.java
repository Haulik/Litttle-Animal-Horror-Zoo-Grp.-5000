// der oprettes en class "Point" med en x og y variable
public class Point{
   int x;
   int y;
   String name;
   String sound;
   
   // metode til at deffinere start punkt
   public Point(int startx, int starty){
      x = startx;
      y = starty;
   }   
   
   // metode til at ændre x og y, med given værdi.
   // samt at fortælle kaninens x og y.
   public void move(int dx, int dy){
      this.x += dx;
      this.y += dy;   
      System.out.println("I am the "+sound+" "+name+", I am now standing on "+x+","+y);
   }  
}
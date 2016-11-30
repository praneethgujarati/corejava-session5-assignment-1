import java.lang.Math;

abstract class Figure
{
  abstract void findArea();
  double area;
  abstract void findPerimeter();
  double perimeter;
}

class Triangle extends Figure
{
  double b=50,h=15,a=20,c=45;
  void findArea()
  {
    area = (b*h)/2;
    System.out.println("area of Trianlge:" +area);
  }
  
  void findPerimeter()
  {
    perimeter=(a+b+c);
    System.out.println("Perimeter of Triangle:" +perimeter);
  }
}

class Rectangle extends Figure
{
   double w=70,l=20;
   void findArea()
   {
     area = w*l;
     System.out.println("area of Rectangle:" +area);
   }
 
  void findPerimeter()
  {
    perimeter=2*(w+l);
    System.out.println("Perimeter of Rectangle:" +perimeter);
  }
}

class Circle extends Figure
{
   double r=5;
   void findArea()
   {
    area = Math.PI*r*r;
    System.out.println("area of Circle:" +area);
   }

   
   void findPerimeter()
   {
     perimeter=Math.PI*2*r;
     System.out.println("Perimeter of Circle:" +perimeter);
   }
}


class Area
{
  public static void main(String args[])
  {
    Triangle t = new Triangle();
    Rectangle r = new Rectangle();
    Circle c = new Circle();


   t.findArea();
   t.findPerimeter();

   r.findArea();
   r.findPerimeter();


   c.findArea();
   c.findPerimeter();
  }
}
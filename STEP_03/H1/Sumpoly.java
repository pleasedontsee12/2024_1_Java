import java.io.*;

class Polygon{
    int nPolygon;

    Polygon(){
        this.nPolygon = 0;
    }

    class Triangle{
        int height;
        int width;
	
        Triangle(int height,int width){
            this.height = height;
            this.width = width;
            nPolygon ++;
        }
   }

   class Rectangle{
        int height;
        int width;

        Rectangle(int height,int width){
            this.height = height;
            this.width = width;
            nPolygon ++;
        }
   }
}

class Sumpoly{
     public static void main(String[] args) throws IOException{
        Polygon poly = new Polygon();
        Polygon.Triangle Triangle1 = poly.new Triangle(1,2);
        Polygon.Triangle Triangle2 = poly.new Triangle(3,6);
        Polygon.Rectangle Rectangle1 = poly.new Rectangle(4,4);
        Polygon.Rectangle Rectangle2 = poly.new Rectangle(2,2);
        Polygon.Rectangle Rectangle3 = poly.new Rectangle(4,9);
        
        int n = poly.nPolygon;
   
        System.out.printf("다각형의 총 갯수 : %d", n);
            
    }

}


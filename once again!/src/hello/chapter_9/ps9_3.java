package chapter_9;
class cylinder{
	private int radius;
	private int height;
	//Answer of Question 3
	public cylinder(int n, int i) {
		radius =n;
		height =i;
	}	
    //Answer of Question 1
//	public void setRadius(int n){
//		radius = n;
//	}
	public int getRadius(){
		System.out.println("The radius of cylinder is ");
		return radius;
	}
//	public void setHeight(int n) {
//		height = n;
//	}
	public int getHeight(){
		System.out.println("The Height of cylinder is ");
		return height;
	}
	//Answer of Question 2
	public void surface_area() {
		double sa = 2*3.14*radius*height+2*3.14*radius*radius;
		System.out.println("The surface area of this cylinder is "+sa);
	}
	public void volume() {
		double v = 2*radius*radius*height;
		System.out.println("The volume of this cylinder is "+v);
	}
}
//New class for Sphere
class Sphere{
	private int radius;
	private int height;
	public Sphere(int n) {
		radius =n;
	}
	public void surface_area() {
		double sa = 4*3.14*radius*radius;
		System.out.println("The surface area of this Sphere is "+sa);
	}
	public void volume() {
		double v = 4/3*3.14*radius*radius*radius;
		System.out.println("The volume of this Sphere is "+v);
	}
}
public class ps9_3 {

	public static void main(String[] args) {
	//cylinder bottle = new cylinder(39, 15);
//		bottle.setRadius(39);                    //printing result of question 1
//		bottle.setHeight(15);
//		bottle.surface_area();                   //printing surface area of cylinder
//        bottle.volume();                         //printing volume of cylinder
		
		Sphere ball = new Sphere(25);
		ball.surface_area();
		ball.volume();
	}

}

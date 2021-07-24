package hello;

class circle {
	int r;
	int d;
	public circle(int i, int j) {
		r = i;
		d = j;
	}
	public double area() {
		System.out.print("the area of this circle is ");
		return Math.PI *r *r;
	}
}

class cylind extends circle{
	int h;
	public cylind(int i, int j, int l) {
      super(i,j);
      h = l;
	}
	public double area() {
		System.out.print("the area of this cylinder is ");
		return 2*Math.PI*r*h+2*Math.PI*r*r;
	}
	public double volume() {
		System.out.print("the volume of this cylinder is ");
		return Math.PI * r*r*h;
	}
}

class rectangl{
	int l;
	int b;
	
	public rectangl(int i, int j) {
		l = i;
	    b = j;
	}
	public int area() {
		System.out.print("the area of this rectangle is ");
		return l*b;
	}
}

class cuboid extends rectangl{
	int h;
	public cuboid(int i, int j, int l) {
      super(i,j);
      h = l;
	}
	public int area() {
		System.out.print("the area of this cuboid is ");
		return 2 *l*b +b*h +l*h;
	}
	public double volume() {
		System.out.print("the volume of this cuboid is ");
		return l*b*h;
	}
}

public class ps10_6 {
	public static void main(String[] args) {
		  cylind c = new cylind(5, 9, 7);
		  cuboid r = new cuboid(4, 7, 6);
		  System.out.println(c.area());
		  System.out.println(c.volume());
		  System.out.println(r.area());
		  System.out.println(r.volume());
		  
		  

	}

}

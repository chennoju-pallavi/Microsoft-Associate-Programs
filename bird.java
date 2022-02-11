class pigeon {
	void display()
    {
    	System.out.println("Parent class");
    }
	void eyes() {
		System.out.println("Bird Eyes!!!");
	}
	void wings() {
		System.out.println("Bird Wings!!!");
	}
}
public class bird extends pigeon{
	void name()
	{
		System.out.println("Bird name is Om");
	}
	public static void main(String[] args) {
		pigeon p=new pigeon();
		bird b=new bird();
		b.wings();
		b.eyes();
		b.name();
	}
}

public class FlowerTest {

	public static void main(String[] args) {
		// Create 4 different flowers using the different constructors
		Flower f1 = new Flower();
		System.out.println(f1.getPetalCount());
		System.out.println(f1.getFlowerName());
		
		Flower f2 = new Flower("Jerusalem");
		System.out.println(f2.getPetalCount());
		System.out.println(f2.getFlowerName());
		
		Flower f3 = new Flower(4);
		System.out.println(f3.getPetalCount());
		System.out.println(f3.getFlowerName());
		
		Flower f4 = new Flower("Israel", 3);
		System.out.println(f4.getPetalCount());
		System.out.println(f4.getFlowerName());	

	}

}
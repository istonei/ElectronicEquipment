
public class ElectronicEquipment {

	public static void main(String[] args) {
		
		Computer computer = new Computer("Computer", 40, 500, 300, "ASUS");
		Cellphone cellphone = new Cellphone("Cellphone", 0.1, 500, 0.5, "Apple");
		Camera camera = new Camera("Camera", 0.95, 500, 1, "Nikon");
		
		System.out.println(computer);
		System.out.println(cellphone);
		System.out.println(camera);

	}

}

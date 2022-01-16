package homework2.encapsulation;

public class TestDocumentory {

	public static void main(String[] args) {
		
		Documentory animals = new Documentory();
		animals.setDuration(3);
		System.out.println(animals.getDuration());
		
		animals.setCategory("19");
		System.out.println(animals.getCategory());
		
	}

}

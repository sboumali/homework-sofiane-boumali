package homework1.stringmanipulation;

public class Assignment {

	public static void main(String[] args) {
	String name = "Sofiane Boumali";
	String ID = "30402NY";
	System.out.println(name.concat(ID));
	System.out.println(name.length());
	System.out.println(name.indent(0));
	System.out.println(name.lastIndexOf(ID));
	System.out.println(name.repeat(0));
	System.out.println(name.replaceFirst(name,ID ));
	System.out.println(name.toLowerCase());
	System.out.println(name.toUpperCase());
	System.out.println(name.replaceAll(name, "KABYLIE SOFIANE"));
	System.out.println(ID + name);
	
	
	
	}

}

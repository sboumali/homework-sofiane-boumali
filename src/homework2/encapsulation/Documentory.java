package homework2.encapsulation;

public class Documentory {

	private int duration;
	
	private String category;
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		if(category == "Old People" || category == "Adult People" ) {
			this.category = category;
		}else {
			this.category = "NO";
		}
		
		
		
	}
	
	public void setDuration(int myDuration) {
		this.duration = myDuration;
	}
	
	public int getDuration() {
		return duration;
		
		
		
	}
}

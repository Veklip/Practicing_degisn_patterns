
public class RealImage implements Image {

	private String filename;

	public RealImage(String filename){
		this.filename = filename;
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Displaying " + filename);
	}

}

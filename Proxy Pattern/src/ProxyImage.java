
public class ProxyImage implements Image {

	private String fileName;
	private RealImage realImage;

	public ProxyImage(String fileName){
		this.fileName = fileName;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		if(realImage == null)
			realImage = new RealImage(fileName);
		
		realImage.display();
	}

}

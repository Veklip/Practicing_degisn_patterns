
public abstract class Shape implements Cloneable {
	private String id;
	protected String type;
	
	public void setId(String id){
		this.id = id;
	}
	
	public String getId(){
		return  id;
	}

	public abstract void draw(); 

	public String getType(){
		return type;
	}
	
	public Object clone(){
		Object o = null;
		
		try{
			o = super.clone();
		}catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return o;
	}

}

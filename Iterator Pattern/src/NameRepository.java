
public class NameRepository implements Container {

	public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};
	
	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new NameIterator();
	}
	
	private class NameIterator implements Iterator {

		int index;
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return index < names.length;
		}

		@Override
		public Object Next() {
			// TODO Auto-generated method stub
			return names[index++];
		}
		
	}

}

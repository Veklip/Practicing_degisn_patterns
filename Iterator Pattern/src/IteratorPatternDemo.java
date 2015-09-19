
public class IteratorPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NameRepository nameRepository = new NameRepository();
		
		for(Iterator it = nameRepository.getIterator(); it.hasNext();){
			System.out.println("name="+(String)it.Next());
		}
	}

}

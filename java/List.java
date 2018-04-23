public class List {
	private Object data;
	private List next;

	public List(Object data) {
		this.data = data;
	}

	//Append a new node to the List with data
	public void append(Object data) {
		List newnode = new List(data);
		this.next = newnode;
	}

	//Get the next element in the List
	public List next() {
		return this.next;
	}

	//Set the data field in a given
	public void set(Object data) {
		this.data = data;
	}

	//Return the data field in the List
	public Object get() {
		return this.data;
	}
	public static void main(String[] args) {
		String firstData = "Test ";
		List newList = new List(firstData);
		String secondData = "list\n";
		newList.append(secondData);
		while(newList!=null) {
			System.out.print(newList.get());
			newList = newList.next();
		}
	}
}

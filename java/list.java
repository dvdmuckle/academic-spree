public class list {
	private Object data;
	private list next;

	public list(Object data) {
		this.data = data;
	}

	//Append a new node to the list with data
	public void append(Object data) {
		list newnode = new list(data);
		this.next = newnode;
	}

	//Get the next element in the list
	public list next() {
		return this.next;
	}

	//Set the data field in a given
	public void set(Object data) {
		this.data = data;
	}

	//Return the data field in the list
	public Object get() {
		return this.data;
	}
	public static void main(String[] args) {
		String firstData = "Test ";
		list newList = new list(firstData);
		String secondData = "list\n";
		newList.append(secondData);
		while(newList!=null) {
			System.out.print(newList.get());
			newList = newList.next();
		}
	}
}

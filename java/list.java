public class list {
	private Object data;
	private list next;

	public list(Object data) {
		this.data = data;
	}

	//Append a new node to the list with data
	public void append(Object data) {
		list newnode = new list(data);
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
}

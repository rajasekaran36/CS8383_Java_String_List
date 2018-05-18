import com.raja.oopslab.stringlist.StringList;

public class Main {
	public static void main(String[] args){
		StringList sl = new StringList();
		sl.addString("Hello");
		sl.addString("Hai");
		sl.addString("Joo");
		sl.addString("Foo");
		//sl.displayList();
		sl.insertStringAt(2, "XXX");
		//sl.displayList();
		sl.searchString("99");
		sl.displayStringsBeginWith("H");
	}
}

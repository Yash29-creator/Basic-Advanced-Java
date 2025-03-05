package oops;

public class Constructor {
	
	String name;
	int id;
	long cno;
	static String schname = "Parul University";
	

	public Constructor(String sname) {
		this.name = sname;
		System.out.println("From Constructor String");
	}
	public Constructor(String sname,int sid) {
		this(sname);
		this.id = sid;
		System.out.println("From Constructor int");
	}
	public Constructor(String sname,int sid,long mblno) {
		this(sname, sid);
		this.cno = mblno;
		System.out.println("From Constructor long");
	}
	public void getAttribute() {
		System.out.println("Student Name: "+name);
		System.out.println("Student ID: "+id);
		System.out.println("Student Contact: "+cno);
		System.out.println("College Name: "+schname);
	}
	
	public static void main(String[] args) {
		Constructor con = new Constructor("Yash",100,1234567890);
		con.getAttribute();
	}

}

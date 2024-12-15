package practice_java;

class Man{
	String name;
	int rol_no;
	String shift;
	
	Man (String name,int rol_no,String s)
	{
		this.name = name;
		this.rol_no = rol_no;
		this.shift = s;
	}
}

class empl extends Man{
	empl(String name,int rol_no,String s)
	{
		super(name,rol_no,s);
	}
}

public class Super_keyword {
	public static void main (String [] args) {
	
		empl a = new empl("Raashith",22503545,"Morning to Night");
		

		System.out.println("His Name is "+a.name);
		System.out.println("His roll number "+a.rol_no);
		System.out.println("He working in "+a.shift);
	}	
	
	
	
}

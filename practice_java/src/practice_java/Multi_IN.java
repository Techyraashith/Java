package practice_java;

class High_Table {
	void HT(){
		System.out.println("High Table Controle the Whole World.");
		System.out.println("There are many Continaltals branchs Under High Table");
	}
}

class Winston_Scott extends High_Table {
	void Incharge() {
		System.out.println("Winston Scott is Incharge of New York Branch");
	}
}

class John_Wick extends Winston_Scott {
	void Boogeman() {
		System.out.println("John Wick is friend of Winston Scott");
		System.out.println("A Killing Machine Working Under the High_Table");
	}
}


public class Multi_IN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		John_Wick k = new John_Wick();
		k.HT();
		k.Incharge();
		k.Boogeman();
		
	}

}

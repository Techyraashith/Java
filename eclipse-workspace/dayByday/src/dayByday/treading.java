package dayByday;

class temp extends Thread{
	int  j = 0;
	public void run() {
		for (int i = 1; i<=10; i++) {
			System.out.println("This is Thread no : 1");
			
			try {
				Thread.sleep(3);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		for (int i = 1; i <= 50; i++) {
			
			j = i;
		}
	}
}

class sec extends Thread{
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("This is Thread no : 2");
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

public class treading {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		temp t1 = new temp();
		sec t2 = new sec();
		
		t2.setPriority(10);
		t1.setPriority(3);
		
		t1.start();
		t2.start();
		
		t1.join();
		System.out.println(t1.j);
		
		
	}

}



























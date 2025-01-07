package dayByday;

public class Bank {
	private String acName;
	private int bal;
	
	public Bank(String acName,int bal) {
		this.acName = acName;
		this.bal = bal;
	}
	
	public class Trans{
		private String Transtype;
		private int amount;
		
		public Trans(String Transtype, int amount) {
			this.Transtype = Transtype;
			this.amount = amount;
		}
		
		public void displayTrans() {
			System.out.println("Transaction type: "+Transtype);
			System.out.println("Amount: " +amount);
		}
	}
	
	public void Withdraw(int amount) {
        if (amount <= bal) {
            bal = bal - amount;
            Trans trans = new Trans("Withdrawal", amount);
            System.out.println("Withdrawn: " + amount);
            trans.displayTrans();
        } else {
            System.out.println("Insufficient balance!");
        }
    }
	
    public void displayBal() {
        System.out.println("Account Holder: " + acName);
        System.out.println("Current Balance: " + bal);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b = new Bank("Raashith",1000);
		
		b.Withdraw(500);
		b.displayBal();
	}

}

package corejava;

public class CollectAmount {
	
	public Integer collectedAmount=1000;
	
	public Integer CollectedtheAmount() {
		System.out.println("Daddy Collected the amount" +collectedAmount +"sent it to you");
		return collectedAmount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectAmount myson= new CollectAmount();
		Integer daddy= myson.CollectedtheAmount();
		System.out.println("Amount colleted my son"+daddy );
		
	}

}

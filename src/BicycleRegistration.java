public class BicycleRegistration
{
	public static void main (String[] args){
		Bicycle bike, bike1, bike2;
		String tagNo, owner1, owner2;


		bike = new Bicycle();
		bike.setTagNo("2004-123R"); 
		
	
		bike1 = new Bicycle();
		bike1.setOwnerName("Adam Smith");

		bike2 = new Bicycle();
		bike2.setOwnerName("Ben Jones");



		//Output the information
	    tagNo = bike.getTagNo();
		owner1 = bike1.getOwnerName();
		owner2 = bike2.getOwnerName();
		
		bike = new Bicycle();
		String tag = bike.getTagNo();
		
		
		System.out.println("The tag number is:" + tagNo );
		System.out.println(owner1 + " owns a bicycle." );
		System.out.println(owner2 + " also owns a bicycle." );

	}
}


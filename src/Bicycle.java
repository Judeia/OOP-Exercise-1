//Bicycle.class
public class Bicycle {

//Data member
	private String ownerName, tagNo;

//Constructor: Initialize the data memeber
	public Bicycle() {
		ownerName = "unknown";
		tagNo = "unknown";
	}

	public Bicycle(String owner , String No){
		tagNo = No;
		ownerName = owner;
	}

	//Returns the number of this Bicycle's Tag 
	public String getTagNo() {
		return tagNo;
	}

	//Assigns the number of this Bicycle's Tag
	public void setTagNo(String tagNo) {
		this.tagNo = tagNo;
	}

	//Assigns the name of this Bicycle's owner
	public void setOwnerName(String name) {
		this.ownerName = name;
	}

	//Returns the name of this Bicycle's owner
	public String getOwnerName() {
		return ownerName;
	}
}

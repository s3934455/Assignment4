import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class House {
private String houseID;
private String houseAddress;
private String houseType;
private double housePrice;
private int numBedrooms;
private int numBathrooms;
private int numCarspace;
private double sizeHouse;
private String descriptionHouse;

public House (String id, String address, String type, double price, int bedrooms, int bathrooms, int carspace, double size, String desciption)
{
	houseID=id; 
	houseAddress=address; 
	houseType=type; 
	housePrice=price;
	numBedrooms=bedrooms; 
	numBathrooms=bathrooms;
	numCarspace=carspace;
	sizeHouse=size;
	descriptionHouse=desciption;
}
public boolean AddHouse()
{
	System.out.println( "Enter the information of the house to be added");
	
	//getting user input HouseID
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter HouseID: ");
	houseID = sc.nextLine();
	if (houseID.length()!=10 || Character.isUpperCase(houseID.charAt(0))==false || Character.isUpperCase(houseID.charAt(1))==false || Character.isUpperCase(houseID.charAt(2))==false || Character.isDigit(houseID.charAt(3))==false || Character.isDigit(houseID.charAt(4))==false || Character.isDigit(houseID.charAt(5))==false || Character.isDigit(houseID.charAt(6))==false || Character.isDigit(houseID.charAt(7))==false || Character.isDigit(houseID.charAt(8))==false || Character.isDigit(houseID.charAt(9))==false) 
	{ 
		System.out.println( "The House information cannot be added"); 
		
		   
		} 
	
	//getting user input House Description
	Scanner sc1 = new Scanner(System.in);
	System.out.println("Enter House Description: ");
	descriptionHouse = sc1.nextLine();
	int countWord= countWordsBookTitle (descriptionHouse); 
	if (countWord <5 || countWord >10) 
	{ 
		System.out.println( "The book information cannot be added"); 
		} 
	
	//getting user input House Type
	Scanner sc2 = new Scanner(System.in);
	System.out.println("Enter the type of the house: ");
	houseType = sc2.nextLine();
	
	//getting user input House Address
	Scanner sc3 = new Scanner(System.in);
	System.out.println("Enter the Address of the house: ");
	houseAddress = sc3.nextLine();
	
	//getting user input Number of Bedrooms
	Scanner sc11 = new Scanner(System.in);
	System.out.println("Enter Number of Bedrooms: ");
	numBedrooms = sc11.nextInt();
	//getting user input Number of Bathrooms
	Scanner sc111 = new Scanner(System.in);
	System.out.println("Enter Number of Bathrooms: ");
	numBathrooms = sc111.nextInt();
	if (numBedrooms >4 && numBathrooms <=2) 
	{
		System.out.println( "The book information cannot be added"); 
		} 
	
	//getting user input Number of CarSpace
	Scanner sc4 = new Scanner(System.in);
	System.out.println("Enter the number of car space: ");
	numCarspace = sc4.nextInt();
	if (houseType != "Apartment" && (numCarspace <1 ))
	{ 
		System.out.println( "The book information cannot be added"); 
		} 
	
	//getting user input House Price
	Scanner sc5 = new Scanner(System.in);
	System.out.println("Enter the Price of the house: ");
	housePrice = sc5.nextInt();
	if ((housePrice <=100000  || housePrice >=1500000) || (numBedrooms == 3 && (housePrice >750000)) && (numBathrooms == 2 && (housePrice >750000)))
	{ 
		System.out.println( "The book information cannot be added"); 
		}
	
	//getting user input House Size
	Scanner sc6 = new Scanner(System.in);
	System.out.println("Enter the Size of the house: ");
	sizeHouse = sc6.nextInt();
	if((sizeHouse<50 || housePrice >350000 ))
	{ 
		System.out.println( "The book information cannot be added"); 
		}
	
	//Writing the user inputs to a text file
	try {
		FileWriter writer = new FileWriter("MyFile7.txt", false);
		writer.write("HouseID: "+houseID + "\n" + "HouseDescription: "+descriptionHouse+ "\n" + "HouseType: "+houseType+ "\n" + "HouseAddress: "+houseAddress+"\n"+ "No.of.bedrooms: "+numBedrooms+ "\n" + "No.of.bathrooms: : "+numBathrooms+ "\n"  + "No.of.CarSpace: "+numCarspace+"\n" + "House Price: "+housePrice);
		writer.flush();
		writer.close();
		} catch (IOException e) {
	            e.printStackTrace();
	        }
 
    return true;
}


public int countWordsBookTitle (String House_Description) 
{ 
StringTokenizer stringTokenizer1 = new StringTokenizer(House_Description); 
return  stringTokenizer1.countTokens(); 
} 


public boolean updateHouse (String newAddress, String newType, double newPrice, int newBedrooms, int newcarSpace, double newSize, String newDescription)
{
	//ask the user whether they want to update the house information
	Scanner input = new Scanner(System.in);
	System.out.println( "Would you like to Update the House Information. Press y for Yes or Press n for No: "); 
	String update = input.nextLine();
	if ("y".equals(update))
	{
		//getting user input HouseID
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter HouseID: ");
		 houseID = sc.nextLine();
		 if (houseID.length()!=10 || Character.isUpperCase(houseID.charAt(0))==false || Character.isUpperCase(houseID.charAt(1))==false || Character.isUpperCase(houseID.charAt(2))==false || Character.isDigit(houseID.charAt(3))==false || Character.isDigit(houseID.charAt(4))==false || Character.isDigit(houseID.charAt(5))==false || Character.isDigit(houseID.charAt(6))==false || Character.isDigit(houseID.charAt(7))==false || Character.isDigit(houseID.charAt(8))==false || Character.isDigit(houseID.charAt(9))==false)  
		 { 
			 System.out.println( "The House information cannot be added"); 
				} 
		 
		 //getting user input House Description
		 Scanner sc1 = new Scanner(System.in);
		 System.out.println("Enter House Description: ");
		 descriptionHouse = sc1.nextLine();
		 int countWord= countWordsBookTitle (descriptionHouse); 
		 if (countWord <5 || countWord >10) 
		 { 
			 System.out.println( "The book information cannot be added"); 
			 } 
		 
		 //getting user input House Type
		 Scanner sc2 = new Scanner(System.in);
		 System.out.println("Enter the type of the house: ");
		 newType = sc2.nextLine();
		 
		 //getting user input House Address
		 Scanner sc3 = new Scanner(System.in);
		 System.out.println("Enter the Address of the house: ");
		 newAddress = sc3.nextLine();
		 if (newType == "TownHouse" || newAddress!= houseAddress)
		 { 
			  System.out.println( "The book information cannot be added"); 
		  } 
		 
		 //getting user input Number of Bedrooms
		 Scanner sc11 = new Scanner(System.in);
		 System.out.println("Enter Number of Bedrooms: ");
		 numBedrooms = sc11.nextInt();
		 
		 //getting user input Number of Bathrooms
		 Scanner sc111 = new Scanner(System.in);
		 System.out.println("Enter Number of Bathrooms: ");
		 numBathrooms = sc111.nextInt();
		 if (numBedrooms >4 && numBathrooms <=2) 
		  { 
			  System.out.println( "The book information cannot be added"); 
		  } 
		 
		 //getting user input Number of CarSpace
		 Scanner sc4 = new Scanner(System.in);
		 System.out.println("Enter the number of car space: ");
		 numCarspace = sc4.nextInt();
		 if (houseType != "Apartment" && (numCarspace <1 ))
		 { 
			 System.out.println( "The book information cannot be added");
			 } 
		 
		 //getting user input House Price
		 Scanner sc5 = new Scanner(System.in);
		 System.out.println("Enter the Price of the house: ");
		 housePrice = sc5.nextInt();
		 if ((housePrice <=100000  || housePrice >=1500000) || (numBedrooms == 3 && (housePrice >750000)) && (numBathrooms == 2 && (housePrice >750000)))
		 { 
			 System.out.println( "The book information cannot be added"); 
			 } 
		 
		 //Writing the user inputs to a text file
		 try {
			 FileWriter writer = new FileWriter("MyFile7.txt", false);
			 writer.write("HouseID: "+houseID + "\n" + "HouseDescription: "+descriptionHouse+ "\n" + "HouseType: "+houseType+ "\n" + "HouseAddress: "+houseAddress+"\n"+ "No.of.bedrooms: "+numBedrooms+ "\n" + "No.of.bathrooms: : "+numBathrooms+ "\n"  + "No.of.CarSpace: "+numCarspace+"\n"  + "House Price: "+housePrice);
			 writer.flush();
			 writer.close();
			 } catch (IOException e) {
				 e.printStackTrace();
				 }
		 }
	else {
		System.out.println( "ThankYou!"); 
		
	}
	return true;
}

}

class BikeUtil{

  public static void main(String a[]){
  
    Bike b = new Bike();
	
     b.id=1;
	 b.name="sham";
	 b.adress= "malleshwaram";
	 b.ownerName = "sri ramu";
	 b.contactNo =988559566l;
	 
System.out.println(b.id+"\n"+b.name+"\n" +b.adress +"\n"  +b.ownerName+"\n" +b.contactNo );

   
   b.ride();
   
   }
   



}
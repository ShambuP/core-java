class BookUtil{

  public static void main(String a[]){
  
    Book b = new Book();
	
     b.id=1;
	 b.name="yashodara charite";
	 b.adress= "yeshwanthpur";
	 b.ownerName = "poorna chandra tejaswi";
	 b.contactNo =98855956l;
	 
System.out.println(b.id+"\n"+b.name+"\n" +b.adress +"\n"  +b.ownerName+"\n" +b.contactNo );

   
   b.read();
   
   }
   



}
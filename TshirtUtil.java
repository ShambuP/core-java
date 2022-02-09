class TshirtUtil{

  public static void main(String a[]){
  
    Tshirt t = new Tshirt();
	
     t.id=1;
	 t.name="nike";
	 t.adress= "malleshwaram";
	 t.ownerName = "brand factory";
	 t.contactNo =98855956l;
	 
System.out.println(t.id+"\n"+t.name+"\n" +t.adress +"\n"  +t.ownerName+"\n" +t.contactNo );

   
   t.wear();
   
   }
   



}
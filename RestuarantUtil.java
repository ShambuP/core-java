class RestuarantUtil{

  public static void main(String a[]){
  
    Restuarant res = new Restuarant();
	
     res.id=1;
	 res.name="ashoka";
	 res.adress= "malleshwaram";
	 res.ownerName = "ramu";
	 res.contactNo =9885559566l;
	 
System.out.println(res.id+"\n"+res.name+"\n" +res.adress +"\n"  +res.ownerName+"\n" +res.contactNo );

   
   res.serveFood();
   
   }
   



}
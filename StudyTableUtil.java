class StudyTableUtil{

  public static void main(String a[]){
  
    StudyTable s = new StudyTable();
	
     s.id=2;
	 s.name="nataraj";
	 s.adress= "yeshwanthpur";
	 s.ownerName = "tejaswi";
	 s.contactNo =98855956l;
	 
System.out.println(s.id+"\n"+s.name+"\n" +s.adress +"\n"  +s.ownerName+"\n" +s.contactNo );

   
   s.study();
   
   }
   



}
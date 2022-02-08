class CellPhoneUtil{



    public static void main(String a[]){
  
     CellPhone cellPhone = new CellPhone();
	 cellPhone.name = "samsung";
	 cellPhone.price= 18000;
	 cellPhone.size= " 7'*4' ";
	 cellPhone.batteryBackUp= "4500 mah ";
	 cellPhone.ram="4gb";
	 System.out.println("the cell phone specifications are  \n " +cellPhone.name  +"\n"  +cellPhone.price +" \n "+cellPhone.size +" \n " +cellPhone.batteryBackUp+"  \n "+cellPhone.ram +"\n");
	 cellPhone.toSpeak();
	 
    CellPhone cellPhone1 = new CellPhone();
	 cellPhone1.name = "google fixel";
	 cellPhone1.price= 28000;
	 cellPhone1.size= " 6'*4' ";
	 cellPhone1.batteryBackUp= "4500 mah ";
	 cellPhone1.ram="8gb";
	 System.out.println("the cell phone specifications are  \n " +cellPhone1.name  +" \n "  +cellPhone1.price +" \n "+cellPhone1.size+ " \n "+cellPhone1.batteryBackUp+"  \n "+cellPhone1.ram +"\n");
	 cellPhone1.toSpeak();
	 


	 CellPhone cellPhone2 = new CellPhone();
	 cellPhone2.name = "iphone";
	 cellPhone2.price= 98000;
	 cellPhone2.size= " 6'*4' ";
	 cellPhone2.batteryBackUp= "4500 mah ";
	 cellPhone2.ram="8gb";
	 System.out.println("the cell phone specifications are  \n " +cellPhone2.name  +" \n "  +cellPhone2.price +" \n " +cellPhone2.size +" \n " +cellPhone2.batteryBackUp+"  \n "+cellPhone2.ram +"\n");
	 cellPhone2.toSpeak();
	 

    }

}
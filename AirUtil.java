class AirUtil{


  public static void main(String a[]){
  
  Airshow as = new Airshow();
  
  as.setAirshowYear(2021);
  System.out.println(as.getAirshowYear());
  
  as.setTheme("The runway to million opportunities");
  System.out.println("this years theme is " +as.getTheme() );
  
  as.setNoOfChoppers(127);
  System.out.println("the total number of Air Crafts participated are "+as.getNoOfChoppers());
  
  
  as.setGuestName("Defence minister Rajanath Singh");
  System.out.println("the guest of the event is "+as.getGuestName());
  
  
  as.setPlace("Bengaluru");
  System.out.println("the event took place in "+as.getPlace());
  
  
  
  }




}
class Speaker{


      static String name = "boat";
      static int maxValue = 6;
      static int minValume;
      static int currentValume;
      static boolean isConnected;

  

     public static void onOrOff(){
		 System.out.println("onoroff method started");
      if(isConnected == false){
     
	 System.out.println("speaker is turned on");
         isConnected = true;
   }
   else if(isConnected == true){
    System.out.println("the speaker is turned off"); 
       isConnected = false;
  }
     System.out.println("onoroff method ended");
}
          public static void increaseVolume(){
		System.out.println("the increaseVolume method started");	  
       if (isConnected == true){
    System.out.println("the speakeris turned on");
       if (currentValume< maxValue){
       currentValume = currentValume+1;
         System.out.println("the currentValume is"+ currentValume);


 }
 else {
	 System.out.println("the max valume is reached");
 }
 }
   else {
  System.out.println("the speakeris off");

  }
  System.out.println("the insrease volume method ended");
}
  public static void decreaseVolume(){
	   System.out.println("the decreaseVolume method startde ");
	  
	  if (isConnected == true ){
		  if (currentValume>minValume){
			  currentValume = currentValume-1;
			  System.out.println("the currentValume is "+currentValume);
			  
		  }
		  else {
			  System.out.println("the minimum valume is reached");
			  
		  }
	  }
	  else{
		  System.out.println("the speaker is  off");
	  }
	  System.out.println("the decrease volume method ended");
  }
}
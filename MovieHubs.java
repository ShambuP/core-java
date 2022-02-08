class MovieHubs{

   static  int totalTickets = 600;
   static String movies[] = {"abc","ggvv","ssr","kgf"};
   static int ticketPrice = 200;
   static String snacks[] = {"popcorn","samosa","rolls","chips"};
   static int totalSnacks = 800;
   static int quantity ;
   static int snackPrice = 50;
   static int eachSnackPrice = 10;
   static boolean selfService ;
   
   
   
      public static double showTime(int noOfTickets, String movieName, String bookedBy){
	  double totalPrice= 0.0;
	  System.out.println("invoked showTime()");
	  System.out.println("arg 1 : number of tickets "+noOfTickets);
	  System.out.println("arg 2 : movie name is "+movieName);
	  System.out.println("arg 3 : bookedBy " +bookedBy);
	  
	  for (int index = 0; index<=movies.length; index++){
	  
	  String movie = movies[index];
	  if (movieName.equals(movie)){
	  System.out.println("movie name is matched");
	   if (noOfTickets<=totalTickets){
	   System.out.println("nuber of tickets" +noOfTickets);
	   totalTickets = totalTickets-noOfTickets;
	   System.out.println("the total tickets remaining "+totalTickets);
	   totalPrice = noOfTickets*ticketPrice;
	     System.out.println("the total price is "+totalPrice);
	   }
	  else {
	  System.out.println("ist tickets illa");
	  }
	  
	  }
	  
	  else {
	  System.out.println("movie not found");
	  }
	  break ;
	  }
	  
	  return totalPrice;
	  }

       public static double snackPrice(int quantity, String snackName, boolean selfService){
		   double totalSnacksPrice = 0.0;
		   	  System.out.println("arg 1 : snack name is "+snackName);
		   	  System.out.println("arg 2 : number of quantity "+quantity);
	   	      System.out.println("arg 3 : are they provide service or self service ");
			  if (selfService==true){
				  System.out.println("they provid self Service only");
				  
			  }
			  else{
				  System.out.println("THEY CATER TO THE PLACES");
			  }
     
              for (int i=0; i<=snacks.length; i++){
				  
				  String Snack = snacks[i];
				  if (snackName.equals(Snack)){
			  System.out.println("Snack name is matched");
			  if (quantity<=totalSnacks){
				  
			   System.out.println("the quantity of snacks is " +quantity);
                   totalSnacks = totalSnacks-quantity;
                   				   System.out.println("the snacks remaining are "+totalSnacks);
								   
					 totalSnacksPrice = quantity*eachSnackPrice;
					     System.out.println("the Total price for the booked snacks is "+totalSnacksPrice);
			  }
			  else{
                 System.out.println("the Snack quantity is exceeds the stock" );

			  }
				  }
				  else {
					  System.out.println("sorry this snack is not there");

				  }
				  break ;
			  }

		   return totalSnacksPrice ;
	   }

}
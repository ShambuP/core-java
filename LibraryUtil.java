class LibraryUtil{

  public static void main(String a[]){
  
  Library lib = new Library();
  
  lib.setId(1);
  System.out.println(lib.getId());
  
  
  lib.setLibraryName("Insights IAS");
  System.out.println(lib.getLibraryName());
  
  
  
  lib.setAdress("Chandra layout");
  System.out.println(lib.getAdress());
  
  lib.setType("Private");
  System.out.println(lib.getType());
  
  lib.setNoOfSections(7);
  System.out.println(lib.getNoOfSections());
  
  
  
  }


}
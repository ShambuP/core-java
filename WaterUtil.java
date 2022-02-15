class WaterUtil{

  public static void main(String a[]){
  
  WaterPurifiers h2o = new WaterPurifiers();
   
   h2o.setId(6);
   System.out.println(h2o.getId());
  
  
  h2o.setDimensions("33.5*44*30");
   System.out.println(h2o.getDimensions());
  
  
  h2o.setBrand("Bajaj");
   System.out.println(h2o.getBrand());
  
  
  
  h2o.setColour("White");
   System.out.println(h2o.getColour());
  
  
  h2o.setMaterial("Metal");
   System.out.println(h2o.getMaterial());
  
  
  }
 

}
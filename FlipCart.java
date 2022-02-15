class FlipCart{

  private int customerId;
  private String name;
  private String mailId;
  private long contactNo;
  private String adress;
  
  
  
  public void setId(int customerId)
  {
   this.customerId = customerId;
  }
  public int getId()
  {
  return customerId;
  }

    public void setName(String name)
  {
   this.name= name;
  }
  public String getName()
  {
  return name;
  }
   public void setMob(long contactNo)
  {
   this.contactNo = contactNo;
  }
  public long getMob()
  {
  return contactNo;
  }
  
   public void setAdress(String adress)
  {
   this.adress = adress;
  }
  public String getAdress()
  {
  return adress;
  }
  
   public void setMail(String mailId)
  {
   this.mailId = mailId;
  }
  public String getMail()
  {
  return mailId;
  }
  
}
class Library{
   
   
    private int id;
	private String libraryName;
	private int noOfSections;
	private String adress;
	private String type;

	
	public void setId(int id)
	{
	  this.id=id;
	}
	public int getId()
	{
	 return id;
	}
	
	public void setLibraryName(String libraryName)
	{
	 this.libraryName = libraryName;
	}
	public String getLibraryName()
	{
	 return libraryName;
	}
	
	public void setNoOfSections(int noOfSections)
	{
	  this.noOfSections=noOfSections;
	  
	}
	public int getNoOfSections()
	{
	 return noOfSections;
	}
	
	
	public void setAdress(String adress)
	{
	 this.adress = adress;
	}
    public String getAdress()
    {
	  return adress;
	}	
	
	
	public void setType(String type)
	{
	  this.type=type;
	
	}
	public String getType()
	{
	 return type;
	}
	
	
}
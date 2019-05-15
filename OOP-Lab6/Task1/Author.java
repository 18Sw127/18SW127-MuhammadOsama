class Author{
	private String name;
	private String email;
	private char gender;
	
	public Author(String name,char gender,String email){
		this.name=name;
		this.email=email;
		this.gender=gender;
		
	}
	public String getName(){
		return name;
	}
	public String getEmail(){
		return email;
	}
	public char getGender(){
		return gender;
	}
	public void setEmail(String email){
		this.email=email;
	}
	public String toString(){
		return "Author[name: "+name+", Gender: "+gender+" and E-mail: "+email+"]";
	} 
}
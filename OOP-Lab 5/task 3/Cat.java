class Cat{
	private String nam;
	private int age;
	private String breed;
	public void setDetails(String nam,int age,String breed){
		this.nam=nam;
		this.age=age;
		this.breed=breed;
	}
	public void showDetails(){
		if(nam!=null && breed!=null && age!=0){       
			System.out.println("Name: "+nam); 
			System.out.println("Age: "+age);
			System.out.println("Breed: "+breed);
		}
		else{
			System.out.println("Details are unavailable.");
		}
	}
}
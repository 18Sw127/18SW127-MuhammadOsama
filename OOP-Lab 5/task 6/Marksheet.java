class Marksheet{
	private double ac;
	private double english;
    private double	pst;
	public Marksheet(double ac,double eng,double Pst){
		this.ac=ac;
		english=eng;
		pst=pst;
	}
	public int getTotalMarks(){
		return 300;
	}
	public double getObtainedMarks(){
		return (english+ac+pst);
	}
	public double getPercentage(){
		return ( ( (getObtainedMarks()/getTotalMarks())*100 ) );
	}
	public char getGrade(double percentage){
		char grade=0;
		if(percentage>=90){
			grade='A';
		}
		else if(percentage<90 && percentage>=80){
			grade='B';
		}
		else if(percentage<80 && percentage>=70){
			grade='C';
		}
		else if(percentage<70 && percentage>=60){
			grade='D';
		}
		return grade;
	} 
}
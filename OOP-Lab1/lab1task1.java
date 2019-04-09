class lab1task1{
public static void main(String args[]){
String name;
int marks;
float percent;
char grade;
boolean status;

name = "Osama";
marks = 786;
percent = marks*100 / 1100f;

if(percent >= 80){
grade = 'A';
}else
if(percent >= 70 && percent < 80){
grade = 'B';
}else
if(percent >= 60 && percent < 70){
grade = 'C';
}else{
grade = 'D';
}

if(percent<60){
	status = false;
}else{
	status = true;
}

System.out.println("Name		  	=  "+name);
System.out.println("Marks out of 550	=  "+marks);
System.out.println("Percentage		=  "+percent);
System.out.println("Grade			=  "+grade);
if(status == true){
System.out.println("Status		  	=  "+"pass");
}else{
System.out.println("Status			=  "+"fail");
}
}
}
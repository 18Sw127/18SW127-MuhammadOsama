class Main
{
	public static void main(String []abcd)
	{
		Student s=new Student("Sameer","tdm","SW",18,945000.00);
		s.setProgram("SW");
		s.setYear(18);
		s.setFee(945000.00);
		System.out.println("Program:"+s.getProgram());
		System.out.println("Year:"+s.getYear());
		System.out.println("Fee:"+s.getFee());
		System.out.println(s.toString());
		Staff st=new Staff("Dr Naeem","SW Dept","MUET",999999);
		st.setSchool("MUET");
		st.setPay(999999);
		System.out.println("School:"+st.getSchool());
		System.out.println("Pay:"+st.getPay());
		System.out.println(st.toString());
	}
}

class Sports
{
	String getName()
	{
		return "Generic Sports";
	}
	void getNumberOfTeamMembers()
	{
		System.out.println("Each team has n players in "+getName());
	}
}
class Cricket extends Sports
{
	String getName()
	{
		return "Cricket ";
	}
	void getNumberOfTeamMembers()
	{
		System.out.println("Each team has 11 players in "+getName());
	}
}
class Soccer extends Sports
{
	String getName()
	{
		return "Soccer ";
	}
	void getNumberOfTeamMembers()
	{
		System.out.println("Each team has 11 players in "+getName());
	}
}
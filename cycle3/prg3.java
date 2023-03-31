class Staff
{
	int code;
	String name = new String();
}
class Faculty extends Staff
{
	String department = new String();
	String subjectTaken = new String();
	String researchArea = new String(); 
}
class Typist extends Staff
{
	String office = new String();
	int speed;
}
class Officer extends Staff
{
	int rank;
	char grade;
}
class Permanent extends Typist
{
	int salary;
}
class Casual extends Typist
{
	int dailyWage;
}

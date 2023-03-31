class prg4
{
	public static void main(String arg[])
	{
		Time t1 = new Time(3,56);
		Time t2 = new Time(6,32);
		Time t3 = new Time();
		t3 = t1.sum(t2);
		System.out.println("Result time : "+t3.hour+":"+t3.minute);
	}
}
class Time
{
	int hour,minute;
	Time(int h,int m)
	{
		this.hour = h;
		this.minute = m;
	}
	Time()
	{
		this.hour = 0;
		this.minute = 0;
	}
	Time sum(Time t)
	{
		Time ts = new Time();
		ts.hour = this.hour + t.hour;
		ts.minute = this.minute + t.minute;
		if(ts.minute>=60)
		{
			ts.hour++;
			ts.minute = ts.minute - 60;
		}
		return ts;
	}
}

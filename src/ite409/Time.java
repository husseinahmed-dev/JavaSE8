package ite409;

public class Time
{
	private int hour;
	private int minute;
	private int second;
	
	public Time(int hour, int minute, int second)
	{
		setHour(hour); 		//this.hour = hour;
		setMinute(minute); 	//this.minute = minute;
		setSecond(second); 	//this.second = second;
	}
	
	public Time(int hour)
	{
		this(hour, 0 , 0);
	}

	public Time(int hour, int minute)
	{
		this(hour, minute , 0);
	}

	public Time(Time timeObject) {
		this(timeObject.getHour(), timeObject.getMinute(), timeObject.getSecond());
	}
	
	public void setHour(int hour) //the only place in which hour is changed
	{
		if(hour>=0 && hour<=23)	this.hour = hour;
	}
	
	public int getHour()
	{
		return hour;
	}

	public void setMinute(int minute) //the only place in which minute is changed
	{
		if(minute>=0 && minute<=59) this.minute = minute;
	}
	
	public int getMinute()
	{
		return minute;
	}
	
	public void setSecond(int second) //the only place in which second is changed
	{
		if(second>=0 && second<=59) this.second = second;
	}
	
	public int getSecond()
	{
		return second;
	}
	
	public String toString()
	{
		return String.format("%d:%d:%d", getHour(), getMinute(), getSecond());
	}
}
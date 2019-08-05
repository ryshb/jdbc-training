package com.visa.prj.entity;

public class Time {
 private int hrs;
 private int min;

 public Time() {
}

public Time(int hrs, int min) {
	this.hrs = hrs;
	this.min = min;
}

public int getHrs() {
	return hrs;
}

public void setHrs(int hrs) {
	this.hrs = hrs;
}

public int getMin() {
	return min;
}

public void setMin(int min) {
	this.min = min;
}
 
public static Time addTime(Time t1, Time t2)
{
	int a= (t1.getMin()+t2.getMin())/60;
	int b= (t1.getMin()+t2.getMin())%60;
	Time tmp=new Time(t1.getHrs()+t2.getHrs()+a, b);
	return tmp;
}
 
public Time addTime(Time t){
	int a= (this.min + t.getMin())/60;
	int b= (this.min + t.getMin())%60;
	Time tmp = new Time(this.hrs + t.getHrs()+a, b);
    return tmp;
}
	
}

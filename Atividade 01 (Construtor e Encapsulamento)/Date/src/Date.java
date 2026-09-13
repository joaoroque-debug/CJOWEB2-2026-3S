public class Date {

    private int day;
    private int month;
    private int year;

    // É colocado dessa forma, pois temos retições. caso não tivesse, poderia colocar daquela forma this.day = day

    public Date(int day, int month, int year){
        setDay(day);
        setMonth(month);
        setYear(year);
    }   

 

    public void setDay(int day){
	if (day >= 1 && day <= 30){
            this.day = day;
	}else{
	this.day = 01;
	}
       }

    public int getDay(){
        return day;
    }

    public void setMonth(int month){
	if (month >= 1 && month <= 12){
            this.month = month;
    }else{
	this.month = 01;
	}
}

    public int getMonth(){
        return month;
    }

    public void setYear(int year){
	if (year >= 1900){
            this.year = year;
    }else{
	this.year =  1900;
	}
}
    
    public int getYear(){
        return year;
    }


    @Override
    public String toString(){
        return String.format("%02d/%02d/%04d", day, month, year);
    }
}

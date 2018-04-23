package com.att.data.process;

public class WeatherRecord {
	private String year;
	private String month;
	private String day;
	private String hour;
	private int temperature;
	private int drewTemperature;
	private int seaLevelPressure;
	private int windDiretion;
	private int windSpeed;
	private int totalCloudCover;
	private int oneHourAccumLiquidPrecip;
	private int sixHourAccumLiquidPrecip;
	
	public WeatherRecord(String year, String month, String day, String hour, int temperature)  {
		this.year = year;
		this.month = month;
		this.day = day;
		this.hour = hour;
		this.temperature = temperature;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getHour() {
		return hour;
	}
	public void setHour(String hour) {
		this.hour = hour;
	}
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	public int getDrewTemperature() {
		return drewTemperature;
	}
	public void setDrewTemperature(int drewTemperature) {
		this.drewTemperature = drewTemperature;
	}
	public int getSeaLevelPressure() {
		return seaLevelPressure;
	}
	public void setSeaLevelPressure(int seaLevelPressure) {
		this.seaLevelPressure = seaLevelPressure;
	}
	public int getWindDiretion() {
		return windDiretion;
	}
	public void setWindDiretion(int windDiretion) {
		this.windDiretion = windDiretion;
	}
	public int getWindSpeed() {
		return windSpeed;
	}
	public void setWindSpeed(int windSpeed) {
		this.windSpeed = windSpeed;
	}
	public int getTotalCloudCover() {
		return totalCloudCover;
	}
	public void setTotalCloudCover(int totalCloudCover) {
		this.totalCloudCover = totalCloudCover;
	}
	public int getOneHourAccumLiquidPrecip() {
		return oneHourAccumLiquidPrecip;
	}
	public void setOneHourAccumLiquidPrecip(int oneHourAccumLiquidPrecip) {
		this.oneHourAccumLiquidPrecip = oneHourAccumLiquidPrecip;
	}
	public int getSixHourAccumLiquidPrecip() {
		return sixHourAccumLiquidPrecip;
	}
	public void setSixHourAccumLiquidPrecip(int sixHourAccumLiquidPrecip) {
		this.sixHourAccumLiquidPrecip = sixHourAccumLiquidPrecip;
	}
	
	@Override
	public String toString() {
		StringBuilder sbuf = new StringBuilder();
        sbuf.append('[').append(year).append(", ").append(month).append(", ")
        .append(hour).append(", ").append(temperature)
            .append(']');
        return sbuf.toString();
		
	}
	
	
	
	
	
	
	
	
	

}

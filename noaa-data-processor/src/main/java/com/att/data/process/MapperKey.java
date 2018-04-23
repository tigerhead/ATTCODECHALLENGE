package com.att.data.process;

public class MapperKey implements  Comparable<MapperKey>{
	private String year;
	private String month;
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
	
	public MapperKey(String year, String month) {
		this.year = year;
		this.month = month;
	}
	
	@Override
	public String toString() {
		StringBuilder sbuf = new StringBuilder();
        sbuf.append('[').append(year).append("/ ").append(month)       
            .append(']');
        return sbuf.toString();
		
	}
	
	 @Override
	    public boolean equals(Object other)
	    {
	        if ( other == null ) return false;
	        if ( this == other ) return true;
	        if ( other instanceof MapperKey ) {
	        	MapperKey key = (MapperKey)other;
	            if ( year.equals(key.year) && month.equals(key.month) )
	                return true;
	        }
	        return false;
	    }
	    @Override
	    public int hashCode()	    {
	        int hash = 1;
	        hash = hash * 17 + year.hashCode();
	        hash = hash * 31 + month.hashCode();
	        return hash;
	    }
	    
	    @Override
		public int compareTo(MapperKey key) {
			
			if(year.equals(key.year))
				return month.compareTo(key.month);
			return year.compareTo(key.year);
		}
	    
	   

}

package com.att.data.process;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class DataProcessor {
	
	public static void main(String[] args) {
		DataProcessor processor = new DataProcessor();
		ClassLoader classLoader = processor.getClass().getClassLoader();
		String fileName = classLoader.getResource("data/010010-99999-2017").getFile();
		processor.process(fileName);
		
	}
	
	public void process(String fileName) {
		
		Pattern pattern = Pattern.compile("\\s+");
		try (BufferedReader in = new BufferedReader(new FileReader(fileName));){
		   /* List<WeatherRecord> records = in.lines().map(line -> {
		                String[] arr = pattern.split(line);
		                return new WeatherRecord(arr[0],
		                                  arr[1],
		                                  arr[2],
		                                  arr[3],
		                                  Integer.parseInt(arr[4]));
		            })
		        .collect(Collectors.toList()); */
		    //Map dataset by year and month
		    Map<MapperKey,List<WeatherRecord>> mapped = in
		    	    .lines()		    	    
		    	    .map(line -> {
		    	            String[] arr = pattern.split(line);
		    	            return new WeatherRecord(arr[0],
		    	                              arr[1],
		    	                              arr[2],
		    	                              arr[3],
		    	                              Integer.parseInt(arr[4]));
		    	        })
		    	    .collect(Collectors.groupingBy(x-> new MapperKey(x.getYear(), x.getMonth()))); 
		    //Sort map
		    Map<MapperKey,List<WeatherRecord>> sorted = new TreeMap<MapperKey,List<WeatherRecord>>();
		    sorted.putAll(mapped);
		    //Find max and min temperature in each month
		    sorted.forEach((key, value) -> {
		    	WeatherRecord maxByTemperature  = value.stream().max(Comparator.comparing(WeatherRecord::getTemperature)).get();
		    	WeatherRecord minByTemperature  = value.stream().min(Comparator.comparing(WeatherRecord::getTemperature)).get();
		    	System.out.println("Highest teamperature in the month " + key + ": " +  maxByTemperature);
		    	System.out.println("Lowest teamperature in the month " + key + ": " +  minByTemperature);
		    	
		    });
		    
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		
	}
	
	

}

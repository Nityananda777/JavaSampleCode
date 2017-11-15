package com.core.dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDifference {

	 public static void main(String[] args)
	    {
		 	String dateStart = "11/03/14 09:29:58";
		    String dateStop = "11/03/14 09:33:43";
	 
	         
	        SimpleDateFormat formatter = new SimpleDateFormat("yy/MM/dd HH:mm:ss");
	        try
	        {
	            Date startDate = formatter.parse(dateStart);
	            Date endDate = formatter.parse(dateStop);
	            long diffInMilliSec = endDate.getTime() - startDate.getTime();
	            long seconds = (diffInMilliSec / 1000) % 60;
	            long minutes = (diffInMilliSec / (1000 * 60)) % 60;
	            long hours = (diffInMilliSec / (1000 * 60 * 60)) % 24;
	            long days = (diffInMilliSec / (1000 * 60 * 60 * 24)) % 365;
	            long years =  (diffInMilliSec / (1000l * 60 * 60 * 24 * 365));
	            System.out.println("Difference is ---> ");
	             
	            System.out.println(years+" years, "+days+" days, "+hours+" hours, "+minutes+" minutes, "+seconds+" seconds");
	        }
	        catch (ParseException e)
	        {
	            e.printStackTrace();
	        }
	    }

}

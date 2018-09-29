package flipkart.flipkart_test;

import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScenarioChecking extends writeLog
{
	public static TimeWatch watch;
	public String time="";
	public static Date dateobj1;
	
	@Before
	public void beforeScenario(Scenario scenario)
	{
		watch=TimeWatch.start();
		DateFormat df1=new SimpleDateFormat("HH:mm:ss");
		dateobj1=new Date();
		df1.format(dateobj1);
		String textfilename=scenario.getName();
		
		writeLog.createReportingFolder(textfilename+".txt");
	}
	
	@After
	public void afterScenario(Scenario scenario)throws FileNotFoundException
	{
		long tempTime;
		if(scenario.isFailed())
		{
			writeLogFile("Failue occured", "Terminal exception", "Fail");
			Exception.class.getClass().getSimpleName();
			
			time=watch.toMinuteSeconds().replace(",","");
			
			DateFormat df2=new SimpleDateFormat("HH:mm:ss");
			
			Date dateobj2=new Date();
			df2.format(dateobj2);
			
			tempTime=dateobj2.getTime()-dateobj1.getTime();
			
			tempTime=tempTime/1000;
		}
		else
		{
			time=watch.toMinuteSeconds().replace(",","");
			
			DateFormat df2=new SimpleDateFormat("HH:mm:ss");
			
			Date dateobj2=new Date();
			df2.format(dateobj2);
			
			tempTime=dateobj2.getTime()-dateobj1.getTime();
			
			tempTime=tempTime/1000;
		}
		int sec=(int)(tempTime%60);
		
		int min=(int)(tempTime/60)%60;
		
		time=min+" min "+sec+" sec ";
		
		try
		{
			Html_parsing.generate_Automation_Report(ABSOLUTE_PATH,time);
		}
		catch(Exception e)
		{
			System.out.println("The error in afterScenario method is "+e.getMessage());
		}		
	}	
}
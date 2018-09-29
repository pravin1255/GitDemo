package flipkart.flipkart_test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Html_parsing {
	
	public static String logData="";
	public static String scenariospecs="";
	
	public static void generateParentReport(String logFileName)throws Exception
	{
		writeScenariosToParent(logFileName);
	}

	private static void writeScenariosToParent(String logFileName) throws IOException {
		scenariospecs=scenariospecs.substring(1);
		logFileName=logFileName.replace(logFileName.split("\\\\")[logFileName.split("\\\\").length-1], "");
		
		File file=new File(logFileName+"\\Automation results.html");
		
		BufferedWriter bw=new BufferedWriter(new FileWriter(file));
		
		bw.write("<html>");
		bw.write("<head>");
		bw.write("\n");
		bw.write("<style-type='text/css'>");
		bw.write("\n");
		bw.write("body {");
		bw.write("\n");
		bw.write("background-color: #a2c3c3;");
		bw.write("\n");
		bw.write("font-family: Verdana, Geneva, sans-serif;");
		bw.write("\n");
		bw.write("text-align: center;");
		bw.write("\n");
		bw.write("}");
		bw.write("\n");
		
		bw.write("small {");
		bw.write("\n");
		bw.write("font-size: 0.7em;");
		bw.write("\n");
		bw.write("}");
		bw.write("\n");
		
		bw.write("table {");
		bw.write("\n");
		bw.write("border: 0px solid #4D7C7B; ");
		bw.write("\n");
		bw.write("border-collapse: collapse;");
		bw.write("\n");
		bw.write("border-spacing: 0px;");
		bw.write("\n");
		bw.write("width: 100%;");
		bw.write("\n");
		bw.write("margin-left: auto;");
		bw.write("\n");
		bw.write("margin-right: auto;");
		bw.write("\n");
		
		bw.write("tr.heading {");
		bw.write("\n");
		bw.write("background-color: #000000;");
		bw.write("\n");
		bw.write("color: white;");
		bw.write("\n");
		bw.write("font-size: 0.9em;");
		bw.write("\n");
		bw.write("font-weight: bold;");
		bw.write("\n");
		bw.write("display: table-row;");
		bw.write("\n");
		bw.write("}");
		
		
		bw.write("tr.subheading{");
		bw.write("\n");
		bw.write("background-color: #e0ebeb;");
		bw.write("\n");
		bw.write("color: 006B42;");
		bw.write("\n");
		bw.write("font-size: 0.9em;");
		bw.write("\n");
		bw.write("font-weight: bold;");
		bw.write("\n");
		bw.write("text-align: left;");
		bw.write("}");
		bw.write("\n");
		
		bw.write("tr.content {");
		bw.write("\n");
		bw.write("background-color: #FAFAC5;");
		bw.write("\n");
		bw.write("color: #000000;");
		bw.write("\n");
		bw.write("font-size: 0.9em");
		bw.write("\n");
		bw.write("display: table-row;");
		bw.write("\n");
		bw.write("}");
		bw.write("\n");
		
		bw.write("td {");
		bw.write("\n");
		bw.write("padding: 4px;");
		bw.write("\n");
		bw.write("text-align: center;");
		bw.write("\n");
		bw.write("word-wrap: break-word;");
		bw.write("\n");
		bw.write("max-width: 450px;");
		bw.write("\n");
		bw.write("}");
		
		bw.write("\n");
		bw.write("th {");
		bw.write("\n");
		bw.write("padding: 4px");
		bw.write("\n");
		bw.write("text-align: inherit\\0/;");
		bw.write("\n");
		bw.write("word-break: break-all;");
		bw.write("\n");
		bw.write("max-width: 450px;");
		bw.write("\n");
		bw.write("}");
		
		bw.write("\n");
		bw.write("td.justified {");
		bw.write("\n");
		bw.write("text-align: justified;");
		bw.write("\n");
		bw.write("}");
		bw.write("\n");
		
		bw.write("td.leftalign {");
		bw.write("\n");
		bw.write("text-align: left;");
		bw.write("\n");
		bw.write("}");
		bw.write("\n");
		
		bw.write("td.pass {");
		bw.write("\n");
		bw.write("font-weight: bold;");
		bw.write("\n");
		bw.write("color: green;");
		bw.write("\n");
		bw.write("text-align: center;");
		bw.write("\n");
		bw.write("}");
		bw.write("\n");
		
		bw.write("td.fail {");
		bw.write("\n");
		bw.write("font-weight: bold;");
		bw.write("\n");
		bw.write("color: red;");
		bw.write("\n");
		bw.write("text-align: center;");
		bw.write("\n");
		bw.write("}");
		bw.write("\n");
		
		bw.write("td.done, td.screenshot {");
		bw.write("\n");
		bw.write("font-weight: bold;");
		bw.write("\n");
		bw.write("color: black;");
		bw.write("\n");
		bw.write("}");
		bw.write("\n");
		
		bw.write("td.debug {");
		bw.write("\n");
		bw.write("font-weight: bold;");
		bw.write("\n");
		bw.write("color: blue;");
		bw.write("\n");
		bw.write("}");
		bw.write("\n");
		bw.write("</style>");
		bw.write("\n");
		bw.write("</head>");
		bw.write("\n");
		
		bw.write("<body>");
		bw.write("\n");
		bw.write("<h1 align=\"center\">Automation Execution results</h1>");
		bw.write("\n");
		bw.write("<table id=\"main\">");
		bw.write("\n");
		bw.write("<thead>");
		bw.write("\n");
		bw.write("<tr class=\"heading\">");
		bw.write("\n");
		bw.write("<td class='justified'>Scenario No</th>");
		bw.write("\n");
		bw.write("<td class='justified'>Scenario Name</th>");
		bw.write("\n");
		bw.write("<td class='justified'>Status</th>");
		bw.write("\n");
		bw.write("<td class='justified'>Time Duration</th>");
		bw.write("\n");
		bw.write("</tr>");
		bw.write("\n");
		bw.write("</thead>");
		bw.write("\n");
		
		bw.write("<tbody id='Setup' style='dispay:table-row-group'>");
		String[] scenario=scenariospecs.split("\\|");
		
		for(int i=0;i<scenario.length;i++)
		{
			String tempScennario=scenario[i].replace("target\\OUTPUT_HTML\\", "");
			
			tempScennario=tempScennario.substring(tempScennario.indexOf("\\")+1);
			
			bw.write("<tr class='content' id='scenariosteps'>");
			bw.write("\n");
			bw.write("<td>+(i+1)+</td>");
			bw.write("\n");
			String filePath=scenario[i].split(",")[0];
			filePath=filePath.split("\\\\")[filePath.split("\\\\").length-1].split("-")[0];
			
			bw.write("<td class='justified'><a href='"+"..\\"+tempScennario.split(",")[0]+"'><b>"+filePath+"</b></a></td>");
			bw.write("\n");
			if(scenario[i].split(",")[1].equalsIgnoreCase("pass"))
			{
				bw.write("<td class='pass'>"+scenario[i].split(",")[1]+"</td>");
			}
			else if(scenario[i].split(",")[1].equalsIgnoreCase("fail"))
			{
				bw.write("<td class='fail'>"+scenario[i].split(",")[1]+"</td>");
			}
			bw.write("\n");
			bw.write("<td class='justified'><b>"+scenario[i].split(",")[2]+"</b></td>");
			
			bw.write("\n");
			bw.write("</tr>");
			bw.write("\n");
			bw.write("</tbody>");
			bw.write("\n");
			bw.write("</table>");
			bw.write("\n");
			bw.write("</body>");
			bw.write("\n");
			bw.write("</html>");
			bw.write("\n");
			bw.close();
		}		
	}

	public static void generate_Automation_Report(String logpath, String timestamp) throws Exception {
		generateReport(logpath,timestamp);		
	}

	private static void generateReport(String logFileName, String exectionTime) throws Exception {
		
		logData=readLogFile(logFileName);
		writeScenaarioToHtml(logData.split("\n"),logFileName,exectionTime,getStatusCount());
	}

	private static void writeScenaarioToHtml(String[] steps, String logFileName, String exectionTime,
			String statusCount) throws IOException {
		
		String scenarioFileName=logFileName.replace(".txt", ".html");
		String scenarioSpec=scenarioFileName;
		File f=new File(scenarioFileName);
		BufferedWriter bw=new BufferedWriter(new FileWriter(f));
		bw.write("<html>");	
		bw.write("<head>");
		bw.write("\n");
		bw.write("<style-type='text/css'>");
		bw.write("\n");
		bw.write("body {");
		bw.write("\n");
		bw.write("background-color: #a2c3c3;");
		bw.write("\n");
		bw.write("font-family: Verdana, Geneva, sans-serif;");
		bw.write("\n");
		bw.write("text-align: center;");
		bw.write("\n");
		bw.write("}");
		bw.write("\n");
		
		bw.write("small {");
		bw.write("\n");
		bw.write("font-size: 0.7em;");
		bw.write("\n");
		bw.write("}");
		bw.write("\n");
		
		bw.write("table {");
		bw.write("\n");
		bw.write("border: 0px solid #4D7C7B; ");
		bw.write("\n");
		bw.write("border-collapse: collapse;");
		bw.write("\n");
		bw.write("border-spacing: 0px;");
		bw.write("\n");
		bw.write("width: 100%;");
		bw.write("\n");
		bw.write("margin-left: auto;");
		bw.write("\n");
		bw.write("margin-right: auto;");
		bw.write("\n");
		
		bw.write("tr.heading {");
		bw.write("\n");
		bw.write("background-color: #000000;");
		bw.write("\n");
		bw.write("color: white;");
		bw.write("\n");
		bw.write("font-size: 0.9em;");
		bw.write("\n");
		bw.write("font-weight: bold;");
		bw.write("\n");
		bw.write("display: table-row;");
		bw.write("\n");
		bw.write("}");		
		
		bw.write("tr.subheading{");
		bw.write("\n");
		bw.write("background-color: #e0ebeb;");
		bw.write("\n");
		bw.write("color: 006B42;");
		bw.write("\n");
		bw.write("font-size: 0.9em;");
		bw.write("\n");
		bw.write("font-weight: bold;");
		bw.write("\n");
		bw.write("text-align: left;");
		bw.write("}");
		bw.write("\n");
		
		bw.write("tr.content {");
		bw.write("\n");
		bw.write("background-color: #FAFAC5;");
		bw.write("\n");
		bw.write("color: #000000;");
		bw.write("\n");
		bw.write("font-size: 0.9em");
		bw.write("\n");
		bw.write("display: table-row;");
		bw.write("\n");
		bw.write("}");
		bw.write("\n");
		
		bw.write("td {");
		bw.write("\n");
		bw.write("padding: 4px;");
		bw.write("\n");
		bw.write("text-align: center;");
		bw.write("\n");
		bw.write("word-wrap: break-word;");
		bw.write("\n");
		bw.write("max-width: 450px;");
		bw.write("\n");
		bw.write("}");
		
		bw.write("\n");
		bw.write("th {");
		bw.write("\n");
		bw.write("padding: 4px");
		bw.write("\n");
		bw.write("text-align: inherit\\0/;");
		bw.write("\n");
		bw.write("word-break: break-all;");
		bw.write("\n");
		bw.write("max-width: 450px;");
		bw.write("\n");
		bw.write("}");
		
		bw.write("\n");
		bw.write("td.justified {");
		bw.write("\n");
		bw.write("text-align: justified;");
		bw.write("\n");
		bw.write("}");
		bw.write("\n");
		
		bw.write("td.leftalign {");
		bw.write("\n");
		bw.write("text-align: left;");
		bw.write("\n");
		bw.write("}");
		bw.write("\n");
		
		bw.write("td.pass {");
		bw.write("\n");
		bw.write("font-weight: bold;");
		bw.write("\n");
		bw.write("color: green;");
		bw.write("\n");
		bw.write("text-align: center;");
		bw.write("\n");
		bw.write("}");
		bw.write("\n");
		
		bw.write("td.fail {");
		bw.write("\n");
		bw.write("font-weight: bold;");
		bw.write("\n");
		bw.write("color: red;");
		bw.write("\n");
		bw.write("text-align: center;");
		bw.write("\n");
		bw.write("}");
		bw.write("\n");
		
		bw.write("td.done, td.screenshot {");
		bw.write("\n");
		bw.write("font-weight: bold;");
		bw.write("\n");
		bw.write("color: black;");
		bw.write("\n");
		bw.write("}");
		bw.write("\n");
		
		bw.write("td.debug {");
		bw.write("\n");
		bw.write("font-weight: bold;");
		bw.write("\n");
		bw.write("color: blue;");
		bw.write("\n");
		bw.write("}");
		bw.write("\n");
		bw.write("</style>");
		bw.write("\n");
		bw.write("</head>");
		bw.write("\n");
		
		bw.write("<body>");
		bw.write("\n");
		String[] fileName=logFileName.split("\\\\");
		bw.write("<h1 align=\"center\">"+fileName[fileName.length-1].replace(".txt", "")+"</h1>");
		bw.write("\n");
		bw.write("<table id=\"main\">");
		bw.write("\n");
		bw.write("<thead>");
		bw.write("\n");
		bw.write("<tr class=\"heading\">");
		bw.write("\n");
		bw.write("<td class='justified'>Sr No</th>");
		bw.write("\n");
		bw.write("<td class='justified'>Step Name</th>");
		bw.write("\n");
		bw.write("<td class='justified'>Step Description</th>");
		bw.write("\n");
		bw.write("<td class='justified'>Execution status</th>");
		bw.write("\n");
		bw.write("<td class='justified'Time Elapsed</th>");
		bw.write("\n");
		bw.write("</tr>");
		bw.write("\n");
		bw.write("</thead>");
		bw.write("\n");
		
		bw.write("<tbody id='Setup' style='dispay:table-row-group'>");
		bw.write("\n");
		String tempPath="";
		
		for(int i=1;i<steps.length;i++)
		{
			bw.write("<tr class='content' id='scenariosteps'>");
			bw.write("\n");
			bw.write("<td>"+i+"</td>");
			bw.write("\n");
			bw.write("<class='justified'><b>"+steps[i].split("\\|")[1]+"</b></td>");
			bw.write("\n");
			bw.write("<class='leftalign'>"+steps[i].split("\\|")[2]+"</td>");
			tempPath=steps[i].split("\\|")[4].replace("target\\OUTPUT_HTML\\", "");
			tempPath=tempPath.substring(tempPath.indexOf("\\")+1);
		
			if(steps[i].split("\\|")[3].equalsIgnoreCase("pass"))
			{
				bw.write("<td class='justified'><a href='"+"..\\"+tempPath+"'style='color:green'><b>"+
			steps[i].split("\\|")[3]+"</b></a></td>");			
			}
			else if(steps[i].split("\\|")[3].equalsIgnoreCase("fail"))
			{
				bw.write("<td class='justified'><a href='"+"..\\"+tempPath+"'style='color:red'><b>"+
						steps[i].split("\\|")[3]+"</b></a></td>");
			}
			else
			{
				bw.write("<td class='justified'><a href='"+"..\\"+tempPath+"'style='color:black'><b>"+
						steps[i].split("\\|")[3]+"</b></a></td>");
			}
			bw.write("<td>"+steps[i].split("\\|")[5]+"</td>");
			bw.write("</tr>");
		}
			
		bw.write("</tbody>");
		bw.write("</table>");
		
		bw.write("<table id=\"footer\">");
		bw.write("\n");
		bw.write("<tfoot>");
		bw.write("\n");
		bw.write("<tr class=\"heading\">");
		bw.write("\n");
		bw.write("<td colspan=\"4\"> Execution description: "+exectionTime+"</th>");
		bw.write("\n");
		bw.write("</tr>");
		
		bw.write("\n");
		bw.write("<tr class=\"subheading\">");
		bw.write("\n");
		bw.write("<td class='pass'> Pass test case "+statusCount.split(" ")[0]+"</td>");
		bw.write("\n");
		bw.write("<td class='fail'> Fail test case "+statusCount.split(" ")[1]+"</td>");
		bw.write("\n");
		
		if(statusCount.split(" ")[1].equals("0"))
		{
			scenarioSpec += ", " +"PASS, "+exectionTime;
		}
		else
		{
			scenarioSpec += ", " +"FAIL, "+exectionTime;
		}
		scenariospecs += "|" +scenarioSpec;
		
		bw.write("\n");
		bw.write("</tr>");
		bw.write("\n");
		bw.write("</tfoot>");
		bw.write("\n");
		bw.write("</table>");
		bw.write("\n");
		bw.write("</tbody>");
		bw.write("\n");
		bw.write("</html>");
		bw.close();
	}

	private static String getStatusCount() {
		
		int passCount=0;
		int failCount=0;
		
		String[] data=logData.split("\n");
		
		for(int i =1;i<data.length;i++)
		{
			if(data[i].split("\\|")[3].toLowerCase().equals("pass"))
			{
				passCount++;
			}			
			else if(data[i].split("\\|")[3].toLowerCase().equals("fail"))
			{
				failCount++;
			}		
		}
		return passCount+" "+failCount;
	}

	private static String readLogFile(String fileName) throws Exception {
		
		String logData1="",tmp;
		FileInputStream in=new FileInputStream(fileName);
		BufferedReader b =new BufferedReader(new InputStreamReader(in));
		
		while((tmp=b.readLine())!=null)
		{
			logData1+="\n"+tmp;			
		}
		in.close();
		return logData1;
	}
}
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import ru.kvaga.jmeter.projects.emias.EMIASResourceSchedule;
import ru.kvaga.jmeter.projects.emias.EMIASSchedule;
import ru.kvaga.jmeter.projects.emias.EMIASScheduleResponse;
import ru.kvaga.jmeter.projects.emias.EMIASTimePeriod;

public class Exec {

	public static void main(String args[]) {
		/*
		 * https://www.mkyong.com/java/jackson-2-convert-java-object-to-from-json/
		 */
		ObjectMapper mapper = new ObjectMapper();
		mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		System.out.println("----");
		try { 

			// Convert JSON string from file to Object
			EMIASScheduleResponse response = mapper.readValue(new File("src/example.json"),	EMIASScheduleResponse.class);
			
			// Enable pretty JSON output
			mapper.enable(SerializationFeature.INDENT_OUTPUT);
			
			// Convert Object to JSON String and print
			System.out.println(mapper.writeValueAsString(response));
			
			scenario(response);
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
	
	static void scenario(EMIASScheduleResponse response) throws ParseException {
		SimpleDateFormat sdfDay = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdfDayTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String strDate="2018-06-15";
		String strStartTime="10:10:00";
		String strEndTime="11:30:00:00";
		
		// If true then earliest else random
		boolean requireEarliest=true;
		
		Date date = sdfDay.parse(strDate);
		Date startTime = sdfDayTime.parse(strDate + " " + strStartTime);
		Date endTime = sdfDayTime.parse(strDate + " " + strEndTime);
		
		System.out.println("Date and time: ");
		System.out.println("Date: " + date);
		System.out.println("StartTime: " + startTime);
		System.out.println("EndTime" + endTime);
		
		ArrayList<EMIASTimePeriod> suiteableTimePeriods = new ArrayList<EMIASTimePeriod>();
		
		// Finding required date
		for(EMIASSchedule schedule : response.getResult().getSchedules()) {
			if(schedule.getDate().equals(date)) {
				System.out.println("Дата обнаружена: " + date);
				// Finding required time period
				for(EMIASTimePeriod timePeriod : schedule.getResourceSchedule().getTimePeriods()) {
					if(
							(
							timePeriod.getAllowedAppointment()
							&& (timePeriod.getStartTime().after(startTime)	|| timePeriod.getStartTime().equals(startTime))) 
							&& (timePeriod.getEndTime().before(endTime) 	|| timePeriod.getEndTime().equals(endTime))
							) {
						/*
						System.out.println("Найдено подходящее коно посещения: \n"
								+ "startTime: " + timePeriod.getStartTime() + "\n" 
								+ "endTime: " + timePeriod.getEndTime() + "\n" 
								);
						*/
						suiteableTimePeriods.add(timePeriod);
					}
				}
			}
		}
		System.out.println("Rол-во найденных доступных окон: " + suiteableTimePeriods.size());
		
		EMIASTimePeriod finalTimePeriod=null;
		if(suiteableTimePeriods.size()>0) {
			if(requireEarliest ) {
				Date earliestStartTime = endTime;
				for(EMIASTimePeriod tp : suiteableTimePeriods) {
					if(tp.getStartTime().before(earliestStartTime) ) {
						finalTimePeriod=tp;
						earliestStartTime=tp.getStartTime();
					}
				}
				System.out.println("Earliest time period: \n"
						+ "startTime: " + finalTimePeriod.getStartTime() +"\n"
						+ "endTime: " + finalTimePeriod.getEndTime() + "\n"
						);
			}else {
				Random rand = new Random();
				finalTimePeriod = suiteableTimePeriods.get(rand.nextInt(suiteableTimePeriods.size()));
				
				System.out.println("Random time period: \n"
						+ "startTime: " + finalTimePeriod.getStartTime() +"\n"
						+ "endTime: " + finalTimePeriod.getEndTime() + "\n"
						);
			}
		}else {
			System.err.println("Свободных окон не найдено");
		}
		
	}
}

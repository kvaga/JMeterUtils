import java.io.File;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

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
		System.out.println("sdfsdf");
		try {

			// Convert JSON string from file to Object
			EMIASScheduleResponse response = mapper.readValue(new File("src/example.json"),
					EMIASScheduleResponse.class);
			
			System.out.println("jsonrpcid: " + response.getJsonrpc());
			System.out.println("Result->AvailableResourceId: "+response.getResult().getAvailableResourceId());
			System.out.println("Result->AvailableResourceName: " + response.getResult().getAvailableResourceName());
			System.out.println("Result->DoctorFio: " + response.getResult().getDoctorFio());
			System.out.println("Result->DoctorSpeciality: " + response.getResult().getDoctorSpeciality());
			System.out.println("Result->DoctorSpecialityCode: " + response.getResult().getDoctorSpecialityCode());
			System.out.println("Result->LpuId: " + response.getResult().getLpuId());
			System.out.println("Schedules: " + response.getResult().getSchedules());
			for(EMIASSchedule schedule: response.getResult().getSchedules()) {
//				System.out.println("Schedules->Result->Schedules->Date: " + schedule.getDate());
				EMIASResourceSchedule resourceSchedule = new EMIASResourceSchedule();
				System.out.println("CabinetName: " + resourceSchedule.getCabinetName());
				System.out.println(": " + resourceSchedule.getComplexResourceId());
				System.out.println(": " + resourceSchedule.getWorkTime());
				System.out.println(": " + for(EMIASTimePeriod timePeriod : resourceSchedule.getTimePeriods()){
					
				}
				
			}
			
			System.out.println("Result->Schedules->StartTime: " + timePeriod.getStartTime());
			System.out.println("Result->Schedules->EndTime: " + timePeriod.getEndTime());
			System.out.println("Result->Schedules->AllowedAppointment: " + timePeriod.getAllowedAppointment());
			System.out.println("id: " + response.getId());
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
	

}

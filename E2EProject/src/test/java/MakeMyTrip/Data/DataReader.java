package MakeMyTrip.Data;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.io.FileUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataReader {
	
	public void getJsonDataToMap() throws IOException
	{
		//read json to String
		String jsonContent=FileUtils.readFileToString(new File(System.getProperty("user.dir")+"src\\test\\java\\MakeMyTrip\\Data\\TravelCitiesData.json"),StandardCharsets.UTF_8);
		
		//String to HashMap Json DataBind
		ObjectMapper mapper=new ObjectMapper();
		Map<String, Object> response = new ObjectMapper().readValue(mapper.toString(), new TypeReference<Map<String, Object>>() {});
	}

}

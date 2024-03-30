
import java.util.Random;

public class WeatherInformation{

    public void assignRandomWeather(Flight flight) {

        String[] weatherConditions = {"sunny", "cloudy", "rainy", "stormy", "snowy", "apocalypse"};
        Random random = new Random();
        
        int index = random.nextInt(weatherConditions.length);
        flight.setWeather(null, weatherConditions[index]);
    }

}





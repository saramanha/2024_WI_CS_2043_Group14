
import java.util.Random;

public class WeatherInformation{

    /**
     * This method assigns a random weather to a Flight's destination.
    **/
    public void assignRandomWeather(Flight flight) {

        String[] weatherConditions = {"sunny", "cloudy", "rainy", "stormy", "snowy", "apocalypse"};
        Random random = new Random();
        
        int index = random.nextInt(weatherConditions.length);
        flight.setWeather(weatherConditions[index]);
    }

}





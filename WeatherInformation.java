
import java.util.Random;

class WeatherInfo{

    public void assignRandomWeather(Flight flight) {

        String[] weatherConditions = {"sunny", "cloudy", "rainy", "stormy", "snowy", "apocalypse"};
        Random random = new Random();
        
        int index = random.nextInt(weatherConditions.length);
        flight.weather = weatherConditions[index];
    }

}





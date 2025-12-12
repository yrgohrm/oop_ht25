import java.util.*;

public class Ex2 {
    public static void main(String[] args) {
        var observations = new ArrayList<>(
                List.of(
                        new WeatherObservation("b", MeasuringType.TEMPERATURE, 10),
                        new WeatherObservation("a", MeasuringType.TEMPERATURE, 10),
                        new WeatherObservation("b", MeasuringType.WIND, 1),
                        new WeatherObservation("c", MeasuringType.SOLAR, 20),
                        new WeatherObservation("d", MeasuringType.TEMPERATURE, 20)));

        Collections.sort(observations);

        observations.forEach(System.out::println);
     
        System.out.println();

        Comparator<WeatherObservation> comp = Comparator.comparing(WeatherObservation::station)
        .thenComparing(WeatherObservation::type)
        .thenComparingDouble(WeatherObservation::value);
        
        Collections.sort(observations, comp);
        
        observations.forEach(System.out::println);
    }
}
import java.util.*;

public record WeatherObservation(String station, MeasuringType type, double value)
        implements Comparable<WeatherObservation> {

    @Override
    public int compareTo(WeatherObservation o) {
        int res = type.compareTo(o.type);
        if (res != 0) {
            return res;
        }

        res = Double.compare(value, o.value);
        if (res != 0) {
            return res;
        }
    
        return station.compareTo(o.station);
    }

    // @Override
    // public int compareTo(WeatherObservation o) {
    //     Comparator<WeatherObservation> comp = Comparator.comparing(WeatherObservation::type)
    //             .thenComparingDouble(WeatherObservation::value)
    //             .thenComparing(WeatherObservation::station);

    //     return comp.compare(this, o);
    // }

    
}

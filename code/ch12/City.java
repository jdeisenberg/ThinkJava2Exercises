public class City {
    private String name;
    private String region;
    private String country;
    private double latitude;
    private double longitude;
    
    City(String name, String region, String country, double latitude, double longitude) {
        this.name = name;
        this.region = region;
        this.country = country;
        this.latitude = clamp(latitude, -90.0, 90.0);
        this.longitude = clamp(longitude, -180.0, 180.0);
    }
    
    private static double clamp(double value, double min, double max) {
        double result = value;
        if (value < min) {
            result = min;
        }
        else if (value > max) {
            result = max;
        }
        return result;
    }
    
}

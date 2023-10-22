package by.it_academy.jd2.Mk_JD2_103_23.database_app.dao.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(schema = "bookings", name = "airports")
public class AirportEntity {
    @Id
    @Column(name = "airport_code")
    private String airportCode;
    @Column(name = "airport_name")
    private String airportName;
    private String city;
    private String coordinates;
    private String timezone;

    public AirportEntity() {
    }

    public AirportEntity(String airportCode, String airportName, String city, String coordinates, String timezone) {
        this.airportCode = airportCode;
        this.airportName = airportName;
        this.city = city;
        this.coordinates = coordinates;
        this.timezone = timezone;
    }

    public String getAirportCode() {
        return airportCode;
    }

    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AirportEntity airport = (AirportEntity) o;
        return Objects.equals(airportCode, airport.airportCode) && Objects.equals(airportName, airport.airportName) && Objects.equals(city, airport.city) && Objects.equals(coordinates, airport.coordinates) && Objects.equals(timezone, airport.timezone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(airportCode, airportName, city, coordinates, timezone);
    }

    @Override
    public String toString() {
        return "Airports{" +
                "airportCode='" + airportCode + '\'' +
                ", airportName='" + airportName + '\'' +
                ", city='" + city + '\'' +
                ", coordinates='" + coordinates + '\'' +
                ", timezone='" + timezone + '\'' +
                '}';
    }
}

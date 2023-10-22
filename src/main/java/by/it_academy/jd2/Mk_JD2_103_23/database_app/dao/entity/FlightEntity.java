package by.it_academy.jd2.Mk_JD2_103_23.database_app.dao.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(schema = "bookings", name = "flights_v")
public class FlightEntity {
    @Id
    @Column(name = "flight_id")
   private String flightId;
    @Column(name = "flight_no")
    private String flightNo;
    @Column(name = "scheduled_departure")
    private String scheduledDeparture;
    @Column(name = "scheduled_departure_local")
   private String scheduledDepartureLocal;
    @Column(name = "scheduled_arrival")
   private String scheduledArrival;
    @Column(name = "scheduled_arrival_local")
   private String scheduledArrivalLocal;
    @Column(name = "scheduled_duration")
   private String scheduledDuration;
    @Column(name = "departure_airport")
   private String departureAirport;
    @Column(name = "departure_airport_name")
   private String departureAirportName;
    @Column(name = "departure_city")
   private String departureCity;
    @Column(name = "arrival_airport")
   private String arrivalAirport;
    @Column(name = "arrival_airport_name")
   private String arrivalAirportName;
    @Column(name = "arrival_city")
   private String arrivalCity;
   private String status;
    @Column(name = "aircraft_code")
   private String aircraftCode;
    @Column(name = "actual_departure")
   private String actualDeparture;
    @Column(name = "actual_departure_local")
   private String actualDepartureLocal;
    @Column(name = "actual_arrival")
   private String actualArrival;
    @Column(name = "actual_arrival_local")
   private String actualArrivalLocal;
    @Column(name = "actual_duration")
   private String actualDuration;

    public FlightEntity() {
    }

    public FlightEntity(String flightId, String flightNo, String scheduledDeparture, String scheduledDepartureLocal, String scheduledArrival, String scheduledArrivalLocal, String scheduledDuration, String departureAirport, String departureAirportName, String departureCity, String arrivalAirport, String arrivalAirportName, String arrivalCity, String status, String aircraftCode, String actualDeparture, String actualDepartureLocal, String actualArrival, String actualArrivalLocal, String actualDuration) {
        this.flightId = flightId;
        this.flightNo = flightNo;
        this.scheduledDeparture = scheduledDeparture;
        this.scheduledDepartureLocal = scheduledDepartureLocal;
        this.scheduledArrival = scheduledArrival;
        this.scheduledArrivalLocal = scheduledArrivalLocal;
        this.scheduledDuration = scheduledDuration;
        this.departureAirport = departureAirport;
        this.departureAirportName = departureAirportName;
        this.departureCity = departureCity;
        this.arrivalAirport = arrivalAirport;
        this.arrivalAirportName = arrivalAirportName;
        this.arrivalCity = arrivalCity;
        this.status = status;
        this.aircraftCode = aircraftCode;
        this.actualDeparture = actualDeparture;
        this.actualDepartureLocal = actualDepartureLocal;
        this.actualArrival = actualArrival;
        this.actualArrivalLocal = actualArrivalLocal;
        this.actualDuration = actualDuration;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public String getScheduledDeparture() {
        return scheduledDeparture;
    }

    public void setScheduledDeparture(String scheduledDeparture) {
        this.scheduledDeparture = scheduledDeparture;
    }

    public String getScheduledDepartureLocal() {
        return scheduledDepartureLocal;
    }

    public void setScheduledDepartureLocal(String scheduledDepartureLocal) {
        this.scheduledDepartureLocal = scheduledDepartureLocal;
    }

    public String getScheduledArrival() {
        return scheduledArrival;
    }

    public void setScheduledArrival(String scheduledArrival) {
        this.scheduledArrival = scheduledArrival;
    }

    public String getScheduledArrivalLocal() {
        return scheduledArrivalLocal;
    }

    public void setScheduledArrivalLocal(String scheduledArrivalLocal) {
        this.scheduledArrivalLocal = scheduledArrivalLocal;
    }

    public String getScheduledDuration() {
        return scheduledDuration;
    }

    public void setScheduledDuration(String scheduledDuration) {
        this.scheduledDuration = scheduledDuration;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getDepartureAirportName() {
        return departureAirportName;
    }

    public void setDepartureAirportName(String departureAirportName) {
        this.departureAirportName = departureAirportName;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public String getArrivalAirportName() {
        return arrivalAirportName;
    }

    public void setArrivalAirportName(String arrivalAirportName) {
        this.arrivalAirportName = arrivalAirportName;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAircraftCode() {
        return aircraftCode;
    }

    public void setAircraftCode(String aircraftCode) {
        this.aircraftCode = aircraftCode;
    }

    public String getActualDeparture() {
        return actualDeparture;
    }

    public void setActualDeparture(String actualDeparture) {
        this.actualDeparture = actualDeparture;
    }

    public String getActualDepartureLocal() {
        return actualDepartureLocal;
    }

    public void setActualDepartureLocal(String actualDepartureLocal) {
        this.actualDepartureLocal = actualDepartureLocal;
    }

    public String getActualArrival() {
        return actualArrival;
    }

    public void setActualArrival(String actualArrival) {
        this.actualArrival = actualArrival;
    }

    public String getActualArrivalLocal() {
        return actualArrivalLocal;
    }

    public void setActualArrivalLocal(String actualArrivalLocal) {
        this.actualArrivalLocal = actualArrivalLocal;
    }

    public String getActualDuration() {
        return actualDuration;
    }

    public void setActualDuration(String actualDuration) {
        this.actualDuration = actualDuration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlightEntity flight = (FlightEntity) o;
        return Objects.equals(flightId, flight.flightId) && Objects.equals(flightNo, flight.flightNo) && Objects.equals(scheduledDeparture, flight.scheduledDeparture) && Objects.equals(scheduledDepartureLocal, flight.scheduledDepartureLocal) && Objects.equals(scheduledArrival, flight.scheduledArrival) && Objects.equals(scheduledArrivalLocal, flight.scheduledArrivalLocal) && Objects.equals(scheduledDuration, flight.scheduledDuration) && Objects.equals(departureAirport, flight.departureAirport) && Objects.equals(departureAirportName, flight.departureAirportName) && Objects.equals(departureCity, flight.departureCity) && Objects.equals(arrivalAirport, flight.arrivalAirport) && Objects.equals(arrivalAirportName, flight.arrivalAirportName) && Objects.equals(arrivalCity, flight.arrivalCity) && Objects.equals(status, flight.status) && Objects.equals(aircraftCode, flight.aircraftCode) && Objects.equals(actualDeparture, flight.actualDeparture) && Objects.equals(actualDepartureLocal, flight.actualDepartureLocal) && Objects.equals(actualArrival, flight.actualArrival) && Objects.equals(actualArrivalLocal, flight.actualArrivalLocal) && Objects.equals(actualDuration, flight.actualDuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightId, flightNo, scheduledDeparture, scheduledDepartureLocal, scheduledArrival, scheduledArrivalLocal, scheduledDuration, departureAirport, departureAirportName, departureCity, arrivalAirport, arrivalAirportName, arrivalCity, status, aircraftCode, actualDeparture, actualDepartureLocal, actualArrival, actualArrivalLocal, actualDuration);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightId='" + flightId + '\'' +
                ", flightNo='" + flightNo + '\'' +
                ", scheduledDeparture='" + scheduledDeparture + '\'' +
                ", scheduledDepartureLocal='" + scheduledDepartureLocal + '\'' +
                ", scheduledArrival='" + scheduledArrival + '\'' +
                ", scheduledArrivalLocal='" + scheduledArrivalLocal + '\'' +
                ", scheduledDuration='" + scheduledDuration + '\'' +
                ", departureAirport='" + departureAirport + '\'' +
                ", departureAirportName='" + departureAirportName + '\'' +
                ", departureCity='" + departureCity + '\'' +
                ", arrivalAirport='" + arrivalAirport + '\'' +
                ", arrivalAirportName='" + arrivalAirportName + '\'' +
                ", arrivalCity='" + arrivalCity + '\'' +
                ", status='" + status + '\'' +
                ", aircraftCode='" + aircraftCode + '\'' +
                ", actualDeparture='" + actualDeparture + '\'' +
                ", actualDepartureLocal='" + actualDepartureLocal + '\'' +
                ", actualArrival='" + actualArrival + '\'' +
                ", actualArrivalLocal='" + actualArrivalLocal + '\'' +
                ", actualDuration='" + actualDuration + '\'' +
                '}';
    }
}

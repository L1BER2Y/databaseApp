package by.it_academy.jd2.Mk_JD2_103_23.database_app.core.dto;

import java.time.LocalDate;
import java.util.Objects;

public class Filter {
    private LocalDate scheduledDeparture;
    private LocalDate scheduledArrival;
    private String departureAirport;
    private String arrivalAirport;
    private String status;

    public Filter() {
    }

    public Filter(LocalDate scheduledDeparture, LocalDate scheduledArrival, String departureAirport, String arrivalAirport, String status) {
        this.scheduledDeparture = scheduledDeparture;
        this.scheduledArrival = scheduledArrival;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.status = status;
    }

    public LocalDate getScheduledDeparture() {
        return scheduledDeparture;
    }

    public void setScheduledDeparture(LocalDate scheduledDeparture) {
        this.scheduledDeparture = scheduledDeparture;
    }

    public LocalDate getScheduledArrival() {
        return scheduledArrival;
    }

    public void setScheduledArrival(LocalDate scheduledArrival) {
        this.scheduledArrival = scheduledArrival;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Filter filter = (Filter) o;
        return Objects.equals(scheduledDeparture, filter.scheduledDeparture) && Objects.equals(scheduledArrival, filter.scheduledArrival) && Objects.equals(departureAirport, filter.departureAirport) && Objects.equals(arrivalAirport, filter.arrivalAirport) && Objects.equals(status, filter.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scheduledDeparture, scheduledArrival, departureAirport, arrivalAirport, status);
    }

    @Override
    public String toString() {
        return "Filter{" +
                "scheduledDeparture=" + scheduledDeparture +
                ", scheduledArrival=" + scheduledArrival +
                ", departureAirport='" + departureAirport + '\'' +
                ", arrivalAirport='" + arrivalAirport + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}

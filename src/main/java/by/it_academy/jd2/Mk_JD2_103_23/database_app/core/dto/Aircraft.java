package by.it_academy.jd2.Mk_JD2_103_23.database_app.core.dto;

import java.util.Objects;

public class Aircraft {
    private String aircraftCode;
    private String model;
    private Integer range;

    public Aircraft() {
    }

    public Aircraft(String aircraftCode, String model, Integer range) {
        this.aircraftCode = aircraftCode;
        this.model = model;
        this.range = range;
    }

    public String getAircraftCode() {
        return aircraftCode;
    }

    public void setAircraftCode(String aircraftCode) {
        this.aircraftCode = aircraftCode;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getRange() {
        return range;
    }

    public void setRange(Integer range) {
        this.range = range;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aircraft aircraft = (Aircraft) o;
        return Objects.equals(aircraftCode, aircraft.aircraftCode) && Objects.equals(model, aircraft.model) && Objects.equals(range, aircraft.range);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aircraftCode, model, range);
    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "aircraftCode='" + aircraftCode + '\'' +
                ", model='" + model + '\'' +
                ", range=" + range +
                '}';
    }
}

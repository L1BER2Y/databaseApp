package by.it_academy.jd2.Mk_JD2_103_23.database_app.dao.entity;

import java.util.Objects;

public class AircraftEntity {
    private String aircraftCode;
    private String model;
    private Integer range;

    public AircraftEntity() {
    }

    public AircraftEntity(String aircraftCode, String model, Integer range) {
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
        AircraftEntity aircraftEntity = (AircraftEntity) o;
        return Objects.equals(aircraftCode, aircraftEntity.aircraftCode) && Objects.equals(model, aircraftEntity.model) && Objects.equals(range, aircraftEntity.range);
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

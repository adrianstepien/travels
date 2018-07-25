package com.traveler.dao.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * A class describing the user's travel
 */
@Entity
@Table(name = "TRAVEL")
public class Travel {

    @Id
    private Long id;
    private String name;
    @Column(name = "PLACE_TO")
    private String placeTo;
    @Column(name = "PLACE_FROM")
    private String placeFrom;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "DATE_OF_START")
    private Date dateOfStart;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "DATE_OF_END")
    private Date dateOfEnd;
    private String description;
    ///private Person person;

    public Travel() {
    }

    public Travel(Long id, String name, String placeTo, String placeFrom, Date dateOfStart, Date dateOfEnd, String description) {
        this.id = id;
        this.name = name;
        this.placeTo = placeTo;
        this.placeFrom = placeFrom;
        this.dateOfStart = dateOfStart;
        this.dateOfEnd = dateOfEnd;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlaceTo() {
        return placeTo;
    }

    public void setPlaceTo(String placeTo) {
        this.placeTo = placeTo;
    }

    public String getPlaceFrom() {
        return placeFrom;
    }

    public void setPlaceFrom(String placeFrom) {
        this.placeFrom = placeFrom;
    }

    public Date getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(Date dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public Date getDateOfEnd() {
        return dateOfEnd;
    }

    public void setDateOfEnd(Date dateOfEnd) {
        this.dateOfEnd = dateOfEnd;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Travel travel = (Travel) o;

        if (id != null ? !id.equals(travel.id) : travel.id != null) return false;
        if (name != null ? !name.equals(travel.name) : travel.name != null) return false;
        if (placeTo != null ? !placeTo.equals(travel.placeTo) : travel.placeTo != null) return false;
        if (placeFrom != null ? !placeFrom.equals(travel.placeFrom) : travel.placeFrom != null) return false;
        if (dateOfStart != null ? !dateOfStart.equals(travel.dateOfStart) : travel.dateOfStart != null) return false;
        if (dateOfEnd != null ? !dateOfEnd.equals(travel.dateOfEnd) : travel.dateOfEnd != null) return false;
        return description != null ? description.equals(travel.description) : travel.description == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (placeTo != null ? placeTo.hashCode() : 0);
        result = 31 * result + (placeFrom != null ? placeFrom.hashCode() : 0);
        result = 31 * result + (dateOfStart != null ? dateOfStart.hashCode() : 0);
        result = 31 * result + (dateOfEnd != null ? dateOfEnd.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Travel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", placeTo='" + placeTo + '\'' +
                ", placeFrom='" + placeFrom + '\'' +
                ", dateOfStart=" + dateOfStart +
                ", dateOfEnd=" + dateOfEnd +
                ", description='" + description + '\'' +
                '}';
    }
}

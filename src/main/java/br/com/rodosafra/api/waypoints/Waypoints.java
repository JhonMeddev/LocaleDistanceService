package br.com.rodosafra.api.waypoints;

import java.util.List;

public class Waypoints {

    private String hint;
    private Double distance;
    private String name;
    private List<Double> location;

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Double> getLocation() {
        return location;
    }

    public void setLocation(List<Double> location) {
        this.location = location;
    }
}

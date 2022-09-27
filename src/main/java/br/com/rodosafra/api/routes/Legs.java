package br.com.rodosafra.api.routes;

import java.util.List;

public class Legs {

    private List<Double> steps;
    private String summary;
    private Double weight;
    private Double duration;
    private Double distance;

    public List getSteps() {
        return steps;
    }

    public void setSteps(List steps) {
        this.steps = steps;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }
}

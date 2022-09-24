package br.com.rodosafra.api.waypoints;

public class Location {

    private Double pontoZero;
    private Double PontoUm;

    public Double getPontoUm() {
        return PontoUm;
    }

    public void setPontoUm(Double pontoUm) {
        PontoUm = pontoUm;
    }

    public Double getPontoZero() {
        return pontoZero;
    }

    public void setPontoZero(Double pontoZero) {
        this.pontoZero = pontoZero;
    }
}

package br.com.rodosafra.api;

import br.com.rodosafra.api.routes.Routes;
import br.com.rodosafra.api.waypoints.Waypoints;

import java.util.List;

public class LocaleDistance {

    private String code;
    private List<Routes> routes;
    private List<Waypoints> waypoints;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Routes> getRoutes() {
        return routes;
    }

    public void setRoutes(List<Routes> routes) {
        this.routes = routes;
    }

    public List<Waypoints> getWaypoints() {
        return waypoints;
    }

    public void setWaypoints(List<Waypoints> waypoints) {
        this.waypoints = waypoints;
    }
}

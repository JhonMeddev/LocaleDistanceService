package br.com.rodosafra.client;

import br.com.rodosafra.api.LocaleDistance;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/client/")
@Produces(MediaType.TEXT_PLAIN)
public class LocaleDistanceController {

    private Client client;


  public LocaleDistanceController (Client client){
        this.client = client;
    }


    @GET
    @Path("{coordenadas}")
    public String getEmployeeById(@PathParam("coordenadas") String coordenadas)
    {
        //Do not hard code in your application
        WebTarget webTarget = client.target("https://router.project-osrm.org/route/v1/driving/"+coordenadas);
        Invocation.Builder invocationBuilder =  webTarget.request(MediaType.APPLICATION_JSON);
        Response response = invocationBuilder.get();
        LocaleDistance localeDistance = response.readEntity(LocaleDistance.class);
        return localeDistance.toString();
    }


}

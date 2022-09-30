package br.com.rodosafra.client;

import br.com.rodosafra.api.Coordenadas;
import br.com.rodosafra.api.LocaleDistance;

import javax.ws.rs.*;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

//@Path("/client/")
@Produces(MediaType.APPLICATION_JSON)
public class LocaleDistanceController {

    private Client client;


  public LocaleDistanceController (Client client){
        this.client = client;
    }


    @GET
    @Path("/{co}")
    public LocaleDistance getRotas(@PathParam("co") String co)
    {
        //Do not hard code in your application
        WebTarget webTarget = client.target("https://router.project-osrm.org/route/v1/driving/"+co);
        Invocation.Builder invocationBuilder =  webTarget.request(MediaType.APPLICATION_JSON);
        Response response = invocationBuilder.get();
        LocaleDistance localeDistance = response.readEntity(LocaleDistance.class);
        return localeDistance;
    }

    @POST
    //@Consumes(MediaType.MULTIPART_FORM_DATA)
    @Path("/coordenadas/")
    public LocaleDistance post(Coordenadas coordenadas) {
      LocaleDistance localeDistance = getRotas(coordenadas.getN1()+";"+coordenadas.getN2());
        return localeDistance;
    }
}

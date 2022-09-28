package br.com.rodosafra.client;

import br.com.rodosafra.api.LocaleDistance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Validator;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RestController
public class LocaleDistanceService {
    @Autowired
    private ILocaleDistance iLocaleDistance;


    @GetMapping("/{coordenadas}")
    public ResponseEntity<LocaleDistance> getRotas(@PathVariable String coordenadas){
        LocaleDistance localeDistance = iLocaleDistance.buscarRotas(coordenadas);

        return localeDistance != null ? ResponseEntity.ok().body(localeDistance) : ResponseEntity.notFound().build();
    }

}

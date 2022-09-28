package br.com.rodosafra.client;

import br.com.rodosafra.api.LocaleDistance;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "https://router.project-osrm.org/route/v1/driving/", name = "routerProject")
public interface ILocaleDistance {

    @GetMapping("{coordenadas}")
    LocaleDistance buscarRotas(@PathVariable("coordenadas") String coordenadas);
}

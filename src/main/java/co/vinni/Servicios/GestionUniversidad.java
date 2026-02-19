package co.vinni.Servicios;

import co.vinni.DTO.Docentes;
import co.vinni.DTO.Universidad;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class GestionUniversidad {
    private Universidad laUniversidad;
    public void crear(Universidad u){
        if(this.laUniversidad==null)
            this.laUniversidad = new Universidad();
        this.laUniversidad = u;}
    public void adicionarDocente(Docentes d){this.laUniversidad.getDocente().add(d);}

}

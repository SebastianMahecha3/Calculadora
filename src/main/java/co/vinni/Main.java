package co.vinni;

import co.vinni.DTO.Docentes;
import co.vinni.DTO.Universidad;
import co.vinni.Servicios.GestionUniversidad;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(" Proyecto base tipo Maven-Java");

        Universidad uni = new Universidad();
        uni.setNombre("Universidad Libre");
        uni.setDireccion("El bosque");

        Docentes docente = new Docentes();
        docente.setNombre("Vinni");

        GestionUniversidad gestion = new GestionUniversidad();

        gestion.crear(uni);
        gestion.adicionarDocente(docente);

        System.out.println(gestion.getLaUniversidad().getNombre());
        System.out.println(gestion.getLaUniversidad().getDireccion());
        System.out.println(gestion.getLaUniversidad().getDocente());


    }
}

package co.vinni.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter


public class Universidad {
    private String nombre;
    private String direccion;
    private List<Docentes> docente;

    public Universidad(){
        this.docente= new ArrayList<>();

    }
}

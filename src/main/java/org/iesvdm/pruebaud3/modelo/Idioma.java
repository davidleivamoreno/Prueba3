package org.iesvdm.pruebaud3.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Idioma {
    private int id_idioma;
    private String nombre;
    private Date ultima_actualizacion;
}

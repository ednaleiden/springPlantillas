package com.projectPlantillas.manejoFormularios.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@ToString
@AllArgsConstructor
@Data
@NoArgsConstructor

public class Userio {

    private String nombre;
    private String email;

    private String password;

    private String genero;

    private String nota;

    private boolean matrimonio;

    private Date fechaNacimiento;

    private String profesion;

    private Long ingreso;

}

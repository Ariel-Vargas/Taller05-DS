/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.taller05ds;

import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author CltControl
 */
public class Incidente {
    protected int id;
    protected LocalDateTime fecha_reportado;
    protected String estado;
    protected String titulo;
    protected String descripcion;
    protected List<String> logActualizaciones;
    protected LocalDateTime fecha_cerrado;
    protected String tipo;
    private Usuario responsable;
    protected PersonalAcademico beneficiario;
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.taller05ds;

import java.util.ArrayList;

/**
 *
 * @author CltControl
 */
public class Curso {
    private String id;
    private String nombre;
    private boolean estadoDisponible;
    private ArrayList<Estudiante> estudiantesEnEsperaDeInscripcion;
    private ArrayList<Estudiante> estudiantesInscritos;
    private Profesor responsable;
    private ArrayList<Foro> foros;
    private ArrayList<ActividadSumativa> actividadesSumativas;
}

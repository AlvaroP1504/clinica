/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinicaiberoamericana;

import java.util.Date;
import java.util.List;

/**
 *
 * @author COD_B
 */
public class Doctor extends Persona {
    
    private String especialidad;
    private Date fechaContratacion;
    private String horarioLaboral;
    
    public Doctor(int id, String nombre, String apellido, Date fechaNacimiento, String telefono, String correo, String direccion, String genero, List<String> alergias, String estado, String especialidad, Date fechaContratacion, String horarioLaboral) {
        super(id, nombre, apellido, fechaNacimiento, telefono, correo, direccion, genero, alergias, estado);
        this.especialidad = especialidad;
        this.fechaContratacion = fechaContratacion;
        this.horarioLaboral = horarioLaboral;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Date getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(Date fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public String getHorarioLaboral() {
        return horarioLaboral;
    }

    public void setHorarioLaboral(String horarioLaboral) {
        this.horarioLaboral = horarioLaboral;
        // hola mundo
    }
    
}

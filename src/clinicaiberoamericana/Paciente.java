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
public class Paciente extends Persona {
    
    private String seguroMedico;
    
    public Paciente(int id, String nombre, String apellido, Date fechaNacimiento, String telefono, String correo, String direccion, String genero, List<String> alergias, String estado, String seguroMedico) {
        super(id, nombre, apellido, fechaNacimiento, telefono, correo, direccion, genero, alergias, estado);
        this.seguroMedico = seguroMedico;
    }

    public String getSeguroMedico() {
        return seguroMedico;
    }

    public void setSeguroMedico(String seguroMedico) {
        this.seguroMedico = seguroMedico;
    }
    
}

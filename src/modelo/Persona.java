/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Jever_Gómez
 */
public class Persona {
    private String nombres,apellidos,direccion,telefono,fecha_naciemiento;

    public Persona(){}
    public Persona(String nombres, String apellidos, String direccion, String telefono, String fecha_naciemiento) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fecha_naciemiento = fecha_naciemiento;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getFecha_naciemiento() {
        return fecha_naciemiento;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setFecha_naciemiento(String fecha_naciemiento) {
        this.fecha_naciemiento = fecha_naciemiento;
    }

    // CRUD
    protected void crear(){}
    protected DefaultTableModel leer (){return null;}
    protected void actualizar (){}
    protected void borrar (){}
    
}

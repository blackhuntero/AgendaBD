/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendabd;

/**
 *
 * @author Mega_
 */
public class DatosDTO {
    String nombre, edad, sexo;
    int id;

    public String getNombre() {
        return nombre;
    }

    public String getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public int getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
    
}

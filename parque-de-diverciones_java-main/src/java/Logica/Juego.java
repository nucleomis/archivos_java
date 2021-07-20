
package Logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Juego implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE) 
    int id_juego;
    @Basic
    String nombre;
    int capacidad;
    String horario;
    
    @OneToMany
    List <Empleado> emp;

    public Juego() {
    }

    public Juego(int id_juego, String nombre, int capacidad, String horario, List<Empleado> emp) {
        this.id_juego = id_juego;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.horario = horario;
        this.emp = emp;
    }

    public int getId_juego() {
        return id_juego;
    }

    public void setId_juego(int id_juego) {
        this.id_juego = id_juego;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public List<Empleado> getEmp() {
        return emp;
    }

    public void setEmp(List<Empleado> emp) {
        this.emp = emp;
    }
    
    
}

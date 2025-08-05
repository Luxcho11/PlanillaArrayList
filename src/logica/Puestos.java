/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author Huawei
 */
public class Puestos {
    private int idPuestos;
    private String NombrePuesto;
    private int salario;

    public Puestos(int idPuestos, String NombrePuesto, int salario) {
        this.idPuestos = idPuestos;
        this.NombrePuesto = NombrePuesto;
        this.salario = salario;
    }
    
   public Puestos() {
        this.idPuestos = 0;
        this.NombrePuesto = "";
        this.salario = 0;
    } 

    public int getIdPuestos() {
        return idPuestos;
    }

    public void setIdPuestos(int idPuestos) {
        this.idPuestos = idPuestos;
    }

    public String getNombrePuesto() {
        return NombrePuesto;
    }

    public void setNombrePuesto(String NombrePuesto) {
        this.NombrePuesto = NombrePuesto;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
   
   
    
}

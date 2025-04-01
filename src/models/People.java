
package models;


public class People {
   //atributos
    private int id;
    private int dni;
    private String nombres;
    private String apellidos;
    
    //metodos

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    
    
    public String walk(){
        return "Estoy caminando";
    }
    public String Speak(){
        return "Hola como estas";
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemahospitalario;

/**
 *
 * @author DELL
 */
 
public class Paciente {
   private String nombre;
   private String apellido;
   private String sexo;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public String getDirecciónResidencia() {
        return direcciónResidencia;
    }

    public String getLugarAtención() {
        return lugarAtención;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public String getMedicoAtendio() {
        return medicoAtendio;
    }

    public String getFecha() {
        return fecha;
    }

    public int getCodigo() {
        return codigo;
    }
   
   private String direcciónResidencia;
   private String lugarAtención;
   private String motivoConsulta;
   private String medicoAtendio;
   private String fecha;
   private int codigo;
   
    public  void paciente1() {
       nombre="Jose";
       apellido="Rodriguez";
       sexo="Masculino";
       direcciónResidencia="Calle 4 N-25";
       lugarAtención="Clinica";
       motivoConsulta="El pasiente demuestra dolor abdominal";
       medicoAtendio="Carlos Ortiz";
       fecha="14/05/2021";
       codigo=12548;
    
       System.out.println("Paciente " + nombre + " " + apellido ); 
       System.out.println("Sexo " + sexo + "\ndirección residencia " + direcciónResidencia + "\nLugar donde fue atendido " + lugarAtención);
       System.out.println("motivo de consulta: " + motivoConsulta + "\nmédico que atendió " + medicoAtendio);
       System.out.println("fecha " + fecha );
       System.out.println("");
    }
    public  void paciente2() {
       nombre="Duvan";
       apellido="Hernandez";
       sexo="Masculino";
       direcciónResidencia="Carrera 13 N-25";
       lugarAtención="Clinica";
       motivoConsulta="El pasiente demuestra dolor lumbal";
       medicoAtendio="Carlos Ortiz";
       fecha="03/08/2021";
       codigo=25849;
    
       System.out.println("Paciente " + nombre + " " + apellido ); 
       System.out.println("Sexo " + sexo + "\ndirección residencia " + direcciónResidencia + "\nLugar donde fue atendido " + lugarAtención);
       System.out.println("motivo de consulta: " + motivoConsulta + "\nmédico que atendió " + medicoAtendio);
       System.out.println("fecha " + fecha );
       System.out.println("");
    }
    public  void paciente3() {
       nombre="Hector";
       apellido="Castañeda";
       sexo="Masculino";
       direcciónResidencia="Calle 2 N-58";
       lugarAtención="Hospital";
       motivoConsulta="El paciente presenta diarrea con sangrado  ";
       medicoAtendio="Andres Zapata";
       fecha="25/10/2021";
       codigo=2513;
       
       System.out.println("Paciente " + nombre + " " + apellido ); 
       System.out.println("Sexo " + sexo + "\ndirección residencia " + direcciónResidencia + "\nLugar donde fue atendido " + lugarAtención);
       System.out.println("motivo de consulta: " + motivoConsulta + "\nmédico que atendió " + medicoAtendio);
       System.out.println("fecha " + fecha );
        System.out.println("");
    }
    public  void paciente4() {
       nombre="Nicolas";
       apellido="Vasquez";
       sexo="Masculino";
       direcciónResidencia="Carrera 15 N-80";
       lugarAtención="Hospital";
       motivoConsulta="El paciente presenta tención alta  ";
       medicoAtendio="Andres Zapata";
       fecha="20/11/2020";
       codigo=254725;
       
       System.out.println("Paciente " + nombre + " " + apellido ); 
       System.out.println("Sexo " + sexo + "\ndirección residencia " + direcciónResidencia + "\nLugar donde fue atendido " + lugarAtención);
       System.out.println("motivo de consulta: " + motivoConsulta + "\nmédico que atendió " + medicoAtendio);
       System.out.println("fecha " + fecha );
        System.out.println("");
    }
    public  void paciente5() {
       nombre="ana";
       apellido="silva";
       sexo="femenino";
       direcciónResidencia="Carrera 3 N-24";
       lugarAtención="centro salud";
       motivoConsulta="El paciente presenta dolor de cabeza y sarpullido en el cuerpo ";
       medicoAtendio="Maria Castillo";
       fecha="01/06/2021";
       codigo=516984;
       
       System.out.println("Paciente " + nombre + " " + apellido ); 
       System.out.println("Sexo " + sexo + "\ndirección residencia " + direcciónResidencia + "\nLugar donde fue atendido " + lugarAtención);
       System.out.println("motivo de consulta: " + motivoConsulta + "\nmédico que atendió " + medicoAtendio);
       System.out.println("fecha " + fecha );
       System.out.println("");
    }
    public  void paciente6() {
       nombre="martha";
       apellido="buitrago";
       sexo="femenino";
       direcciónResidencia="Carrera 5 N4 - 51";
       lugarAtención="Centro de salud";
       motivoConsulta="El paciente presenta un corte leve en su brazo izquierdo ";
       medicoAtendio="Luisa Quintana";
       fecha="08/12/2020";
       codigo=98745;
       
       System.out.println("Paciente " + nombre + " " + apellido ); 
       System.out.println("Sexo " + sexo + "\ndirección residencia " + direcciónResidencia + "\nLugar donde fue atendido " + lugarAtención);
       System.out.println("motivo de consulta: " + motivoConsulta + "\nmédico que atendió " + medicoAtendio);
       System.out.println("fecha " + fecha );
       System.out.println("");
    }
    public  void paciente7() {
       nombre="Rosa";
       apellido="Zamora";
       sexo="femenino";
       direcciónResidencia="Carrera 4 N2 - 1";
       lugarAtención="clinica";
       motivoConsulta="El paciente presenta un corte leve en su brazo izquierdo ";
       medicoAtendio="Luisa Quintana";
       fecha="20/06/2020";
       codigo=2548;
       
       System.out.println("Paciente " + nombre + " " + apellido ); 
       System.out.println("Sexo " + sexo + "\ndirección residencia " + direcciónResidencia + "\nLugar donde fue atendido " + lugarAtención);
       System.out.println("motivo de consulta: " + motivoConsulta + "\nmédico que atendió " + medicoAtendio);
       System.out.println("fecha " + fecha );
       System.out.println("");
    }
}

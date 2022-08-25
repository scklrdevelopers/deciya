
package softempresa;

public class Empresa {
     //Atributos
    private String nombreEmpresa;
    private String dirección;
    private int telefono;
    private int nitEmpresa;
    
    //Metodo Constructor
    public Empresa(String nombreEmpresa, String dirección, int telefono, int nitEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.dirección = dirección;
        this.telefono = telefono;
        this.nitEmpresa = nitEmpresa;
    }

    //Setter y Getter
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getNitEmpresa() {
        return nitEmpresa;
    }

    public void setNitEmpresa(int nitEmpresa) {
        this.nitEmpresa = nitEmpresa;
    }
        
    
    }
    
      

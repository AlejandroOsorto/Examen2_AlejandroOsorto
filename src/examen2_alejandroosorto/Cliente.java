package examen2_alejandroosorto;

/**
 *
 * @author Ale
 */
public class Cliente
{
    private String nombre;
    private String apellido;
    private int ID;

    public Cliente()
    {
    }

    public Cliente(String nombre, String apellido, int ID)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ID = ID;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getApellido()
    {
        return apellido;
    }

    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }

    public int getID()
    {
        return ID;
    }

    public void setID(int ID)
    {
        this.ID = ID;
    }
    
    @Override
    public String toString()
    {
        return "(" + ID + ")" + nombre + " " + apellido;
    }
}

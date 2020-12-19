package examen2_alejandroosorto;

import java.io.Serializable;

/**
 *
 * @author Ale
 */
public class Orden implements Serializable
{
    private int ID;
    private String nombre;
    
    private int pollo;
    private int bisc;
    private int pure;
    private int papa;
    private int fresco;
    private int pie;
    
    private static final long SerialVersionUID = 999L;

    public Orden()
    {
    }

    public Orden(int ID, String nombre, int pollo, int bisc, int pure, int papa, int fresco, int pie)
    {
        this.ID = ID;
        this.nombre = nombre;
        this.pollo = pollo;
        this.bisc = bisc;
        this.pure = pure;
        this.papa = papa;
        this.fresco = fresco;
        this.pie = pie;
    }

    public int getID()
    {
        return ID;
    }

    public void setID(int ID)
    {
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

    public int getPollo()
    {
        return pollo;
    }

    public void setPollo(int pollo)
    {
        this.pollo = pollo;
    }

    public int getBisc()
    {
        return bisc;
    }

    public void setBisc(int bisc)
    {
        this.bisc = bisc;
    }

    public int getPure()
    {
        return pure;
    }

    public void setPure(int pure)
    {
        this.pure = pure;
    }

    public int getPapa()
    {
        return papa;
    }

    public void setPapa(int papa)
    {
        this.papa = papa;
    }

    public int getFresco()
    {
        return fresco;
    }

    public void setFresco(int fresco)
    {
        this.fresco = fresco;
    }

    public int getPie()
    {
        return pie;
    }

    public void setPie(int pie)
    {
        this.pie = pie;
    }
    
    @Override
    public String toString()
    {
        return nombre + ID;
    }
}

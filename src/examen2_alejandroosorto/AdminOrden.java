package examen2_alejandroosorto;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Ale
 */
public class AdminOrden
{
    private ArrayList<Orden> listaOrdenes = new ArrayList();
    private File archivo = null;
    
    public AdminOrden(String path) 
    {
        archivo = new File(path);
    }

    public ArrayList<Orden> getListaOrdenes()
    {
        return listaOrdenes;
    }

    public void setListaClientes(ArrayList<Orden> listaOrdenes)
    {
        this.listaOrdenes = listaOrdenes;
    }

    public File getArchivo()
    {
        return archivo;
    }

    public void setArchivo(File archivo)
    {
        this.archivo = archivo;
    }
    
    public void setClente(Orden o)
    {
        listaOrdenes.add(o);
    }
    
    public void CargarArchivo()
    {
        try
        {
            listaOrdenes = new ArrayList();
            Orden temp;
            if (archivo.exists())
            {
                FileInputStream leer = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(leer);
                
                try
                {
                    while ((temp = (Orden) objeto.readObject()) != null)
                    {
                        listaOrdenes.add(temp);
                    }
                } 
                catch (EOFException e) {}
                
                objeto.close();
                leer.close();
            }
            
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public void ModificarArchivo()
    {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try
        {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Orden t : listaOrdenes)
            {
                bw.writeObject(t);
            }
            bw.flush();
        } 
        catch (Exception ex) {} 
        finally
        {
            try
            {
                bw.close();
                fw.close();
            } 
            catch (Exception e) {}
        }
    }
}

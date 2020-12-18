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
public class AdminCliente
{
    private ArrayList<Cliente> listaClientes = new ArrayList();
    private File archivo = null;
    
    public AdminCliente(String path) 
    {
        archivo = new File(path);
    }

    public ArrayList<Cliente> getListaClientes()
    {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes)
    {
        this.listaClientes = listaClientes;
    }

    public File getArchivo()
    {
        return archivo;
    }

    public void setArchivo(File archivo)
    {
        this.archivo = archivo;
    }
    
    public void setUsuario(Cliente u)
    {
        listaClientes.add(u);
    }
    
    public void CargarArchivo()
    {
        try
        {
            listaClientes = new ArrayList();
            Cliente temp;
            if (archivo.exists())
            {
                FileInputStream leer = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(leer);
                
                try
                {
                    while ((temp = (Cliente) objeto.readObject()) != null)
                    {
                        listaClientes.add(temp);
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
            for (Cliente t : listaClientes)
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

package examen2_alejandroosorto;

import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 *
 * @author Ale
 */
public class HiloPure extends Thread
{
    private JProgressBar barra;
    private JLabel elemento;
    private boolean avance;
    private boolean activo;
    
    public HiloPure(JProgressBar barra, JLabel elemento)
    {
        this.barra = barra;
        this.elemento = elemento;
        avance = true;
        activo = true;
    }
    
    public boolean isAvance()
    {
        return avance;
    }

    public void setAvance(boolean avance)
    {
        this.avance = avance;
    }

    public boolean isActivo()
    {
        return activo;
    }

    public void setActivo(boolean activo)
    {
        this.activo = activo;
    }

    public JProgressBar getBarra()
    {
        return barra;
    }

    public void setBarra(JProgressBar barra)
    {
        this.barra = barra;
    }

    public JLabel getElemento()
    {
        return elemento;
    }

    public void setElemento(JLabel elemento)
    {
        this.elemento = elemento;
    }
    
    
    
    @Override
    public void run()
    {
        elemento.setText("Puré");
        while (activo)
        {
            if (avance)
            {
                barra.setValue(barra.getValue() + 10);
                if (barra.getValue() == 100)
                {
                    activo = false;
                    
                }
            }
            
            try
            {
                Thread.sleep(200);
            }
            catch (InterruptedException e) {}
        }
        barra.setValue(0);
        elemento.setText("");
    }
}

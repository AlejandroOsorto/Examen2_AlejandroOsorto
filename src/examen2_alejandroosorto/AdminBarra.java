package examen2_alejandroosorto;

import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTable;

/**
 *
 * @author Ale
 */
public class AdminBarra extends Thread
{
    private JProgressBar barra;
    private JTable tabla;
    private Elementos elementos;
    private JLabel elemento;
    
    private boolean activoPollo;
    private boolean avancePollo;
    
    private boolean activoBisc;
    private boolean avanceBisc;
    
    private boolean activoPur;
    private boolean avancePur;
    
    private boolean activoPapa;
    private boolean avancePapa;
    
    private boolean activoFresco;
    private boolean avanceFresco;
    
    private boolean activoPie;
    private boolean avancePie;
    
    private int num = 0;
    private int numOrden = 0;

    public AdminBarra(JProgressBar barra, JTable tabla, Elementos elementos, JLabel elemento)
    {
        this.barra = barra;
        this.tabla = tabla;
        this.elementos = elementos;
        this.elemento = elemento;
        
        activoPollo = true;
        avancePollo = true;
        
        activoBisc = true;
        avanceBisc = true;
        
        activoPur = true;
        avancePur = true;
        
        activoPapa = true;
        avancePapa = true;
        
        activoFresco = true;
        avanceFresco = true;
        
        activoPie = true;
        avancePie = true;
    }

    public JProgressBar getBarra()
    {
        return barra;
    }

    public void setBarra(JProgressBar barra)
    {
        this.barra = barra;
    }

    public JTable getTabla()
    {
        return tabla;
    }

    public void setTabla(JTable tabla)
    {
        this.tabla = tabla;
    }

    public Elementos getElementos()
    {
        return elementos;
    }

    public void setElementos(Elementos elementos)
    {
        this.elementos = elementos;
    }
    
    //Pollo 4 segundos
    //biscuits 1 segundo
    //Pure 2 segundos
    //Papas 3 segundos
    //Frescos 1 segundo
    //Pies 5 segundos
    
    @Override
    public void run()
    {
        //Pollo------------------------------------------------------------------------------------------------------------
        if (elementos.getPollo() > 0)
        {
            elemento.setText("Pollo");
            while (activoPollo)
            {
                if (avancePollo)
                {
                    barra.setValue(barra.getValue() + 10);
                    if (barra.getValue() == 100)
                    {
                        barra.setValue(0);
                        num++;
                        
                    }
                }
                if (num == elementos.getPollo())
                {
                    activoPollo = false;
                }

                try
                {
                    Thread.sleep(400);
                }
                catch (InterruptedException e) {}
            }
            elemento.setText("");
            num = 0;
        }
        
        //Biscuit------------------------------------------------------------------------------------------------------------
        if (elementos.getBisc() > 0)
        {
            elemento.setText("Biscuit");
            while (activoBisc)
            {
                if (avanceBisc)
                {
                    barra.setValue(barra.getValue() + 10);
                    if (barra.getValue() == 100)
                    {
                        barra.setValue(0);
                        num++;
                    }
                }
                if (num == elementos.getBisc())
                {
                    activoBisc = false;
                }

                try
                {
                    Thread.sleep(100);
                }
                catch (InterruptedException e) {}
            }
            elemento.setText("");
            num = 0;
        }
        
        //Puré------------------------------------------------------------------------------------------------------------
        if (elementos.getPur() > 0)
        {
            elemento.setText("Puré");
            while (activoPur)
            {
                if (avancePur)
                {
                    barra.setValue(barra.getValue() + 10);
                    if (barra.getValue() == 100)
                    {
                        barra.setValue(0);
                        num++;
                    }
                }
                if (num == elementos.getPur())
                {
                    activoPur = false;
                }

                try
                {
                    Thread.sleep(200);
                }
                catch (InterruptedException e) {}
            }
            elemento.setText("");
            num = 0;
        }
        
        //Papas------------------------------------------------------------------------------------------------------------
        if (elementos.getPap() > 0)
        {
            elemento.setText("Papas");
            while (activoPapa)
            {
                if (avancePapa)
                {
                    barra.setValue(barra.getValue() + 10);
                    if (barra.getValue() == 100)
                    {
                        barra.setValue(0);
                        num++;
                    }
                }
                if (num == elementos.getPap())
                {
                    activoPapa = false;
                }

                try
                {
                    Thread.sleep(300);
                }
                catch (InterruptedException e) {}
            }
            elemento.setText("");
            num = 0;
        }
        
        //Fresco------------------------------------------------------------------------------------------------------------
        if (elementos.getFresc()> 0)
        {
            elemento.setText("Refresco");
            while (activoFresco)
            {
                if (avanceFresco)
                {
                    barra.setValue(barra.getValue() + 10);
                    if (barra.getValue() == 100)
                    {
                        barra.setValue(0);
                        num++;
                    }
                }
                if (num == elementos.getFresc())
                {
                    activoFresco = false;
                }

                try
                {
                    Thread.sleep(100);
                }
                catch (InterruptedException e) {}
            }
            elemento.setText("");
            num = 0;
        }
        
        //Pie------------------------------------------------------------------------------------------------------------
        if (elementos.getPie()> 0)
        {
            elemento.setText("Pie");
            while (activoPie)
            {
                if (avancePie)
                {
                    barra.setValue(barra.getValue() + 10);
                    if (barra.getValue() == 100)
                    {
                        barra.setValue(0);
                        num++;
                    }
                }
                if (num == elementos.getPie())
                {
                    activoPie = false;
                }

                try
                {
                    Thread.sleep(500);
                }
                catch (InterruptedException e) {}
            }
            elemento.setText("");
            num = 0;
        }
    }
}

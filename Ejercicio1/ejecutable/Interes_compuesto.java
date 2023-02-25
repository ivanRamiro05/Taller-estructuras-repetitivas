import javax.swing.JOptionPane;

public class Interes_compuesto
{
     public static void main(String[] args)
      {
    //DECLATRACION DE VARIABLES
    double socio1, socio2 , Meta, capital1, capital2,meses;
    meses=0;
    capital1=0;
    capital2=0;
    //input
    socio1= Integer.parseInt(JOptionPane.showInputDialog("Capital con el cual CARLITOS apoyara el negocio:"));
    socio2= Integer.parseInt(JOptionPane.showInputDialog("Capital con el cual RANGEL apoyara el negocio:"));
    Meta= Integer.parseInt(JOptionPane.showInputDialog("Dinero  que se desea lograr obtener:"));
    
        //processing
        while(Meta>capital1+capital2)

        {
            meses=meses+1;
            capital1=socio1*Math.pow(1+0.03, meses);
            capital2=socio2*Math.pow(1+0.04, meses);
        }
        JOptionPane.showMessageDialog(null,"MESES DE ESPERA : " +meses);
    }
}
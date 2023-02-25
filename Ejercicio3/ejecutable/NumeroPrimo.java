import javax.swing.JOptionPane;

public class NumeroPrimo
{
public static void main(String[] args) 
{
    {
        int primo;
        int con;
        int i;

        primo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Numero el cual quieres saber si es primo :"));
        con=0;
        for(i=1;primo>=i;i++)
        {
            if((primo%i)==0)
            {

                con=con+1;

            }

        }
        if(con<=2){
            JOptionPane.showMessageDialog(null,"El Numero "+primo+" es primo");
        }else{
            JOptionPane.showMessageDialog(null,"El Numero "+primo+" no es primo");

        }
    }
    
}
 
}

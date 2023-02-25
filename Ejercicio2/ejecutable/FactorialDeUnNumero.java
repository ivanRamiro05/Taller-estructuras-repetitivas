import javax.swing.JOptionPane;



public class FactorialDeUnNumero

{
    

    public static void main(String[] args)
    {
        //Declaracion de variables
        int N;
        int factorial;
        
        //entrada

        N = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Numero para calcular el factorial:"));
        factorial=1;
        //proceso
        for(int i=1;N>=i;i++)
        {
            factorial=factorial*i;
        }
        //salida
        JOptionPane.showMessageDialog(null,"El factorial de "+ N +" es = " +factorial);


    }
}
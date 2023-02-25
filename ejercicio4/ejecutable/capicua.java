import javax.swing.JOptionPane;

public class capicua
{
    public static void main(String[] args)  
    {
        int N, a, inverso = 0, cifra;
        N = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero : "));
        
        while (N < 10);
       
        //le damos la vuelta al número
        a = N;
        while (a!=0){
            cifra = a % 10;
            inverso = inverso * 10 + cifra;
            a = a / 10;
        }
    
        if(N == inverso){
            JOptionPane.showMessageDialog(null,"Es capicua");
        }else{
            JOptionPane.showMessageDialog(null,"No es capicua");
        }
    
  
}
}
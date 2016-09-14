import java.io.*;

public class pa2bx
{
    public static void main (String args[])
        throws InterruptedException, IOException
    {
        Runtime rt = Runtime.getRuntime();
        String cmdargs [] = new String [3];
        cmdargs[0] = "java";
        cmdargs[1] = "subpro3";
		cmdargs[2] = "hola";
		
        Process pro1 = rt.exec(cmdargs);
        System.out.println("Comando emitido: "+
                            cmdargs[0]+" "+cmdargs[1]);

        int y =0;
		
		do{
			try{
			 y = pro1.exitValue();
			System.out.println("y= " + y);
			
			}
			catch(Exception e) {
			  System.out.println("Todavía falta");
			}
		}while(y!= -8);
		 System.out.println("Ya terminó");
	
    }
}
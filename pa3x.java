import java.io.*;

public class pa3x
{
    public static void main (String args[])
        throws InterruptedException, IOException
    {
	
        Runtime rt = Runtime.getRuntime();
        Process pro1 = rt.exec(args);
        System.out.println("Comando emitido: "+
                            args[0]+" "+args[1]+" "+args[2]);

        System.out.println("Ya termino o todavía falta");
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
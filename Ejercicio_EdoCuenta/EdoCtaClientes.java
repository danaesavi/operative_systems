import java.io.*;

public class EdoCtaClientes
{
    public static void main (String args[])
    	throws IOException
    {
		
		long time1 = System.currentTimeMillis();
        BufferedReader filein = null; //para entrada
		 Runtime rt = Runtime.getRuntime();
        String cmdargs [] = new String [4];
        Process proc[] = new Process[11];
		
        int i=0;
		int totProc= proc.length;;
        String linea, nomCliente, clvCliente;
		
		PrintWriter fileout;  // para salida
		fileout = new PrintWriter( new FileWriter("EstadosNoGenerados.txt") );
		
		cmdargs[0]="java";
		cmdargs[1]="MovimientosCliente";
        i = 0;
        try
        {   filein = new BufferedReader( new FileReader("clientes.txt") );
            linea = filein.readLine();
            while ( linea != null )
            {   
                //linea = filein.readLine();
				String[] datosCliente=linea.split(" ");
				cmdargs[2]=datosCliente[0];
				cmdargs[3]=datosCliente[1];
				proc[i]=rt.exec(cmdargs);
				
				
				int x =proc[i].waitFor();
				System.out.println("--YA TERMINO--: " + (i+1));
				if(x==0){ //no se generó
					//System.out.println(x);
					fileout.println(linea);
					
					
				}
				linea = filein.readLine();
				i++;
		}
        } catch(Exception e)
        {   System.out.println("Algo fallo: " + e.getMessage());
            filein.close();
            System.exit(2);
        }
        filein.close();
		fileout.close();
		long timedif=System.currentTimeMillis()-time1;
		System.out.println("Duracion: "+ (timedif/1000.00	)+ "segundos");
     


        

    }
}
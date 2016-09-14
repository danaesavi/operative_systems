import java.io.*;

public class MovimientosCliente
{

   public static void main (String[] args)
   {
      BufferedReader filein; //para entrada
      PrintWriter fileout;  // para salida
      String linea, nomCliente, clvCliente;
	  nomCliente=" ";
      int clave1, clave2;
	  boolean flag=false;
	  StringBuilder edos=new StringBuilder();
      try
      {   clvCliente = args[0];
      	  nomCliente = args[1];
		  clave1 = Integer.parseInt(clvCliente);

         filein = new BufferedReader( new FileReader("movimientos.txt") );
         fileout = new PrintWriter( new FileWriter("EdoCta"+ nomCliente+".txt") );

		  linea = filein.readLine();
		  
          while ( linea != null )
          {  if( linea.length() != 0 )
			 {  
				String[] lineaDoc=linea.split(" ");
				if(Integer.parseInt(lineaDoc[0])== clave1){
					 
					 fileout.println(linea);
					 flag=true;
					 
				}
			 }

             linea = filein.readLine();
          }
          filein.close();
          fileout.close();
      }
      catch (Exception ex)
      {   System.out.println("\nEXCEPCION: IOException.");
          System.out.println("getMessage: " + ex.getMessage() );
          ex.printStackTrace();
          System.out.println("\nHasta la vista.\n");
      }
	  if(flag){
		System.exit(-4);
	  
	  }
	   else{
		   File f=new File("EdoCta"+nomCliente+".txt");
		   f.delete();
		   System.exit(0);
	   }
   }
}
import java.io.*;
import java.util.*;

public class subpro3
{
    static PrintWriter fileout;

    public static void main( String args[] ) throws IOException
    {
        fileout = new PrintWriter( new FileWriter("resul.txt") );
        fileout.println( "Cadena:" + args[0] );
        System.out.println( "Cadena:" + args[0]  );
	

        for( int d = 0; d < 60000; d++)
        {  for( int f = 0; f < 60000; f++);
        }

       fileout.close();
       
        System.exit(-8);
    }
}

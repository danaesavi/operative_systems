import java.util.*;
import java.lang.*;


public class FechaG
{
   public static Calendar calendar;

   public static void main( String args[] )
   {
      long timedif = 0;
      calendar = new GregorianCalendar();
      System.out.println("HOY= " + (new Date()).toString() );
      aux();
      timedif = System.currentTimeMillis();
      System.out.println("---------------------------");
      System.out.println("---------------------------");
      System.out.println("---------------------------");
      try{
	Thread.sleep(4000);}
	catch (InterruptedException e)
	{}

      calendar = new GregorianCalendar();
      System.out.println("HOY= " + (new Date()).toString() );
      aux();
      timedif = System.currentTimeMillis()-timedif;
      System.out.println("Diferencia de tiempo: "+timedif/1000.0+" segundos");

   } // main

   public static void aux()
   {
      System.out.print("DATE: " + calendar.get(Calendar.DATE) +
                       "        ");
      System.out.print("MONTH: " + (calendar.get(Calendar.MONTH)+1) +
                       "        ");
      System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
      System.out.print("WEEK_OF_YEAR: " + calendar.get(Calendar.WEEK_OF_YEAR) +
                       "        ");
      System.out.println("WEEK_OF_MONTH: " + calendar.get(Calendar.WEEK_OF_MONTH));
      System.out.print("DAY_OF_MONTH: " + calendar.get(Calendar.DAY_OF_MONTH) +
                       "        ");
      System.out.print("DAY_OF_YEAR: " + calendar.get(Calendar.DAY_OF_YEAR) +
                       "        ");
      System.out.println("DAY_OF_WEEK: " +calendar.get(Calendar.DAY_OF_WEEK));
      System.out.print("HOUR: " + calendar.get(Calendar.HOUR) +
                       "        ");
      System.out.println("AM_PM: " + calendar.get(Calendar.AM_PM));
      System.out.println("HOUR_OF_DAY: " + calendar.get(Calendar.HOUR_OF_DAY));
      System.out.print("MINUTE: " + calendar.get(Calendar.MINUTE) +
                       "        ");
      System.out.print("SECOND: " + calendar.get(Calendar.SECOND) +
                       "        ");
      System.out.println("MILLISECOND: " + calendar.get(Calendar.MILLISECOND));

   }// aux
} // FechaG


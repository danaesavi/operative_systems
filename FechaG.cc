// FechaG.cc

#include <stdio.h>
#include <time.h>
#include <unistd.h>
time_t a;
struct tm *vtm;

void aux()
{
    printf( "HOUR= %d      ", vtm->tm_hour );
    printf( "MINUTE= %d      ", vtm->tm_min );
    printf( "SECOND= %d\n", vtm->tm_sec);
    printf( "DAY OF MONTH= %d      ", vtm->tm_mday);
    printf( "MONTH= %d      ", vtm->tm_mon + 1);
    printf( "YEAR= %d\n", vtm->tm_year + 1900);
    printf( "WEEK DAY= %d      ", vtm->tm_wday);
    printf( "YEAR DAY= %d\n", vtm->tm_yday + 1);
    return;
}

int main()
{
    char *st1;
    time_t start = time(0);
    time( &a );
    printf( "a= %d seg.\n",a);

    // Similar al comando "date"
    st1 = ctime( &a );
    printf( "st1= %s\n", st1);

    vtm = localtime( &a );
    aux();
    sleep(4);

    printf( "------------------------------\n");
    printf( "------------------------------\n");
    printf( "------------------------------\n");
    

    time( &a );
    printf( "a= %d seg.\n", a);

    // Similar al comando "date"
    st1 = ctime( &a );
    printf( "st1= %s\n", st1);

    vtm = localtime( &a );
    aux();
    double dif = difftime(time(0),start);
    printf( "\n Diferencia: ");
    printf("%1f",dif);
    printf("\n");
    

    return 0;
}


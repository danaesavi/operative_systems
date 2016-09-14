// DatosSis.cc

#include <stdio.h>
#include <stdlib.h>

/* Despliega el contenido una variable de
   medio ambiente. */

int main(int argc, char *argv[],char *envp[])
{

 

  // Similar a "printenv var".
 
  if(argc>0 && argv[1] != (char *) 0){
	 if (getenv(argv[1])!= (char *) 0){
		printf("%s\n", getenv(argv[1]) );
	}


	
 }

  

  return 0;
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import  java.util.ArrayList ;
import  javax.swing.JOptionPane ;
import java.math. * ;


público  de clase  DERIVACION {
	static  String sal = " " ;
	 doble sol estático = 0,0 ;
estática  doble h, resultado = 0 , evalu = 0 ;
static  int pi = 0 , maxcolum = 10 ;
 registro doble estático = 0,2 ;
static  int maxd;
 pestaña doble estática [] [];


	derivacion ( doble  tabla [] [], doble  evaluacion , String  metodo ) {
		maxd = tabla . largo;
	   	tabulador =  nuevo  doble [maxd] [maxcolum];
	   	 iniciartabla ();
		 
		 para ( int c = 0 ; c < 2 ; c ++ ) {
		 	para ( int f = 0 ; f < maxd; f ++ ) {
		 	tabulador [f] [c] = tabla [f] [c];	
		 	}
		 }
	   	
		 diferenciar (evalu, metodo);
	}
	
	derivación ( doble  tabla [] [], doble  evaluación , int  derivada ) {
		maxd = tabla . largo;
	   	tabulador =  nuevo  doble [maxd] [maxcolum];
		 iniciartabla ();
		 
		 para ( int c = 0 ; c < 2 ; c ++ ) {
		 	para ( int f = 0 ; f < maxd; f ++ ) {
		 	tabulador [f] [c] = tabla [f] [c];	
		 	}
		 }
		 
		 if (derivada == 1 ) {
		 d1 (evaluación);	
		 }
		 
		 si (derivada == 2 ) {
		 d2 (evaluación);	
		 }
		 
		 if (derivada == 3 ) {
		 d3 (evaluación);	
		 }
		  
	}
	
	
	public  String  solucion () {
		return sal;
	}
	
	público  doble  resultado () {
		return sol;
	}
	
		  diferenciar vacío  privado ( evaluación doble , método de cadena ) {  
	
 		// mostrartabla ();
		
		if ((metodo . compareTo ( " tabla de diferencias " )) == 0 ) {
		derivatabla ();
 	
 	    d (eval);
		}
		
		if ((metodo . compareTo ( " diferencias centrales " )) == 0 ) {
		
		d1 (eval);
			
		}
		
		if ((metodo . compareTo ( " newton " )) == 0 ) {
		
		dN (eval, eval - recor, eval + recor);
			
		}
		
		if ((metodo . compareTo ( " " )) == 0 ) {
		derivatabla ();
 		mostrartabla ();	
 	    d (eval);
		d1 (eval);
		dN (eval, eval - recor, eval + recor);
			
		}
		
	}

	public  static  void  iniciartabla () {
		para ( int i = 0 ; i < maxd; i ++ ) {
			para ( int j = 0 ; j < 10 ; j ++ ) {
			tab [i] [j] = 0.0 ;
			}
		
		}
	}
	
	public   void  mostrartabla () {
		Sistema . fuera . printf ( "           " );
		para ( int i = 0 ; i < maxd; i ++ ) {
			para ( int j = 0 ; j < 10 ; j ++ ) {
			
				Sistema . fuera . printf ( "   |% 3.3f |   " , (tabulador [i] [j]));
			}
			Sistema . fuera . imprimir ( " \ n           " );
		}
		
		Sistema . fuera . imprimir ( " \ n " );
	}
	
	
		public  static  void  dN ( doble  dato , doble  da , doble  dd ) {
			sal = " " ;
			int fd = 0 , fda = 0 , fdd = 0 , e = 0 ;
			
			h = (pestaña [ 1 ] [ 0 ]) - (pestaña [ 0 ] [ 0 ]);	
	
				
			para ( int j = 0 ; j < maxd; j ++ ) {
			if (tab [j] [ 0 ] == dato) {
				fd = j;
				
			}
			
			}
			
			para ( int j = 0 ; j < maxd; j ++ ) {
			si (tab [j] [ 0 ] == da) {
				fda = j;
				
			}
			
			}
			
			para ( int j = 0 ; j < maxd; j ++ ) {
			si (tab [j] [ 0 ] == dd) {
				fdd = j;
			
			}
			
			}
			
			si (e == 0 ) {
			
			
		    doble a1 = (tab [fda] [ 1 ] - tab [fd] [ 1 ]) / (tab [fda] [ 0 ] - tab [fd] [ 0 ]);
		   
			doble a2p1 = (tab [fdd] [ 1 ] - tab [fda] [ 1 ]) / (tab [fdd] [ 0 ] - tab [fda] [ 0 ]);
		
		
			
			doble a2p2 = (tab [fda] [ 1 ] - tab [fd] [ 1 ]) / (tab [fda] [ 0 ] - tab [fd] [ 0 ]);
		

			
			doble a2 = ((a2p1) - (a2p2)) / (tab [fdd] [ 0 ] - tab [fd] [ 0 ]);
			
				
			
		    
			
		    resultado = a1 + (a2 * (tab [fd] [ 0 ] - tab [fda] [ 0 ]));
			
		
			}
			
			
			sal + = ( " \ n El valor de la primera derivada por interpolación de NEWTON de f (x) en el punto " + dato + " es igual a: \ n " + resultado + " \ n \ n " );
		
			sol = resultado;
		
					
		}

	
	
	
		public  static  void  d1 ( doble  dato ) {
			sal = " " ;
			int filacond = 0 ;
			
			h = (pestaña [ 1 ] [ 0 ]) - (pestaña [ 0 ] [ 0 ]);	
	
				
			para ( int j = 0 ; j < maxd; j ++ ) {
			
			if (tab [j] [ 0 ] == dato) {
				filacond = j;
			}
			}
			
		      resultado = ((tab [filacond + 1 ] [ 1 ]) - (tab [filacond - 1 ] [ 1 ]));
						
		
			resultado * = ( 1 / ( 2 * h));
			
			
			sal + = ( " El valor de la PRIMERA derivada de f (x) por derivadas CENTRALES en el punto " + dato + " es igual a: \ n " + resultado + " \ n \ n " );
		sol = resultado;
					
		}

	
		public  static  void  d2 ( doble  dato ) {
			sal = " " ;
			int filacond = 0 ;
			
			h = (pestaña [ 1 ] [ 0 ]) - (pestaña [ 0 ] [ 0 ]);	
	
				
			para ( int j = 0 ; j < maxd; j ++ ) {
			
			if (tab [j] [ 0 ] == dato) {
				filacond = j;
			}
			}
			
		      resultado = ((tab [filacond + 1 ] [ 1 ]) - ( 2 * (tab [filacond] [ 1 ])) + (tab [filacond - 1 ] [ 1 ]));
						
		
			resultado * = ( 1 / ( Math . pow (h, 2.0 )));
			
		
			sal + = ( " El valor de la SEGUNDA derivada de f (x) por derivadas CENTRALES en el punto " + dato + " es igual a: \ n " + resultado + " \ n \ n " );
		    sol = resultado;
					
		}

		
		public  static  void  d3 ( doble  dato ) {
			sal = " " ;
			int filacond = 0 ;
			
			h = (pestaña [ 1 ] [ 0 ]) - (pestaña [ 0 ] [ 0 ]);	
	
				
			para ( int j = 0 ; j < maxd; j ++ ) {
			
			if (tab [j] [ 0 ] == dato) {
				filacond = j;
			}
			}
			
		      resultado = ((tab [filacond + 2 ] [ 1 ]) - ( 2 * (tab [filacond + 1 ] [ 1 ])) + ( 2 * (tab [filacond - 1 ] [ 1 ])) - (tab [ filacond - 2 ] [ 1 ]));
						
		
			resultado * = ( 1 / ( 2 * ( Math . pow (h, 3.0 ))));
			
			
			sal + = ( " El valor de la TERCERA derivada de f (x) por derivadas CENTRALES en el punto " + dato + " es igual a: \ n " + resultado + " \ n \ n " );
			sol = resultado;
		}

	
	
		public  static  void  d ( doble  dato ) {
			sal = " " ;
			int filacond = 0 ;
				
			para ( int j = 0 ; j < maxd; j ++ ) {
			
			if (tab [j] [ 0 ] == dato) {
				filacond = j;
			}
			}
			
			
			para ( int c = 1 ; c <= 8 ; c ++ ) {
				int a = 1 ;
				si ((c % 2 ) == 0 ) {
					a = - 1 ;
				}
				else {
				a = 1 ;	
				}
				
				
				resultado + = ( 1 / c) * (tab [filacond] [c + 1 ]) * (a);
			}
		
			resultado * = ( 1 / h);
			
			if (resultado ! = 0 ) {
			sal + = ( " El valor de la derivada de f (x) por TABLA DE DIFERENCIAS en el punto " + dato + " es igual a: \ n " + resultado + " \ n \ n \ n " );
			sol = resultado;
			}
			
			si (resultado == 0 ) {
			sal + = ( " El valor de la derivada de f (x) por TABLA DE DIFERENCIAS en el punto " + dato + " se desconoce \ n \ n \ n " );
			}
				
		}
		
	 determinagrado del vacío estático  público () { 
	
	int coincidencia = 0 , ldc = 0 ;
	Sistema . fuera . imprimir ( " \ n " );
	para ( int coo = 2 ; coo < maxcolum; coo ++ ) {
	
	para ( int j = 1 ; j < maxd; j ++ ) {
		
			if (((tab [j - 1 ] [coo]) ! = 0 ) && ((tab [j] [coo]) ! = 0 )) {	
			if ((tab [j - 1 ] [coo]) == (tab [j] [coo])) {
				
			
				
				coincidencia ++ ;
			
				ldc = coo - 1 ;
				  
				
			}
			}
			}
	}
	
	if (coincidencia > 1 ) {
		sal + = ( " la función f (x) es de grado: " + ldc);
	}
	si (coincidencia == 0 ) {
		sal + = ( " Se desconoce el grado de la función \ n " );
	}
	
	}
		
	
	public  static  void  derivatabla () {
			
	h = (pestaña [ 1 ] [ 0 ]) - (pestaña [ 0 ] [ 0 ]);	
	
	resultado = 0 ;
	
  	para ( int col = 2 ; col < maxcolum; col ++ ) {
	para ( int i = (pi + 1 ); i < maxd; i ++ ) {
	
	tab [i] [col] = (tab [i] [col - 1 ]) - (tab [i - 1 ] [col - 1 ]);

	}
	pi ++ ;
	}
	
	
	
// 	resultado = resultado * (1 / h);
	
	

}
	
	
}
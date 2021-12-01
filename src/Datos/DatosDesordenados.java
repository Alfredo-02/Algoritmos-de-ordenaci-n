/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author Noemí Lara Acono
 */
public class DatosDesordenados {
    // Atributos
    private int[] valores; 
    private int limiteSuperior; 
    private int size; 

    public DatosDesordenados(int limite, int size) {
        this.valores = new int[size];
        this.limiteSuperior = limite;
        this.size = size;
    }
    
    public void agregarDato(int valor){
        valores[size]= valor;
        size++;
    }
    
    public int getDato(int posicion){
        return valores[posicion];
    }
    
    public void generarValores(){
        for (int i=0; i < valores.length; i++){
            double aleatorio = Math.random() * limiteSuperior;
            valores[i] = (int) aleatorio + 1;
        }
    }
    
    public int getSize(){
        return size; 
    }
    
    public int getCapacidad(){
        return valores.length;
    }
    
    public int getLimiteSuperior(){
        return limiteSuperior;
    }
    
    
    public int[] getValores(){
        return valores;
    } 
    
    public int[] getCopiaValores(){
        int [] copia = new int[size];
        System.arraycopy(valores, 0, copia, 0, size);
        return copia;
    }
    
    
   
     public DatosOrdenados algoritmoSort(){
        
        // obtener una copia de los datos desordenados
        int [] arreglo = this.getCopiaValores();
        
        // agregar algoritmo de ordenación
        
        // devolver los datos ordenados
        return new DatosOrdenados(arreglo);
    }
    
    public DatosOrdenados bubbleSort(){
        int [] arreglo = this.getCopiaValores();
        int n = arreglo.length;
        int cont = 0;
        int ci = 0;
        for (int i=0; i < n-1; i++){
            for (int j=0; j < n-i-1; j++){
                cont++;
                if (arreglo[j] > arreglo[j+1]){
                    // intercambiar: swap
                    ci++;
                    int temporal = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = temporal;
                }
            }
        }
        System.out.println("BS-comparaciones = " + cont);
        System.out.println("BS-intercambios = " + ci);
        return new DatosOrdenados(arreglo);
    }
    
    public DatosOrdenados bubbleSortDescendente() {
        int[] arreglo = this.getCopiaValores();
        int n = arreglo.length;
        int cont = 0;
        int ci = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                cont++;
                if (arreglo[j] < arreglo[j + 1]) {
                    // intercambiar: swap
                    ci++;
                    int temporal = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temporal;
                }
            }
        }
        System.out.println("BS-comparaciones = " + cont);
        System.out.println("BS-permutaciones = " + ci);

        return new DatosOrdenados(arreglo);
    }
    
    static int comp = 0;
    static int perm = 0;
    
    private void QuickSortAscen(int numeros[], int izq,int m, int der){
            /*Este metodo recibe un arreglo de numero, y dos enteros que referencian el primer valor
            Y el ultimo*/
        
            //Se toma como pivote el primer valor
            int pivote = numeros[izq];
         
            //Se definen los dos lados y un auxiliar
            int i = izq; 
            int j = der; 
            int aux;
            
            while(i<j){
                while (numeros[i] <= pivote && i < j) 
                    i++;
                while (numeros[j] > pivote) 
                    j--;   
                if (i<j) {       
                    perm++;
                    aux = numeros[i];                  
                    numeros[i]= numeros[j];
                    numeros[j]=aux;
                }
            }
            numeros[izq] = numeros[j]; 
            numeros[j] = pivote;
            if (izq < j-1)
                QuickSortAscen(numeros,izq,m,j-1);
            if (j+1 < der)
                QuickSortAscen(numeros,j+1,m,der);
    }
    
    private void QuicksortAs(int numeros[], int izq, int der) {
        int m = (der + izq) / 2;
        if (der > izq){
            comp++;
            QuicksortAs(numeros, izq, m);
            QuicksortAs(numeros, m + 1, der);
            QuickSortAscen(numeros, izq,m, der);
        }
    }
    
    public DatosOrdenados QuicksortAscendente(){
        int [] Q = this.getCopiaValores();
        this.QuicksortAs( Q, 0, Q.length - 1);
        System.out.println("QSAscendente-comparaciones = " + comp);
        System.out.println("QSAscendente-permutaciones = " + perm);
	return new DatosOrdenados(Q);
    } // fin del método QuickSort
    
    
    //Metodo QuickSort descendente
    private void QuicksortDes(int numeros[], int izq,int m, int der)
    {
            /*Este metodo recibe un arreglo de numero, y dos enteros que referencian el primer valor
            Y el ultimo*/
        
            //Se toma como pivote el primer valor
            int pivote = numeros[izq];
            
            //Se definen los dos lados y un auxiliar
            int i = izq; 
            int j = der; 
            int aux;
           
            while(i<j)
            {
               while (numeros[i] >= pivote && i < j) 
                  i++;

               while (numeros[j] < pivote) 
                  j--;   

               if (i<j) 
               {        
                   perm++;
                   aux = numeros[i];                  
                   numeros[i]= numeros[j];
                   numeros[j]=aux;
               }
            }

             numeros[izq] = numeros[j]; 
             numeros[j] = pivote;

             if (izq < j-1)
                QuicksortDes(numeros,izq,m,j-1);

             if (j+1 < der)
                QuicksortDes(numeros,j+1,m,der);
             
        ;
      }
    
    
    private void QuicksortDes(int numeros[], int izq, int der) {
        int m = (der + izq) / 2;
        if (der > izq) {
            comp++;
            QuicksortDes(numeros, izq, m);
            QuicksortDes(numeros, m + 1, der);
            QuicksortDes(numeros, izq, m, der);
        }
    }
    
    public DatosOrdenados QuickSortDescendente() {
        //arreglo a ordenar
        int[] quickdes = this.getCopiaValores();

        
        this.QuicksortDes(quickdes, 0, quickdes.length - 1);
      
        System.out.println("QSDescendente-comparaciones = " + comp);
        System.out.println("QSDescendente-permutaciones = " + perm);

        //metodo para imprimir el vctor ordenado
        return new DatosOrdenados(quickdes);
    }
 //Fin del Metodo QuickSort descendente
    public DatosOrdenados radix (){
        int[] arreglor = this.getCopiaValores();
        int n = arreglor.length;
        int cont = 0;
        int pq=0;
        
        int x,i,j;
        for (x = Integer.SIZE-1; x >= 0; x--){
            int auxiliar [] = new int [arreglor.length];
            j = 0;
            for (i = 0; i < arreglor.length; i++){
                boolean mover = arreglor[i] <<x>=0;
                if (x==0 ? !mover:mover){
                    auxiliar[j] = arreglor[i];
                    j++;
                   cont++; 
                }else {
                    arreglor[i-j] = arreglor[i];
                    pq++;
                    
                }
               
            }
            
            for (i=j; i<auxiliar.length;i++){
                auxiliar[i]= arreglor[i-j];
                
            }
            arreglor = auxiliar;
            
        }
        System.out.println("R-comparaciones = " +cont);
        System.out.println("R-permutaciones = " +pq );
        return new DatosOrdenados(arreglor);
    } 
    public DatosOrdenados radixDescendente (){
        int[] arreglor = this.getCopiaValores();
        int n = arreglor.length;
        int cont = 0;
        int pq=0;
        
        int x,i,j;
        for (x = Integer.SIZE-1; x >= 0; x--){
            int auxiliar [] = new int [arreglor.length];
            j = 0;
            for (i = 0; i < arreglor.length; i++){
                boolean mover = arreglor[i] <<x<=0;
                if (x==0 ? !mover:mover){
                    auxiliar[j] = arreglor[i];
                    j++;
                   cont++; 
                }else {
                    arreglor[i-j] = arreglor[i];
                    pq++;
                    
                }
               
            }
            
            for (i=j; i<auxiliar.length;i++){
                auxiliar[i]= arreglor[i-j];
                
            }
            arreglor = auxiliar;
            
        }
        System.out.println("R-comparaciones = " +cont);
        System.out.println("R-permutaciones = " +pq );
        return new DatosOrdenados(arreglor);
    } 
    
    
        public DatosOrdenados shell() {
        int [] s = this.getCopiaValores();
        int salto, aux, i, cont1=0, cont2=0;
        boolean cambios;
  
        for (salto = s.length / 2; salto != 0; salto /= 2) {
            cont1++;
            cambios = true;
            while (cambios) {   // Mientras se intercambie algún elemento  
                cont1++;
                cambios = false;
                for (i = salto; i < s.length; i++)   // se da una pasada
                {
                    cont1++;
                    if (s[i - salto] > s[i]) {       // y si están desordenados
                        cont2++;
                        aux = s[i];                  // se reordenan
                        s[i] = s[i - salto];
                        s[i - salto] = aux;
                        cambios = true;              // y se marca como cambio.                                   
                    }
                }
            
        }
}
        System.out.println("SS-iteraciones = " + cont1);
        System.out.println("SS-comparaciones = " + cont2);
        return new DatosOrdenados(s);
}
    public DatosOrdenados shellDescendente() {
        int [] s = this.getCopiaValores();
        int salto, aux, i, cont1=0,cont2=0;
        boolean cambios;
  
        for (salto = s.length / 2; salto != 0; salto /= 2) {
            cont1++;
            cambios = true;
            while (cambios) {   // Mientras se intercambie algún elemento                                         
                cont1++;
                cambios = false;
                for (i = salto; i < s.length; i++)   // se da una pasada
                {
                    cont1++;
                    if (s[i - salto] < s[i]) {       // y si están desordenados
                        cont2++;
                        aux = s[i];                  // se reordenan
                        s[i] = s[i - salto];
                        s[i - salto] = aux;
                        cambios = true;              // y se marca como cambio.                                   
                    }
                }
            
        }
}       
        System.out.println("SS-iteraciones = " + cont1);
        System.out.println("SS-comparaciones = " + cont2);
        return new DatosOrdenados(s);
}
    
       
    
    public DatosOrdenados insertSort(){
         // obtener una copia de los datos desordenados
        int [] a = this.getCopiaValores();
        
	int i, j, aux; 
	int cont=0; 
	for ( i = 1; i < a.length; i++){
		j = i;
		aux = a[i];
		while (j >0 && aux < a[j-1]){
                   cont++;
                   a[j] = a[j-1];
                   j--; 
		}
		a[j] = aux; 
	}
        System.out.println("IS-comparaciones = " + cont);
	// devolver los datos ordenados
        return new DatosOrdenados(a);
    }
    
    public DatosOrdenados mergeSort(){
    int [] x = this.getCopiaValores();
	// Aquí va la llamada al método mergesort( arreglo, l, r)
	this.mergesort( x, 0, x.length - 1);
        System.out.println("MS-comparaciones = " + cm);
	return new DatosOrdenados(x);
    } // fin del método ordenacionMerge
    
   private void mergesort (int v[], int l, int r) {
		 int m = (r+l)/2; 
		 if (r > l) { 
                     cm++;
			 mergesort (v, l, m);
			 mergesort (v, m+1, r); 
			 merge (v, l, m, r); 
		 }
	}
    static int cm=0;
   private void merge (int v[], int l, int m, int r)
	{
	//Encuentra el tamaño de los sub-vectores para unirlos.
	  int n1 = m - l + 1;
	  int n2 = r - m;

	  //Vectores temporales.
	  int arrIzq[] = new int [n1];
	  int arrDer[] = new int [n2];

	  //Copia los datos a los arreglos temporales.
	  for (int i=0; i < n1; i++) {
              cm++;
		arrIzq[i] = v[l+i];
	  }
	  for (int j=0; j < n2; j++) {
              cm++;
		arrDer[j] = v[m + j + 1];
	  }
	  // Combinación (mezcla) de los dos arreglos:
	  int i = 0, j = 0;
	  int k = l;
	  while (i < n1 && j < n2) {//Ordenamiento.
                cm++;
		if (arrIzq[i] <= arrDer[j]) {
			v[k] = arrIzq[i];
			i++;
		} else {
			v[k] = arrDer[j];
			j++;
		}
		k++;
	  }//Fin del while.

	  /* Si quedan elementos por ordenar */
	  //Copiar los elementos restantes de arrIzq[].
	  while (i < n1) {
              cm++;
	    v[k] = arrIzq[i];
	    i++;
	    k++;
	  }
	  //Copiar los elementos restantes de arrDer[].
	  while (j < n2) {
              cm++;
	    v[k] = arrDer[j];
	    j++;
	    k++;
	  }
	}
    
    @Override
    public String toString(){
        String cad = "Datos DESORDENADOS: ";
        for (int x : valores){
            cad += x + ", ";
        }
        return cad;
    }
    
    
    
}

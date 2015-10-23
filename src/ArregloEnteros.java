
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author LEFF
 */
public class ArregloEnteros {
    int enteros[];
    
    public ArregloEnteros(int a){
        enteros = new int[a];
    }
    
    //auxiliar
    void llenar(int n){
        llenar(n,0);
    }
    
    void llenar(int n, int pos){
        if (pos < enteros.length) {
            enteros[pos]= n;
            llenar(n,pos+1);
        }
    }
    
    //auxiliar
    boolean buscar(int n){
        return buscar(n, 0);
    }
    
    boolean buscar(int n, int pos){
        if (pos < enteros.length) {
            if (enteros[pos] == n) {
                return true;
            }
            buscar(n,pos+1);
        }
        return false;
    }
    
    //auxiliar
    int suma(){
        return suma(0);
    }
    
    int suma(int pos){
        int ac = 0;
        if (pos < enteros.length) {
            ac += enteros[pos];
            return suma(pos+1);
        }
       return ac; 
    }
    
    //auxiliar
    void print(){
        print(0);
    }
    
    void print(int pos){
        if (pos < enteros.length) {
            System.out.println("Pos ["+pos+"]: "+enteros[pos]);
            print(pos+1);
        }
    }
    
    //auxiliar
    int divisibleEntre(int divisor){
        return divisibleEntre(divisor, 0);
    }
    
    int divisibleEntre(int divisor, int pos){
        int acum = 0;
        if (pos < enteros.length) {
            if (enteros[pos] % divisor == 0) {
                acum += 1;
            }
            return divisibleEntre(divisor, pos+1);
        }
        return acum;
    }
    
    //auxiliar
    void reemplazar(int x, int y){
        reemplazar(x,y,0);
    }
    
    void reemplazar(int x, int y, int pos){
        if (pos < enteros.length) {
            if (enteros[pos] == x) {
                enteros[pos] = y;
            }
            reemplazar(x,y,pos+1);
        }
    }
    
    int maximo(int pos){
        int max=0;
        if (pos < enteros.length) {
            if (enteros[pos] > max) {
                max = enteros[pos];
            }
            return maximo(pos+1);
        }
        return max;
    }
    
    //auxiliar
    int factorialDe(int fact){
        return factorialDe(0,fact);
    }
    
    int factorialDe(int pos, int fact){
        boolean search = buscar(pos);
        if (search && fact > 0) {
            int var = fact * factorialDe(fact - 1);
            return var;
        }
            return 1;
    }
    
    public boolean palindromo(int inicio, int fin){
        if(inicio < fin){
            if(enteros[inicio] != enteros[fin])
                return false;
            return palindromo(inicio + 1, fin - 1);
        }
        return true;
    }
    
     public void sort(int menor, int mayor) { 
		int medio = menor + (mayor - menor) / 2;
		int pivote = enteros[medio];		
		int me = menor, ma = mayor;                
		while (me <= ma) {
			while (enteros[ma] < pivote) {
				me++;
			}
			while (enteros[ma] > pivote) {
				ma--;
			} 
			if (me <= ma) {
				int temp = enteros[me];
				enteros[me] = enteros[ma];
				enteros[ma] = temp;
				me++;
				ma--;
			}
		} 		
		if (menor < ma)
			sort(menor, ma);
 
		if (mayor > me)
			sort(me, mayor);
	}
}

package enteros;
/**
 * clase hecha para el examen , para ver el java doc
 * 
 * @author miguel
 */
public class Enteros {
	
	
/**
 * resive un numero y devuelve su factorial
 * @param n (numero entero)
 * @return entero factorial
 */
public static int r_factorial(int n) {
		int resultado;

		if (n == 0) {
			resultado = 1;
		} else {
			resultado = n * r_factorial(n - 1);
		}
		return resultado;
}



/**
 * 
 * @param cadena (recibe una cadena y devuelve un string de la cadena escrita al reves)
 * @return cadena_alreves
 */
public static String alreves(String cadena) {
		String resultado = "";

		for (int i = cadena.length() - 1; i >= 0; i--) {
			resultado = resultado + cadena.charAt(i);
		}
		return resultado;
}


/**
 * metodo booleano  
 * @param n (recibe un numero y retorna falso o verdadero si un numero es capicua o no)
 * @return resultado (boolean)
 */
public static boolean capicua(int n) {
		boolean resultado;
		String cadena;

		cadena = Integer.toString(n);
		if (cadena.equals(alreves(cadena))) {
			resultado = true;
		} else {
			resultado = false;
		}

		return resultado;
}


/**
 * metodo boolenao que recibe dos numeros (multiplo/divisor) y retorna verdadero o false si el primer numero es divisible por el segundo
 * @param multiplo (recibe un numero que sera el  multiplo)
 * @param divisor (recibe  un entero divisor)
 * @return resultado (boolean)
 */
public static boolean divisible(int multiplo, int divisor) {
		boolean resultado;

		if (multiplo % divisor == 0) {
			resultado = true;
		} else {
			resultado = false;
		}

		return resultado;
}


/**
 * metodo booleano que recibe dos numeros enteros y devuelve verdadero o falso si son divisibles 
 * @param mult (entero que sera multiplo)
 * @param divisor (entero que sera divisor)
 * @return resultado (booleano)
 */
public static boolean multiplo(int mult, int divisor) {
		boolean resultado;

		try {
			if (mult % divisor == 0) {
				resultado = true;
			} else {
				resultado = false;
			}
		} catch (ArithmeticException e) {
			resultado = false;
		}
		return resultado;
}


/**
 * metodo booleano que recibe un numero entero y devuelve verdadero o falso si el numero es primo o no
 * @param n (numero entero)
 * @return primo (boolean)
 */
public static boolean esPrimo(int n) {
		boolean primo;

		if (n <= 1) {
			primo = false;
		} else {
			primo = true;
			int i = 2;
			while (primo && i <= n / 2) {
				if (divisible(n, i)) {
					primo = false;
				} else {
					i++;
				}
			}
		}
		return primo;
}


/**
 * Recibe un número entero y devuelve el número de primos menores o iguales a ese número
 * @param n (numero entero)
 * @return resultado (entero)
 */
public static int n_primos(int n) {
		int resultado = 0;

		for (int i = 2; i <= n; i++) {
			if (esPrimo(i)) {
				resultado++;
			}
		}
		return resultado;
}


/**
 * Recibe un número entero y devuelve los números primos  menores o iguales a ese número.
 * @param n (numero entero)
 * @return resultado (array de enteros)
 */
public static int[] primosHasta(int n) {
		int[] resultado;

		resultado = new int[n_primos(n)];
		int cont = 0;
		for (int i = 2; i <= n; i++) {
			if (esPrimo(i)) {
				resultado[cont] = i;
				cont++;
			}
		}

		return resultado;
}


/**
 * Recibe un número entero (n) y devuelve los n primeros primos
 * @param n (numero entero)
 * @return resultado (entero)
 */
public static int[] primerosPrimos(int n) {
		int[] resultado = new int[(n < 0) ? 0 : n];

		int cont = 0;
		int i = 2;
		while (cont < n) {
			if (esPrimo(i)) {
				resultado[cont] = i;
				cont++;
			}
			i++;
		}

		return resultado;
	}
}


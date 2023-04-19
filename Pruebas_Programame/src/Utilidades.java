
/*
 * public class PolisilabaesPolisilaba467 {
 * public static void main(String[] args) throws IOException {
 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 * int casos = Integer.parseInt(br.readLine());
 * for (int i = 0; i < casos; i++) {
 * String[] palabras = br.readLine().split(" es ");
 * System.out.println((palabras[0].equalsIgnoreCase(palabras[1])
 * ? "TAUTOLOGIA"
 * : "NO TAUTOLOGIA"));
 * }
 * }
 * }
 */

/**
 * BUCLE IF MEJORADO:
 * System.out.println((CondicionDelIF) ? "LoqueEscribeSiSeCumple"
 * : "LoqueEscribreSi NO se cumple"));
 */

/**
 * PRINTEO CON FORMA
 * 
 * 
 * %+d numero de decimales
 * %+
 * System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
 */

/**
 * Parameter Descripción
 * n$ Se reemplaza “n” por un número para cambiar el orden en el que se procesan
 * los argumentos. Por ejemplo %3$d se refiere al tercer argumento
 * independientemente del lugar que ocupa en la cadena de formato.
 * Flags Descripción
 * número Rellena con espacios (o con ceros, ver siguiente flag) a la izquierda
 * hasta el valor del número.
 * 0 Se rellena con ceros a la izquierda hasta el valor dado por el flag
 * anterior. Por ejemplo “%03d” imprime un número justificado con ceros hasta
 * tres dígitos.
 * + Imprimir el signo de un número
 * - Justifica el campo a la izquierda (por defecto ya hemos dicho que se
 * justifica a la derecha)
 * # Formato alternativo. Para reales se dejan ceros al final y se imprime
 * siempre la coma. Para números que no están en base 10, se añade un prefijo
 * denotando la base.
 * Width Descripción
 * número Tamaño del ancho del campo donde se imprimirá el valor.
 * Igual que el caso anterior, pero el número a utilizar se pasa como parámetro
 * justo antes del valor. Por ejemplo printf("%*d", 5, 10) imprime el número 10,
 * pero con un ancho de cinco dígitos (es decir, rellenará con 3 espacios en
 * blanco a la izquierda).
 * Precision Descripción
 * número Tamaño de la parte decimal para números reales. Número de caracteres a
 * imprimir para cadenas de texto
 * Igual que el caso anterior, pero el número a utilizar se pasa como parámetro
 * justo antes del valor. Por ejemplo printf("%.*s", 3, "abcdef") imprime “abc”.
 * Length Descripción
 * hh Convertir variable de tipo char a entero e imprimir
 * h Convertir variable de tipo short a entero e imprimir
 * l Para enteros, se espera una variable de tipo long.
 * ll Para enteros, se espera una variable de tipo long long.
 * L Para reales, se espera una variable de tipo long double.
 * z Para enteros, se espera un argumento de tipo size_t.
 * 
 * Type Descripción
 * %c Imprime el carácter ASCII correspondiente
 * %d, %i Conversión decimal con signo de un entero
 * %x, %X Conversión hexadecimal sin signo
 * %p Dirección de memoria (puntero)
 * %e, %E Conversión a coma flotante con signo en notación científica
 * %f, %F Conversión a coma flotante con signo, usando punto decimal
 * %g, %G Conversión a coma flotante, usando la notación que requiera menor
 * espacio
 * %o Conversión octal sin signo de un entero
 * %u Conversión decimal sin signo de un entero
 * %s Cadena de caracteres (terminada en '\0')
 * %% Imprime el símbolo %
 * 
 * https://www.edu.xunta.gal/centros/iesteis/aulavirtual/pluginfile.php/142161/mod_resource/content/0/PROG_Chuleta-JavaAV.pdf
 */
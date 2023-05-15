### 1.3 Cálculos 
Analice el código que se muestra a continuación. Indique qué code smells encuentra y cómo pueden corregirse.						

```java
public void imprimirValores() {
	int totalEdades = 0;
	double promedioEdades = 0;
	double totalSalarios = 0;
	
	for (Empleado empleado : personal) {
		totalEdades = totalEdades + empleado.getEdad();
		totalSalarios = totalSalarios + empleado.getSalario();
	}
	promedioEdades = totalEdades / personal.size();
		
	String message = String.format("El promedio de las edades es %s y el total de salarios es %s", promedioEdades, totalSalarios);
	
	System.out.println(message);
			
}
```

**Code smells:**
   1. Falta de encapsulamiento: las variables de instancia son públicas (ya que no se especifica visibilidad, siendo por defecto la pública), lo que produce que estas sean accesibles y modificables directamente desde fuera de la clase que la contiene, rompiendo el principio de encapsulación de la programación orientada a objetos. Se podría solucionar estableciendo la visibilidad de las variables como privada y proporcionar métodos de acceso (getters) y modificación (setters) para manipularlas desde el exterior de la clase.
   2. Método largo: el método esta realizando multiples tareas (sumar las edades, sumar los salarios, calcular el promedio de edades e imprimir esos valores).  
   Se podría solucionar creando distintos métodos que hagan cada una de esas cosas por separado. Como la responsabilidad de calcular el promedio de edades se delegaría a otro método, el método **"imprimirValores()"** ya no necesitaría la suma de las edades, si no que la necesitaría el nuevo método **"calcularPromedioDeEdades()"**, que para obtener la suma de las edades haría invocaría al método **"calcularSumaEdades()"**

*Solución*:

```java
public void imprimirValores() {

	String message = String.format("El promedio de las edades es %s y el total de salarios es %s", calcularPromedioDeEdades(), calcularTotalSalarios());
	
	System.out.println(message);
			
}

private int calcularSumaEdades() {
	int sumaEdades = 0;
	
	for (Empleado empleado : personal) {
		sumaEdades += empleado.getEdad();
	}
	
	return sumaEdades;
}

private double calcularPromedioDeEdades() {
	int sumaEdades = calcularSumaEdades();
	double promedioEdades = (double) (sumaEdades / personal.size());
	
	return promedioEdades;
}

private double calcularTotalSalarios() {
	double totalSalarios = 0;
	
	for (Empleado empleado : personal) {
		totalSalarios += empleado.getSalario();
	}
	
	return totalSalarios;
}
```
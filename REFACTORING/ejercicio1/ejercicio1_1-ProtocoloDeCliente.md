### 1.1 Protocolo de Cliente
La clase Cliente tiene el siguiente protocolo. ¿Cómo puede mejorarlo? 

```java
/** 
* Retorna el límite de crédito del cliente
*/
protected double lmtCrdt() {...

/** 
* Retorna el monto facturado al cliente desde la fecha f1 a la fecha f2
*/
protected double mtFcE(LocalDate f1, LocalDate f2) {...

/** 
* Retorna el monto cobrado al cliente desde la fecha f1 a la fecha f2
*/
protected double mtCbE(LocalDate f1, LocalDate f2) {...
```

**Code smells:** 
1. Nombres poco descriptivos

*Solucion*: 
```java
/** 
* Retorna el límite de crédito del cliente
*/
protected double limiteDeCredito() {...

/** 
* Retorna el monto facturado al cliente desde la fecha f1 a la fecha f2
*/
protected double montoFacturado(LocalDate fechaInicio, LocalDate fechaFin) {...

/** 
* Retorna el monto cobrado al cliente desde la fecha f1 a la fecha f2
*/
protected double montoCobrado(LocalDate fechaInicio, LocalDate fechaFin) {...
```

- Los nombres de las variables deben indicar su rol. Debe quedar claro el rol que cumplen en el método / clase.
- Nombre de mensaje que revela la intención. El nombre del mensaje comunique lo que se quiere hacer.
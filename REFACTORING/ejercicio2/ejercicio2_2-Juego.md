### 2.2 Juego

```java
public class Juego {
    public void incrementar(Jugador j) {
        j.puntuacion = j.puntuacion + 100;
    }
    public void decrementar(Jugador j) {
        j.puntuacion = j.puntuacion - 50;
    }
}

public class Jugador {
    public String nombre;
    public String apellido;
    public int puntuacion = 0;
}
```

1. **Mal Olor**: Declaración de atributo público

2. **Refactoring**: Encapsulate Field
   1. Crea un getter y un setter para el campo.
   2. Encuentra todas las invocaciones del campo. Reemplace el recibo del valor del campo con el getter y reemplace la configuración de nuevos valores del campo con el setter.
   3. Después de que se hayan reemplazado todas las invocaciones de campo, haga que el campo sea privado.

3. **Resultado**:  

```java
public class Juego {
    public void incrementar(Jugador j) {
        j.setPuntuacion(j.getPuntuacion() + 100);
    }
    public void decrementar(Jugador j) {
        j.setPuntuacion(j.getPuntuacion() - 50);
    }
}

public class Jugador {
	private String nombre;
    private String apellido;
    private int puntuacion = 0;
    
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getPuntuacion() {
		return puntuacion;
	}
	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

}
```

1. **Mal Olor**: Nombre de metodo poco descriptivo

2. **Refactoring**: Rename Method
   1. Cambie el nombre del método.
   2. Busque todas las referencias al método y actualícelas.

3. **Resultado**:  

```java
public class Juego {
	
    public void incrementarPuntuacion(Jugador j) {
        j.setPuntuacion(j.getPuntuacion() + 100);
    }
    
    public void decrementarPuntuacion(Jugador j) {
        j.setPuntuacion(j.getPuntuacion() - 50);
    }
}

public class Jugador {
	private String nombre;
    private String apellido;
    private int puntuacion = 0;
    
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getPuntuacion() {
		return puntuacion;
	}
	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

}
```


1. **Mal Olor**: Data Class y Feature Envy (Responsabilidad mal asignada)

2. **Refactoring**: Move Method
   1. Verifique todas las funciones utilizadas por el método anterior en su clase. Puede ser una buena idea moverlos también. Como regla general, si una característica es utilizada solo por el método en consideración, ciertamente debe mover la característica a él. Si la característica también es utilizada por otros métodos, también debe mover estos métodos.  
   A veces es mucho más fácil mover una gran cantidad de métodos que establecer relaciones entre ellos en diferentes clases.  Asegúrese de que el método no esté declarado en superclases y subclases. Si este es el caso, deberá abstenerse de moverse o implementar una especie de polimorfismo en la clase receptora para garantizar la funcionalidad variable de un método dividido entre las clases donantes.

   2. Declare el nuevo método en la clase del destinatario. Es posible que desee dar un nuevo nombre al método que sea más apropiado para él en la nueva clase.
   
   3. Decida cómo se referirá a la clase receptora. Es posible que ya tenga un campo o método que devuelva un objeto apropiado, pero si no, deberá escribir un nuevo método o campo para almacenar el objeto de la clase de destinatario.

3. **Resultado**:  

```java
public class Juego {
	
    public void incrementarPuntuacion(Jugador j) {
        j.incrementarPuntuacion();
    }
    
    public void decrementarPuntuacion(Jugador j) {
        j.decrementarPuntuacion();
    }
}

public class Jugador {
	private String nombre;
    private String apellido;
    private int puntuacion = 0;
    
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getPuntuacion() {
		return puntuacion;
	}
	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}
	
    public void incrementarPuntuacion() {
        this.puntuacion += 100;
    }
    
    public void decrementarPuntuacion() {
    	this.puntuacion -= 50;
    }

}
```

1. **Mal Olor**: No se provee un constructor para inicializar los atributos de las clases en donde seria mejor que este inicializado el **"puntuacion**" en 0

2. **Refactoring**: -

3. **Resultado**:  

```java
public class Juego {
	
    public void incrementarPuntuacion(Jugador j) {
        j.incrementarPuntuacion();
    }
    
    public void decrementarPuntuacion(Jugador j) {
        j.decrementarPuntuacion();
    }
}

public class Jugador {
	private String nombre;
    private String apellido;
    private int puntuacion;
    
	public Jugador(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.puntuacion = 0;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getPuntuacion() {
		return puntuacion;
	}
	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}
	
    public void incrementarPuntuacion() {
        this.puntuacion += 100;
    }
    
    public void decrementarPuntuacion() {
    	this.puntuacion -= 50;
    }

}
```

1. **Mal Olor**: El valor de los campos nombre y apellido debe establecerse solo cuando se crea

2. **Refactoring**: Remove Setting Method
   1. El valor de un campo debe poder cambiarse solo en el constructor. Si el constructor no contiene un parámetro para establecer el valor, agregue uno. 
   2. Encuentra todas las llamadas de setter.
      1. Si una llamada de setter se encuentra justo después de una llamada para el constructor de la clase actual, mueva su argumento a la llamada del constructor y elimine el setter. 
      2. Reemplace las llamadas de setter en el constructor con acceso directo al campo.
   3. Eliminar el setter.

3. **Resultado**:

```java
public class Juego {
	
    public void incrementarPuntuacion(Jugador j) {
        j.incrementarPuntuacion();
    }
    
    public void decrementarPuntuacion(Jugador j) {
        j.decrementarPuntuacion();
    }
}

public class Jugador {
	private String nombre;
    private String apellido;
    private int puntuacion;
    
	public Jugador(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.puntuacion = 0;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getPuntuacion() {
		return puntuacion;
	}
	
	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}
	
    public void incrementarPuntuacion() {
        this.puntuacion += 100;
    }
    
    public void decrementarPuntuacion() {
    	this.puntuacion -= 50;
    }

}
```
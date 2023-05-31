### Ejercicio 2: Extensión de Frameworks

**Responda las preguntas correspondientes al ejercicio de plantillas y herencia:**

_1. ¿Qué debo hacer si aparece una nueva fuente de energía (por ejemplo, paneles solares con baterías)? ¿Cuántas y cuáles clases debo agregar en caso de querer todas las variantes de robots posibles para este nuevo tipo de fuente de energía?_

Si aparece una nueva fuente de energía (por ejemplo, paneles solares con batería) se debería crea una nueva clases que extienda de la clase abstracta **`Robot`** y en ella se deberían redefinir el metedo **`consumeBattery()`**. Luego de esta clase se extenderian las clases de los robots con el movimiento que se desee donde se redefiniria el metodo **`move()`** y por ultimo de estas se extenderian las clases de los robots con el arma que se desee donde se redefiniria el metodo **`fireArms()`**. Deberia agregar un total de 7 nuevas clases:
1. **`PanelRobot`** 
2. **`PanelOvercraftRobot`**
3. **`PanelCaterpillarRobot`**
4. **`PanelOvercraftRobotWithLasers`**
5. **`PanelOvercraftRobotWithBombs`**
6. **`PanelCaterpillarRobotWithLasers`**
7. **`PanelCaterpillarRobotWithBombs`**

_2. ¿Puedo cambiarle, a un robot existente, el sistema de armas sin tener que instanciar el robot de nuevo?_

No, no podría, si se quiere cambiar el sistema de armas de un robot existente se debería crear un nuevo robot con el sistema de armas deseado.

_3. ¿Dónde almacenaría usted el nivel de carga de la batería? ¿Qué implicaría eso si antes de disparar el láser hay que garantizar que la fuente de energía puede satisfacer el consumo del arma?_

El nivel de carga de la batería se podría almacenar en una variable de instancia de la clase **`Robot`**. Si antes de disparar el laser hay que garantizar que la fuente de energía puede satisfacer el consumo del arma, se debería crear un método que verifique que el nivel de carga de la batería sea mayor o igual al consumo del arma y que retorne un booleano. Luego en el método **`fireArms()`** se debería llamar a este método y si retorna true se dispara el arma y si retorna false no se dispara el arma. Tanto en **`PanelOvercraftRobotWithLasers`**, **`PanelCaterpilarRobotWithLasers`**, **`NuclearOvercraftRobotWithLasers`** y **`NuclearCaterpillarRobotWithLasers`**  se repetiría código que no se podria abstraer en una clase abstracta

**Responda las preguntas correspondientes al ejercicio de plantillas y composición:**

_1. ¿Qué debo hacer si aparece una nueva fuente de locomoción (por ejemplo, motor con ruedas con tracción 4x4)? ¿Cuántas y cuáles clases debo agregar en caso de querer todas las variantes de robots posibles para este nuevo tipo de sistema de locomoción?_

Si apareciese un nuevo tipo de locomoción, tracción 4x4 por ejemplo, alcanza con agregar una subclase **`FourByFourWheels`** a **`LocomotionSystems`**. La nueva clase implementará el método **`move(Robot : r)`** como corresponda.

_2. ¿Puedo cambiarle, a un robot existente, el sistema de armas sin tener que instanciar el robot de nuevo?_

Si, ahora se le puede cambiar a un robot existente el sistema de armas en ejecución sin tener que instanciar un robot de nuevo.  La clase **`Robot`** debería entender el mensaje **`setArms(Arms : a)`** para poder cambiar el sistema de armas en ejecución (como creador de framework debería proveerlo)

_3. ¿Dónde almacenaría usted el nivel de carga de la batería? ¿Qué implicaría eso si antes de disparar el láser hay que garantizar que la fuente de energía puede satisfacer el consumo del arma?_

En **`EnergySource`**, eso implica que cuando se quiera disparar el laser se tiene que mandar un mensaje a **`EnergySource`**.

**Explique las ventajas y desventajas de las dos formas de extensión del framework (herencia y composición)**

**Con herencia:**

* mas simple si tengo pocas clases
* cuando se implementan los métodos ganchos puedo acceder a las variables de instancia y al comportamiento heredado de la clase abstracta
* pueden quedar muchas clases y duplicación de código
* cambiar el comportamiento en tiempo de ejecucion implica instanciar un nuevo objeto
* mayor acoplamiento

**Con composición:**
* evita la duplicación de código y el creciente numero de clases
* al implementar los métodos gancho debo pasar como parámetro todo lo que necesiten - no tienen acceso a las variables de instancia del objeto
* puedo cambiar el comportamiento en tiempo de ejecución sin instanciar un nuevo objeto
* mejor delegación en tareas y menor acoplamiento
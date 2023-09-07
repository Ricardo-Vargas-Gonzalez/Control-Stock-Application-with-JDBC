# Control de Stock

## Notas de la Versión

### Documentación del proyecto

recuerda que En los metodos se puede realizar directamente la importación, de los controladores
por ejemplo si se agrego un java.sql.Statement es debido a que se importa directamente de java sql

#### El Statement

El objeto Statement (sentencia) sirve para procesar una sentencia SQL estática y obtener los resultados producidos por ella.
Solo puede haber un ResultSet  abierto para cada objeto Statement en un momento dado.

#### Cierre de las conexione

Siempre que se abre una conexion debe cerrarse de lo contrario la misma se continuara ejecutando inddefinidamente por medio de un ".close();"

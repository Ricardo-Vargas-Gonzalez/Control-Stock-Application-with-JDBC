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

#### SQL INJECTION

Finalmente entendí el termino, se trada de usar comandos de sql en la aplicacion desarrollada generando su fallo de manera, simple o drástica, esto puede ocurrir por errores de tipado del usuario, algo común o en los casos mas peligrosos, cuando un atacante busca el daño de la aplicación, esto puede afectar por completo el trabajop de producción, por lo que hay que ser cautelosos en lo que se permite y como se trata con estos tipos de comandos.
En el caso de java podemos tratar esta vulnerabilidad por medio de los prepareStatements que directamente convertiran cualquier intento de comando sql en los campos de la aplicación, en mero texto añadido a la tabla de MySql.
El PreparedStatement mantiene la query compilada en la base de datos, de forma parametrizada. Así el usuario puede ejecutar la misma consulta diversas veces con parámetros distintos.

#### Auto-commit

El estándar de JDBC (del driver) para manejar transacciones de base de datos es el Auto-Commit que puede ser modificado por el método setAutoCommit, de la interfaz Connection

#### Pool de conexiones

el pool de conexiones es un arreglo que permite, configurar el minimo y el maximo de conexiones, al mismo tiempo, que puede tener una base de datos, lo hace por medio de los datasource, tales como C3P0.

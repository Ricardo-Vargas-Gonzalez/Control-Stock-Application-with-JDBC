package com.alura.jdbc.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    
    public Connection recuperaConexion() throws SQLException {
        return DriverManager.getConnection(
			"jdbc:mysql://localhost/control_de_stock?useTimeZone=true&serverTimeZone=UTC",
			"root",
			"RAVGI0TReNT."
		);
    }
}
 /* Esta clase, basicamente es una fabrica de conexiones, puesto que el metodo factory(factory method) es un patrón de diseño
  * tiene como objetivo envcapsular el codigo de creación de un objeto especifico sintetizando la logica en un solo objeto
  * por lo que cada vez que se llame, será porque se quiere crear una conexcion 
  * Los objetos son creados sin exponer la lógica o las configuraciones de creación al cliente. Además, es posible referirnos al objeto recién creado utilizando una interfaz (una abstracción), desacoplando la implementación.*/
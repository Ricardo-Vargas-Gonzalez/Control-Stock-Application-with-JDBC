package com.alura.jdbc.factory;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {

    private DataSource datasource;

    public ConnectionFactory() {
        var pooledDataSource = new ComboPooledDataSource();
        pooledDataSource.setJdbcUrl("jdbc:mysql://localhost/control_de_stock?useTimeZone=true&serverTimeZone=UTC");
        pooledDataSource.setUser("root");
        pooledDataSource.setPassword("RAVGI0TReNT.");
        pooledDataSource.setMaxPoolSize(10);

        this.datasource = pooledDataSource;
    }

    public Connection recuperaConexion() throws SQLException {
        return this.datasource.getConnection();
    }
}
/*
 * Esta clase, basicamente es una fabrica de conexiones, puesto que el metodo
 * factory(factory method) es un patrón de diseño
 * tiene como objetivo envcapsular el codigo de creación de un objeto especifico
 * sintetizando la logica en un solo objeto
 * por lo que cada vez que se llame, será porque se quiere crear una conexcion
 * Los objetos son creados sin exponer la lógica o las configuraciones de
 * creación al cliente. Además, es posible referirnos al objeto recién creado
 * utilizando una interfaz (una abstracción), desacoplando la implementación.
 */
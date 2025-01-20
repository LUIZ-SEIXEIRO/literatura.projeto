package com.literalura.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseManager {

    private static final String DB_URL = "jdbc:sqlite:literalura.db";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL);
    }

    public void createTables() {
        try (Connection conn = getConnection(); Statement stmt = conn.createStatement()) {
             String sqlCreateBooks = "CREATE TABLE IF NOT EXISTS books (" +
                    "id INTEGER PRIMARY KEY," +
                    "title TEXT," +
                    "author_id INTEGER," +
                    "FOREIGN KEY (author_id) REFERENCES authors(id)" +
                    ")";
             String sqlCreateAuthors = "CREATE TABLE IF NOT EXISTS authors (" +
                     "id INTEGER PRIMARY KEY," +
                     "name TEXT" +
                     ")";
             stmt.execute(sqlCreateAuthors);
             stmt.execute(sqlCreateBooks);

            System.out.println("Tabelas criadas com sucesso.");
        } catch (SQLException e) {
             System.err.println("Erro ao criar tabelas: " + e.getMessage());
             e.printStackTrace();
        }
    }

}

package com.literalura;

import com.literalura.api.ApiConnector;
import com.literalura.database.DatabaseManager;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ApiConnector apiConnector = new ApiConnector();
        DatabaseManager databaseManager = new DatabaseManager();
        databaseManager.createTables();

        try {
            String json = apiConnector.fetchJson("https://gutendex.com/books");
            System.out.println("Resposta da API:");
            System.out.println(json);
        } catch (IOException | InterruptedException e) {
            System.err.println("Erro ao acessar a API: " + e.getMessage());
            e.printStackTrace();
        }

    }
}

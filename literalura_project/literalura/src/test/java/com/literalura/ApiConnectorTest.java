package com.literalura;

import com.literalura.api.ApiConnector;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

public class ApiConnectorTest {

    @Test
    public void testFetchJson() throws IOException, InterruptedException{
        ApiConnector apiConnector = new ApiConnector();
        String json = apiConnector.fetchJson("https://gutendex.com/books");
        assertNotNull(json);
        assertFalse(json.isEmpty());
    }

    @Test
    public void testFetchJsonInvalidURL() {
        ApiConnector apiConnector = new ApiConnector();
        assertThrows(IOException.class, () -> {
           apiConnector.fetchJson("https://gutendex.com/error_url");
       });
    }
}

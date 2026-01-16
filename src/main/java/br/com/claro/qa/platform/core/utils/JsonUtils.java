package br.com.claro.qa.platform.core.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.InputStream;

public class JsonUtils {

    private static final ObjectMapper mapper = new ObjectMapper();

    public static <T> T fromJson(String filePath, Class<T> clazz) {
        try (InputStream is = JsonUtils.class
                .getClassLoader()
                .getResourceAsStream(filePath)) {

            return mapper.readValue(is, clazz);

        } catch (Exception e) {
            throw new RuntimeException("Erro ao ler arquivo JSON: " + filePath, e);
        }
    }
}

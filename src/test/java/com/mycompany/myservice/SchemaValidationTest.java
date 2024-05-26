package com.mycompany.myservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest(
        properties = {
            "spring.jpa.hibernate.ddl-auto=validate",
            "spring.test.database.replace=none",
            "spring.datasource.url=jdbc:tc:mysql:8.2.0:///db"
        })
class SchemaValidationTest {

    @Test
    void validateJpaMappingsWithDbSchema() {}
}

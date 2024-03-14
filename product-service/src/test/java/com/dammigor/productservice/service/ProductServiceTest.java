package com.dammigor.productservice.service;

import com.dammigor.productservice.repository.ProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class ProductServiceTest {

    private final ProductRepository productRepository = Mockito.mock(ProductRepository.class);

    AutoCloseable openMocks;

    @BeforeEach
    void init() {
        openMocks = MockitoAnnotations.openMocks(this);
    }

    @Nested
    class CreateProductTests {

        @Test
        @DisplayName("Test Should Pass When Product is Successfully Created")
        void shouldCreateProductSuccessfully() {

        }
    }


}
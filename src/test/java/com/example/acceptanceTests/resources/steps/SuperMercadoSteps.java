package com.example.acceptanceTests.resources.steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class SuperMercadoSteps {

    private final String BASE_URL = "http://localhost:8080/api";
    private final RestTemplate restTemplate = new RestTemplate();
    private double totalCalculado;

    @Before
    public void setup() {
        // Inicializar el estado si es necesario
    }

    @Given("un cliente agrega los siguientes productos a la canasta")
    public void agregarProductos(io.cucumber.datatable.DataTable dataTable) {
        List<Map<String, String>> productos = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> productoData : productos) {
            Map<String, Object> producto = new HashMap<>();
            producto.put("id", Long.parseLong(productoData.get("id")));
            producto.put("nombre", productoData.get("nombre"));
            producto.put("precio", Double.parseDouble(productoData.get("precio")));

            restTemplate.postForEntity(BASE_URL + "/carrito/agregar", producto, String.class);
        }
    }

    @When("calcula el precio total")
    public void calcularTotal() {
        ResponseEntity<Double> response = restTemplate.getForEntity(BASE_URL + "/carrito/total", Double.class);
        totalCalculado = response.getBody();
    }

    @Then("el total es {string}")
    public void verificarTotal(String totalEsperado) {
        assertEquals(Double.parseDouble(totalEsperado), totalCalculado);
    }

//    Carrito carrito = new Carrito();
//
//    @Given("un cliente agrega los siguientes productos a la canasta")
//    public void AgregarProductos(DataTable dataTable) {
//        List<Map<String, String>> productos = dataTable.asMaps();
//        productos.forEach(p -> {
//            System.out.println(p);
//            carrito.getProductos().add(new Producto(Long.parseLong(p.get("id")), p.get("nombre"), Long.parseLong(p.get("precio"))));
//        });
//    }
}

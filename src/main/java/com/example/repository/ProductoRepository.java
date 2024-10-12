package com.example.repository;

import com.example.model.Producto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductoRepository {
    private List<Producto> productos = new ArrayList<>();

    public ProductoRepository() {
        productos.add(new Producto(1L, "Manzana", 1.5));
        productos.add(new Producto(2L, "Banana", 1.0));
        productos.add(new Producto(3L, "Leche", 2.5));
        productos.add(new Producto(4L, "Pan", 1.2));
        productos.add(new Producto(5L, "Queso", 3.0));
        productos.add(new Producto(6L, "Huevos", 2.0));
        productos.add(new Producto(7L, "Pollo", 5.5));
        productos.add(new Producto(8L, "Carne de res", 8.0));
        productos.add(new Producto(9L, "Arroz", 1.0));
        productos.add(new Producto(10L, "Pasta", 1.3));
        productos.add(new Producto(11L, "Tomate", 2.0));
        productos.add(new Producto(12L, "Cebolla", 1.1));
        productos.add(new Producto(13L, "Pimiento", 1.5));
        productos.add(new Producto(14L, "Zanahoria", 0.8));
        productos.add(new Producto(15L, "Café", 4.5));
        productos.add(new Producto(16L, "Té", 3.0));
        productos.add(new Producto(17L, "Azúcar", 1.5));
        productos.add(new Producto(18L, "Sal", 0.5));
        productos.add(new Producto(19L, "Fideos", 2.0));
        productos.add(new Producto(20L, "Vinagre", 2.5));
        productos.add(new Producto(21L, "Cereal", 3.5));
        productos.add(new Producto(22L, "Harina", 1.2));
        productos.add(new Producto(23L, "Galletas", 2.0));
        productos.add(new Producto(24L, "Chocolate", 3.5));
        productos.add(new Producto(25L, "Jugo de naranja", 2.5));
        productos.add(new Producto(26L, "Refresco", 1.5));
        productos.add(new Producto(27L, "Agua mineral", 1.0));
        productos.add(new Producto(28L, "Yogur", 2.2));
        productos.add(new Producto(29L, "Helado", 4.0));
        productos.add(new Producto(30L, "Salsa Lista", 2.0));
        productos.add(new Producto(31L, "Mermelada", 2.3));
        productos.add(new Producto(32L, "Atún en lata", 2.0));
        productos.add(new Producto(33L, "Sardinas", 1.7));
        productos.add(new Producto(34L, "Garbanzos", 1.2));
        productos.add(new Producto(35L, "Lentejas", 1.1));
        productos.add(new Producto(36L, "Frijoles", 1.3));
        productos.add(new Producto(37L, "Chorizo", 3.0));
        productos.add(new Producto(38L, "Jabón de lavar", 2.5));
        productos.add(new Producto(39L, "Detergente", 3.5));
        productos.add(new Producto(40L, "Suavizante", 2.8));
        productos.add(new Producto(41L, "Papel higiénico", 4.5));
        productos.add(new Producto(42L, "Toallas de papel", 2.5));
        productos.add(new Producto(43L, "Champú", 3.0));
        productos.add(new Producto(44L, "Acondicionador", 2.5));
        productos.add(new Producto(45L, "Crema dental", 2.0));
        productos.add(new Producto(46L, "Desodorante", 3.0));
        productos.add(new Producto(47L, "Rastrillos", 2.0));
        productos.add(new Producto(48L, "Pilas", 3.5));
        productos.add(new Producto(49L, "Papel aluminio", 1.8));
        productos.add(new Producto(50L, "Plástico para envolver", 1.7));
        productos.add(new Producto(51L, "Servilletas", 2.2));
        productos.add(new Producto(52L, "Velas", 1.5));
        productos.add(new Producto(53L, "Encendedores", 1.0));
        productos.add(new Producto(54L, "Café instantáneo", 3.0));
        productos.add(new Producto(55L, "Te negro", 1.8));
        productos.add(new Producto(56L, "Gelatina", 0.9));
        productos.add(new Producto(57L, "Tortillas", 1.5));
        productos.add(new Producto(58L, "Salsa de tomate", 1.2));
        productos.add(new Producto(59L, "Mayonesa", 2.0));
        productos.add(new Producto(60L, "Mostaza", 1.5));
        productos.add(new Producto(61L, "Salsa BBQ", 2.5));
        productos.add(new Producto(62L, "Ketchup", 2.2));
        productos.add(new Producto(63L, "Pimienta", 1.2));
        productos.add(new Producto(64L, "Orégano", 1.0));
        productos.add(new Producto(65L, "Comino", 0.8));
        productos.add(new Producto(66L, "Pimienta roja", 1.0));
        productos.add(new Producto(67L, "Hierbas italianas", 1.5));
        productos.add(new Producto(68L, "Curry", 1.7));
        productos.add(new Producto(69L, "Papas fritas", 2.0));
        productos.add(new Producto(70L, "Nachos", 1.8));
        productos.add(new Producto(71L, "Salsa para nachos", 2.5));
        productos.add(new Producto(72L, "Leche condensada", 1.5));
        productos.add(new Producto(73L, "Leche evaporada", 1.7));
        productos.add(new Producto(74L, "Manteca", 2.0));
        productos.add(new Producto(75L, "Aceite de girasol", 3.0));
        productos.add(new Producto(76L, "Aceite de coco", 5.0));
        productos.add(new Producto(77L, "Ajo", 0.9));
        productos.add(new Producto(78L, "Jengibre", 1.0));
        productos.add(new Producto(79L, "Limón", 0.7));
        productos.add(new Producto(80L, "Fresas", 2.5));
        productos.add(new Producto(81L, "Mango", 1.8));
        productos.add(new Producto(82L, "Piña", 2.2));
        productos.add(new Producto(83L, "Durazno", 1.5));
        productos.add(new Producto(84L, "Albaricoque", 1.7));
        productos.add(new Producto(85L, "Ciruela", 2.0));
        productos.add(new Producto(86L, "Frambuesas", 3.0));
        productos.add(new Producto(87L, "Arándanos", 2.8));
        productos.add(new Producto(88L, "Nueces", 5.0));
        productos.add(new Producto(89L, "Almendras", 4.5));
        productos.add(new Producto(90L, "Cacahuates", 2.5));
        productos.add(new Producto(91L, "Pasas", 1.8));
        productos.add(new Producto(92L, "Semillas de girasol", 2.0));
        productos.add(new Producto(93L, "Avena", 1.5));
        productos.add(new Producto(94L, "Galletas saladas", 1.7));
        productos.add(new Producto(95L, "Crackers", 2.0));
        productos.add(new Producto(96L, "Pastelitos", 2.8));
        productos.add(new Producto(97L, "Tarta de manzana", 3.5));
        productos.add(new Producto(98L, "Muffins", 2.5));
        productos.add(new Producto(99L, "Brownies", 3.0));
        productos.add(new Producto(100L, "Cupcakes", 3.0));
    }

    public List<Producto> findAll() {
        return productos;
    }

    public Producto findById(Long id) {
        return productos.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }

    public Producto save(Producto producto) {
        producto.setId((long) (productos.size() + 1));
        productos.add(producto);
        return producto;
    }
}

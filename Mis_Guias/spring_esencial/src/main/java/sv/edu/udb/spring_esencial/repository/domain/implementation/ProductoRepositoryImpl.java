package sv.edu.udb.spring_esencial.repository.domain.implementation;

import sv.edu.udb.spring_esencial.repository.ProductoRepository;
import sv.edu.udb.spring_esencial.repository.domain.Producto;

import java.util.random.RandomGenerator;

public class ProductoRepositoryImpl implements ProductoRepository {
    @Override
    public Producto guardarProducto(final String nombre, final Double precio) {
        return new Producto(RandomGenerator.of("Random").nextInt(), nombre, precio);
    }
}

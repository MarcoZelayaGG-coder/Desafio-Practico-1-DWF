package sv.edu.udb.spring_esencial.repository.domain;

import java.util.List;

    public class Proveedor {
        private String nombre;
        private Integer id;
        private List<Producto> productosOfrecidos;

        public Proveedor(final Integer id, final String nombre, final List<Producto> productosOfrecidos)
        {
            this.id = id;
            this.nombre = nombre;
            this.productosOfrecidos = productosOfrecidos;
        }

        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public Integer getId() {
            return id;
        }
        public void setId(Integer id) {
            this.id = id;
        }
        public List<Producto> getProductosOfrecidos() {
            return productosOfrecidos;
        }
        public void setProductosOfrecidos(List<Producto> productosOfrecidos) {
            this.productosOfrecidos = productosOfrecidos;
        }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Menu {

    private Scanner teclado;
    private List<Libro> catalogoLibros;
    private List<Usuario> registroUsuarios;

    public Menu() {
        teclado = new Scanner(System.in);
        catalogoLibros = new ArrayList<>();
        registroUsuarios = new ArrayList<>();
    }

    public void mostrarMenu() {
        String opcion = null;

        do {
            System.out.println("Catálogo de libros");
            System.out.println("1. Añadir un libro");
            System.out.println("2. Ver todo el catálogo");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            opcion = teclado.nextLine();

            switch(opcion) {
                case "1":
                    anadirLibro();
                    break;
                case "2":
                    anadirLibro();
                    break;
            }
        } while (!opcion.equals("3"));
    }

    public void anadirLibro() {
        System.out.print("Título: ");
        String titulo = teclado.nextLine();
        System.out.print("Autor: ");
        String autor = teclado.nextLine();
        System.out.print("Editorial: ");
        String editorial = teclado.nextLine();
        System.out.print("Número de páginas: ");
        int numeroPaginas = Integer.parseInt(teclado.nextLine());
        System.out.print("Precio: ");
        float precio = Float.parseFloat(teclado.nextLine());

        Libro libro = new Libro(titulo.trim(), autor.trim(), editorial.trim(), numeroPaginas, precio);
        catalogoLibros.add(libro);
    }

    public void verCatalogo() {
        for (Libro libro : catalogoLibros) {
            System.out.println(libro.getTitulo());
            System.out.println(libro.getAutor());
            System.out.println(libro.getEditorial());
        }
    }

    public void anadirUsuario() {
        System.out.print("Username: ");
        String username = teclado.nextLine();
        System.out.print("Password: ");
        String password = teclado.nextLine();
        System.out.print("Direccion: ");
        String direccion = teclado.nextLine();
        System.out.print("Email: ");
        String email = teclado.nextLine();
        System.out.print("Teléfono: ");
        String telefono = teclado.nextLine();
        Usuario usuario = new Usuario(username.trim(), password.trim(), direccion.trim(), email.trim(), telefono.trim());
        registroUsuarios.add(usuario);
    }

    public void verRegistroUsuarios() {
        for (Usuario usuario : registroUsuarios) {
            System.out.println(usuario.getUsername());
            System.out.println(usuario.getPassword());
            System.out.println(usuario.getDireccion());
            System.out.println(usuario.getEmail());
            System.out.println(usuario.getTelefono());
        }
    }
}

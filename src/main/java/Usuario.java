public class Usuario {
    private String username;
    private String password;
    private String direccion;
    private String email;
    private String telefono;

    public Usuario(){}

    public Usuario(String username, String password, String adress, String email, String telefono){
        this.username = username;
        this.password = password;
        this.direccion = adress;
        this.email = email;
        this.telefono = telefono;

    }

    public String getUsername() {return username;}

    public void setUsername(String username) {this.username = username;}

    public String getPassword() {return password;}

    public void setPassword(String password) {this.password = password;}

    public String getDireccion() {return direccion;}

    public void setDireccion(String adress) {this.direccion = adress;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public String getTelefono() {return telefono;}

    public void setTelefono(String telephone) {this.telefono = telefono;}
}

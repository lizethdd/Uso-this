
 class Persona {
    String nombre, apellido;

    public Persona(String nombre, String apellido) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Accedamos a persona usando this: "+this);
        new Imprimir().Imprimir(this);
    }
    
    
}

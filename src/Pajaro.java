public class Pajaro
{
  String nombre;
  int damage;
  public Pajaro(String nombre, int damage)
  {
    this.nombre = nombre;
    this.damage = damage;
  }

  public void lanzar()
  {
    System.out.println("Lanzando a " + nombre);
  }
}

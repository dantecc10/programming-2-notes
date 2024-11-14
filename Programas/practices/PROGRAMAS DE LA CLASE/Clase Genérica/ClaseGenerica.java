/*
 Existen una serie de convenciones para nombrar a los genéricos:
     E – Element (usado bastante por Java Collections Framework)
     K – Key (Llave, usado en mapas)
     N – Number (para números)
     T – Type (Representa un tipo, es decir, una clase)
     V – Value (representa el valor, también se usa en mapas)
     S,U,V etc. – usado para representar otros tipos.
 */

public class ClaseGenerica<T,V> {
  T obj;
  V var;
 
  public ClaseGenerica(T o, V v) {
    obj = o;
    var = v;
  }
 
  public void classType() {
    System.out.println("El tipo de T es " + obj.getClass().getName());
    System.out.println("El tipo de V es " + var.getClass().getName());
  }
  
  public void opera(V v1) {
	  if (v1.equals(var))
		  System.out.println("Son iguales");
	  else
		  System.out.println("Son diferentes");
  }
}

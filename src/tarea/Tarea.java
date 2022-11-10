/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea;

/**
 *
 * @author Administrator
 */
public class Tarea {

  public static void main(String[] args) {
    int a = 1;
    int b = 2;
    int c = 3;
    
    int resultado = suma(a, b, c);
    
    System.out.println("El resultado es: " + resultado);
  }
  
  public static int suma(int a, int b, int c) {
    return a + b + c;
  }
}

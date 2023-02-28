package view;

import Controller.Fibonacci;

public class Principal {

public static void main( String[] args){

Fibonacci cont = new Fibonacci();

int num = 9;

int resultado = cont.Fibo(num);

System.out.println(resultado);
}
}
package Controller;

public class Fibonacci {

public Fibonacci() {

super();
}
//ponto de parada
public int Fibo(int num) {
if (num == 1 || num == 2) {
return 1;
}
//função do termo anterior

return Fibo(num - 2 )+Fibo(num-1);

}
}
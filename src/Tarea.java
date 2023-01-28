public class Tarea
{
    public static void main(String[] args) {

        /*
        Primera parte:
        -Crear una función con tres parámetros que sean números que se suman entre sí.
        -Llamar a la función en el main y darle valores.
         */

        sumar(7,3,8);


        /*
        Segunda parte:
         -Crear una clase coche.
         -Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
         -Una función que incremente el número de puertas que tiene el coche.
         -Crear un objeto miCoche en el main y añadirle una puerta.
         -Mostrar el número de puertas que tiene el objeto.
         */



        Coche miCoche = new Coche();

        miCoche.incrementarPuertas(5);

        System.out.println("Cantidad de puertas:" + miCoche.numero_puertas);



    }


    public static int sumar(int a,int b, int c)
    {
        return a+b+c;
    }


}

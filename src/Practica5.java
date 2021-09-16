public class Practica5
{
    public static void main(String[] args)
    {
        Blues blue = new Blues();
        Bomb bomb = new Bomb();
        Chuck chuck = new Chuck();
        Pajaro[] pajaros = {blue, bomb, chuck};

        int opcion;
        do {
            System.out.println("--------------------Aves--------------------");
            System.out.println("1. Blue");
            System.out.println("2. Bomb");
            System.out.println("3. Chuck");
            System.out.println("4. Salir");
            opcion = CapturaEntrada.capturarEntero("Elija a su ave");
            switch (opcion)
            {
                case 1:
                    blue.lanzar();
                    blue.dividirse();
                    break;
                case 2:
                    bomb.lanzar();
                    bomb.explotar();
                    break;
                case 3:
                    chuck.lanzar();
                    chuck.acelerar();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while(opcion != 4);


    }

}

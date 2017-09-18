public class Test
{
    public static void main(String[] args) {
        Dlugopis dlugopis1 = new Dlugopis("Czarny", "Czarny", 12.5, 90);
        Dlugopis dlugopis2 = new Dlugopis("Błękitny", "Granatowy", 15.0, 130);

//        dlugopis1.kolor= "Czarny";
//        dlugopis1.kolorAtramentu= "Czarny";
//        dlugopis1.dlugosc= 12.5;
//        dlugopis1.waga= 90;

        System.out.println(dlugopis1.kolor);
        System.out.println(dlugopis1.kolorAtramentu);
        System.out.println(dlugopis1.dlugosc);
        System.out.println(dlugopis1.waga );

        System.out.println("\n");

//        dlugopis2.kolor= "Błekitny";
//        dlugopis2.kolorAtramentu= "Granatowy";
//        dlugopis2.dlugosc= 15.0;
//        dlugopis2.waga= 130;
        System.out.println(dlugopis2.kolor);
        System.out.println(dlugopis2.kolorAtramentu);
        System.out.println(dlugopis2.dlugosc);
        System.out.println(dlugopis2.waga);



    }
}

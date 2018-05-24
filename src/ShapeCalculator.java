class ShapeCalculator {
    public static void main(String[] args) {

        Kolo kolo = new Kolo();
        kolo.koloPole(10); {

            System.out.println("Pole kola: " + kolo.koloPole(10));
        }

        Kwadrat kwadrat = new Kwadrat();
        kwadrat.kwadratPole(10); {

            System.out.println("Pole kwadratu: " + kwadrat.kwadratPole(10));
        }

        Prostokat prostokat = new Prostokat();
        prostokat.prostokatObwod(10,20); {
            System.out.println("Obwod prostokata: " + prostokat.prostokatObwod(10,20));
        }

        Trojkat trojkat = new Trojkat();
        trojkat.trojkatObwod(10,20,30); {
            System.out.println("Obwod Trojkata: " + trojkat.trojkatObwod(10,20,30));
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyList<Integer> liste = new MyList<>(30);
        System.out.println("Liste : " + (liste.isEmpty() ));
        liste.add(80);
        liste.add(20);
        liste.add(10);
        liste.add(30);
        liste.add(20);
        liste.add(50);
        liste.add(60);
        liste.add(70);

        System.out.println("Liste : " + (liste.isEmpty()));

        System.out.println("Indeks : " + liste.indexOf(20));

        System.out.println("Indeks :" + liste.indexOf(100));

        System.out.println("Indeks : " + liste.lastIndexOf(20));

        Object[] dizi = liste.toArray();
        System.out.println("Object dizisinin ilk elemanı :" + dizi[0]);

        MyList<Integer> altListem = liste.subList(0, 3);
        System.out.println(altListem.toString());


        System.out.println("Listedeki 10 değeri : " + liste.contains(10));
        System.out.println("Listedeki 80 değeri : " + liste.contains(80));


        liste.clear();
        System.out.println(liste);

    }

}

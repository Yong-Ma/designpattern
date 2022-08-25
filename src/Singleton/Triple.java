package Singleton;

/**
 * @ClassName Triple
 * @description:
 * @author: mzy
 * @create: 2022-08-09 23:21
 * @Version 1.0
 **/
public class Triple {

    private int id;

    private Triple(int id) {
        System.out.println("Triple实例化,id为" + id);
        this.id = id;
    }

    private static Triple[] triple = new Triple[]{
        new Triple(0),
        new Triple(1),
        new Triple(2),
    };
    public static Triple getInstance(int id) {
        return triple[id];
    }

    public static void main(String[] args) {
        Triple triple1 = Triple.getInstance(0);
        Triple triple2 = Triple.getInstance(1);
        Triple triple3 = Triple.getInstance(2);
        Triple triple4 = Triple.getInstance(2);
        System.out.println(triple1 == triple2);
        System.out.println(triple1 == triple3);
        System.out.println(triple2 == triple3);
        System.out.println(triple3 == triple4);
    }
}

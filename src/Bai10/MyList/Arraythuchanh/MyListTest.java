package Bai10.MyList.Arraythuchanh;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInterger = new MyList<>();
        listInterger.add(1) ;
        listInterger.add(2) ;
        listInterger.add(3) ;
        listInterger.add(4) ;
        System.out.println("element 3: " +listInterger.get(3));
        System.out.println("element 2 :" + listInterger.get(2));

        listInterger.get(-1);


    }
}

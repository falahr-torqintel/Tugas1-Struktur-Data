import java.util.LinkedList;

public class tugas1 {

  public static void main(String[] args){


    int StrukturBaris = 10;

    String KataBaru = "Falah";

    int[] empatAngka = {5, 10, 20, 99};

    String[][] Angka = {
      {"05", "3", "5"},
      {"14", "19", "20"},
      {"22", "27", "99"}
      
    };


    LinkedList<Integer> listAngka = new LinkedList<>();
    listAngka.add(5);
    listAngka.add(19);
    listAngka.add(44);
    listAngka.add(60);
    listAngka.add(99);


    System.out.println("StrukturBaru: " + StrukturBaris );
    System.out.println("KataBaru: " + KataBaru);
    System.out.println("array 1d empatAngka[0]:  " + empatAngka[0]);
    System.out.println("array 2d:  " + Angka[0][0]);
    System.out.println("LinkedList: " + listAngka);


    


    
  }
}
compas-cyber@compas-serv

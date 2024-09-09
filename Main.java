import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Fino a che numero vuoi sapere i numeri primi?");
    int n = s.nextInt();
    List<Integer> numeriPrimi = nPrimi(n);
    System.out.println(numeriPrimi);
    
  }
  public static List<Integer> nPrimi(int x) {
    List<Integer> lista = new ArrayList<Integer>(List.of(2));
    // System.out.println(lista);
    for(int i = 3; i <= x; i++){
      
      for(int j = 0; j < lista.size() && i % lista.get(j) != 0; j++){
        if(j == lista.size() - 1){
            lista.add(i);
            break;
          }
        }
      
      }
    return lista;
  }
}
package desafioexe;

import java.util.ArrayList;
import java.util.List;


public class Desafio {

    public static List<Integer> fibonacci() {
        List<Integer> fibonacciList = new ArrayList<>();

        fibonacciList.add(0,0);
        fibonacciList.add(1,1);

        for (int i = 2; ; i++) {
            int lastNum;
            int penulNum;
            lastNum = fibonacciList.get(i - 1);
            penulNum = fibonacciList.get(i - 2);
                if (fibonacciList.get(i)>350){
                    break;}
            fibonacciList.add(i,lastNum + penulNum);

     System.out.println(fibonacciList);
        }
      return fibonacciList;

    }

    public static void main (String[] args){

    }
}
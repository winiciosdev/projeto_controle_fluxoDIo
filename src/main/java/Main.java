import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner l = new Scanner(System.in);

    //aqui solicito que o usuario insira dois números inteiros para o inicio do programa//


    System.out.println("por favor, insira o primeiro número");
    String input1 = l.nextLine();

    System.out.println("agora por favor insira o segundo número");
    String input2 = l.nextLine();
    System.out.println("imprimindo os números inseridos... ");

    try{

      //aqui estou convertendo os valores inseridos pelo usuario como String para inteiros//
      int num1 = Integer.parseInt(input1);
      int num2 = Integer.parseInt(input2);

      if(num1 >= num2){
        throw new ParametrosInvalidosException("O primeiro número deve ser menor que o segundo");
      }

    //esse vai ser o laço de repetição que vai imprimir os números entre os dois números inseridos pelo usuário//
      for(int i = num1; i <= num2; i++){
        System.out.println(i);
        
      }
    }catch (NumberFormatException e){
      System.out.println("por favor insira dois nùmeroscompativeis e inteiros. ");
    }catch(ParametrosInvalidosException e){
      System.out.println(e.getMessage());
    }


    }
  }

import java.util.Scanner;

class TelaAtendimento {

  private int faixaEtaria;

  private void setFaixaEtaria(int idade) {

    if (idade < 20)

      faixaEtaria = 1;
    else if (idade > 60)
      faixaEtaria = 3;
    else
      faixaEtaria = 2;

  }

  public boolean executar() {
    digaoi();
    digatchau();
    return true;
  }

  private void digaoi() {

    Regra regra = new Regra();
    String temp = regra.getMessageRecepcao();
    System.out.println(temp);

    Scanner entrada = new Scanner(System.in);
    System.out.print("Qual sua Idade: ");
    int idade = entrada.nextInt();

    setFaixaEtaria(idade);
  }

  private void digatchau() {

    String msgDespedida;
    Regra regra = new Regra();
    msgDespedida = regra.getMessageDespedida(faixaEtaria);

    System.out.println(msgDespedida);

  }

}
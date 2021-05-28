import java.util.Date;
import java.text.SimpleDateFormat;

class Regra {

  public String getMessageRecepcao() {
    System.currentTimeMillis();

    String message;

    Configuracao configuracao = new Configuracao();
    int hora = configuracao.getHoraRef();

    if (hora < 12)
      message = "BOM DIA World";
    else if (hora > 18)
      message = "BOA NOITE World";

    else
      message = "BOA TARDE World";

    return message;
  }

  public String getMessageDespedida(int faixaEtaria) {

    String msg = "(falha) tchau padrao: faixa nao identificada";

    if (faixaEtaria == 1)
      msg = "Valeu! T+ bro!";
    if (faixaEtaria == 2)
      msg = "Tudo de bom. Até a próxima";
    if (faixaEtaria == 3)
      msg = "Até logo, nobre SR(A)";

    return msg;

  }
}
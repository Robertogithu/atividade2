import java.util.Date;
import java.text.SimpleDateFormat;

class Configuracao {

  public int getHoraRef() {

    Date momento1 = new Date();
    SimpleDateFormat mascara1 = new SimpleDateFormat("H");
    String HoraRef = mascara1.format(momento1);
    int horaRef = Integer.parseInt(HoraRef);

    horaRef = horaRef - 3;
    if (horaRef <= 0)
      horaRef = horaRef + 24;

     
    return horaRef;
  }
}
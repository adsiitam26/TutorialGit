package mx.com.itam.adsi.ejercicio;

import org.apache.log4j.Logger;

public class Principal{
  private final static Logger LOG = Logger.getLogger(Principal.class);

  public static void main(String...argv) {
    Principal p = new Principal();
    LOG.info("Conversión de fff1: " + p.toArabic("fff1","0123456789abcdef"));
  }
  public int toArabic(String source, String alphabet) {
    int res = 0;
    for(char c : source.toCharArray())
      res = res*(alphabet.length()) + alphabet.indexOf(c);
    return res;
  }
  /**
   * Convertimos un String en su equivalencia en ASCII-binario
   * @param  src String que queremos convertir
   * @return     String con la representación de src en ASCII-binario
   */
  public String string2Binary(String src){
    String res = "";

    for (int i=0; i<src.length; i++) {
      res += Integer.toBinaryString(src.charAt( i ));
    }

    return res;
  }
}

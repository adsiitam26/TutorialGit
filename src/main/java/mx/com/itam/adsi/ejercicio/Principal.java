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
   * Convierte un String a su suma en ASCII
   * @param  src String (o suma de char's) que se quiere transformar
   * @return     Suma de cada caracter del String en ASCII
   */
  public int string2AsciiInt(String src){
    int res = 0;
    for (int i=0; i<src.length; i++) {
      res += src.charAt(i);
    }

    return res;
  }
}

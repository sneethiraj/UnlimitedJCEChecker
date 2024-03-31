
package com.infotekies.java.security;

/**
* Created by sneethiraj on 3/14/16.
*/

import java.text.NumberFormat;

import javax.crypto.Cipher;

public class UnlimitedJCEChecker {

  public static void main(String args[]) {
    final String CIPHER_ALGO = "AES";
    NumberFormat nf = NumberFormat.getInstance();
    try {
      int maxKeyLen = Cipher.getMaxAllowedKeyLength(CIPHER_ALGO);
      boolean isJCEInstalled = (maxKeyLen > 128) ;
      
      StringBuffer sb = new StringBuffer() ;
      
      if (isJCEInstalled) {
        sb.append("UnlimitedJCE is available.")  ;
      }
      else {
        sb.append("UnlimitedJCE is NOT available.") ;
      }
      sb.append("\n") ;
      
      sb.append("{").append(CIPHER_ALGO).append("}").append(" - ") ;
      sb.append("Max KeyLength: [").append(nf.format(maxKeyLen)).append("]").append("\n") ;
      
      System.out.println(sb.toString());
    } catch (Exception e) {
      throw new RuntimeException("Exception in finding maxLength for algorithm {" + CIPHER_ALGO + "}", e);
    }
  }
}

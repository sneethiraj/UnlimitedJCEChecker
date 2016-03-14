package com.infotekies.java.security;/**
 * Created by sneethiraj on 3/14/16.
 */

import javax.crypto.Cipher;

public class UnlimitedJCEChecker {

    public static void main(String args[]) {
        String algorithm = "AES" ;
        try {
            Cipher cipher = Cipher.getInstance(algorithm) ;
            int maxKeyLen = Cipher.getMaxAllowedKeyLength(algorithm);
            String msg = (maxKeyLen > 128) ? "Yes: UnlimitedJCE available." : "No: UnlimitedJCE not available." ;
            System.out.println( msg + " {" + algorithm + "} Max KeyLength: [" + maxKeyLen + "]");
        } catch (Exception e){
          throw new RuntimeException("Exception in finding maxLength for algorithm {" + algorithm + "}" , e) ;
        }
    }
}

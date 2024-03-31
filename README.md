# UnlimitedJCEChecker

First check if you can find out via running, isJCEInstalled script

$ ./isJCEInstalled

If the script works without any issue, you shoud see some results like
==========>
+ echo 'System.out.println("Is JCE Installed ? " + (javax.crypto.Cipher.getMaxAllowedKeyLength("AES") > 128)) ;'
+ jshell -
Is JCE Installed ? true
==========>
Then, you do not need to do any build and test.

# For build of UnlimitedJCEChecker

mvn package

# For running of UnlimitedJCEChecker

mvn test

# requestSSL

用jdk產生憑證
keytool -genkey -alias domain -storetype PKCS12 -keyalg RSA -keysize 2048 -keystore tomcat.p12 -validity 3650
將p12轉成jks
keytool -importkeystore -srckeystore tomcat.p12 -srcstoretype PKCS12 -deststoretype JKS -destkeystore tomcat.jks
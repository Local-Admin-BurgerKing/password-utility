package com.niton.localadmin.pwdutil;

import com.niton.localadmin.core.util.PasswordEncryptor;
import com.niton.media.crypt.SimpleAES;
import com.niton.media.crypt.SimpleCluster;
import com.niton.media.crypt.SimpleRSA;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import java.io.UnsupportedEncodingException;
import java.security.*;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;
import java.util.Scanner;

public class Launcher {

    public static void main(String[] args) throws GeneralSecurityException, UnsupportedEncodingException {
        System.out.println("Password to encrypt :");
        Scanner s = new Scanner(System.in);
        String pwd = args.length > 0 ? args[0]:s.nextLine();
        String encrypted = PasswordEncryptor.encrypt(pwd);
        System.out.println("-> "+encrypted);
    }

}

package p287q;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes.dex */
abstract class i {

    private static class a {
        @NonNull
        static KeyGenParameterSpec a(@NonNull KeyGenParameterSpec.Builder builder) {
            return builder.build();
        }

        @NonNull
        static KeyGenParameterSpec.Builder b(@NonNull String str, int i10) {
            return new KeyGenParameterSpec.Builder(str, i10);
        }

        static void c(@NonNull KeyGenerator keyGenerator, @NonNull KeyGenParameterSpec keyGenParameterSpec) throws InvalidAlgorithmParameterException {
            keyGenerator.init(keyGenParameterSpec);
        }

        static void d(@NonNull KeyGenParameterSpec.Builder builder) {
            builder.setBlockModes("CBC");
        }

        static void e(@NonNull KeyGenParameterSpec.Builder builder) {
            builder.setEncryptionPaddings("PKCS7Padding");
        }
    }

    private static class b {
        @NonNull
        static BiometricPrompt.CryptoObject a(@NonNull Signature signature) {
            return new BiometricPrompt.CryptoObject(signature);
        }

        @NonNull
        static BiometricPrompt.CryptoObject b(@NonNull Cipher cipher) {
            return new BiometricPrompt.CryptoObject(cipher);
        }

        @NonNull
        static BiometricPrompt.CryptoObject c(@NonNull Mac mac) {
            return new BiometricPrompt.CryptoObject(mac);
        }

        static Cipher d(@NonNull BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getCipher();
        }

        static Mac e(@NonNull BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getMac();
        }

        static Signature f(@NonNull BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getSignature();
        }
    }

    private static class c {
        @NonNull
        static BiometricPrompt.CryptoObject a(@NonNull IdentityCredential identityCredential) {
            return new BiometricPrompt.CryptoObject(identityCredential);
        }

        static IdentityCredential b(@NonNull BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getIdentityCredential();
        }
    }

    static f.c a() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            KeyGenParameterSpec.Builder builderB = a.b("androidxBiometric", 3);
            a.d(builderB);
            a.e(builderB);
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            a.c(keyGenerator, a.a(builderB));
            keyGenerator.generateKey();
            SecretKey secretKey = (SecretKey) keyStore.getKey("androidxBiometric", null);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(1, secretKey);
            return new f.c(cipher);
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException e10) {
            Log.w("CryptoObjectUtils", "Failed to create fake crypto object.", e10);
            return null;
        }
    }

    static f.c b(BiometricPrompt.CryptoObject cryptoObject) {
        IdentityCredential identityCredentialB;
        if (cryptoObject == null) {
            return null;
        }
        Cipher cipherD = b.d(cryptoObject);
        if (cipherD != null) {
            return new f.c(cipherD);
        }
        Signature signatureF = b.f(cryptoObject);
        if (signatureF != null) {
            return new f.c(signatureF);
        }
        Mac macE = b.e(cryptoObject);
        if (macE != null) {
            return new f.c(macE);
        }
        if (Build.VERSION.SDK_INT < 30 || (identityCredentialB = c.b(cryptoObject)) == null) {
            return null;
        }
        return new f.c(identityCredentialB);
    }

    static f.c c(d1.a.e eVar) {
        if (eVar == null) {
            return null;
        }
        Cipher cipherA = eVar.a();
        if (cipherA != null) {
            return new f.c(cipherA);
        }
        Signature signatureC = eVar.c();
        if (signatureC != null) {
            return new f.c(signatureC);
        }
        Mac macB = eVar.b();
        if (macB != null) {
            return new f.c(macB);
        }
        return null;
    }

    static BiometricPrompt.CryptoObject d(f.c cVar) {
        IdentityCredential identityCredentialB;
        if (cVar == null) {
            return null;
        }
        Cipher cipherA = cVar.a();
        if (cipherA != null) {
            return b.b(cipherA);
        }
        Signature signatureD = cVar.d();
        if (signatureD != null) {
            return b.a(signatureD);
        }
        Mac macC = cVar.c();
        if (macC != null) {
            return b.c(macC);
        }
        if (Build.VERSION.SDK_INT < 30 || (identityCredentialB = cVar.b()) == null) {
            return null;
        }
        return c.a(identityCredentialB);
    }

    static d1.a.e e(f.c cVar) {
        if (cVar == null) {
            return null;
        }
        Cipher cipherA = cVar.a();
        if (cipherA != null) {
            return new d1.a.e(cipherA);
        }
        Signature signatureD = cVar.d();
        if (signatureD != null) {
            return new d1.a.e(signatureD);
        }
        Mac macC = cVar.c();
        if (macC != null) {
            return new d1.a.e(macC);
        }
        if (Build.VERSION.SDK_INT >= 30 && cVar.b() != null) {
            Log.e("CryptoObjectUtils", "Identity credential is not supported by FingerprintManager.");
        }
        return null;
    }
}

package Xc;

import Wc.g;
import android.content.Context;
import android.util.Base64;
import expo.modules.securestore.SecureStoreOptions;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f16252d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f16253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Xc.a f16254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SecureRandom f16255c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public b(Context mContext, Xc.a mAESEncryptor) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(mAESEncryptor, "mAESEncryptor");
        this.f16253a = mContext;
        this.f16254b = mAESEncryptor;
        this.f16255c = new SecureRandom();
    }

    private final Cipher e() throws NoSuchPaddingException, NoSuchAlgorithmException {
        Cipher cipher = Cipher.getInstance("RSA/None/PKCS1Padding");
        Intrinsics.checkNotNullExpressionValue(cipher, "getInstance(...)");
        return cipher;
    }

    @Override // Xc.c
    public String a(SecureStoreOptions options, boolean z10) {
        Intrinsics.checkNotNullParameter(options, "options");
        String str = z10 ? "keystoreAuthenticated" : "keystoreUnauthenticated";
        return b(options) + ":" + str;
    }

    @Override // Xc.c
    public String b(SecureStoreOptions options) {
        Intrinsics.checkNotNullParameter(options, "options");
        return "RSA/None/PKCS1Padding:" + options.getKeychainService();
    }

    public Object d(String str, JSONObject jSONObject, KeyStore.PrivateKeyEntry privateKeyEntry, SecureStoreOptions secureStoreOptions, Wc.b bVar, Ed.b bVar2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        byte[] bArrDecode = Base64.decode(jSONObject.getString("esk"), 0);
        Cipher cipherE = e();
        cipherE.init(2, privateKeyEntry.getPrivateKey());
        return this.f16254b.f(str, jSONObject, new KeyStore.SecretKeyEntry(new SecretKeySpec(cipherE.doFinal(bArrDecode), "AES")), secureStoreOptions, bVar, bVar2);
    }

    @Override // Xc.c
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public KeyStore.PrivateKeyEntry c(KeyStore keyStore, SecureStoreOptions options) throws g {
        Intrinsics.checkNotNullParameter(keyStore, "keyStore");
        Intrinsics.checkNotNullParameter(options, "options");
        throw new g("Tried to initialize HybridAESEncryptor key store entry on Android SDK >= 23. This shouldn't happen. If you see this message report an issue at https://github.com/expo/expo.");
    }
}

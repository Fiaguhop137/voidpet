package Xc;

import Ad.r;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import expo.modules.securestore.SecureStoreOptions;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableEntryException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Xc.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0219a f16242a = new C0219a(null);

    /* JADX INFO: renamed from: Xc.a$a, reason: collision with other inner class name */
    public static final class C0219a {
        private C0219a() {
        }

        public /* synthetic */ C0219a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static final class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f16243a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f16244b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f16245c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f16247e;

        b(Ed.b bVar) {
            super(bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f16245c = obj;
            this.f16247e |= Integer.MIN_VALUE;
            return a.this.d(null, null, false, null, null, this);
        }
    }

    static final class c extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f16248a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f16249b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f16251d;

        c(Ed.b bVar) {
            super(bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f16249b = obj;
            this.f16251d |= Integer.MIN_VALUE;
            return a.this.f(null, null, null, null, null, this);
        }
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
        return "AES/GCM/NoPadding:" + options.getKeychainService();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(String str, KeyStore.SecretKeyEntry secretKeyEntry, boolean z10, String str2, Wc.b bVar, Ed.b bVar2) throws NoSuchPaddingException, Wc.a, NoSuchAlgorithmException, InvalidKeyException {
        b bVar3;
        GCMParameterSpec gCMParameterSpec;
        if (bVar2 instanceof b) {
            bVar3 = (b) bVar2;
            int i10 = bVar3.f16247e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar3.f16247e = i10 - Integer.MIN_VALUE;
            } else {
                bVar3 = new b(bVar2);
            }
        } else {
            bVar3 = new b(bVar2);
        }
        Object objC = bVar3.f16245c;
        Object objE = Fd.b.e();
        int i11 = bVar3.f16247e;
        if (i11 == 0) {
            r.b(objC);
            Key secretKey = secretKeyEntry.getSecretKey();
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, secretKey);
            gCMParameterSpec = (GCMParameterSpec) cipher.getParameters().getParameterSpec(GCMParameterSpec.class);
            Intrinsics.c(cipher);
            bVar3.f16243a = str;
            bVar3.f16244b = gCMParameterSpec;
            bVar3.f16247e = 1;
            objC = bVar.c(cipher, z10, str2, bVar3);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            GCMParameterSpec gCMParameterSpec2 = (GCMParameterSpec) bVar3.f16244b;
            String str3 = (String) bVar3.f16243a;
            r.b(objC);
            gCMParameterSpec = gCMParameterSpec2;
            str = str3;
        }
        Intrinsics.c(gCMParameterSpec);
        return e(str, (Cipher) objC, gCMParameterSpec);
    }

    public final JSONObject e(String plaintextValue, Cipher cipher, GCMParameterSpec gcmSpec) throws JSONException {
        Intrinsics.checkNotNullParameter(plaintextValue, "plaintextValue");
        Intrinsics.checkNotNullParameter(cipher, "cipher");
        Intrinsics.checkNotNullParameter(gcmSpec, "gcmSpec");
        Charset UTF_8 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
        byte[] bytes = plaintextValue.getBytes(UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        String strEncodeToString = Base64.encodeToString(cipher.doFinal(bytes), 2);
        String strEncodeToString2 = Base64.encodeToString(gcmSpec.getIV(), 2);
        JSONObject jSONObjectPut = new JSONObject().put("ct", strEncodeToString).put("iv", strEncodeToString2).put("tlen", gcmSpec.getTLen());
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "put(...)");
        return jSONObjectPut;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object f(String str, JSONObject jSONObject, KeyStore.SecretKeyEntry secretKeyEntry, SecureStoreOptions secureStoreOptions, Wc.b bVar, Ed.b bVar2) throws BadPaddingException, JSONException, NoSuchPaddingException, IllegalBlockSizeException, Wc.a, NoSuchAlgorithmException, InvalidKeyException, Wc.d, InvalidAlgorithmParameterException {
        c cVar;
        byte[] bArr;
        if (bVar2 instanceof c) {
            cVar = (c) bVar2;
            int i10 = cVar.f16251d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f16251d = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(bVar2);
            }
        } else {
            cVar = new c(bVar2);
        }
        Object obj = cVar.f16249b;
        Object objE = Fd.b.e();
        int i11 = cVar.f16251d;
        if (i11 == 0) {
            r.b(obj);
            String string = jSONObject.getString("ct");
            String string2 = jSONObject.getString("iv");
            int i12 = jSONObject.getInt("tlen");
            byte[] bArrDecode = Base64.decode(string, 0);
            AlgorithmParameterSpec gCMParameterSpec = new GCMParameterSpec(i12, Base64.decode(string2, 0));
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            boolean zOptBoolean = jSONObject.optBoolean("requireAuthentication");
            if (i12 < 96) {
                throw new Wc.d("Authentication tag length must be at least 96 bits long", str, secureStoreOptions.getKeychainService(), null, 8, null);
            }
            cipher.init(2, secretKeyEntry.getSecretKey(), gCMParameterSpec);
            Intrinsics.c(cipher);
            String authenticationPrompt = secureStoreOptions.getAuthenticationPrompt();
            cVar.f16248a = bArrDecode;
            cVar.f16251d = 1;
            Object objC = bVar.c(cipher, zOptBoolean, authenticationPrompt, cVar);
            if (objC == objE) {
                return objE;
            }
            obj = objC;
            bArr = bArrDecode;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bArr = (byte[]) cVar.f16248a;
            r.b(obj);
        }
        byte[] bArrDoFinal = ((Cipher) obj).doFinal(bArr);
        Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
        Charset UTF_8 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
        return new String(bArrDoFinal, UTF_8);
    }

    @Override // Xc.c
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public KeyStore.SecretKeyEntry c(KeyStore keyStore, SecureStoreOptions options) throws NoSuchAlgorithmException, KeyStoreException, InvalidAlgorithmParameterException, UnrecoverableEntryException {
        Intrinsics.checkNotNullParameter(keyStore, "keyStore");
        Intrinsics.checkNotNullParameter(options, "options");
        String strA = a(options, options.getRequireAuthentication());
        KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder(strA, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setUserAuthenticationRequired(options.getRequireAuthentication()).build();
        Intrinsics.checkNotNullExpressionValue(keyGenParameterSpecBuild, "build(...)");
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", keyStore.getProvider());
        keyGenerator.init(keyGenParameterSpecBuild);
        keyGenerator.generateKey();
        KeyStore.Entry entry = keyStore.getEntry(strA, null);
        KeyStore.SecretKeyEntry secretKeyEntry = entry instanceof KeyStore.SecretKeyEntry ? (KeyStore.SecretKeyEntry) entry : null;
        if (secretKeyEntry != null) {
            return secretKeyEntry;
        }
        throw new UnrecoverableEntryException("Could not retrieve the newly generated secret key entry");
    }
}

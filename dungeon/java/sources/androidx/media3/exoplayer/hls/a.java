package androidx.media3.exoplayer.hls;

import U1.AbstractC1459a;
import W1.x;
import android.net.Uri;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
class a implements W1.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final W1.f f24597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f24598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f24599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private CipherInputStream f24600d;

    public a(W1.f fVar, byte[] bArr, byte[] bArr2) {
        this.f24597a = fVar;
        this.f24598b = bArr;
        this.f24599c = bArr2;
    }

    @Override // W1.f
    public void close() {
        if (this.f24600d != null) {
            this.f24600d = null;
            this.f24597a.close();
        }
    }

    @Override // W1.f
    public final Uri e() {
        return this.f24597a.e();
    }

    @Override // W1.f
    public final Map f() {
        return this.f24597a.f();
    }

    @Override // W1.f
    public final void j(x xVar) {
        AbstractC1459a.e(xVar);
        this.f24597a.j(xVar);
    }

    @Override // W1.f
    public final long m(W1.j jVar) {
        try {
            Cipher cipherP = p();
            try {
                cipherP.init(2, new SecretKeySpec(this.f24598b, "AES"), new IvParameterSpec(this.f24599c));
                W1.h hVar = new W1.h(this.f24597a, jVar);
                this.f24600d = new CipherInputStream(hVar, cipherP);
                hVar.b();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e10) {
                throw new RuntimeException(e10);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e11) {
            throw new RuntimeException(e11);
        }
    }

    protected Cipher p() {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }

    @Override // R1.InterfaceC1350j
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        AbstractC1459a.e(this.f24600d);
        int i12 = this.f24600d.read(bArr, i10, i11);
        if (i12 < 0) {
            return -1;
        }
        return i12;
    }
}

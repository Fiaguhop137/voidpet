package W1;

import R1.z;
import U1.AbstractC1459a;
import U1.S;
import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes.dex */
public final class e extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private j f14469e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f14470f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f14471g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f14472h;

    public e() {
        super(false);
    }

    @Override // W1.f
    public void close() {
        if (this.f14470f != null) {
            this.f14470f = null;
            q();
        }
        this.f14469e = null;
    }

    @Override // W1.f
    public Uri e() {
        j jVar = this.f14469e;
        if (jVar != null) {
            return jVar.f14480a;
        }
        return null;
    }

    @Override // W1.f
    public long m(j jVar) throws g, z {
        r(jVar);
        this.f14469e = jVar;
        Uri uriNormalizeScheme = jVar.f14480a.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        AbstractC1459a.b("data".equals(scheme), "Unsupported scheme: " + scheme);
        String[] strArrH1 = S.h1(uriNormalizeScheme.getSchemeSpecificPart(), ",");
        if (strArrH1.length != 2) {
            throw z.b("Unexpected URI format: " + uriNormalizeScheme, null);
        }
        String str = strArrH1[1];
        if (strArrH1[0].contains(";base64")) {
            try {
                this.f14470f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e10) {
                throw z.b("Error while parsing Base64 encoded string: " + str, e10);
            }
        } else {
            this.f14470f = S.u0(URLDecoder.decode(str, StandardCharsets.US_ASCII.name()));
        }
        long j10 = jVar.f14486g;
        byte[] bArr = this.f14470f;
        if (j10 > bArr.length) {
            this.f14470f = null;
            throw new g(2008);
        }
        int i10 = (int) j10;
        this.f14471g = i10;
        int length = bArr.length - i10;
        this.f14472h = length;
        long j11 = jVar.f14487h;
        if (j11 != -1) {
            this.f14472h = (int) Math.min(length, j11);
        }
        s(jVar);
        long j12 = jVar.f14487h;
        return j12 != -1 ? j12 : this.f14472h;
    }

    @Override // R1.InterfaceC1350j
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f14472h;
        if (i12 == 0) {
            return -1;
        }
        int iMin = Math.min(i11, i12);
        System.arraycopy(S.i(this.f14470f), this.f14471g, bArr, i10, iMin);
        this.f14471g += iMin;
        this.f14472h -= iMin;
        p(iMin);
        return iMin;
    }
}

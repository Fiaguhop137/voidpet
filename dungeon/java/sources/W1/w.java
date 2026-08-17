package W1;

import U1.AbstractC1459a;
import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class w implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f14562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f14563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Uri f14564c = Uri.EMPTY;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f14565d = Collections.EMPTY_MAP;

    public w(f fVar) {
        this.f14562a = (f) AbstractC1459a.e(fVar);
    }

    @Override // W1.f
    public void close() {
        this.f14562a.close();
    }

    @Override // W1.f
    public Uri e() {
        return this.f14562a.e();
    }

    @Override // W1.f
    public Map f() {
        return this.f14562a.f();
    }

    @Override // W1.f
    public void j(x xVar) {
        AbstractC1459a.e(xVar);
        this.f14562a.j(xVar);
    }

    @Override // W1.f
    public long m(j jVar) {
        this.f14564c = jVar.f14480a;
        this.f14565d = Collections.EMPTY_MAP;
        try {
            return this.f14562a.m(jVar);
        } finally {
            Uri uriE = e();
            if (uriE != null) {
                this.f14564c = uriE;
            }
            this.f14565d = f();
        }
    }

    public long p() {
        return this.f14563b;
    }

    public Uri q() {
        return this.f14564c;
    }

    public Map r() {
        return this.f14565d;
    }

    @Override // R1.InterfaceC1350j
    public int read(byte[] bArr, int i10, int i11) {
        int i12 = this.f14562a.read(bArr, i10, i11);
        if (i12 != -1) {
            this.f14563b += (long) i12;
        }
        return i12;
    }

    public void s() {
        this.f14563b = 0L;
    }
}

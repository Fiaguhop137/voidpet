package p350t8;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p404w8.r;

/* JADX INFO: loaded from: classes2.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f54563a = 4368;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ArrayList f54564b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f54565c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    r f54566d = r.f56701d;

    static {
        new AtomicInteger(0);
    }

    /* synthetic */ q(byte[] bArr) {
    }

    public final q a(int i10) {
        this.f54563a = 2101523;
        return this;
    }

    public final q b(String str) {
        this.f54565c = str;
        return this;
    }

    public final q c(r rVar) {
        this.f54566d = (r) p170j8.r.l(rVar);
        return this;
    }

    public final r d() {
        return new r(false, true, 17, false, this.f54563a, null, this.f54564b, false, false, false, null, 0, 9, this.f54565c, this.f54566d, false, null);
    }
}

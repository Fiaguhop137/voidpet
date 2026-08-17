package p346t4;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements p346t4.a.InterfaceC0675a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f54444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f54445b;

    public interface a {
        File a();
    }

    public d(a aVar, long j10) {
        this.f54444a = j10;
        this.f54445b = aVar;
    }

    @Override // p346t4.a.InterfaceC0675a
    public p346t4.a build() {
        File fileA = this.f54445b.a();
        if (fileA == null) {
            return null;
        }
        if (fileA.isDirectory() || fileA.mkdirs()) {
            return e.c(fileA, this.f54444a);
        }
        return null;
    }
}

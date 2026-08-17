package p025b6;

import O5.e;

/* JADX INFO: loaded from: classes2.dex */
public class c extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private e f26292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f26293e;

    public c(e eVar, boolean z10) {
        this.f26292d = eVar;
        this.f26293e = z10;
    }

    @Override // p025b6.e
    public synchronized int M() {
        e eVar;
        eVar = this.f26292d;
        return eVar == null ? 0 : eVar.d().M();
    }

    @Override // p025b6.a, p025b6.e
    public boolean T3() {
        return this.f26293e;
    }

    @Override // p025b6.e, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            try {
                e eVar = this.f26292d;
                if (eVar == null) {
                    return;
                }
                this.f26292d = null;
                eVar.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p025b6.e, p025b6.m
    public synchronized int getHeight() {
        e eVar;
        eVar = this.f26292d;
        return eVar == null ? 0 : eVar.d().getHeight();
    }

    @Override // p025b6.e, p025b6.m
    public synchronized int getWidth() {
        e eVar;
        eVar = this.f26292d;
        return eVar == null ? 0 : eVar.d().getWidth();
    }

    @Override // p025b6.e
    public synchronized boolean isClosed() {
        return this.f26292d == null;
    }

    public synchronized O5.c s() {
        e eVar;
        eVar = this.f26292d;
        return eVar == null ? null : eVar.d();
    }

    public synchronized e t() {
        return this.f26292d;
    }
}

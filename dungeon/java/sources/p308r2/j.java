package p308r2;

import R1.z;
import W1.g;
import W1.p;
import W1.s;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f52074a;

    public j() {
        this(-1);
    }

    public j(int i10) {
        this.f52074a = i10;
    }

    @Override // p308r2.k
    public long a(k.c cVar) {
        IOException iOException = cVar.f52083c;
        if ((iOException instanceof z) || (iOException instanceof FileNotFoundException) || (iOException instanceof p) || (iOException instanceof m.h) || g.a(iOException)) {
            return -9223372036854775807L;
        }
        return Math.min((cVar.f52084d - 1) * 1000, 5000);
    }

    @Override // p308r2.k
    public int b(int i10) {
        int i11 = this.f52074a;
        if (i11 == -1) {
            return i10 == 7 ? 6 : 3;
        }
        return i11;
    }

    @Override // p308r2.k
    public k.b c(k.a aVar, k.c cVar) {
        if (!e(cVar.f52083c)) {
            return null;
        }
        if (aVar.a(1)) {
            return new k.b(1, 300000L);
        }
        if (aVar.a(2)) {
            return new k.b(2, 60000L);
        }
        return null;
    }

    protected boolean e(IOException iOException) {
        if (!(iOException instanceof s)) {
            return false;
        }
        int i10 = ((s) iOException).f14548d;
        return i10 == 403 || i10 == 404 || i10 == 410 || i10 == 416 || i10 == 500 || i10 == 503;
    }
}

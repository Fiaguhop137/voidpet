package S2;

import U1.AbstractC1459a;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends Y1.h implements l {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f11508o;

    class a extends q {
        a() {
        }

        @Override // Y1.g
        public void z() {
            j.this.t(this);
        }
    }

    protected j(String str) {
        super(new p[2], new q[2]);
        this.f11508o = str;
        w(1024);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Y1.h
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final m k(Throwable th) {
        return new m("Unexpected decode error", th);
    }

    protected abstract k B(byte[] bArr, int i10, boolean z10);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Y1.h
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final m l(p pVar, q qVar, boolean z10) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) AbstractC1459a.e(pVar.f16811d);
            qVar.A(pVar.f16813f, B(byteBuffer.array(), byteBuffer.limit(), z10), pVar.f11524j);
            qVar.f16821d = false;
            return null;
        } catch (m e10) {
            return e10;
        }
    }

    @Override // S2.l
    public void b(long j10) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Y1.h
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final p i() {
        return new p();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Y1.h
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final q j() {
        return new a();
    }
}

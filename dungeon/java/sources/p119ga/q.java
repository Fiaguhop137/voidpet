package p119ga;

import java.io.IOException;
import p172ja.f;
import p262oa.b;
import p262oa.c;

/* JADX INFO: loaded from: classes2.dex */
public abstract class q {

    class a extends q {
        a() {
        }

        @Override // p119ga.q
        public Object b(p262oa.a aVar) throws IOException {
            if (aVar.s() != b.NULL) {
                return q.this.b(aVar);
            }
            aVar.o();
            return null;
        }

        @Override // p119ga.q
        public void d(c cVar, Object obj) throws IOException {
            if (obj == null) {
                cVar.r();
            } else {
                q.this.d(cVar, obj);
            }
        }
    }

    public final q a() {
        return new a();
    }

    public abstract Object b(p262oa.a aVar);

    public final f c(Object obj) {
        try {
            f fVar = new f();
            d(fVar, obj);
            return fVar.b0();
        } catch (IOException e10) {
            throw new g(e10);
        }
    }

    public abstract void d(c cVar, Object obj);
}

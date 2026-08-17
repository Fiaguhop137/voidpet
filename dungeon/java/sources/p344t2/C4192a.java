package p344t2;

import V1.i;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: renamed from: t2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4192a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private i.e f54205a;

    private boolean a(i.d dVar, boolean z10) {
        i.e eVar;
        i.b bVarB;
        int i10 = dVar.f14003a;
        if (i10 == 2 || i10 == 15) {
            return true;
        }
        if (i10 != 3 || z10) {
            return ((i10 != 6 && i10 != 3) || (eVar = this.f54205a) == null || (bVarB = i.b.b(eVar, dVar)) == null || bVarB.a()) ? false : true;
        }
        return false;
    }

    private void e(List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((i.d) list.get(i10)).f14003a == 1) {
                this.f54205a = i.e.a((i.d) list.get(i10));
            }
        }
    }

    public void b(ByteBuffer byteBuffer) {
        e(i.e(byteBuffer));
    }

    public void c() {
        this.f54205a = null;
    }

    public int d(ByteBuffer byteBuffer, boolean z10) {
        List listE = i.e(byteBuffer);
        e(listE);
        int size = listE.size() - 1;
        int i10 = 0;
        while (size >= 0 && a((i.d) listE.get(size), z10)) {
            if (((i.d) listE.get(size)).f14003a == 6 || ((i.d) listE.get(size)).f14003a == 3) {
                i10++;
            }
            size--;
        }
        if (i10 > 1 || size + 1 >= 8) {
            return byteBuffer.limit();
        }
        return size >= 0 ? ((i.d) listE.get(size)).f14004b.limit() : byteBuffer.position();
    }
}

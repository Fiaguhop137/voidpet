package p041c4;

import p059d4.c;
import p095f4.d;

/* JADX INFO: loaded from: classes.dex */
public class G implements N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final G f27194a = new G();

    private G() {
    }

    @Override // p041c4.N
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d a(c cVar, float f10) {
        boolean z10 = cVar.d() == c.b.BEGIN_ARRAY;
        if (z10) {
            cVar.N();
        }
        float fNextDouble = (float) cVar.nextDouble();
        float fNextDouble2 = (float) cVar.nextDouble();
        while (cVar.hasNext()) {
            cVar.k0();
        }
        if (z10) {
            cVar.J();
        }
        return new d((fNextDouble / 100.0f) * f10, (fNextDouble2 / 100.0f) * f10);
    }
}

package p310r4;

import D4.e;
import L4.k;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p274p4.h;
import p274p4.j;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f52259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f52260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f52261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p199l1.e f52262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f52263e;

    interface a {
        v a(v vVar);
    }

    public i(Class cls, Class cls2, Class cls3, List list, e eVar, p199l1.e eVar2) {
        this.f52259a = cls;
        this.f52260b = list;
        this.f52261c = eVar;
        this.f52262d = eVar2;
        this.f52263e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private v b(com.bumptech.glide.load.data.e eVar, int i10, int i11, h hVar) {
        List list = (List) k.d(this.f52262d.acquire());
        try {
            return c(eVar, i10, i11, hVar, list);
        } finally {
            this.f52262d.a(list);
        }
    }

    private v c(com.bumptech.glide.load.data.e eVar, int i10, int i11, h hVar, List list) throws q {
        int size = this.f52260b.size();
        v vVarB = null;
        for (int i12 = 0; i12 < size; i12++) {
            j jVar = (j) this.f52260b.get(i12);
            try {
                if (jVar.a(eVar.a(), hVar)) {
                    vVarB = jVar.b(eVar.a(), i10, i11, hVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e10) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + jVar, e10);
                }
                list.add(e10);
            }
            if (vVarB != null) {
                break;
            }
        }
        if (vVarB != null) {
            return vVarB;
        }
        throw new q(this.f52263e, new ArrayList(list));
    }

    public v a(com.bumptech.glide.load.data.e eVar, int i10, int i11, h hVar, a aVar) {
        return this.f52261c.a(aVar.a(b(eVar, i10, i11, hVar)), hVar);
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f52259a + ", decoders=" + this.f52260b + ", transcoder=" + this.f52261c + '}';
    }
}

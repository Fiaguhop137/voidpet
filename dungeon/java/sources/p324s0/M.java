package p324s0;

import Ad.g;
import O0.d;
import O0.f;
import p270p0.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final d f52894a = f.b(1.0f, 0.0f, 2, null);

    public static final o0 b(I i10) {
        o0 o0VarY0 = i10.y0();
        if (o0VarY0 != null) {
            return o0VarY0;
        }
        a.c("LayoutNode should be attached to an owner");
        throw new g();
    }
}

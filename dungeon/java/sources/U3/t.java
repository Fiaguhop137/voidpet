package U3;

import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public class t extends a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Object f13109i;

    public t(p095f4.c cVar) {
        this(cVar, null);
    }

    public t(p095f4.c cVar, Object obj) {
        super(Collections.EMPTY_LIST);
        o(cVar);
        this.f13109i = obj;
    }

    @Override // U3.a
    float c() {
        return 1.0f;
    }

    @Override // U3.a
    public Object h() {
        p095f4.c cVar = this.f13034e;
        Object obj = this.f13109i;
        return cVar.b(0.0f, 0.0f, obj, obj, f(), f(), f());
    }

    @Override // U3.a
    Object i(p095f4.a aVar, float f10) {
        return h();
    }

    @Override // U3.a
    public void l() {
        if (this.f13034e != null) {
            super.l();
        }
    }

    @Override // U3.a
    public void n(float f10) {
        this.f13033d = f10;
    }
}

package p418x4;

import L4.k;
import p310r4.v;

/* JADX INFO: loaded from: classes.dex */
public class g implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Object f57400a;

    public g(Object obj) {
        this.f57400a = k.d(obj);
    }

    @Override // p310r4.v
    public final int a() {
        return 1;
    }

    @Override // p310r4.v
    public Class b() {
        return this.f57400a.getClass();
    }

    @Override // p310r4.v
    public final Object get() {
        return this.f57400a;
    }

    @Override // p310r4.v
    public void recycle() {
    }
}

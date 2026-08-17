package L4;

import p323s.C4101a;
import p323s.f0;

/* JADX INFO: loaded from: classes.dex */
public final class b extends C4101a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f6330g;

    @Override // p323s.f0, java.util.Map
    public void clear() {
        this.f6330g = 0;
        super.clear();
    }

    @Override // p323s.f0
    public void g(f0 f0Var) {
        this.f6330g = 0;
        super.g(f0Var);
    }

    @Override // p323s.f0
    public Object h(int i10) {
        this.f6330g = 0;
        return super.h(i10);
    }

    @Override // p323s.f0, java.util.Map
    public int hashCode() {
        if (this.f6330g == 0) {
            this.f6330g = super.hashCode();
        }
        return this.f6330g;
    }

    @Override // p323s.f0
    public Object i(int i10, Object obj) {
        this.f6330g = 0;
        return super.i(i10, obj);
    }

    @Override // p323s.f0, java.util.Map
    public Object put(Object obj, Object obj2) {
        this.f6330g = 0;
        return super.put(obj, obj2);
    }
}

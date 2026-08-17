package C4;

import p310r4.r;

/* JADX INFO: loaded from: classes.dex */
public class e extends A4.j implements r {
    public e(c cVar) {
        super(cVar);
    }

    @Override // p310r4.v
    public int a() {
        return ((c) this.f216a).i();
    }

    @Override // p310r4.v
    public Class b() {
        return c.class;
    }

    @Override // A4.j, p310r4.r
    public void initialize() {
        ((c) this.f216a).e().prepareToDraw();
    }

    @Override // p310r4.v
    public void recycle() {
        ((c) this.f216a).stop();
        ((c) this.f216a).k();
    }
}

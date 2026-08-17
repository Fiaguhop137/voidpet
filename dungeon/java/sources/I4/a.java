package I4;

import L4.l;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f4919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f4920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private H4.c f4921c;

    public a() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public a(int i10, int i11) {
        if (l.u(i10, i11)) {
            this.f4919a = i10;
            this.f4920b = i11;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i10 + " and height: " + i11);
    }

    @Override // E4.l
    public void a() {
    }

    @Override // I4.d
    public final H4.c b() {
        return this.f4921c;
    }

    @Override // E4.l
    public void c() {
    }

    @Override // E4.l
    public void d() {
    }

    @Override // I4.d
    public final void e(c cVar) {
        cVar.c(this.f4919a, this.f4920b);
    }

    @Override // I4.d
    public final void g(H4.c cVar) {
        this.f4921c = cVar;
    }

    @Override // I4.d
    public void i(Drawable drawable) {
    }

    @Override // I4.d
    public final void k(c cVar) {
    }

    @Override // I4.d
    public void l(Drawable drawable) {
    }
}

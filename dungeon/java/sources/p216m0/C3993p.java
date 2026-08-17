package p216m0;

import android.os.Build;
import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: renamed from: m0.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3993p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f48888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3983f f48889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f48890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f48891d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f48892e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f48893f;

    public C3993p(List list) {
        this(list, null);
    }

    public C3993p(List list, C3983f c3983f) {
        MotionEvent motionEventF;
        this.f48888a = list;
        this.f48889b = c3983f;
        this.f48890c = (Build.VERSION.SDK_INT < 29 || (motionEventF = f()) == null) ? 0 : motionEventF.getClassification();
        MotionEvent motionEventF2 = f();
        this.f48891d = AbstractC3991n.a(motionEventF2 != null ? motionEventF2.getButtonState() : 0);
        MotionEvent motionEventF3 = f();
        this.f48892e = M.b(motionEventF3 != null ? motionEventF3.getMetaState() : 0);
        this.f48893f = a();
    }

    private final int a() {
        MotionEvent motionEventF = f();
        if (motionEventF == null) {
            List list = this.f48888a;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                z zVar = (z) list.get(i10);
                if (AbstractC3994q.d(zVar)) {
                    return AbstractC3996t.f48899a.e();
                }
                if (AbstractC3994q.b(zVar)) {
                    return AbstractC3996t.f48899a.d();
                }
            }
            return AbstractC3996t.f48899a.c();
        }
        int actionMasked = motionEventF.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    switch (actionMasked) {
                        case 5:
                            break;
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            return AbstractC3996t.f48899a.f();
                        case 9:
                            return AbstractC3996t.f48899a.a();
                        case 10:
                            return AbstractC3996t.f48899a.b();
                        default:
                            return AbstractC3996t.f48899a.g();
                    }
                }
                return AbstractC3996t.f48899a.c();
            }
            return AbstractC3996t.f48899a.e();
        }
        return AbstractC3996t.f48899a.d();
    }

    public final int b() {
        return this.f48891d;
    }

    public final List c() {
        return this.f48888a;
    }

    public final int d() {
        return this.f48890c;
    }

    public final C3983f e() {
        return this.f48889b;
    }

    public final MotionEvent f() {
        C3983f c3983f = this.f48889b;
        if (c3983f != null) {
            return c3983f.c();
        }
        return null;
    }

    public final int g() {
        return this.f48893f;
    }

    public final void h(int i10) {
        this.f48893f = i10;
    }
}

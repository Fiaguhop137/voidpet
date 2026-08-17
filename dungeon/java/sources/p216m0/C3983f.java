package p216m0;

import android.view.MotionEvent;
import java.util.List;
import p323s.C4123x;

/* JADX INFO: renamed from: m0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3983f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4123x f48868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B f48869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f48870c;

    public C3983f(C4123x c4123x, B b10) {
        this.f48868a = c4123x;
        this.f48869b = b10;
    }

    public final boolean a(long j10) {
        Object obj;
        List listB = this.f48869b.b();
        int size = listB.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = listB.get(i10);
            if (y.b(((C) obj).d(), j10)) {
                break;
            }
            i10++;
        }
        C c10 = (C) obj;
        if (c10 != null) {
            return c10.a();
        }
        return false;
    }

    public final C4123x b() {
        return this.f48868a;
    }

    public final MotionEvent c() {
        return this.f48869b.a();
    }

    public final boolean d() {
        return this.f48870c;
    }

    public final void e(boolean z10) {
        this.f48870c = z10;
    }
}

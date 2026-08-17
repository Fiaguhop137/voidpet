package p062d7;

import android.view.View;
import android.view.animation.Animation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p348t6.b;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends p062d7.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final a f39856g = new a(null);

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        b.a("LayoutUpdateAnimation", p348t6.a.ERROR);
    }

    @Override // p062d7.a
    public Animation c(View view, int i10, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(view, "view");
        boolean z10 = true;
        boolean z11 = (((int) view.getX()) == i10 && ((int) view.getY()) == i11) ? false : true;
        if (view.getWidth() == i12 && view.getHeight() == i13) {
            z10 = false;
        }
        if (z11 || z10) {
            return new n(view, i10, i11, i12, i13);
        }
        return null;
    }

    @Override // p062d7.a
    public boolean g() {
        return e() > 0;
    }
}

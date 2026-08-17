package p307r1;

import android.view.View;
import androidx.core.view.AbstractC1907g0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f52021a = d.f52025b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f52022b = d.f52024a;

    public static final void a(View view, b listener) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(listener, "listener");
        b(view).a(listener);
    }

    private static final c b(View view) {
        int i10 = f52021a;
        c cVar = (c) view.getTag(i10);
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        view.setTag(i10, cVar2);
        return cVar2;
    }

    public static final boolean c(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Object tag = view.getTag(f52022b);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean d(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        for (Object obj : AbstractC1907g0.a(view)) {
            if ((obj instanceof View) && c((View) obj)) {
                return true;
            }
        }
        return false;
    }

    public static final void e(View view, b listener) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(listener, "listener");
        b(view).b(listener);
    }
}

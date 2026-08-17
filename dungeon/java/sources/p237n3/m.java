package p237n3;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import p271p1.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    public static final i a(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(a.f49892a);
            i iVar = tag instanceof i ? (i) tag : null;
            if (iVar != null) {
                return iVar;
            }
            Object objA = b.a(view);
            view = objA instanceof View ? (View) objA : null;
        }
        return null;
    }

    public static final void b(View view, i iVar) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(a.f49892a, iVar);
    }
}

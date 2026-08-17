package p010a9;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.internal.g;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f19608a = false;

    public static void a(a aVar, View view, FrameLayout frameLayout) {
        e(aVar, view, frameLayout);
        if (aVar.l() != null) {
            aVar.l().setForeground(aVar);
        } else {
            if (f19608a) {
                throw new IllegalArgumentException("Trying to reference null customBadgeParent");
            }
            view.getOverlay().add(aVar);
        }
    }

    public static SparseArray b(Context context, g gVar) {
        SparseArray sparseArray = new SparseArray(gVar.size());
        for (int i10 = 0; i10 < gVar.size(); i10++) {
            int iKeyAt = gVar.keyAt(i10);
            b.a aVar = (b.a) gVar.valueAt(i10);
            sparseArray.put(iKeyAt, aVar != null ? a.g(context, aVar) : null);
        }
        return sparseArray;
    }

    public static g c(SparseArray sparseArray) {
        g gVar = new g();
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            int iKeyAt = sparseArray.keyAt(i10);
            a aVar = (a) sparseArray.valueAt(i10);
            gVar.put(iKeyAt, aVar != null ? aVar.v() : null);
        }
        return gVar;
    }

    public static void d(a aVar, View view) {
        if (aVar == null) {
            return;
        }
        if (f19608a || aVar.l() != null) {
            aVar.l().setForeground(null);
        } else {
            view.getOverlay().remove(aVar);
        }
    }

    public static void e(a aVar, View view, FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        aVar.setBounds(rect);
        aVar.Z(view, frameLayout);
    }

    public static void f(Rect rect, float f10, float f11, float f12, float f13) {
        rect.set((int) (f10 - f12), (int) (f11 - f13), (int) (f10 + f12), (int) (f11 + f13));
    }
}

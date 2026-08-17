package p098f7;

import android.support.v4.media.session.b;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.AbstractC2232l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f41787a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List f41788b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f41789c = new HashMap();

    private a() {
    }

    public static final View a(View root, String nativeId) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(nativeId, "nativeId");
        if (Intrinsics.b(f41787a.b(root), nativeId)) {
            return root;
        }
        if (!(root instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) root;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            View viewA = a(childAt, nativeId);
            if (viewA != null) {
                return viewA;
            }
        }
        return null;
    }

    private final String b(View view) {
        Object tag = view.getTag(AbstractC2232l.f29814H);
        if (tag instanceof String) {
            return (String) tag;
        }
        return null;
    }

    public static final void c(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        String strB = f41787a.b(view);
        if (strB == null) {
            return;
        }
        Iterator it = f41788b.iterator();
        if (it.hasNext()) {
            b.a(it.next());
            throw null;
        }
        for (Map.Entry entry : f41789c.entrySet()) {
            b.a(entry.getKey());
            if (((Set) entry.getValue()).contains(strB)) {
                throw null;
            }
        }
    }
}

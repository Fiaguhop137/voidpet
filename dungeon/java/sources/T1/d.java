package T1;

import U1.AbstractC1459a;
import U1.S;
import android.os.Bundle;
import android.text.Spannable;
import android.text.Spanned;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f11986a = S.z0(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f11987b = S.z0(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f11988c = S.z0(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f11989d = S.z0(3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f11990e = S.z0(4);

    public static ArrayList a(Spanned spanned) {
        ArrayList arrayList = new ArrayList();
        for (f fVar : (f[]) spanned.getSpans(0, spanned.length(), f.class)) {
            arrayList.add(b(spanned, fVar, 1, fVar.b()));
        }
        for (h hVar : (h[]) spanned.getSpans(0, spanned.length(), h.class)) {
            arrayList.add(b(spanned, hVar, 2, hVar.b()));
        }
        for (e eVar : (e[]) spanned.getSpans(0, spanned.length(), e.class)) {
            arrayList.add(b(spanned, eVar, 3, null));
        }
        for (i iVar : (i[]) spanned.getSpans(0, spanned.length(), i.class)) {
            arrayList.add(b(spanned, iVar, 4, iVar.b()));
        }
        return arrayList;
    }

    private static Bundle b(Spanned spanned, Object obj, int i10, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f11986a, spanned.getSpanStart(obj));
        bundle2.putInt(f11987b, spanned.getSpanEnd(obj));
        bundle2.putInt(f11988c, spanned.getSpanFlags(obj));
        bundle2.putInt(f11989d, i10);
        if (bundle != null) {
            bundle2.putBundle(f11990e, bundle);
        }
        return bundle2;
    }

    public static void c(Bundle bundle, Spannable spannable) {
        int i10 = bundle.getInt(f11986a);
        int i11 = bundle.getInt(f11987b);
        int i12 = bundle.getInt(f11988c);
        int i13 = bundle.getInt(f11989d, -1);
        Bundle bundle2 = bundle.getBundle(f11990e);
        if (i13 == 1) {
            spannable.setSpan(f.a((Bundle) AbstractC1459a.e(bundle2)), i10, i11, i12);
            return;
        }
        if (i13 == 2) {
            spannable.setSpan(h.a((Bundle) AbstractC1459a.e(bundle2)), i10, i11, i12);
        } else if (i13 == 3) {
            spannable.setSpan(new e(), i10, i11, i12);
        } else {
            if (i13 != 4) {
                return;
            }
            spannable.setSpan(i.a((Bundle) AbstractC1459a.e(bundle2)), i10, i11, i12);
        }
    }
}

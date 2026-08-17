package p436y4;

import A4.l;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import p274p4.h;
import p274p4.j;
import p310r4.v;
import p328s4.d;

/* JADX INFO: loaded from: classes.dex */
public class z implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f57954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f57955b;

    public z(l lVar, d dVar) {
        this.f57954a = lVar;
        this.f57955b = dVar;
    }

    @Override // p274p4.j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public v b(Uri uri, int i10, int i11, h hVar) {
        v vVarB = this.f57954a.b(uri, i10, i11, hVar);
        if (vVarB == null) {
            return null;
        }
        return q.a(this.f57955b, (Drawable) vVarB.get(), i10, i11);
    }

    @Override // p274p4.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri, h hVar) {
        return "android.resource".equals(uri.getScheme());
    }
}

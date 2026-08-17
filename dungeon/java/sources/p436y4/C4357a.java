package p436y4;

import L4.k;
import android.content.res.Resources;
import p274p4.h;
import p274p4.j;
import p310r4.v;

/* JADX INFO: renamed from: y4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C4357a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f57880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources f57881b;

    public C4357a(Resources resources, j jVar) {
        this.f57881b = (Resources) k.d(resources);
        this.f57880a = (j) k.d(jVar);
    }

    @Override // p274p4.j
    public boolean a(Object obj, h hVar) {
        return this.f57880a.a(obj, hVar);
    }

    @Override // p274p4.j
    public v b(Object obj, int i10, int i11, h hVar) {
        return w.d(this.f57881b, this.f57880a.b(obj, i10, i11, hVar));
    }
}

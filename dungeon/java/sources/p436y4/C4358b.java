package p436y4;

import android.graphics.drawable.BitmapDrawable;
import java.io.File;
import p274p4.c;
import p274p4.h;
import p274p4.k;
import p310r4.v;
import p328s4.d;

/* JADX INFO: renamed from: y4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C4358b implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f57882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f57883b;

    public C4358b(d dVar, k kVar) {
        this.f57882a = dVar;
        this.f57883b = kVar;
    }

    @Override // p274p4.k
    public c b(h hVar) {
        return this.f57883b.b(hVar);
    }

    @Override // p274p4.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(v vVar, File file, h hVar) {
        return this.f57883b.a(new f(((BitmapDrawable) vVar.get()).getBitmap(), this.f57882a), file, hVar);
    }
}

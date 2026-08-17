package p310r4;

import java.io.File;
import p274p4.d;
import p274p4.h;
import p346t4.a;

/* JADX INFO: loaded from: classes.dex */
class e implements a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f52184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f52185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h f52186c;

    e(d dVar, Object obj, h hVar) {
        this.f52184a = dVar;
        this.f52185b = obj;
        this.f52186c = hVar;
    }

    @Override // t4.a.b
    public boolean a(File file) {
        return this.f52184a.a(this.f52185b, file, this.f52186c);
    }
}

package p066db;

import Ob.c;
import java.util.Map;
import p173jb.d;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f39885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f39886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String[] f39887c;

    public /* synthetic */ b(e eVar, d dVar, String[] strArr) {
        this.f39885a = eVar;
        this.f39886b = dVar;
        this.f39887c = strArr;
    }

    @Override // Ob.c
    public final void a(Map map) {
        e.s(this.f39885a, this.f39886b, this.f39887c, map);
    }
}

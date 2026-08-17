package p083ea;

import K9.C1135c;
import K9.InterfaceC1136d;
import K9.q;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f40716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f40717b;

    c(Set set, d dVar) {
        this.f40716a = d(set);
        this.f40717b = dVar;
    }

    public static /* synthetic */ i b(InterfaceC1136d interfaceC1136d) {
        return new c(interfaceC1136d.f(f.class), d.a());
    }

    public static C1135c c() {
        return C1135c.e(i.class).b(q.m(f.class)).f(new b()).d();
    }

    private static String d(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            sb2.append(fVar.b());
            sb2.append('/');
            sb2.append(fVar.c());
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    @Override // p083ea.i
    public String a() {
        if (this.f40717b.b().isEmpty()) {
            return this.f40716a;
        }
        return this.f40716a + ' ' + d(this.f40717b.b());
    }
}

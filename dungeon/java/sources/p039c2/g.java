package p039c2;

import W1.j;
import java.util.Map;
import p057d2.b;
import p057d2.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static j a(p057d2.j jVar, String str, i iVar, int i10, Map map) {
        return new j.b().i(iVar.b(str)).h(iVar.f39687a).g(iVar.f39688b).f(b(jVar, iVar)).b(i10).e(map).a();
    }

    public static String b(p057d2.j jVar, i iVar) {
        String strK = jVar.k();
        return strK != null ? strK : iVar.b(((b) jVar.f39693c.get(0)).f39637a).toString();
    }
}

package p083ea;

import K9.C1135c;
import K9.q;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h {

    public interface a {
        String a(Object obj);
    }

    public static C1135c b(String str, String str2) {
        return C1135c.l(f.a(str, str2), f.class);
    }

    public static C1135c c(String str, a aVar) {
        return C1135c.m(f.class).b(q.k(Context.class)).f(new g(str, aVar)).d();
    }
}

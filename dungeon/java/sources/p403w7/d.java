package p403w7;

import com.github.penfeizhou.animation.io.Reader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    static class a extends IOException {
        a() {
            super("APNG Format error");
        }
    }

    public static boolean a(Reader reader) {
        p421x7.a aVar = reader instanceof p421x7.a ? (p421x7.a) reader : new p421x7.a(reader);
        try {
            if (!aVar.a("\u0089PNG") || !aVar.a("\r\n\u001a\n")) {
                throw new a();
            }
            while (aVar.available() > 0) {
                if (c(aVar) instanceof p403w7.a) {
                    return true;
                }
            }
            return false;
        } catch (IOException e10) {
            if (e10 instanceof a) {
                return false;
            }
            e10.printStackTrace();
            return false;
        }
    }

    public static List b(p421x7.a aVar) throws a {
        if (!aVar.a("\u0089PNG") || !aVar.a("\r\n\u001a\n")) {
            throw new a();
        }
        ArrayList arrayList = new ArrayList();
        while (aVar.available() > 0) {
            arrayList.add(c(aVar));
        }
        return arrayList;
    }

    private static e c(p421x7.a aVar) throws IOException {
        e jVar;
        int iPosition = aVar.position();
        int iC = aVar.c();
        int iB = aVar.b();
        if (iB == p403w7.a.f56631g) {
            jVar = new p403w7.a();
        } else if (iB == f.f56654n) {
            jVar = new f();
        } else if (iB == g.f56664f) {
            jVar = new g();
        } else if (iB == h.f56666e) {
            jVar = new h();
        } else if (iB == i.f56667e) {
            jVar = new i();
        } else {
            jVar = iB == j.f56668h ? new j() : new e();
        }
        jVar.f56653d = iPosition;
        jVar.f56651b = iB;
        jVar.f56650a = iC;
        jVar.c(aVar);
        jVar.f56652c = aVar.c();
        return jVar;
    }
}

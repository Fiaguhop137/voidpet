package I7;

import com.github.penfeizhou.animation.io.Reader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m {

    static class a extends IOException {
        a() {
            super("WebP Format error");
        }
    }

    public static boolean a(Reader reader) {
        J7.a aVar = reader instanceof J7.a ? (J7.a) reader : new J7.a(reader);
        try {
            if (!aVar.f("RIFF")) {
                return false;
            }
            aVar.skip(4L);
            if (!aVar.f("WEBP")) {
                return false;
            }
            while (aVar.available() > 0) {
                e eVarC = c(aVar);
                if (eVarC instanceof k) {
                    return ((k) eVarC).e();
                }
            }
        } catch (IOException e10) {
            if (!(e10 instanceof a)) {
                e10.printStackTrace();
            }
        }
        return false;
    }

    public static List b(J7.a aVar) throws IOException {
        if (!aVar.f("RIFF")) {
            throw new a();
        }
        aVar.skip(4L);
        if (!aVar.f("WEBP")) {
            throw new a();
        }
        ArrayList arrayList = new ArrayList();
        while (aVar.available() > 0) {
            arrayList.add(c(aVar));
        }
        return arrayList;
    }

    static e c(J7.a aVar) {
        e fVar;
        int iPosition = aVar.position();
        int iB = aVar.b();
        int iE = aVar.e();
        if (k.f5073g == iB) {
            fVar = new k();
        } else if (b.f5046f == iB) {
            fVar = new b();
        } else if (c.f5049m == iB) {
            fVar = new c();
        } else if (I7.a.f5045d == iB) {
            fVar = new I7.a();
        } else if (i.f5071d == iB) {
            fVar = new i();
        } else if (j.f5072d == iB) {
            fVar = new j();
        } else if (g.f5070d == iB) {
            fVar = new g();
        } else if (n.f5085d == iB) {
            fVar = new n();
        } else {
            fVar = f.f5069d == iB ? new f() : new e();
        }
        fVar.f5066a = iB;
        fVar.f5067b = iE;
        fVar.f5068c = iPosition;
        fVar.c(aVar);
        return fVar;
    }
}

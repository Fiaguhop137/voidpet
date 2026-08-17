package p050cd;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class d implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f27437a;

    private d(Map map) {
        this.f27437a = Collections.unmodifiableMap(r.b(map));
    }

    public static d f(Map map) {
        return new d(map);
    }

    @Override // p050cd.q
    public StringBuilder c(StringBuilder sb2) {
        String str = "";
        for (Map.Entry entry : this.f27437a.entrySet()) {
            sb2.append(str);
            String str2 = (String) entry.getKey();
            h hVar = (h) entry.getValue();
            sb2.append(str2);
            if (Boolean.TRUE.equals(hVar.get())) {
                hVar.b().q(sb2);
            } else {
                sb2.append("=");
                hVar.c(sb2);
            }
            str = ", ";
        }
        return sb2;
    }

    @Override // p199l1.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Map get() {
        return this.f27437a;
    }

    public String e() {
        return c(new StringBuilder()).toString();
    }
}

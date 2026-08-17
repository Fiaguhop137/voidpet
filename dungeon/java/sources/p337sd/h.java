package p337sd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p158id.d;
import p175jd.b;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements g {
    @Override // p337sd.g
    public List a(List updates, d dVar, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(updates, "updates");
        if (dVar == null) {
            return CollectionsKt.l();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = updates.iterator();
        d dVar2 = null;
        d dVar3 = null;
        while (it.hasNext()) {
            d dVar4 = (d) it.next();
            if (Intrinsics.b(dVar4.l(), dVar.l()) && dVar4.b().before(dVar.b())) {
                arrayList.add(dVar4);
                if (dVar3 == null || dVar3.b().before(dVar4.b())) {
                    dVar3 = dVar4;
                }
                if (i.f53529a.a(dVar4, jSONObject) && (dVar2 == null || dVar2.b().before(dVar4.b()))) {
                    dVar2 = dVar4;
                }
            }
        }
        if (dVar2 != null) {
            arrayList.remove(dVar2);
        } else if (dVar3 != null) {
            arrayList.remove(dVar3);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((d) obj).m() != b.EMBEDDED) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }
}

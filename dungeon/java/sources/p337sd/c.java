package p337sd;

import expo.modules.updates.d;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f53525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f53526b;

    public c(String runtimeVersion, d config) {
        Intrinsics.checkNotNullParameter(runtimeVersion, "runtimeVersion");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f53525a = runtimeVersion;
        this.f53526b = config;
    }

    @Override // p337sd.a
    public p158id.d a(List updates, JSONObject jSONObject) {
        Object obj;
        Intrinsics.checkNotNullParameter(updates, "updates");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : updates) {
            p158id.d dVar = (p158id.d) obj2;
            if (Intrinsics.b(this.f53525a, dVar.k()) && i.f53529a.a(dVar, jSONObject)) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            p158id.d dVar2 = (p158id.d) obj3;
            if ((dVar2.o() == null && dVar2.j() == null) || (Intrinsics.b(dVar2.o(), this.f53526b.s()) && Intrinsics.b(dVar2.j(), this.f53526b.o()))) {
                arrayList2.add(obj3);
            }
        }
        Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                Date dateB = ((p158id.d) next).b();
                do {
                    Object next2 = it.next();
                    Date dateB2 = ((p158id.d) next2).b();
                    if (dateB.compareTo(dateB2) < 0) {
                        next = next2;
                        dateB = dateB2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (p158id.d) obj;
    }
}

package p337sd;

import android.net.Uri;
import expo.modules.updates.d;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f53523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f53524b;

    public b(String runtimeVersion, d dVar) {
        Intrinsics.checkNotNullParameter(runtimeVersion, "runtimeVersion");
        this.f53523a = runtimeVersion;
        this.f53524b = dVar;
    }

    @Override // p337sd.a
    public p158id.d a(List updates, JSONObject jSONObject) {
        Object next;
        Intrinsics.checkNotNullParameter(updates, "updates");
        ArrayList arrayList = new ArrayList();
        for (Object obj : updates) {
            p158id.d dVar = (p158id.d) obj;
            if (Intrinsics.b(this.f53523a, dVar.k()) && i.f53529a.a(dVar, jSONObject)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            next = null;
            if (!it.hasNext()) {
                break;
            }
            Object next2 = it.next();
            p158id.d dVar2 = (p158id.d) next2;
            if (dVar2.o() != null || dVar2.j() != null) {
                Uri uriO = dVar2.o();
                d dVar3 = this.f53524b;
                if (Intrinsics.b(uriO, dVar3 != null ? dVar3.s() : null)) {
                    Map mapJ = dVar2.j();
                    d dVar4 = this.f53524b;
                    if (Intrinsics.b(mapJ, dVar4 != null ? dVar4.o() : null)) {
                    }
                }
            }
            arrayList2.add(next2);
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                Date dateB = ((p158id.d) next).b();
                do {
                    Object next3 = it2.next();
                    Date dateB2 = ((p158id.d) next3).b();
                    if (dateB.compareTo(dateB2) < 0) {
                        next = next3;
                        dateB = dateB2;
                    }
                } while (it2.hasNext());
            }
        }
        return (p158id.d) next;
    }
}

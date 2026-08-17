package p337sd;

import android.net.Uri;
import expo.modules.updates.d;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p247nd.r;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f53527a;

    public e(d dVar) {
        this.f53527a = dVar;
    }

    @Override // p337sd.d
    public boolean a(r.c directive, p158id.d embeddedUpdate, p158id.d dVar, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(directive, "directive");
        Intrinsics.checkNotNullParameter(embeddedUpdate, "embeddedUpdate");
        i iVar = i.f53529a;
        if (!iVar.a(embeddedUpdate, jSONObject)) {
            return false;
        }
        if (dVar != null && iVar.a(dVar, jSONObject)) {
            return directive.b().after(dVar.b());
        }
        return true;
    }

    @Override // p337sd.d
    public boolean b(p158id.d dVar, p158id.d dVar2, JSONObject jSONObject) {
        if (dVar == null) {
            return false;
        }
        i iVar = i.f53529a;
        if (!iVar.a(dVar, jSONObject)) {
            return false;
        }
        if (dVar2 == null || !iVar.a(dVar2, jSONObject)) {
            return true;
        }
        if (dVar.o() != null) {
            Uri uriO = dVar.o();
            d dVar3 = this.f53527a;
            if (!Intrinsics.b(uriO, dVar3 != null ? dVar3.s() : null)) {
                return false;
            }
        }
        if (dVar.j() != null) {
            Map mapJ = dVar.j();
            d dVar4 = this.f53527a;
            if (!Intrinsics.b(mapJ, dVar4 != null ? dVar4.o() : null)) {
                return false;
            }
        }
        if (dVar2.o() != null) {
            Uri uriO2 = dVar2.o();
            d dVar5 = this.f53527a;
            if (!Intrinsics.b(uriO2, dVar5 != null ? dVar5.s() : null)) {
                return true;
            }
        }
        if (dVar2.j() != null) {
            Map mapJ2 = dVar2.j();
            d dVar6 = this.f53527a;
            if (!Intrinsics.b(mapJ2, dVar6 != null ? dVar6.o() : null)) {
                return true;
            }
        }
        return dVar.b().after(dVar2.b());
    }
}

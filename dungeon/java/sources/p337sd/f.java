package p337sd;

import expo.modules.updates.d;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p247nd.r;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f53528a;

    public f(d config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f53528a = config;
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
        if (dVar.o() != null && !Intrinsics.b(dVar.o(), this.f53528a.s())) {
            return false;
        }
        if (dVar.j() != null && !Intrinsics.b(dVar.j(), this.f53528a.o())) {
            return false;
        }
        if (dVar2.o() != null && !Intrinsics.b(dVar2.o(), this.f53528a.s())) {
            return true;
        }
        if (dVar2.j() == null || Intrinsics.b(dVar2.j(), this.f53528a.o())) {
            return dVar.b().after(dVar2.b());
        }
        return true;
    }
}

package com.google.firebase.datatransport;

import K9.C1135c;
import K9.D;
import K9.InterfaceC1136d;
import K9.q;
import L7.i;
import N7.t;
import N9.b;
import N9.c;
import N9.d;
import N9.e;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.datatransport.cct.a;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p083ea.h;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public static /* synthetic */ i a(InterfaceC1136d interfaceC1136d) {
        t.f((Context) interfaceC1136d.a(Context.class));
        return t.c().g(a.f31571g);
    }

    public static /* synthetic */ i b(InterfaceC1136d interfaceC1136d) {
        t.f((Context) interfaceC1136d.a(Context.class));
        return t.c().g(a.f31572h);
    }

    public static /* synthetic */ i c(InterfaceC1136d interfaceC1136d) {
        t.f((Context) interfaceC1136d.a(Context.class));
        return t.c().g(a.f31572h);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public List<C1135c> getComponents() {
        return Arrays.asList(C1135c.e(i.class).h("fire-transport").b(q.k(Context.class)).f(new c()).d(), C1135c.c(D.a(N9.a.class, i.class)).b(q.k(Context.class)).f(new d()).d(), C1135c.c(D.a(b.class, i.class)).b(q.k(Context.class)).f(new e()).d(), h.b("fire-transport", "18.2.0"));
    }
}

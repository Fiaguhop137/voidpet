package com.google.firebase.installations;

import K9.C1135c;
import K9.D;
import K9.InterfaceC1136d;
import K9.q;
import L9.j;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    public static /* synthetic */ X9.e a(InterfaceC1136d interfaceC1136d) {
        return new c((H9.e) interfaceC1136d.a(H9.e.class), interfaceC1136d.g(U9.i.class), (ExecutorService) interfaceC1136d.e(D.a(J9.a.class, ExecutorService.class)), j.a((Executor) interfaceC1136d.e(D.a(J9.b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1135c> getComponents() {
        return Arrays.asList(C1135c.e(X9.e.class).h("fire-installations").b(q.k(H9.e.class)).b(q.i(U9.i.class)).b(q.j(D.a(J9.a.class, ExecutorService.class))).b(q.j(D.a(J9.b.class, Executor.class))).f(new X9.f()).d(), U9.h.a(), p083ea.h.b("fire-installations", "19.0.1"));
    }
}

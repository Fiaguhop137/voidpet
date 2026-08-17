package com.google.firebase.analytics.connector.internal;

import H9.e;
import K9.C1135c;
import K9.InterfaceC1136d;
import K9.q;
import T9.d;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p083ea.h;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ I9.a lambda$getComponents$0(InterfaceC1136d interfaceC1136d) {
        return I9.b.c((e) interfaceC1136d.a(e.class), (Context) interfaceC1136d.a(Context.class), (d) interfaceC1136d.a(d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<C1135c> getComponents() {
        return Arrays.asList(C1135c.e(I9.a.class).b(q.k(e.class)).b(q.k(Context.class)).b(q.k(d.class)).f(a.f37353a).e().d(), h.b("fire-analytics", "23.0.0"));
    }
}

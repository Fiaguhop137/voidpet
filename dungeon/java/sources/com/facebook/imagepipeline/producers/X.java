package com.facebook.imagepipeline.producers;

import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface X {

    public interface a {
        void a();

        void b(InputStream inputStream, int i10);

        void onFailure(Throwable th);
    }

    void a(C c10, a aVar);

    void b(C c10, int i10);

    boolean c(C c10);

    Map d(C c10, int i10);

    C e(InterfaceC2182n interfaceC2182n, e0 e0Var);
}

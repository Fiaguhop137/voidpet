package io.sentry;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Map;

/* JADX INFO: renamed from: io.sentry.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC3703f0 {
    void a(Object obj, Writer writer);

    void b(C3771q2 c3771q2, OutputStream outputStream);

    Object c(Reader reader, Class cls);

    C3771q2 d(InputStream inputStream);

    Object e(Reader reader, Class cls, InterfaceC3773r0 interfaceC3773r0);

    String f(Map map);
}

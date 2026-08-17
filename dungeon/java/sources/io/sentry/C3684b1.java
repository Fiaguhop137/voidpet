package io.sentry;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Map;

/* JADX INFO: renamed from: io.sentry.b1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3684b1 implements InterfaceC3703f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C3684b1 f45683a = new C3684b1();

    private C3684b1() {
    }

    public static C3684b1 g() {
        return f45683a;
    }

    @Override // io.sentry.InterfaceC3703f0
    public void a(Object obj, Writer writer) {
    }

    @Override // io.sentry.InterfaceC3703f0
    public void b(C3771q2 c3771q2, OutputStream outputStream) {
    }

    @Override // io.sentry.InterfaceC3703f0
    public Object c(Reader reader, Class cls) {
        return null;
    }

    @Override // io.sentry.InterfaceC3703f0
    public C3771q2 d(InputStream inputStream) {
        return null;
    }

    @Override // io.sentry.InterfaceC3703f0
    public Object e(Reader reader, Class cls, InterfaceC3773r0 interfaceC3773r0) {
        return null;
    }

    @Override // io.sentry.InterfaceC3703f0
    public String f(Map map) {
        return "";
    }
}

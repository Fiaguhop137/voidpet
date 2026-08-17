package io.sentry;

import java.io.Closeable;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: renamed from: io.sentry.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC3724j1 extends Closeable {
    static Date P1(String str, ILogger iLogger) {
        if (str == null) {
            return null;
        }
        try {
            try {
                return AbstractC3732l.f(str);
            } catch (Exception e10) {
                iLogger.b(EnumC3721i3.ERROR, "Error when deserializing millis timestamp format.", e10);
                return null;
            }
        } catch (Exception unused) {
            return AbstractC3732l.g(str);
        }
    }

    Object A1(ILogger iLogger, InterfaceC3773r0 interfaceC3773r0);

    TimeZone D0(ILogger iLogger);

    String D2();

    void I();

    void J();

    Map J2(ILogger iLogger, InterfaceC3773r0 interfaceC3773r0);

    List L3(ILogger iLogger, InterfaceC3773r0 interfaceC3773r0);

    void M2(ILogger iLogger, Map map, String str);

    void N();

    void Q(boolean z10);

    Double S0();

    void T();

    String X0();

    Date e1(ILogger iLogger);

    boolean hasNext();

    String j2();

    void k0();

    Boolean m1();

    double nextDouble();

    float nextFloat();

    int nextInt();

    long nextLong();

    Float p3();

    io.sentry.vendor.gson.stream.b peek();

    Integer t2();

    Long x2();

    Object z3();
}

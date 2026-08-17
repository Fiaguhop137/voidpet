package io.sentry;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: renamed from: io.sentry.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3820x0 implements InterfaceC3724j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.sentry.vendor.gson.stream.a f46695a;

    public C3820x0(Reader reader) {
        this.f46695a = new io.sentry.vendor.gson.stream.a(reader);
    }

    @Override // io.sentry.InterfaceC3724j1
    public Object A1(ILogger iLogger, InterfaceC3773r0 interfaceC3773r0) throws IOException {
        if (this.f46695a.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return interfaceC3773r0.a(this, iLogger);
        }
        this.f46695a.i();
        return null;
    }

    @Override // io.sentry.InterfaceC3724j1
    public TimeZone D0(ILogger iLogger) throws IOException {
        if (this.f46695a.peek() == io.sentry.vendor.gson.stream.b.NULL) {
            this.f46695a.i();
            return null;
        }
        try {
            return TimeZone.getTimeZone(this.f46695a.j2());
        } catch (Exception e10) {
            iLogger.b(EnumC3721i3.ERROR, "Error when deserializing TimeZone", e10);
            return null;
        }
    }

    @Override // io.sentry.InterfaceC3724j1
    public String D2() throws IOException {
        if (this.f46695a.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return this.f46695a.j2();
        }
        this.f46695a.i();
        return null;
    }

    @Override // io.sentry.InterfaceC3724j1
    public void I() throws IOException {
        this.f46695a.I();
    }

    @Override // io.sentry.InterfaceC3724j1
    public void J() throws IOException {
        this.f46695a.J();
    }

    @Override // io.sentry.InterfaceC3724j1
    public Map J2(ILogger iLogger, InterfaceC3773r0 interfaceC3773r0) throws IOException {
        if (this.f46695a.peek() == io.sentry.vendor.gson.stream.b.NULL) {
            this.f46695a.i();
            return null;
        }
        this.f46695a.I();
        HashMap map = new HashMap();
        if (this.f46695a.hasNext()) {
            while (true) {
                try {
                    map.put(this.f46695a.X0(), interfaceC3773r0.a(this, iLogger));
                } catch (Exception e10) {
                    iLogger.b(EnumC3721i3.WARNING, "Failed to deserialize object in map.", e10);
                }
                if (this.f46695a.peek() != io.sentry.vendor.gson.stream.b.BEGIN_OBJECT && this.f46695a.peek() != io.sentry.vendor.gson.stream.b.NAME) {
                    break;
                }
            }
        }
        this.f46695a.T();
        return map;
    }

    @Override // io.sentry.InterfaceC3724j1
    public List L3(ILogger iLogger, InterfaceC3773r0 interfaceC3773r0) throws IOException {
        if (this.f46695a.peek() == io.sentry.vendor.gson.stream.b.NULL) {
            this.f46695a.i();
            return null;
        }
        this.f46695a.N();
        ArrayList arrayList = new ArrayList();
        if (this.f46695a.hasNext()) {
            do {
                try {
                    arrayList.add(interfaceC3773r0.a(this, iLogger));
                } catch (Exception e10) {
                    iLogger.b(EnumC3721i3.WARNING, "Failed to deserialize object in list.", e10);
                }
            } while (this.f46695a.peek() == io.sentry.vendor.gson.stream.b.BEGIN_OBJECT);
        }
        this.f46695a.J();
        return arrayList;
    }

    @Override // io.sentry.InterfaceC3724j1
    public void M2(ILogger iLogger, Map map, String str) {
        try {
            map.put(str, z3());
        } catch (Exception e10) {
            iLogger.a(EnumC3721i3.ERROR, e10, "Error deserializing unknown key: %s", str);
        }
    }

    @Override // io.sentry.InterfaceC3724j1
    public void N() throws IOException {
        this.f46695a.N();
    }

    @Override // io.sentry.InterfaceC3724j1
    public void Q(boolean z10) {
        this.f46695a.Q(z10);
    }

    @Override // io.sentry.InterfaceC3724j1
    public Double S0() throws IOException {
        if (this.f46695a.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return Double.valueOf(this.f46695a.nextDouble());
        }
        this.f46695a.i();
        return null;
    }

    @Override // io.sentry.InterfaceC3724j1
    public void T() throws IOException {
        this.f46695a.T();
    }

    @Override // io.sentry.InterfaceC3724j1
    public String X0() {
        return this.f46695a.X0();
    }

    public boolean a() {
        return this.f46695a.g();
    }

    public void b() throws IOException {
        this.f46695a.i();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f46695a.close();
    }

    @Override // io.sentry.InterfaceC3724j1
    public Date e1(ILogger iLogger) throws IOException {
        if (this.f46695a.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return InterfaceC3724j1.P1(this.f46695a.j2(), iLogger);
        }
        this.f46695a.i();
        return null;
    }

    @Override // io.sentry.InterfaceC3724j1
    public boolean hasNext() {
        return this.f46695a.hasNext();
    }

    @Override // io.sentry.InterfaceC3724j1
    public String j2() {
        return this.f46695a.j2();
    }

    @Override // io.sentry.InterfaceC3724j1
    public void k0() throws IOException {
        this.f46695a.k0();
    }

    @Override // io.sentry.InterfaceC3724j1
    public Boolean m1() throws IOException {
        if (this.f46695a.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return Boolean.valueOf(this.f46695a.g());
        }
        this.f46695a.i();
        return null;
    }

    @Override // io.sentry.InterfaceC3724j1
    public double nextDouble() {
        return this.f46695a.nextDouble();
    }

    @Override // io.sentry.InterfaceC3724j1
    public float nextFloat() {
        return (float) this.f46695a.nextDouble();
    }

    @Override // io.sentry.InterfaceC3724j1
    public int nextInt() {
        return this.f46695a.nextInt();
    }

    @Override // io.sentry.InterfaceC3724j1
    public long nextLong() {
        return this.f46695a.nextLong();
    }

    @Override // io.sentry.InterfaceC3724j1
    public Float p3() throws IOException {
        if (this.f46695a.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return Float.valueOf(nextFloat());
        }
        this.f46695a.i();
        return null;
    }

    @Override // io.sentry.InterfaceC3724j1
    public io.sentry.vendor.gson.stream.b peek() {
        return this.f46695a.peek();
    }

    @Override // io.sentry.InterfaceC3724j1
    public Integer t2() throws IOException {
        if (this.f46695a.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return Integer.valueOf(this.f46695a.nextInt());
        }
        this.f46695a.i();
        return null;
    }

    @Override // io.sentry.InterfaceC3724j1
    public Long x2() throws IOException {
        if (this.f46695a.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return Long.valueOf(this.f46695a.nextLong());
        }
        this.f46695a.i();
        return null;
    }

    @Override // io.sentry.InterfaceC3724j1
    public Object z3() {
        return new C3815w0().e(this);
    }
}

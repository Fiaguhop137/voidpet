package io.sentry;

import io.sentry.util.AbstractC3807i;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class T2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Charset f44476d = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final U2 f44477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Callable f44478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f44479c;

    /* JADX INFO: Access modifiers changed from: private */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private byte[] f44480a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Callable f44481b;

        public a(Callable callable) {
            this.f44481b = callable;
        }

        private static byte[] b(byte[] bArr) {
            return bArr != null ? bArr : new byte[0];
        }

        public byte[] a() {
            Callable callable;
            if (this.f44480a == null && (callable = this.f44481b) != null) {
                this.f44480a = (byte[]) callable.call();
            }
            return b(this.f44480a);
        }
    }

    T2(U2 u10, Callable callable) {
        this.f44477a = (U2) io.sentry.util.w.c(u10, "SentryEnvelopeItemHeader is required.");
        this.f44478b = (Callable) io.sentry.util.w.c(callable, "DataFactory is required.");
        this.f44479c = null;
    }

    T2(U2 u10, byte[] bArr) {
        this.f44477a = (U2) io.sentry.util.w.c(u10, "SentryEnvelopeItemHeader is required.");
        this.f44479c = bArr;
        this.f44478b = null;
    }

    public static /* synthetic */ byte[] A(C3682b c3682b, long j10, InterfaceC3703f0 interfaceC3703f0, ILogger iLogger) throws io.sentry.exception.b {
        byte[] bArr;
        if (c3682b.f() != null) {
            byte[] bArrF = c3682b.f();
            B(bArrF.length, j10, c3682b.h());
            return bArrF;
        }
        if (c3682b.j() != null) {
            byte[] bArrC = io.sentry.util.o.c(interfaceC3703f0, iLogger, c3682b.j());
            if (bArrC != null) {
                B(bArrC.length, j10, c3682b.h());
                return bArrC;
            }
        } else {
            if (c3682b.i() != null) {
                return AbstractC3807i.b(c3682b.i(), j10);
            }
            if (c3682b.e() != null && (bArr = (byte[]) c3682b.e().call()) != null) {
                B(bArr.length, j10, c3682b.h());
                return bArr;
            }
        }
        throw new io.sentry.exception.b(String.format("Couldn't attach the attachment %s.\nPlease check that either bytes, serializable, path or provider is set.", c3682b.h()));
    }

    private static void B(long j10, long j11, String str) throws io.sentry.exception.b {
        if (j10 > j11) {
            throw new io.sentry.exception.b(String.format("Dropping attachment with filename '%s', because the size of the passed bytes with %d bytes is bigger than the maximum allowed attachment size of %d bytes.", str, Long.valueOf(j10), Long.valueOf(j11)));
        }
    }

    public static T2 C(InterfaceC3703f0 interfaceC3703f0, ILogger iLogger, C3682b c3682b, long j10) {
        a aVar = new a(new S2(c3682b, j10, interfaceC3703f0, iLogger));
        return new T2(new U2(EnumC3716h3.Attachment, new CallableC3790t2(aVar), c3682b.g(), c3682b.h(), c3682b.d()), new CallableC3797u2(aVar));
    }

    public static T2 D(InterfaceC3703f0 interfaceC3703f0, io.sentry.clientreport.c cVar) {
        io.sentry.util.w.c(interfaceC3703f0, "ISerializer is required.");
        io.sentry.util.w.c(cVar, "ClientReport is required.");
        a aVar = new a(new B2(interfaceC3703f0, cVar));
        return new T2(new U2(EnumC3716h3.resolve(cVar), new C2(aVar), "application/json", null), new E2(aVar));
    }

    public static T2 E(InterfaceC3703f0 interfaceC3703f0, AbstractC3725j2 abstractC3725j2) {
        io.sentry.util.w.c(interfaceC3703f0, "ISerializer is required.");
        io.sentry.util.w.c(abstractC3725j2, "SentryEvent is required.");
        a aVar = new a(new CallableC3827y2(interfaceC3703f0, abstractC3725j2));
        return new T2(new U2(EnumC3716h3.resolve(abstractC3725j2), new CallableC3832z2(aVar), "application/json", null), new A2(aVar));
    }

    public static T2 F(InterfaceC3703f0 interfaceC3703f0, C3741m3 c3741m3) {
        io.sentry.util.w.c(interfaceC3703f0, "ISerializer is required.");
        io.sentry.util.w.c(c3741m3, "SentryLogEvents is required.");
        a aVar = new a(new F2(interfaceC3703f0, c3741m3));
        return new T2(new U2(EnumC3716h3.Log, new G2(aVar), "application/vnd.sentry.items.log+json", (String) null, (String) null, (String) null, Integer.valueOf(c3741m3.a().size())), new H2(aVar));
    }

    public static T2 G(InterfaceC3703f0 interfaceC3703f0, C3772q3 c3772q3) {
        io.sentry.util.w.c(interfaceC3703f0, "ISerializer is required.");
        io.sentry.util.w.c(c3772q3, "SentryMetricsEvents is required.");
        a aVar = new a(new P2(interfaceC3703f0, c3772q3));
        return new T2(new U2(EnumC3716h3.TraceMetric, new Q2(aVar), "application/vnd.sentry.items.trace-metric+json", (String) null, (String) null, (String) null, Integer.valueOf(c3772q3.a().size())), new R2(aVar));
    }

    public static T2 H(C3774r1 c3774r1, InterfaceC3703f0 interfaceC3703f0, X x10) {
        File fileQ = c3774r1.q();
        a aVar = new a(new M2(fileQ, c3774r1, x10, interfaceC3703f0));
        return new T2(new U2(EnumC3716h3.ProfileChunk, new N2(aVar), "application-json", fileQ.getName(), (String) null, c3774r1.p(), (Integer) null), new O2(aVar));
    }

    public static T2 I(C3811v1 c3811v1, long j10, InterfaceC3703f0 interfaceC3703f0) {
        File fileC = c3811v1.C();
        a aVar = new a(new CallableC3812v2(fileC, j10, c3811v1, interfaceC3703f0));
        return new T2(new U2(EnumC3716h3.Profile, new CallableC3817w2(aVar), "application-json", fileC.getName()), new CallableC3822x2(aVar));
    }

    public static T2 J(InterfaceC3703f0 interfaceC3703f0, ILogger iLogger, A3 a10, A1 a11, boolean z10) {
        a aVar = new a(new I2(interfaceC3703f0, a10, a11, a10.h0(), iLogger, z10));
        return new T2(new U2(EnumC3716h3.ReplayVideo, new J2(aVar), null, null), new K2(aVar));
    }

    public static T2 K(InterfaceC3703f0 interfaceC3703f0, O3 o10) {
        io.sentry.util.w.c(interfaceC3703f0, "ISerializer is required.");
        io.sentry.util.w.c(o10, "Session is required.");
        a aVar = new a(new CallableC3785s2(interfaceC3703f0, o10));
        return new T2(new U2(EnumC3716h3.Session, new D2(aVar), "application/json", null), new L2(aVar));
    }

    private static byte[] S(Map map) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write((byte) (map.size() | 128));
            for (Map.Entry entry : map.entrySet()) {
                byte[] bytes = ((String) entry.getKey()).getBytes(f44476d);
                int length = bytes.length;
                byteArrayOutputStream.write(-39);
                byteArrayOutputStream.write((byte) length);
                byteArrayOutputStream.write(bytes);
                byte[] bArr = (byte[]) entry.getValue();
                int length2 = bArr.length;
                byteArrayOutputStream.write(-58);
                byteArrayOutputStream.write(ByteBuffer.allocate(4).order(ByteOrder.BIG_ENDIAN).putInt(length2).array());
                byteArrayOutputStream.write(bArr);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static /* synthetic */ byte[] c(InterfaceC3703f0 interfaceC3703f0, A3 a10, A1 a11, File file, ILogger iLogger, boolean z10) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f44476d));
                try {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    interfaceC3703f0.a(a10, bufferedWriter);
                    linkedHashMap.put(EnumC3716h3.ReplayEvent.getItemType(), byteArrayOutputStream.toByteArray());
                    byteArrayOutputStream.reset();
                    if (a11 != null) {
                        interfaceC3703f0.a(a11, bufferedWriter);
                        linkedHashMap.put(EnumC3716h3.ReplayRecording.getItemType(), byteArrayOutputStream.toByteArray());
                        byteArrayOutputStream.reset();
                    }
                    if (file != null && file.exists()) {
                        byte[] bArrB = AbstractC3807i.b(file.getPath(), 10485760L);
                        if (bArrB.length > 0) {
                            linkedHashMap.put(EnumC3716h3.ReplayVideo.getItemType(), bArrB);
                        }
                    }
                    byte[] bArrS = S(linkedHashMap);
                    bufferedWriter.close();
                    byteArrayOutputStream.close();
                    if (file != null) {
                        if (z10) {
                            AbstractC3807i.a(file.getParentFile());
                            return bArrS;
                        }
                        file.delete();
                    }
                    return bArrS;
                } catch (Throwable th) {
                    try {
                        bufferedWriter.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            try {
                iLogger.b(EnumC3721i3.ERROR, "Could not serialize replay recording", th5);
                return null;
            } finally {
                if (file != null) {
                    if (z10) {
                        AbstractC3807i.a(file.getParentFile());
                    } else {
                        file.delete();
                    }
                }
            }
        }
    }

    public static /* synthetic */ byte[] d(InterfaceC3703f0 interfaceC3703f0, io.sentry.clientreport.c cVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f44476d));
            try {
                interfaceC3703f0.a(cVar, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static /* synthetic */ byte[] o(InterfaceC3703f0 interfaceC3703f0, AbstractC3725j2 abstractC3725j2) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f44476d));
            try {
                interfaceC3703f0.a(abstractC3725j2, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static /* synthetic */ byte[] p(File file, long j10, C3811v1 c3811v1, InterfaceC3703f0 interfaceC3703f0) throws io.sentry.exception.b {
        if (!file.exists()) {
            throw new io.sentry.exception.b(String.format("Dropping profiling trace data, because the file '%s' doesn't exists", file.getName()));
        }
        String strF = io.sentry.vendor.a.f(AbstractC3807i.b(file.getPath(), j10), 3);
        if (strF.isEmpty()) {
            throw new io.sentry.exception.b("Profiling trace file is empty");
        }
        c3811v1.F(strF);
        c3811v1.E();
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f44476d));
                    try {
                        interfaceC3703f0.a(c3811v1, bufferedWriter);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        bufferedWriter.close();
                        byteArrayOutputStream.close();
                        file.delete();
                        return byteArray;
                    } catch (Throwable th) {
                        try {
                            bufferedWriter.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                file.delete();
                throw th5;
            }
        } catch (IOException e10) {
            throw new io.sentry.exception.b(String.format("Failed to serialize profiling trace data\n%s", e10.getMessage()));
        }
    }

    public static /* synthetic */ byte[] t(InterfaceC3703f0 interfaceC3703f0, C3772q3 c3772q3) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f44476d));
            try {
                interfaceC3703f0.a(c3772q3, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static /* synthetic */ byte[] v(InterfaceC3703f0 interfaceC3703f0, C3741m3 c3741m3) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f44476d));
            try {
                interfaceC3703f0.a(c3741m3, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static /* synthetic */ byte[] w(InterfaceC3703f0 interfaceC3703f0, O3 o10) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f44476d));
            try {
                interfaceC3703f0.a(o10, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static /* synthetic */ byte[] x(File file, C3774r1 c3774r1, X x10, InterfaceC3703f0 interfaceC3703f0) throws io.sentry.exception.b {
        if (!file.exists()) {
            throw new io.sentry.exception.b(String.format("Dropping profile chunk, because the file '%s' doesn't exists", file.getName()));
        }
        if (!"java".equals(c3774r1.p())) {
            String strF = io.sentry.vendor.a.f(AbstractC3807i.b(file.getPath(), 52428800L), 3);
            if (strF.isEmpty()) {
                throw new io.sentry.exception.b("Profiling trace file is empty");
            }
            c3774r1.s(strF);
        } else {
            if (O0.b().equals(x10)) {
                throw new io.sentry.exception.b("No ProfileConverter available, dropping chunk.");
            }
            try {
                c3774r1.t(x10.a(file.getAbsolutePath()));
            } catch (Exception e10) {
                throw new io.sentry.exception.b("Profile conversion failed", e10);
            }
        }
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f44476d));
                    try {
                        interfaceC3703f0.a(c3774r1, bufferedWriter);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        bufferedWriter.close();
                        byteArrayOutputStream.close();
                        file.delete();
                        return byteArray;
                    } catch (Throwable th) {
                        try {
                            bufferedWriter.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (IOException e11) {
                throw new io.sentry.exception.b(String.format("Failed to serialize profile chunk\n%s", e11.getMessage()));
            }
        } catch (Throwable th5) {
            file.delete();
            throw th5;
        }
    }

    public io.sentry.clientreport.c L(InterfaceC3703f0 interfaceC3703f0) throws IOException {
        U2 u10 = this.f44477a;
        if (u10 == null || u10.e() != EnumC3716h3.ClientReport) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(M()), f44476d));
        try {
            io.sentry.clientreport.c cVar = (io.sentry.clientreport.c) interfaceC3703f0.c(bufferedReader, io.sentry.clientreport.c.class);
            bufferedReader.close();
            return cVar;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public byte[] M() {
        Callable callable;
        if (this.f44479c == null && (callable = this.f44478b) != null) {
            this.f44479c = (byte[]) callable.call();
        }
        return this.f44479c;
    }

    public V2 N(InterfaceC3703f0 interfaceC3703f0) throws IOException {
        U2 u10 = this.f44477a;
        if (u10 == null || u10.e() != EnumC3716h3.Event) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(M()), f44476d));
        try {
            V2 v10 = (V2) interfaceC3703f0.c(bufferedReader, V2.class);
            bufferedReader.close();
            return v10;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public U2 O() {
        return this.f44477a;
    }

    public C3741m3 P(InterfaceC3703f0 interfaceC3703f0) throws IOException {
        U2 u10 = this.f44477a;
        if (u10 == null || u10.e() != EnumC3716h3.Log) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(M()), f44476d));
        try {
            C3741m3 c3741m3 = (C3741m3) interfaceC3703f0.c(bufferedReader, C3741m3.class);
            bufferedReader.close();
            return c3741m3;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public C3772q3 Q(InterfaceC3703f0 interfaceC3703f0) throws IOException {
        U2 u10 = this.f44477a;
        if (u10 == null || u10.e() != EnumC3716h3.TraceMetric) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(M()), f44476d));
        try {
            C3772q3 c3772q3 = (C3772q3) interfaceC3703f0.c(bufferedReader, C3772q3.class);
            bufferedReader.close();
            return c3772q3;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public io.sentry.protocol.E R(InterfaceC3703f0 interfaceC3703f0) throws IOException {
        U2 u10 = this.f44477a;
        if (u10 == null || u10.e() != EnumC3716h3.Transaction) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(M()), f44476d));
        try {
            io.sentry.protocol.E e10 = (io.sentry.protocol.E) interfaceC3703f0.c(bufferedReader, io.sentry.protocol.E.class);
            bufferedReader.close();
            return e10;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}

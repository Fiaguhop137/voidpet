package com.applovin.impl;

import android.os.Process;
import android.os.SystemClock;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.PriorityBlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public final class q1 extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PriorityBlockingQueue f28297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f28298b;

    public q1(PriorityBlockingQueue priorityBlockingQueue, p pVar) {
        super("AxonSdk:network");
        if (priorityBlockingQueue == null) {
            throw new IllegalArgumentException("No request queue specified");
        }
        if (pVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f28297a = priorityBlockingQueue;
        this.f28298b = pVar;
        setPriority(((Integer) pVar.l().a(m2.f28133G)).intValue());
    }

    public static HttpURLConnection a(s1 s1Var) throws ProtocolException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(s1Var.f28340a).openConnection();
        httpURLConnection.setRequestMethod(s1Var.f28341b);
        httpURLConnection.setConnectTimeout(s1Var.f28344e);
        httpURLConnection.setReadTimeout(s1Var.f28344e);
        httpURLConnection.setDefaultUseCaches(false);
        httpURLConnection.setAllowUserInteraction(false);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setInstanceFollowRedirects(true);
        httpURLConnection.setDoInput(true);
        if (!s1Var.f28342c.isEmpty()) {
            for (Map.Entry entry : s1Var.f28342c.entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return httpURLConnection;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x00e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x0118 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x0112 A[EDGE_INSN: B:130:0x0112->B:81:0x0112 BREAK  A[LOOP:0: B:76:0x0105->B:78:0x010b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00d3 A[Catch: all -> 0x00df, TRY_LEAVE, TryCatch #15 {all -> 0x00df, blocks: (B:64:0x00bd, B:66:0x00d3, B:93:0x0131), top: B:128:0x00bd }] */
    /* JADX WARN: Code duplicated, block: B:74:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ee A[Catch: all -> 0x010f, TryCatch #5 {all -> 0x010f, blocks: (B:72:0x00e8, B:75:0x00ee, B:76:0x0105, B:78:0x010b, B:81:0x0112), top: B:109:0x00e8, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x010b A[Catch: all -> 0x010f, LOOP:0: B:76:0x0105->B:78:0x010b, LOOP_END, TryCatch #5 {all -> 0x010f, blocks: (B:72:0x00e8, B:75:0x00ee, B:76:0x0105, B:78:0x010b, B:81:0x0112), top: B:109:0x00e8, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x013b  */
    public final void b(s1 s1Var) {
        long j10;
        int responseCode;
        HttpURLConnection httpURLConnection;
        byte[] byteArray;
        Throwable th;
        byte[] byteArray2;
        byte[] bArr;
        InputStream errorStream;
        p pVar;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr2;
        int i10;
        HttpURLConnection httpURLConnectionA;
        long jElapsedRealtime;
        long jElapsedRealtime2;
        long jElapsedRealtime3 = SystemClock.elapsedRealtime();
        try {
            httpURLConnectionA = a(s1Var);
            try {
                byte[] bArr3 = s1Var.f28343d;
                if (bArr3 != null && bArr3.length > 0) {
                    httpURLConnectionA.setDoOutput(true);
                    httpURLConnectionA.setFixedLengthStreamingMode(s1Var.f28343d.length);
                    OutputStream outputStream = httpURLConnectionA.getOutputStream();
                    try {
                        outputStream.write(s1Var.f28343d);
                        outputStream.close();
                    } catch (Throwable th2) {
                        if (outputStream == null) {
                            throw th2;
                        }
                        try {
                            outputStream.close();
                            throw th2;
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                            throw th2;
                        }
                    }
                }
                jElapsedRealtime = SystemClock.elapsedRealtime();
                responseCode = httpURLConnectionA.getResponseCode();
                try {
                    jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    if (responseCode > 0) {
                        try {
                            InputStream inputStream = httpURLConnectionA.getInputStream();
                            try {
                                p pVar2 = this.f28298b;
                                if (inputStream == null) {
                                    byteArray = null;
                                } else {
                                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                    byte[] bArr4 = new byte[((Integer) pVar2.l().a(t.f28358k)).intValue()];
                                    while (true) {
                                        int i11 = inputStream.read(bArr4);
                                        if (i11 <= 0) {
                                            break;
                                        } else {
                                            byteArrayOutputStream2.write(bArr4, 0, i11);
                                        }
                                        th = th;
                                        byteArray = null;
                                        try {
                                            throw th;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            th = th;
                                            httpURLConnection = httpURLConnectionA;
                                            j10 = jElapsedRealtime;
                                            try {
                                                long jElapsedRealtime4 = SystemClock.elapsedRealtime();
                                                this.f28298b.g().a("NetworkCommunicationThread", th);
                                                this.f28298b.g();
                                                if (p1.f28289b) {
                                                    this.f28298b.g().d("NetworkCommunicationThread", "Failed to make HTTP request", th);
                                                }
                                                if (httpURLConnection != null) {
                                                    try {
                                                        errorStream = httpURLConnection.getErrorStream();
                                                        try {
                                                            pVar = this.f28298b;
                                                            if (errorStream == null) {
                                                                byteArray2 = null;
                                                            } else {
                                                                byteArrayOutputStream = new ByteArrayOutputStream();
                                                                bArr2 = new byte[((Integer) pVar.l().a(t.f28358k)).intValue()];
                                                                while (true) {
                                                                    i10 = errorStream.read(bArr2);
                                                                    if (i10 > 0) {
                                                                        break;
                                                                    } else {
                                                                        byteArrayOutputStream.write(bArr2, 0, i10);
                                                                    }
                                                                    byteArray2 = null;
                                                                    this.f28298b.g().a("NetworkCommunicationThread", th);
                                                                    bArr = byteArray2;
                                                                }
                                                                byteArray2 = byteArrayOutputStream.toByteArray();
                                                            }
                                                            if (errorStream != null) {
                                                                try {
                                                                    errorStream.close();
                                                                } catch (Throwable unused) {
                                                                    this.f28298b.g().a("NetworkCommunicationThread", th);
                                                                    bArr = byteArray2;
                                                                    long j11 = j10;
                                                                    httpURLConnectionA = httpURLConnection;
                                                                    jElapsedRealtime = j11;
                                                                    responseCode = responseCode;
                                                                    jElapsedRealtime2 = jElapsedRealtime4;
                                                                    e0.a(httpURLConnectionA, this.f28298b.g());
                                                                    t1 t1Var = new t1();
                                                                    t1Var.f28361a = responseCode;
                                                                    t1Var.f28362b = byteArray;
                                                                    t1Var.f28363c = bArr;
                                                                    t1Var.f28364d = jElapsedRealtime2 - jElapsedRealtime;
                                                                    t1Var.f28365e = th;
                                                                    s1Var.f28346g.execute(new p184k4.l0(s1Var, new u1(t1Var)));
                                                                }
                                                            }
                                                        } catch (Throwable th5) {
                                                            if (errorStream == null) {
                                                                throw th5;
                                                            }
                                                            try {
                                                                errorStream.close();
                                                                throw th5;
                                                            } catch (Throwable th6) {
                                                                th5.addSuppressed(th6);
                                                                throw th5;
                                                            }
                                                        }
                                                    } catch (Throwable unused2) {
                                                        byteArray2 = null;
                                                        this.f28298b.g().a("NetworkCommunicationThread", th);
                                                        bArr = byteArray2;
                                                        long j12 = j10;
                                                        httpURLConnectionA = httpURLConnection;
                                                        jElapsedRealtime = j12;
                                                        responseCode = responseCode;
                                                        jElapsedRealtime2 = jElapsedRealtime4;
                                                        e0.a(httpURLConnectionA, this.f28298b.g());
                                                        t1 t1Var2 = new t1();
                                                        t1Var2.f28361a = responseCode;
                                                        t1Var2.f28362b = byteArray;
                                                        t1Var2.f28363c = bArr;
                                                        t1Var2.f28364d = jElapsedRealtime2 - jElapsedRealtime;
                                                        t1Var2.f28365e = th;
                                                        s1Var.f28346g.execute(new p184k4.l0(s1Var, new u1(t1Var2)));
                                                    }
                                                    bArr = byteArray2;
                                                } else {
                                                    bArr = null;
                                                }
                                                long j13 = j10;
                                                httpURLConnectionA = httpURLConnection;
                                                jElapsedRealtime = j13;
                                                responseCode = responseCode;
                                                jElapsedRealtime2 = jElapsedRealtime4;
                                                e0.a(httpURLConnectionA, this.f28298b.g());
                                                t1 t1Var3 = new t1();
                                                t1Var3.f28361a = responseCode;
                                                t1Var3.f28362b = byteArray;
                                                t1Var3.f28363c = bArr;
                                                t1Var3.f28364d = jElapsedRealtime2 - jElapsedRealtime;
                                                t1Var3.f28365e = th;
                                                s1Var.f28346g.execute(new p184k4.l0(s1Var, new u1(t1Var3)));
                                            } catch (Throwable th7) {
                                                e0.a(httpURLConnection, this.f28298b.g());
                                                throw th7;
                                            }
                                        }
                                    }
                                    byteArray = byteArrayOutputStream2.toByteArray();
                                }
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (Throwable th8) {
                                        th = th8;
                                        throw th;
                                    }
                                }
                                bArr = null;
                                th = null;
                            } catch (Throwable th9) {
                                if (inputStream == null) {
                                    throw th9;
                                }
                                try {
                                    inputStream.close();
                                    throw th9;
                                } catch (Throwable th10) {
                                    th9.addSuppressed(th10);
                                    throw th9;
                                }
                            }
                        } catch (Throwable th11) {
                            th = th11;
                            byteArray = null;
                        }
                    } else {
                        bArr = null;
                        th = null;
                        byteArray = null;
                    }
                } catch (Throwable th12) {
                    th = th12;
                    byteArray = null;
                }
            } catch (Throwable th13) {
                httpURLConnection = httpURLConnectionA;
                j10 = jElapsedRealtime3;
                th = th13;
                responseCode = 0;
                byteArray = null;
                long jElapsedRealtime5 = SystemClock.elapsedRealtime();
                this.f28298b.g().a("NetworkCommunicationThread", th);
                this.f28298b.g();
                if (p1.f28289b) {
                    this.f28298b.g().d("NetworkCommunicationThread", "Failed to make HTTP request", th);
                }
                if (httpURLConnection != null) {
                    errorStream = httpURLConnection.getErrorStream();
                    pVar = this.f28298b;
                    if (errorStream == null) {
                        byteArray2 = null;
                    } else {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        bArr2 = new byte[((Integer) pVar.l().a(t.f28358k)).intValue()];
                        while (true) {
                            i10 = errorStream.read(bArr2);
                            if (i10 > 0) {
                                break;
                                break;
                            }
                            byteArrayOutputStream.write(bArr2, 0, i10);
                            byteArray2 = null;
                            this.f28298b.g().a("NetworkCommunicationThread", th);
                            bArr = byteArray2;
                        }
                        byteArray2 = byteArrayOutputStream.toByteArray();
                    }
                    if (errorStream != null) {
                        errorStream.close();
                    }
                    bArr = byteArray2;
                } else {
                    bArr = null;
                }
                long j14 = j10;
                httpURLConnectionA = httpURLConnection;
                jElapsedRealtime = j14;
                responseCode = responseCode;
                jElapsedRealtime2 = jElapsedRealtime5;
                e0.a(httpURLConnectionA, this.f28298b.g());
                t1 t1Var4 = new t1();
                t1Var4.f28361a = responseCode;
                t1Var4.f28362b = byteArray;
                t1Var4.f28363c = bArr;
                t1Var4.f28364d = jElapsedRealtime2 - jElapsedRealtime;
                t1Var4.f28365e = th;
                s1Var.f28346g.execute(new p184k4.l0(s1Var, new u1(t1Var4)));
            }
        } catch (Throwable th14) {
            j10 = jElapsedRealtime3;
            responseCode = 0;
            httpURLConnection = null;
            byteArray = null;
            th = th14;
        }
        e0.a(httpURLConnectionA, this.f28298b.g());
        t1 t1Var5 = new t1();
        t1Var5.f28361a = responseCode;
        t1Var5.f28362b = byteArray;
        t1Var5.f28363c = bArr;
        t1Var5.f28364d = jElapsedRealtime2 - jElapsedRealtime;
        t1Var5.f28365e = th;
        s1Var.f28346g.execute(new p184k4.l0(s1Var, new u1(t1Var5)));
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                b((s1) this.f28297a.take());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.AbstractC2546n0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes2.dex */
final class A4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final URL f34854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f34855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3089y4 f34856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f34857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f34858e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ B4 f34859f;

    public A4(B4 b10, String str, URL url, byte[] bArr, Map map, InterfaceC3089y4 interfaceC3089y4) {
        Objects.requireNonNull(b10);
        this.f34859f = b10;
        p170j8.r.f(str);
        p170j8.r.l(url);
        p170j8.r.l(interfaceC3089y4);
        this.f34854a = url;
        this.f34855b = bArr;
        this.f34856c = interfaceC3089y4;
        this.f34857d = str;
        this.f34858e = map;
    }

    private final void b(int i10, Exception exc, byte[] bArr, Map map) {
        this.f34859f.f34853a.b().t(new RunnableC3096z4(this, i10, exc, bArr, map));
    }

    final /* synthetic */ void a(int i10, Exception exc, byte[] bArr, Map map) {
        this.f34856c.a(this.f34857d, i10, exc, bArr, map);
    }

    /* JADX WARN: Code duplicated, block: B:77:0x0151  */
    /* JADX WARN: Code duplicated, block: B:87:0x0179  */
    /* JADX WARN: Code duplicated, block: B:90:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x015d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.google.android.gms.measurement.internal.A4] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v3 */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        HttpURLConnection httpURLConnection;
        OutputStream outputStream;
        OutputStream outputStream2;
        ?? r10;
        OutputStream outputStream3;
        ?? r11;
        OutputStream outputStream4;
        InputStream inputStream;
        B4 b10 = this.f34859f;
        b10.g();
        int i10 = 0;
        try {
            URL url = this.f34854a;
            int i11 = AbstractC2546n0.f33020a;
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setDefaultUseCaches(false);
            X2 x10 = b10.f34853a;
            x10.w();
            httpURLConnection.setConnectTimeout(60000);
            x10.w();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            ?? r12 = 1;
            httpURLConnection.setDoInput(true);
            try {
                try {
                    Map map = this.f34858e;
                    if (map != null) {
                        for (Map.Entry entry : map.entrySet()) {
                            httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                    }
                    byte[] bArr = this.f34855b;
                    if (bArr != null) {
                        try {
                            x10.c();
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                            gZIPOutputStream.write(bArr);
                            gZIPOutputStream.close();
                            byteArrayOutputStream.close();
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            C3018o2 c3018o2W = this.f34859f.f34853a.a().w();
                            int length = byteArray.length;
                            c3018o2W.b("Uploading data. size", Integer.valueOf(length));
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                            httpURLConnection.setFixedLengthStreamingMode(length);
                            httpURLConnection.connect();
                            OutputStream outputStream5 = httpURLConnection.getOutputStream();
                            try {
                                outputStream5.write(byteArray);
                                outputStream5.close();
                                r12 = outputStream5;
                            } catch (IOException e10) {
                                e = e10;
                                r11 = 0;
                                outputStream4 = outputStream5;
                                if (outputStream4 != null) {
                                    try {
                                        outputStream4.close();
                                    } catch (IOException e11) {
                                        this.f34859f.f34853a.a().o().c("Error closing HTTP compressed POST connection output stream. appId", C3032q2.x(this.f34857d), e11);
                                    }
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                b(i10, e, null, r11);
                            } catch (Throwable th) {
                                th = th;
                                r10 = 0;
                                outputStream3 = outputStream5;
                                if (outputStream3 != null) {
                                    try {
                                        outputStream3.close();
                                    } catch (IOException e12) {
                                        this.f34859f.f34853a.a().o().c("Error closing HTTP compressed POST connection output stream. appId", C3032q2.x(this.f34857d), e12);
                                    }
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                b(i10, null, null, r10);
                                throw th;
                            }
                        } catch (IOException e13) {
                            this.f34859f.f34853a.a().o().b("Failed to gzip post request content", e13);
                            throw e13;
                        }
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    try {
                        try {
                            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                            try {
                                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                inputStream = httpURLConnection.getInputStream();
                                try {
                                    byte[] bArr2 = new byte[1024];
                                    while (true) {
                                        int i12 = inputStream.read(bArr2);
                                        if (i12 <= 0) {
                                            byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                                            inputStream.close();
                                            httpURLConnection.disconnect();
                                            b(responseCode, null, byteArray2, headerFields);
                                            return;
                                        }
                                        byteArrayOutputStream2.write(bArr2, 0, i12);
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                inputStream = null;
                            }
                        } catch (IOException e14) {
                            i10 = responseCode;
                            e = e14;
                            outputStream2 = null;
                            r11 = outputStream2;
                            outputStream4 = outputStream2;
                            if (outputStream4 != null) {
                                outputStream4.close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            b(i10, e, null, r11);
                        } catch (Throwable th4) {
                            i10 = responseCode;
                            th = th4;
                            outputStream = null;
                            r10 = outputStream;
                            outputStream3 = outputStream;
                            if (outputStream3 != null) {
                                outputStream3.close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            b(i10, null, null, r10);
                            throw th;
                        }
                    } catch (IOException e15) {
                        i10 = responseCode;
                        e = e15;
                        r11 = r12;
                        outputStream4 = null;
                        if (outputStream4 != null) {
                            outputStream4.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        b(i10, e, null, r11);
                    } catch (Throwable th5) {
                        i10 = responseCode;
                        th = th5;
                        r10 = r12;
                        outputStream3 = null;
                        if (outputStream3 != null) {
                            outputStream3.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        b(i10, null, null, r10);
                        throw th;
                    }
                } catch (IOException e16) {
                    e = e16;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (IOException e17) {
            e = e17;
            httpURLConnection = null;
            outputStream2 = null;
        } catch (Throwable th7) {
            th = th7;
            httpURLConnection = null;
            outputStream = null;
        }
    }
}

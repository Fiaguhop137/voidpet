package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AssetManager f24827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f24828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f.c f24829c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final File f24831e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f24832f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f24833g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f24834h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private c[] f24836j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private byte[] f24837k;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f24835i = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f24830d = d();

    public b(AssetManager assetManager, Executor executor, f.c cVar, String str, String str2, String str3, File file) {
        this.f24827a = assetManager;
        this.f24828b = executor;
        this.f24829c = cVar;
        this.f24832f = str;
        this.f24833g = str2;
        this.f24834h = str3;
        this.f24831e = file;
    }

    private b b(c[] cVarArr, byte[] bArr) {
        try {
            InputStream inputStreamG = g(this.f24827a, this.f24834h);
            if (inputStreamG == null) {
                if (inputStreamG != null) {
                    inputStreamG.close();
                }
                return null;
            }
            try {
                this.f24836j = g.r(inputStreamG, g.p(inputStreamG, g.f24857b), bArr, cVarArr);
                inputStreamG.close();
                return this;
            } catch (Throwable th) {
                try {
                    inputStreamG.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (FileNotFoundException e10) {
            this.f24829c.a(9, e10);
        } catch (IOException e11) {
            this.f24829c.a(7, e11);
        } catch (IllegalStateException e12) {
            this.f24836j = null;
            this.f24829c.a(8, e12);
        }
    }

    private void c() {
        if (!this.f24835i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    private static byte[] d() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            return i.f24869a;
        }
        switch (i10) {
            case 24:
            case 25:
                return i.f24873e;
            case 26:
                return i.f24872d;
            case 27:
                return i.f24871c;
            case 28:
            case 29:
            case 30:
                return i.f24870b;
            default:
                return null;
        }
    }

    private InputStream f(AssetManager assetManager) {
        try {
            return g(assetManager, this.f24833g);
        } catch (FileNotFoundException e10) {
            this.f24829c.a(6, e10);
            return null;
        } catch (IOException e11) {
            this.f24829c.a(7, e11);
            return null;
        }
    }

    private InputStream g(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f24829c.b(5, null);
            }
            return null;
        }
    }

    private c[] i(InputStream inputStream) {
        try {
            try {
                try {
                    c[] cVarArrX = g.x(inputStream, g.p(inputStream, g.f24856a), this.f24832f);
                    try {
                        inputStream.close();
                        return cVarArrX;
                    } catch (IOException e10) {
                        this.f24829c.a(7, e10);
                        return cVarArrX;
                    }
                } catch (IllegalStateException e11) {
                    this.f24829c.a(8, e11);
                    try {
                        inputStream.close();
                    } catch (IOException e12) {
                        this.f24829c.a(7, e12);
                    }
                    return null;
                }
            } catch (IOException e13) {
                this.f24829c.a(7, e13);
                inputStream.close();
                return null;
            }
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException e14) {
                this.f24829c.a(7, e14);
            }
            throw th;
        }
    }

    private static boolean j() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 31 || i10 == 24 || i10 == 25;
    }

    private void k(int i10, Object obj) {
        this.f24828b.execute(new p148i3.a(this, i10, obj));
    }

    public boolean e() {
        if (this.f24830d == null) {
            k(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (!this.f24831e.exists()) {
            try {
                if (!this.f24831e.createNewFile()) {
                    k(4, null);
                    return false;
                }
            } catch (IOException unused) {
                k(4, null);
                return false;
            }
        } else if (!this.f24831e.canWrite()) {
            k(4, null);
            return false;
        }
        this.f24835i = true;
        return true;
    }

    public b h() {
        b bVarB;
        c();
        if (this.f24830d != null) {
            InputStream inputStreamF = f(this.f24827a);
            if (inputStreamF != null) {
                this.f24836j = i(inputStreamF);
            }
            c[] cVarArr = this.f24836j;
            if (cVarArr != null && j() && (bVarB = b(cVarArr, this.f24830d)) != null) {
                return bVarB;
            }
        }
        return this;
    }

    public b l() {
        c[] cVarArr = this.f24836j;
        byte[] bArr = this.f24830d;
        if (cVarArr != null && bArr != null) {
            c();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    g.F(byteArrayOutputStream, bArr);
                    if (!g.C(byteArrayOutputStream, bArr, cVarArr)) {
                        this.f24829c.a(5, null);
                        this.f24836j = null;
                        byteArrayOutputStream.close();
                        return this;
                    }
                    this.f24837k = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    this.f24836j = null;
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e10) {
                this.f24829c.a(7, e10);
            } catch (IllegalStateException e11) {
                this.f24829c.a(8, e11);
            }
        }
        return this;
    }

    public boolean m() {
        byte[] bArr = this.f24837k;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f24831e);
                    try {
                        FileChannel channel = fileOutputStream.getChannel();
                        try {
                            FileLock fileLockTryLock = channel.tryLock();
                            try {
                                d.l(byteArrayInputStream, fileOutputStream, fileLockTryLock);
                                k(1, null);
                                if (fileLockTryLock != null) {
                                    fileLockTryLock.close();
                                }
                                channel.close();
                                fileOutputStream.close();
                                byteArrayInputStream.close();
                                this.f24837k = null;
                                this.f24836j = null;
                                return true;
                            } catch (Throwable th) {
                                if (fileLockTryLock != null) {
                                    try {
                                        fileLockTryLock.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            if (channel != null) {
                                try {
                                    channel.close();
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                }
                            }
                            throw th3;
                        }
                    } catch (Throwable th5) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                } catch (Throwable th7) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                    }
                    throw th7;
                }
            } catch (FileNotFoundException e10) {
                k(6, e10);
                this.f24837k = null;
                this.f24836j = null;
                return false;
            } catch (IOException e11) {
                k(7, e11);
                this.f24837k = null;
                this.f24836j = null;
                return false;
            }
        } catch (Throwable th9) {
            this.f24837k = null;
            this.f24836j = null;
            throw th9;
        }
    }
}

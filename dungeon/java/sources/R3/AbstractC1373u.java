package R3;

import If.InterfaceC1108j;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: renamed from: R3.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1373u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f10858a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set f10859b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f10860c = {80, 75, 3, 4};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte[] f10861d = {31, -117, 8};

    public static U A(Context context, int i10, String str) {
        C1364k c1364kA = str == null ? null : X3.g.b().a(str);
        if (c1364kA != null) {
            return new U(c1364kA);
        }
        try {
            InterfaceC1108j interfaceC1108jD = If.K.d(If.K.l(context.getResources().openRawResource(i10)));
            if (K(interfaceC1108jD).booleanValue()) {
                return F(context, new ZipInputStream(interfaceC1108jD.Y()), str);
            }
            if (!I(interfaceC1108jD).booleanValue()) {
                return t(p059d4.c.c(interfaceC1108jD), str);
            }
            try {
                return r(new GZIPInputStream(interfaceC1108jD.Y()), str);
            } catch (IOException e10) {
                return new U((Throwable) e10);
            }
        } catch (Resources.NotFoundException e11) {
            return new U((Throwable) e11);
        }
    }

    public static W B(Context context, String str) {
        return C(context, str, "url_" + str);
    }

    public static W C(Context context, String str, String str2) {
        return j(str2, new CallableC1365l(context, str, str2), null);
    }

    public static W D(Context context, ZipInputStream zipInputStream, String str) {
        return j(str, new CallableC1368o(context, zipInputStream, str), new RunnableC1369p(zipInputStream));
    }

    public static W E(ZipInputStream zipInputStream, String str) {
        return D(null, zipInputStream, str);
    }

    public static U F(Context context, ZipInputStream zipInputStream, String str) {
        return G(context, zipInputStream, str, true);
    }

    public static U G(Context context, ZipInputStream zipInputStream, String str, boolean z10) {
        try {
            return H(context, zipInputStream, str);
        } finally {
            if (z10) {
                p077e4.r.c(zipInputStream);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x014b A[Catch: IOException -> 0x02b0, TryCatch #4 {IOException -> 0x02b0, blocks: (B:7:0x0019, B:9:0x001f, B:12:0x0028, B:14:0x0034, B:75:0x017b, B:15:0x0039, B:17:0x0045, B:18:0x004a, B:20:0x0056, B:21:0x006f, B:24:0x0079, B:26:0x0081, B:28:0x0089, B:31:0x0093, B:33:0x009b, B:36:0x00a4, B:37:0x00a9, B:39:0x00bb, B:41:0x00dc, B:70:0x0141, B:72:0x014b, B:73:0x0168, B:69:0x0120, B:74:0x016c, B:5:0x000f, B:42:0x00e5, B:53:0x0106, B:68:0x011f, B:67:0x011c, B:64:0x0117, B:43:0x00ea, B:52:0x0103, B:63:0x0116, B:62:0x0113), top: B:131:0x000f, inners: #2 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:72:0x014b, please report this as an issue */
    private static U H(Context context, ZipInputStream zipInputStream, String str) {
        C1364k c1364kA;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (str == null) {
            c1364kA = null;
        } else {
            try {
                c1364kA = X3.g.b().a(str);
            } catch (IOException e10) {
                return new U((Throwable) e10);
            }
        }
        if (c1364kA != null) {
            return new U(c1364kA);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        C1364k c1364k = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                c1364k = (C1364k) v(p059d4.c.c(If.K.d(If.K.l(zipInputStream))), null, false).b();
            } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                String[] strArrSplit = name.split("/");
                map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
            } else if (name.contains(".ttf") || name.contains(".otf")) {
                String[] strArrSplit2 = name.split("/");
                String str2 = strArrSplit2[strArrSplit2.length - 1];
                String str3 = str2.split("\\.")[0];
                if (context == null) {
                    return new U((Throwable) new IllegalStateException("Unable to extract font " + str3 + " please pass a non-null Context parameter"));
                }
                File file = new File(context.getCacheDir(), str2);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int i10 = zipInputStream.read(bArr);
                                if (i10 == -1) {
                                    break;
                                }
                                fileOutputStream2.write(bArr, 0, i10);
                            }
                            fileOutputStream2.flush();
                            fileOutputStream2.close();
                            fileOutputStream.close();
                            Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                            if (!file.delete()) {
                                p077e4.g.c("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                            }
                            map2.put(str3, typefaceCreateFromFile);
                        } catch (Throwable th) {
                            try {
                                fileOutputStream2.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    p077e4.g.d("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th5);
                    Typeface typefaceCreateFromFile2 = Typeface.createFromFile(file);
                    if (!file.delete()) {
                        p077e4.g.c("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                    }
                    map2.put(str3, typefaceCreateFromFile2);
                    nextEntry = zipInputStream.getNextEntry();
                }
            } else {
                zipInputStream.closeEntry();
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (c1364k == null) {
            return new U((Throwable) new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : map.entrySet()) {
            O oK = k(c1364k, (String) entry.getKey());
            if (oK != null) {
                oK.g(p077e4.r.m((Bitmap) entry.getValue(), oK.f(), oK.d()));
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            boolean z10 = false;
            for (X3.c cVar : c1364k.g().values()) {
                if (cVar.a().equals(entry2.getKey())) {
                    cVar.e((Typeface) entry2.getValue());
                    z10 = true;
                }
            }
            if (!z10) {
                p077e4.g.c("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (map.isEmpty()) {
            Iterator it = c1364k.j().entrySet().iterator();
            while (it.hasNext()) {
                O o10 = (O) ((Map.Entry) it.next()).getValue();
                if (o10 == null) {
                    return null;
                }
                String strC = o10.c();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (strC.startsWith("data:") && strC.indexOf("base64,") > 0) {
                    try {
                        byte[] bArrDecode = Base64.decode(strC.substring(strC.indexOf(44) + 1), 0);
                        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                        if (bitmapDecodeByteArray != null) {
                            o10.g(p077e4.r.m(bitmapDecodeByteArray, o10.f(), o10.d()));
                        }
                    } catch (IllegalArgumentException e11) {
                        p077e4.g.d("data URL did not have correct base64 format.", e11);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            X3.g.b().c(str, c1364k);
        }
        return new U(c1364k);
    }

    private static Boolean I(InterfaceC1108j interfaceC1108j) {
        return L(interfaceC1108j, f10861d);
    }

    private static boolean J(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    private static Boolean K(InterfaceC1108j interfaceC1108j) {
        return L(interfaceC1108j, f10860c);
    }

    private static Boolean L(InterfaceC1108j interfaceC1108j, byte[] bArr) {
        try {
            InterfaceC1108j interfaceC1108jPeek = interfaceC1108j.peek();
            for (byte b10 : bArr) {
                if (interfaceC1108jPeek.readByte() != b10) {
                    return Boolean.FALSE;
                }
            }
            interfaceC1108jPeek.close();
            return Boolean.TRUE;
        } catch (Exception e10) {
            p077e4.g.b("Failed to check zip file header", e10);
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused) {
            return Boolean.FALSE;
        }
    }

    private static void M(boolean z10) {
        ArrayList arrayList = new ArrayList(f10859b);
        if (arrayList.size() <= 0) {
            return;
        }
        android.support.v4.media.session.b.a(arrayList.get(0));
        throw null;
    }

    private static String N(Context context, int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("rawRes");
        sb2.append(J(context) ? "_night_" : "_day_");
        sb2.append(i10);
        return sb2.toString();
    }

    public static /* synthetic */ void b(String str, AtomicBoolean atomicBoolean, Throwable th) {
        Map map = f10858a;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            M(true);
        }
    }

    public static /* synthetic */ U c(Context context, String str, String str2) {
        U uC = AbstractC1358e.j(context).c(context, str, str2);
        if (str2 != null && uC.b() != null) {
            X3.g.b().c(str2, (C1364k) uC.b());
        }
        return uC;
    }

    public static /* synthetic */ U d(WeakReference weakReference, Context context, int i10, String str) {
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            context = context2;
        }
        return A(context, i10, str);
    }

    public static /* synthetic */ void i(String str, AtomicBoolean atomicBoolean, C1364k c1364k) {
        Map map = f10858a;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            M(true);
        }
    }

    private static W j(String str, Callable callable, Runnable runnable) {
        C1364k c1364kA = str == null ? null : X3.g.b().a(str);
        W w10 = c1364kA != null ? new W(c1364kA) : null;
        if (str != null) {
            Map map = f10858a;
            if (map.containsKey(str)) {
                w10 = (W) map.get(str);
            }
        }
        if (w10 != null) {
            if (runnable != null) {
                runnable.run();
            }
            return w10;
        }
        W w11 = new W(callable);
        if (str != null) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            w11.d(new r(str, atomicBoolean));
            w11.c(new C1371s(str, atomicBoolean));
            if (!atomicBoolean.get()) {
                Map map2 = f10858a;
                map2.put(str, w11);
                if (map2.size() == 1) {
                    M(false);
                }
            }
        }
        return w11;
    }

    private static O k(C1364k c1364k, String str) {
        for (O o10 : c1364k.j().values()) {
            if (o10.c().equals(str)) {
                return o10;
            }
        }
        return null;
    }

    public static W l(Context context, String str) {
        return m(context, str, "asset_" + str);
    }

    public static W m(Context context, String str, String str2) {
        return j(str2, new CallableC1370q(context.getApplicationContext(), str, str2), null);
    }

    public static U n(Context context, String str) {
        return o(context, str, "asset_" + str);
    }

    public static U o(Context context, String str, String str2) {
        C1364k c1364kA = str2 == null ? null : X3.g.b().a(str2);
        if (c1364kA != null) {
            return new U(c1364kA);
        }
        try {
            return p(context, context.getAssets().open(str), str2);
        } catch (IOException e10) {
            return new U((Throwable) e10);
        }
    }

    public static U p(Context context, InputStream inputStream, String str) {
        C1364k c1364kA = str == null ? null : X3.g.b().a(str);
        if (c1364kA != null) {
            return new U(c1364kA);
        }
        try {
            InterfaceC1108j interfaceC1108jD = If.K.d(If.K.l(inputStream));
            if (K(interfaceC1108jD).booleanValue()) {
                return F(context, new ZipInputStream(interfaceC1108jD.Y()), str);
            }
            return I(interfaceC1108jD).booleanValue() ? r(new GZIPInputStream(interfaceC1108jD.Y()), str) : t(p059d4.c.c(interfaceC1108jD), str);
        } catch (IOException e10) {
            return new U((Throwable) e10);
        }
    }

    public static W q(InputStream inputStream, String str) {
        return j(str, new CallableC1366m(inputStream, str), new RunnableC1367n(inputStream));
    }

    public static U r(InputStream inputStream, String str) {
        return s(inputStream, str, true);
    }

    public static U s(InputStream inputStream, String str, boolean z10) {
        return w(If.K.l(inputStream), str, z10);
    }

    public static U t(p059d4.c cVar, String str) {
        return u(cVar, str, true);
    }

    public static U u(p059d4.c cVar, String str, boolean z10) {
        return v(cVar, str, z10);
    }

    private static U v(p059d4.c cVar, String str, boolean z10) {
        try {
            C1364k c1364kA = str == null ? null : X3.g.b().a(str);
            if (c1364kA != null) {
                return new U(c1364kA);
            }
            C1364k c1364kA2 = p041c4.w.a(cVar);
            if (str != null) {
                X3.g.b().c(str, c1364kA2);
            }
            return new U(c1364kA2);
        } catch (Exception e10) {
            return new U((Throwable) e10);
        } finally {
            if (z10) {
                p077e4.r.c(cVar);
            }
        }
    }

    public static U w(If.a0 a0Var, String str, boolean z10) {
        return v(p059d4.c.c(If.K.d(a0Var)), str, z10);
    }

    public static W x(Context context, int i10) {
        return y(context, i10, N(context, i10));
    }

    public static W y(Context context, int i10, String str) {
        return j(str, new CallableC1372t(new WeakReference(context), context.getApplicationContext(), i10, str), null);
    }

    public static U z(Context context, int i10) {
        return A(context, i10, N(context, i10));
    }
}

package com.google.android.gms.dynamite;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.C2342k;
import com.google.android.gms.common.util.DynamiteApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import p170j8.AbstractC3851p;
import p170j8.r;

/* JADX INFO: loaded from: classes2.dex */
public final class DynamiteModule {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static Boolean f31969h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static String f31970i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f31971j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f31972k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static Boolean f31973l;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static n f31979r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static o f31980s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f31981a;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final ThreadLocal f31974m = new ThreadLocal();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ThreadLocal f31975n = new c();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final b.a f31976o = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f31963b = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f31964c = new f();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f31965d = new g();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f31966e = new h();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f31967f = new i();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f31968g = new j();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final b f31977p = new k();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b f31978q = new com.google.android.gms.dynamite.a();

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {

        @NonNull
        public static ClassLoader sClassLoader;
    }

    public static class a extends Exception {
        /* synthetic */ a(String str, Throwable th, byte[] bArr) {
            super(str, th);
        }

        /* synthetic */ a(String str, byte[] bArr) {
            super(str);
        }
    }

    public interface b {

        public interface a {
            int a(Context context, String str, boolean z10);

            int b(Context context, String str);
        }

        /* JADX INFO: renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b, reason: collision with other inner class name */
        public static class C0397b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f31982a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f31983b = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f31984c = 0;
        }

        C0397b a(Context context, String str, a aVar);
    }

    private DynamiteModule(Context context) {
        r.l(context);
        this.f31981a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 61);
            sb2.append("com.google.android.gms.dynamite.descriptors.");
            sb2.append(str);
            sb2.append(".ModuleDescriptor");
            Class<?> clsLoadClass = classLoader.loadClass(sb2.toString());
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (AbstractC3851p.a(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String strValueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb3 = new StringBuilder(strValueOf.length() + 50 + String.valueOf(str).length() + 1);
            sb3.append("Module descriptor id '");
            sb3.append(strValueOf);
            sb3.append("' didn't match expected id '");
            sb3.append(str);
            sb3.append("'");
            Log.e("DynamiteModule", sb3.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 45);
            sb4.append("Local module descriptor class for ");
            sb4.append(str);
            sb4.append(" not found.");
            Log.w("DynamiteModule", sb4.toString());
            return 0;
        } catch (Exception e10) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e10.getMessage())));
            return 0;
        }
    }

    public static int c(Context context, String str) {
        return f(context, str, false);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0267 A[Catch: all -> 0x0174, a -> 0x0179, RemoteException -> 0x017e, TryCatch #8 {RemoteException -> 0x017e, a -> 0x0179, all -> 0x0174, blocks: (B:34:0x00f0, B:40:0x00fc, B:42:0x0103, B:43:0x0136, B:47:0x013c, B:49:0x0144, B:51:0x0148, B:52:0x0153, B:59:0x0160, B:67:0x0196, B:69:0x019e, B:70:0x01a5, B:71:0x01ae, B:66:0x0183, B:74:0x01b1, B:75:0x01b2, B:76:0x01ba, B:77:0x01bb, B:78:0x01c3, B:81:0x01c6, B:82:0x01c7, B:84:0x01fe, B:86:0x0205, B:88:0x020d, B:94:0x0246, B:96:0x024c, B:97:0x0255, B:98:0x025d, B:89:0x021c, B:90:0x0224, B:92:0x0227, B:93:0x0237, B:99:0x025e, B:100:0x0266, B:101:0x0267, B:102:0x026f, B:108:0x027c), top: B:157:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x0272 A[Catch: all -> 0x0270, TRY_ENTER, TryCatch #0 {, blocks: (B:35:0x00f1, B:37:0x00f7, B:38:0x00f9, B:105:0x0272, B:106:0x027a), top: B:149:0x00f1 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:126:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:129:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:134:0x02f8 A[Catch: all -> 0x00c3, TryCatch #3 {all -> 0x00c3, blocks: (B:5:0x0045, B:9:0x00bc, B:16:0x00c8, B:19:0x00ce, B:32:0x00ec, B:109:0x027d, B:110:0x0288, B:118:0x0298, B:120:0x02c0, B:122:0x02cf, B:132:0x02ef, B:133:0x02f7, B:113:0x028b, B:114:0x028c, B:115:0x0294, B:134:0x02f8, B:135:0x0319, B:136:0x031a, B:137:0x036c), top: B:151:0x0045 }] */
    /* JADX WARN: Code duplicated, block: B:149:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:0x0137 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x00ce A[Catch: all -> 0x00c3, TRY_LEAVE, TryCatch #3 {all -> 0x00c3, blocks: (B:5:0x0045, B:9:0x00bc, B:16:0x00c8, B:19:0x00ce, B:32:0x00ec, B:109:0x027d, B:110:0x0288, B:118:0x0298, B:120:0x02c0, B:122:0x02cf, B:132:0x02ef, B:133:0x02f7, B:113:0x028b, B:114:0x028c, B:115:0x0294, B:134:0x02f8, B:135:0x0319, B:136:0x031a, B:137:0x036c), top: B:151:0x0045 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:23:0x00da  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f7 A[Catch: all -> 0x0270, TryCatch #0 {, blocks: (B:35:0x00f1, B:37:0x00f7, B:38:0x00f9, B:105:0x0272, B:106:0x027a), top: B:149:0x00f1 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00fc A[Catch: all -> 0x0174, a -> 0x0179, RemoteException -> 0x017e, TRY_ENTER, TryCatch #8 {RemoteException -> 0x017e, a -> 0x0179, all -> 0x0174, blocks: (B:34:0x00f0, B:40:0x00fc, B:42:0x0103, B:43:0x0136, B:47:0x013c, B:49:0x0144, B:51:0x0148, B:52:0x0153, B:59:0x0160, B:67:0x0196, B:69:0x019e, B:70:0x01a5, B:71:0x01ae, B:66:0x0183, B:74:0x01b1, B:75:0x01b2, B:76:0x01ba, B:77:0x01bb, B:78:0x01c3, B:81:0x01c6, B:82:0x01c7, B:84:0x01fe, B:86:0x0205, B:88:0x020d, B:94:0x0246, B:96:0x024c, B:97:0x0255, B:98:0x025d, B:89:0x021c, B:90:0x0224, B:92:0x0227, B:93:0x0237, B:99:0x025e, B:100:0x0266, B:101:0x0267, B:102:0x026f, B:108:0x027c), top: B:157:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0103 A[Catch: all -> 0x0174, a -> 0x0179, RemoteException -> 0x017e, TryCatch #8 {RemoteException -> 0x017e, a -> 0x0179, all -> 0x0174, blocks: (B:34:0x00f0, B:40:0x00fc, B:42:0x0103, B:43:0x0136, B:47:0x013c, B:49:0x0144, B:51:0x0148, B:52:0x0153, B:59:0x0160, B:67:0x0196, B:69:0x019e, B:70:0x01a5, B:71:0x01ae, B:66:0x0183, B:74:0x01b1, B:75:0x01b2, B:76:0x01ba, B:77:0x01bb, B:78:0x01c3, B:81:0x01c6, B:82:0x01c7, B:84:0x01fe, B:86:0x0205, B:88:0x020d, B:94:0x0246, B:96:0x024c, B:97:0x0255, B:98:0x025d, B:89:0x021c, B:90:0x0224, B:92:0x0227, B:93:0x0237, B:99:0x025e, B:100:0x0266, B:101:0x0267, B:102:0x026f, B:108:0x027c), top: B:157:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x013c A[Catch: all -> 0x0174, a -> 0x0179, RemoteException -> 0x017e, TRY_ENTER, TryCatch #8 {RemoteException -> 0x017e, a -> 0x0179, all -> 0x0174, blocks: (B:34:0x00f0, B:40:0x00fc, B:42:0x0103, B:43:0x0136, B:47:0x013c, B:49:0x0144, B:51:0x0148, B:52:0x0153, B:59:0x0160, B:67:0x0196, B:69:0x019e, B:70:0x01a5, B:71:0x01ae, B:66:0x0183, B:74:0x01b1, B:75:0x01b2, B:76:0x01ba, B:77:0x01bb, B:78:0x01c3, B:81:0x01c6, B:82:0x01c7, B:84:0x01fe, B:86:0x0205, B:88:0x020d, B:94:0x0246, B:96:0x024c, B:97:0x0255, B:98:0x025d, B:89:0x021c, B:90:0x0224, B:92:0x0227, B:93:0x0237, B:99:0x025e, B:100:0x0266, B:101:0x0267, B:102:0x026f, B:108:0x027c), top: B:157:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x01bb A[Catch: all -> 0x0174, a -> 0x0179, RemoteException -> 0x017e, TryCatch #8 {RemoteException -> 0x017e, a -> 0x0179, all -> 0x0174, blocks: (B:34:0x00f0, B:40:0x00fc, B:42:0x0103, B:43:0x0136, B:47:0x013c, B:49:0x0144, B:51:0x0148, B:52:0x0153, B:59:0x0160, B:67:0x0196, B:69:0x019e, B:70:0x01a5, B:71:0x01ae, B:66:0x0183, B:74:0x01b1, B:75:0x01b2, B:76:0x01ba, B:77:0x01bb, B:78:0x01c3, B:81:0x01c6, B:82:0x01c7, B:84:0x01fe, B:86:0x0205, B:88:0x020d, B:94:0x0246, B:96:0x024c, B:97:0x0255, B:98:0x025d, B:89:0x021c, B:90:0x0224, B:92:0x0227, B:93:0x0237, B:99:0x025e, B:100:0x0266, B:101:0x0267, B:102:0x026f, B:108:0x027c), top: B:157:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01c7 A[Catch: all -> 0x0174, a -> 0x0179, RemoteException -> 0x017e, TryCatch #8 {RemoteException -> 0x017e, a -> 0x0179, all -> 0x0174, blocks: (B:34:0x00f0, B:40:0x00fc, B:42:0x0103, B:43:0x0136, B:47:0x013c, B:49:0x0144, B:51:0x0148, B:52:0x0153, B:59:0x0160, B:67:0x0196, B:69:0x019e, B:70:0x01a5, B:71:0x01ae, B:66:0x0183, B:74:0x01b1, B:75:0x01b2, B:76:0x01ba, B:77:0x01bb, B:78:0x01c3, B:81:0x01c6, B:82:0x01c7, B:84:0x01fe, B:86:0x0205, B:88:0x020d, B:94:0x0246, B:96:0x024c, B:97:0x0255, B:98:0x025d, B:89:0x021c, B:90:0x0224, B:92:0x0227, B:93:0x0237, B:99:0x025e, B:100:0x0266, B:101:0x0267, B:102:0x026f, B:108:0x027c), top: B:157:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01fe A[Catch: all -> 0x0174, a -> 0x0179, RemoteException -> 0x017e, TryCatch #8 {RemoteException -> 0x017e, a -> 0x0179, all -> 0x0174, blocks: (B:34:0x00f0, B:40:0x00fc, B:42:0x0103, B:43:0x0136, B:47:0x013c, B:49:0x0144, B:51:0x0148, B:52:0x0153, B:59:0x0160, B:67:0x0196, B:69:0x019e, B:70:0x01a5, B:71:0x01ae, B:66:0x0183, B:74:0x01b1, B:75:0x01b2, B:76:0x01ba, B:77:0x01bb, B:78:0x01c3, B:81:0x01c6, B:82:0x01c7, B:84:0x01fe, B:86:0x0205, B:88:0x020d, B:94:0x0246, B:96:0x024c, B:97:0x0255, B:98:0x025d, B:89:0x021c, B:90:0x0224, B:92:0x0227, B:93:0x0237, B:99:0x025e, B:100:0x0266, B:101:0x0267, B:102:0x026f, B:108:0x027c), top: B:157:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0205 A[Catch: all -> 0x0174, a -> 0x0179, RemoteException -> 0x017e, TryCatch #8 {RemoteException -> 0x017e, a -> 0x0179, all -> 0x0174, blocks: (B:34:0x00f0, B:40:0x00fc, B:42:0x0103, B:43:0x0136, B:47:0x013c, B:49:0x0144, B:51:0x0148, B:52:0x0153, B:59:0x0160, B:67:0x0196, B:69:0x019e, B:70:0x01a5, B:71:0x01ae, B:66:0x0183, B:74:0x01b1, B:75:0x01b2, B:76:0x01ba, B:77:0x01bb, B:78:0x01c3, B:81:0x01c6, B:82:0x01c7, B:84:0x01fe, B:86:0x0205, B:88:0x020d, B:94:0x0246, B:96:0x024c, B:97:0x0255, B:98:0x025d, B:89:0x021c, B:90:0x0224, B:92:0x0227, B:93:0x0237, B:99:0x025e, B:100:0x0266, B:101:0x0267, B:102:0x026f, B:108:0x027c), top: B:157:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x020d A[Catch: all -> 0x0174, a -> 0x0179, RemoteException -> 0x017e, TryCatch #8 {RemoteException -> 0x017e, a -> 0x0179, all -> 0x0174, blocks: (B:34:0x00f0, B:40:0x00fc, B:42:0x0103, B:43:0x0136, B:47:0x013c, B:49:0x0144, B:51:0x0148, B:52:0x0153, B:59:0x0160, B:67:0x0196, B:69:0x019e, B:70:0x01a5, B:71:0x01ae, B:66:0x0183, B:74:0x01b1, B:75:0x01b2, B:76:0x01ba, B:77:0x01bb, B:78:0x01c3, B:81:0x01c6, B:82:0x01c7, B:84:0x01fe, B:86:0x0205, B:88:0x020d, B:94:0x0246, B:96:0x024c, B:97:0x0255, B:98:0x025d, B:89:0x021c, B:90:0x0224, B:92:0x0227, B:93:0x0237, B:99:0x025e, B:100:0x0266, B:101:0x0267, B:102:0x026f, B:108:0x027c), top: B:157:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x021c A[Catch: all -> 0x0174, a -> 0x0179, RemoteException -> 0x017e, TryCatch #8 {RemoteException -> 0x017e, a -> 0x0179, all -> 0x0174, blocks: (B:34:0x00f0, B:40:0x00fc, B:42:0x0103, B:43:0x0136, B:47:0x013c, B:49:0x0144, B:51:0x0148, B:52:0x0153, B:59:0x0160, B:67:0x0196, B:69:0x019e, B:70:0x01a5, B:71:0x01ae, B:66:0x0183, B:74:0x01b1, B:75:0x01b2, B:76:0x01ba, B:77:0x01bb, B:78:0x01c3, B:81:0x01c6, B:82:0x01c7, B:84:0x01fe, B:86:0x0205, B:88:0x020d, B:94:0x0246, B:96:0x024c, B:97:0x0255, B:98:0x025d, B:89:0x021c, B:90:0x0224, B:92:0x0227, B:93:0x0237, B:99:0x025e, B:100:0x0266, B:101:0x0267, B:102:0x026f, B:108:0x027c), top: B:157:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0225 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x0227 A[Catch: all -> 0x0174, a -> 0x0179, RemoteException -> 0x017e, TryCatch #8 {RemoteException -> 0x017e, a -> 0x0179, all -> 0x0174, blocks: (B:34:0x00f0, B:40:0x00fc, B:42:0x0103, B:43:0x0136, B:47:0x013c, B:49:0x0144, B:51:0x0148, B:52:0x0153, B:59:0x0160, B:67:0x0196, B:69:0x019e, B:70:0x01a5, B:71:0x01ae, B:66:0x0183, B:74:0x01b1, B:75:0x01b2, B:76:0x01ba, B:77:0x01bb, B:78:0x01c3, B:81:0x01c6, B:82:0x01c7, B:84:0x01fe, B:86:0x0205, B:88:0x020d, B:94:0x0246, B:96:0x024c, B:97:0x0255, B:98:0x025d, B:89:0x021c, B:90:0x0224, B:92:0x0227, B:93:0x0237, B:99:0x025e, B:100:0x0266, B:101:0x0267, B:102:0x026f, B:108:0x027c), top: B:157:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0237 A[Catch: all -> 0x0174, a -> 0x0179, RemoteException -> 0x017e, TryCatch #8 {RemoteException -> 0x017e, a -> 0x0179, all -> 0x0174, blocks: (B:34:0x00f0, B:40:0x00fc, B:42:0x0103, B:43:0x0136, B:47:0x013c, B:49:0x0144, B:51:0x0148, B:52:0x0153, B:59:0x0160, B:67:0x0196, B:69:0x019e, B:70:0x01a5, B:71:0x01ae, B:66:0x0183, B:74:0x01b1, B:75:0x01b2, B:76:0x01ba, B:77:0x01bb, B:78:0x01c3, B:81:0x01c6, B:82:0x01c7, B:84:0x01fe, B:86:0x0205, B:88:0x020d, B:94:0x0246, B:96:0x024c, B:97:0x0255, B:98:0x025d, B:89:0x021c, B:90:0x0224, B:92:0x0227, B:93:0x0237, B:99:0x025e, B:100:0x0266, B:101:0x0267, B:102:0x026f, B:108:0x027c), top: B:157:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x024c A[Catch: all -> 0x0174, a -> 0x0179, RemoteException -> 0x017e, TryCatch #8 {RemoteException -> 0x017e, a -> 0x0179, all -> 0x0174, blocks: (B:34:0x00f0, B:40:0x00fc, B:42:0x0103, B:43:0x0136, B:47:0x013c, B:49:0x0144, B:51:0x0148, B:52:0x0153, B:59:0x0160, B:67:0x0196, B:69:0x019e, B:70:0x01a5, B:71:0x01ae, B:66:0x0183, B:74:0x01b1, B:75:0x01b2, B:76:0x01ba, B:77:0x01bb, B:78:0x01c3, B:81:0x01c6, B:82:0x01c7, B:84:0x01fe, B:86:0x0205, B:88:0x020d, B:94:0x0246, B:96:0x024c, B:97:0x0255, B:98:0x025d, B:89:0x021c, B:90:0x0224, B:92:0x0227, B:93:0x0237, B:99:0x025e, B:100:0x0266, B:101:0x0267, B:102:0x026f, B:108:0x027c), top: B:157:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0255 A[Catch: all -> 0x0174, a -> 0x0179, RemoteException -> 0x017e, TryCatch #8 {RemoteException -> 0x017e, a -> 0x0179, all -> 0x0174, blocks: (B:34:0x00f0, B:40:0x00fc, B:42:0x0103, B:43:0x0136, B:47:0x013c, B:49:0x0144, B:51:0x0148, B:52:0x0153, B:59:0x0160, B:67:0x0196, B:69:0x019e, B:70:0x01a5, B:71:0x01ae, B:66:0x0183, B:74:0x01b1, B:75:0x01b2, B:76:0x01ba, B:77:0x01bb, B:78:0x01c3, B:81:0x01c6, B:82:0x01c7, B:84:0x01fe, B:86:0x0205, B:88:0x020d, B:94:0x0246, B:96:0x024c, B:97:0x0255, B:98:0x025d, B:89:0x021c, B:90:0x0224, B:92:0x0227, B:93:0x0237, B:99:0x025e, B:100:0x0266, B:101:0x0267, B:102:0x026f, B:108:0x027c), top: B:157:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x025e A[Catch: all -> 0x0174, a -> 0x0179, RemoteException -> 0x017e, TryCatch #8 {RemoteException -> 0x017e, a -> 0x0179, all -> 0x0174, blocks: (B:34:0x00f0, B:40:0x00fc, B:42:0x0103, B:43:0x0136, B:47:0x013c, B:49:0x0144, B:51:0x0148, B:52:0x0153, B:59:0x0160, B:67:0x0196, B:69:0x019e, B:70:0x01a5, B:71:0x01ae, B:66:0x0183, B:74:0x01b1, B:75:0x01b2, B:76:0x01ba, B:77:0x01bb, B:78:0x01c3, B:81:0x01c6, B:82:0x01c7, B:84:0x01fe, B:86:0x0205, B:88:0x020d, B:94:0x0246, B:96:0x024c, B:97:0x0255, B:98:0x025d, B:89:0x021c, B:90:0x0224, B:92:0x0227, B:93:0x0237, B:99:0x025e, B:100:0x0266, B:101:0x0267, B:102:0x026f, B:108:0x027c), top: B:157:0x00f0 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r31v0, types: [com.google.android.gms.dynamite.DynamiteModule$b] */
    /* JADX WARN: Type inference failed for: r4v10, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static DynamiteModule e(Context context, b bVar, String str) throws a {
        ?? r10;
        int i10;
        DynamiteModule dynamiteModuleJ;
        Cursor cursor;
        int i11;
        Boolean bool;
        n nVarL;
        int iF1;
        p314r8.a aVarK;
        Object objK;
        l lVar;
        o oVar;
        l lVar2;
        boolean z10;
        p314r8.a aVarK2;
        Cursor cursor2;
        String str2 = ":";
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new a("null application Context", null);
        }
        ThreadLocal threadLocal = f31974m;
        l lVar3 = (l) threadLocal.get();
        l lVar4 = new l(null);
        threadLocal.set(lVar4);
        ThreadLocal threadLocal2 = f31975n;
        Long l10 = (Long) threadLocal2.get();
        long jLongValue = l10.longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.uptimeMillis()));
            b.C0397b c0397bA = bVar.a(context, str, f31976o);
            int i12 = c0397bA.f31982a;
            int i13 = c0397bA.f31983b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 26 + String.valueOf(i12).length() + 19 + String.valueOf(str).length() + 1 + String.valueOf(i13).length());
            sb2.append("Considering local module ");
            sb2.append(str);
            sb2.append(":");
            sb2.append(i12);
            sb2.append(" and remote module ");
            sb2.append(str);
            sb2.append(":");
            sb2.append(i13);
            Log.i("DynamiteModule", sb2.toString());
            int i14 = c0397bA.f31984c;
            if (i14 != 0) {
                if (i14 != -1) {
                    if (i14 == 1 || c0397bA.f31983b != 0) {
                        if (i14 == -1) {
                            DynamiteModule dynamiteModuleJ2 = j(applicationContext, str);
                            if (jLongValue == 0) {
                                threadLocal2.remove();
                            } else {
                                threadLocal2.set(l10);
                            }
                            cursor2 = lVar4.f31985a;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            threadLocal.set(lVar3);
                            return dynamiteModuleJ2;
                        }
                        if (i14 == 1) {
                            StringBuilder sb3 = new StringBuilder(String.valueOf(i14).length() + 36);
                            sb3.append("VersionPolicy returned invalid code:");
                            sb3.append(i14);
                            throw new a(sb3.toString(), null);
                        }
                        try {
                            try {
                                i11 = c0397bA.f31983b;
                                try {
                                    synchronized (DynamiteModule.class) {
                                        if (g(context)) {
                                            throw new a("Remote loading disabled", null);
                                        }
                                        bool = f31969h;
                                    }
                                    if (bool != null) {
                                        throw new a("Failed to determine which loading route to use.", null);
                                    }
                                    if (bool.booleanValue()) {
                                        StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i11).length());
                                        sb4.append("Selected remote version of ");
                                        sb4.append(str);
                                        sb4.append(", version >= ");
                                        sb4.append(i11);
                                        Log.i("DynamiteModule", sb4.toString());
                                        synchronized (DynamiteModule.class) {
                                            oVar = f31980s;
                                        }
                                        if (oVar != null) {
                                            throw new a("DynamiteLoaderV2 was not cached.", null);
                                        }
                                        lVar2 = (l) threadLocal.get();
                                        if (lVar2 != null || lVar2.f31985a == null) {
                                            throw new a("No result cursor", null);
                                        }
                                        Context applicationContext2 = context.getApplicationContext();
                                        Cursor cursor3 = lVar2.f31985a;
                                        p314r8.b.c1(null);
                                        synchronized (DynamiteModule.class) {
                                            z10 = f31972k >= 2;
                                        }
                                        if (z10) {
                                            Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                            aVarK2 = oVar.c1(p314r8.b.c1(applicationContext2), str, i11, p314r8.b.c1(cursor3));
                                        } else {
                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                            aVarK2 = oVar.k(p314r8.b.c1(applicationContext2), str, i11, p314r8.b.c1(cursor3));
                                        }
                                        Context context2 = (Context) p314r8.b.k(aVarK2);
                                        if (context2 == null) {
                                            throw new a("Failed to get module context", null);
                                        }
                                        dynamiteModuleJ = new DynamiteModule(context2);
                                    } else {
                                        StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i11).length());
                                        sb5.append("Selected remote version of ");
                                        sb5.append(str);
                                        sb5.append(", version >= ");
                                        sb5.append(i11);
                                        Log.i("DynamiteModule", sb5.toString());
                                        nVarL = l(context);
                                        if (nVarL != null) {
                                            throw new a("Failed to create IDynamiteLoader.", null);
                                        }
                                        iF1 = nVarL.f1();
                                        if (iF1 >= 3) {
                                            lVar = (l) threadLocal.get();
                                            if (lVar != null) {
                                                throw new a("No cached result cursor holder", null);
                                            }
                                            aVarK = nVarL.h1(p314r8.b.c1(context), str, i11, p314r8.b.c1(lVar.f31985a));
                                        } else if (iF1 == 2) {
                                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                                            aVarK = nVarL.d1(p314r8.b.c1(context), str, i11);
                                        } else {
                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                            aVarK = nVarL.k(p314r8.b.c1(context), str, i11);
                                        }
                                        objK = p314r8.b.k(aVarK);
                                        if (objK != null) {
                                            throw new a("Failed to load remote module.", null);
                                        }
                                        dynamiteModuleJ = new DynamiteModule((Context) objK);
                                    }
                                    if (jLongValue == 0) {
                                        f31975n.remove();
                                    } else {
                                        f31975n.set(l10);
                                    }
                                    cursor = lVar4.f31985a;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    f31974m.set(lVar3);
                                    return dynamiteModuleJ;
                                } catch (RemoteException e10) {
                                    throw new a("Failed to load remote module.", e10, null);
                                } catch (a e11) {
                                    throw e11;
                                } catch (Throwable th) {
                                    com.google.android.gms.common.util.g.a(context, th);
                                    throw new a("Failed to load remote module.", th, null);
                                }
                            } catch (a e12) {
                                e = e12;
                                r10 = str2;
                                String message = e.getMessage();
                                StringBuilder sb6 = new StringBuilder(String.valueOf(message).length() + 30);
                                sb6.append("Failed to load remote module: ");
                                sb6.append(message);
                                Log.w("DynamiteModule", sb6.toString());
                                i10 = c0397bA.f31982a;
                                if (i10 != 0 || bVar.a(r10, str, new m(i10, 0)).f31984c != -1) {
                                    throw new a("Remote load failed. No local fallback found.", e, null);
                                }
                                dynamiteModuleJ = j(applicationContext, str);
                            }
                        } catch (a e13) {
                            e = e13;
                            r10 = context;
                            String message2 = e.getMessage();
                            StringBuilder sb7 = new StringBuilder(String.valueOf(message2).length() + 30);
                            sb7.append("Failed to load remote module: ");
                            sb7.append(message2);
                            Log.w("DynamiteModule", sb7.toString());
                            i10 = c0397bA.f31982a;
                            if (i10 != 0) {
                            }
                            throw new a("Remote load failed. No local fallback found.", e, null);
                        }
                    }
                } else if (c0397bA.f31982a != 0) {
                    i14 = -1;
                    if (i14 == 1) {
                    }
                    if (i14 == -1) {
                        DynamiteModule dynamiteModuleJ3 = j(applicationContext, str);
                        if (jLongValue == 0) {
                            threadLocal2.remove();
                        } else {
                            threadLocal2.set(l10);
                        }
                        cursor2 = lVar4.f31985a;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        threadLocal.set(lVar3);
                        return dynamiteModuleJ3;
                    }
                    if (i14 == 1) {
                        StringBuilder sb8 = new StringBuilder(String.valueOf(i14).length() + 36);
                        sb8.append("VersionPolicy returned invalid code:");
                        sb8.append(i14);
                        throw new a(sb8.toString(), null);
                    }
                    i11 = c0397bA.f31983b;
                    synchronized (DynamiteModule.class) {
                        if (g(context)) {
                            throw new a("Remote loading disabled", null);
                        }
                        bool = f31969h;
                        if (bool != null) {
                            throw new a("Failed to determine which loading route to use.", null);
                        }
                        if (bool.booleanValue()) {
                            StringBuilder sb9 = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i11).length());
                            sb9.append("Selected remote version of ");
                            sb9.append(str);
                            sb9.append(", version >= ");
                            sb9.append(i11);
                            Log.i("DynamiteModule", sb9.toString());
                            synchronized (DynamiteModule.class) {
                                oVar = f31980s;
                                if (oVar != null) {
                                    throw new a("DynamiteLoaderV2 was not cached.", null);
                                }
                                lVar2 = (l) threadLocal.get();
                                if (lVar2 != null) {
                                }
                                throw new a("No result cursor", null);
                            }
                        }
                        StringBuilder sb10 = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i11).length());
                        sb10.append("Selected remote version of ");
                        sb10.append(str);
                        sb10.append(", version >= ");
                        sb10.append(i11);
                        Log.i("DynamiteModule", sb10.toString());
                        nVarL = l(context);
                        if (nVarL != null) {
                            throw new a("Failed to create IDynamiteLoader.", null);
                        }
                        iF1 = nVarL.f1();
                        if (iF1 >= 3) {
                            lVar = (l) threadLocal.get();
                            if (lVar != null) {
                                throw new a("No cached result cursor holder", null);
                            }
                            aVarK = nVarL.h1(p314r8.b.c1(context), str, i11, p314r8.b.c1(lVar.f31985a));
                        } else if (iF1 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                            aVarK = nVarL.d1(p314r8.b.c1(context), str, i11);
                        } else {
                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                            aVarK = nVarL.k(p314r8.b.c1(context), str, i11);
                        }
                        objK = p314r8.b.k(aVarK);
                        if (objK != null) {
                            throw new a("Failed to load remote module.", null);
                        }
                        dynamiteModuleJ = new DynamiteModule((Context) objK);
                        if (jLongValue == 0) {
                            f31975n.remove();
                        } else {
                            f31975n.set(l10);
                        }
                        cursor = lVar4.f31985a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        f31974m.set(lVar3);
                        return dynamiteModuleJ;
                    }
                }
            }
            int i15 = c0397bA.f31982a;
            int i16 = c0397bA.f31983b;
            StringBuilder sb11 = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(i15).length() + 23 + String.valueOf(i16).length() + 1);
            sb11.append("No acceptable module ");
            sb11.append(str);
            sb11.append(" found. Local version is ");
            sb11.append(i15);
            sb11.append(" and remote version is ");
            sb11.append(i16);
            sb11.append(".");
            throw new a(sb11.toString(), null);
        } catch (Throwable th2) {
            if (jLongValue == 0) {
                f31975n.remove();
            } else {
                f31975n.set(l10);
            }
            Cursor cursor4 = lVar4.f31985a;
            if (cursor4 != null) {
                cursor4.close();
            }
            f31974m.set(lVar3);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x018f A[Catch: all -> 0x00f4, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x00f4, blocks: (B:4:0x0006, B:65:0x00e9, B:67:0x00ef, B:75:0x011d, B:103:0x0181, B:107:0x018f, B:125:0x01ec, B:126:0x01ef, B:120:0x01e3, B:73:0x00fa, B:128:0x01f1, B:5:0x0007, B:8:0x000d, B:9:0x0029, B:63:0x00e6, B:22:0x004d, B:46:0x00a5, B:49:0x00a8, B:56:0x00c0, B:64:0x00e8, B:62:0x00c6), top: B:141:0x0006, inners: #7, #9 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00b4 A[Catch: all -> 0x003a, TryCatch #12 {all -> 0x003a, blocks: (B:10:0x002a, B:12:0x0036, B:53:0x00bd, B:17:0x003f, B:19:0x0046, B:21:0x004c, B:26:0x0053, B:28:0x0057, B:32:0x0061, B:34:0x0069, B:37:0x0070, B:44:0x009c, B:45:0x00a4, B:40:0x0077, B:42:0x007d, B:43:0x008e, B:48:0x00a7, B:51:0x00aa, B:52:0x00b4, B:18:0x0042), top: B:144:0x002a, inners: #2 }] */
    public static int f(Context context, String str, boolean z10) {
        Throwable th;
        RemoteException remoteException;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = f31969h;
                Cursor cursor2 = null;
                int iC1 = 0;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            try {
                                ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                                if (classLoader == ClassLoader.getSystemClassLoader()) {
                                    bool = Boolean.FALSE;
                                } else if (classLoader != null) {
                                    try {
                                        k(classLoader);
                                    } catch (a unused) {
                                    }
                                    bool = Boolean.TRUE;
                                } else {
                                    if (!g(context)) {
                                        return 0;
                                    }
                                    if (f31971j) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        Boolean bool2 = Boolean.TRUE;
                                        if (bool2.equals(null)) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        } else {
                                            try {
                                                int iH = h(context, str, z10, true);
                                                String str2 = f31970i;
                                                if (str2 != null && !str2.isEmpty()) {
                                                    ClassLoader classLoaderA = p332s8.d.a();
                                                    if (classLoaderA == null) {
                                                        if (Build.VERSION.SDK_INT >= 29) {
                                                            p332s8.b.a();
                                                            String str3 = f31970i;
                                                            r.l(str3);
                                                            classLoaderA = p332s8.a.a(str3, ClassLoader.getSystemClassLoader());
                                                        } else {
                                                            String str4 = f31970i;
                                                            r.l(str4);
                                                            classLoaderA = new com.google.android.gms.dynamite.b(str4, ClassLoader.getSystemClassLoader());
                                                        }
                                                    }
                                                    k(classLoaderA);
                                                    declaredField.set(null, classLoaderA);
                                                    f31969h = bool2;
                                                    return iH;
                                                }
                                                return iH;
                                            } catch (a unused2) {
                                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    }
                                }
                                f31969h = bool;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e10) {
                        String string = e10.toString();
                        StringBuilder sb2 = new StringBuilder(string.length() + 30);
                        sb2.append("Failed to load module via V2: ");
                        sb2.append(string);
                        Log.w("DynamiteModule", sb2.toString());
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return h(context, str, z10, false);
                    } catch (a e11) {
                        String message = e11.getMessage();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(message).length() + 42);
                        sb3.append("Failed to retrieve remote module version: ");
                        sb3.append(message);
                        Log.w("DynamiteModule", sb3.toString());
                        return 0;
                    }
                }
                n nVarL = l(context);
                if (nVarL != null) {
                    try {
                        try {
                            int iF1 = nVarL.f1();
                            if (iF1 >= 3) {
                                l lVar = (l) f31974m.get();
                                if (lVar == null || (cursor = lVar.f31985a) == null) {
                                    Cursor cursor3 = (Cursor) p314r8.b.k(nVarL.g1(p314r8.b.c1(context), str, z10, ((Long) f31975n.get()).longValue()));
                                    if (cursor3 != null) {
                                        try {
                                            if (cursor3.moveToFirst()) {
                                                int i10 = cursor3.getInt(0);
                                                cursor2 = (i10 <= 0 || !i(cursor3)) ? cursor3 : null;
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                iC1 = i10;
                                            } else {
                                                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                                if (cursor3 != null) {
                                                    cursor3.close();
                                                }
                                            }
                                        } catch (RemoteException e12) {
                                            remoteException = e12;
                                            cursor2 = cursor3;
                                            String message2 = remoteException.getMessage();
                                            StringBuilder sb4 = new StringBuilder(String.valueOf(message2).length() + 42);
                                            sb4.append("Failed to retrieve remote module version: ");
                                            sb4.append(message2);
                                            Log.w("DynamiteModule", sb4.toString());
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            cursor2 = cursor3;
                                            if (cursor2 == null) {
                                                throw th;
                                            }
                                            cursor2.close();
                                            throw th;
                                        }
                                    } else {
                                        Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                        if (cursor3 != null) {
                                            cursor3.close();
                                        }
                                    }
                                } else {
                                    iC1 = cursor.getInt(0);
                                }
                            } else if (iF1 == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                iC1 = nVarL.e1(p314r8.b.c1(context), str, z10);
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                iC1 = nVarL.c1(p314r8.b.c1(context), str, z10);
                            }
                        } catch (RemoteException e13) {
                            remoteException = e13;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                return iC1;
            }
        } catch (Throwable th5) {
            com.google.android.gms.common.util.g.a(context, th5);
            throw th5;
        }
    }

    private static boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f31973l)) {
            return true;
        }
        boolean z10 = false;
        if (f31973l == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", true != com.google.android.gms.common.util.m.i() ? 0 : 268435456);
            if (C2342k.f().h(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z10 = true;
            }
            f31973l = Boolean.valueOf(z10);
            if (z10 && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f31971j = true;
            }
        }
        if (!z10) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0163 A[Catch: all -> 0x0141, TryCatch #0 {all -> 0x0141, blocks: (B:59:0x00ef, B:61:0x00f5, B:64:0x00fd, B:78:0x012a, B:82:0x0133, B:86:0x0139, B:87:0x0140, B:96:0x014f, B:97:0x015d, B:99:0x015f, B:101:0x0163, B:102:0x0185, B:103:0x0186), top: B:108:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x0186 A[Catch: all -> 0x0141, TRY_LEAVE, TryCatch #0 {all -> 0x0141, blocks: (B:59:0x00ef, B:61:0x00f5, B:64:0x00fd, B:78:0x012a, B:82:0x0133, B:86:0x0139, B:87:0x0140, B:96:0x014f, B:97:0x015d, B:99:0x015f, B:101:0x0163, B:102:0x0185, B:103:0x0186), top: B:108:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x0189  */
    /* JADX WARN: Code duplicated, block: B:126:? A[SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x0147: MOVE (r2 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]), block:B:92:0x0147 */
    private static int h(Context context, String str, boolean z10, boolean z11) throws Throwable {
        Throwable th;
        Exception exc;
        Cursor cursor;
        MatrixCursor matrixCursor;
        Cursor cursor2 = null;
        try {
            try {
                boolean z12 = true;
                Uri uriBuild = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z10 ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(((Long) f31975n.get()).longValue())).build();
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
                boolean z13 = false;
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    matrixCursor = null;
                } else {
                    try {
                        Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, null, null, null, null);
                        if (cursorQuery == null) {
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            matrixCursor = null;
                        } else {
                            try {
                                int count = cursorQuery.getCount();
                                int columnCount = cursorQuery.getColumnCount();
                                matrixCursor = new MatrixCursor(cursorQuery.getColumnNames(), count);
                                for (int i10 = 0; i10 < count; i10++) {
                                    if (!cursorQuery.moveToPosition(i10)) {
                                        throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                    }
                                    Object[] objArr = new Object[columnCount];
                                    for (int i11 = 0; i11 < columnCount; i11++) {
                                        int type = cursorQuery.getType(i11);
                                        if (type == 0) {
                                            objArr[i11] = null;
                                        } else if (type == 1) {
                                            objArr[i11] = Long.valueOf(cursorQuery.getLong(i11));
                                        } else if (type == 2) {
                                            objArr[i11] = Double.valueOf(cursorQuery.getDouble(i11));
                                        } else if (type == 3) {
                                            objArr[i11] = cursorQuery.getString(i11);
                                        } else {
                                            if (type != 4) {
                                                throw new RemoteException("Unknown column type");
                                            }
                                            objArr[i11] = cursorQuery.getBlob(i11);
                                        }
                                    }
                                    matrixCursor.addRow(objArr);
                                }
                                cursorQuery.close();
                                contentProviderClientAcquireUnstableContentProviderClient.release();
                            } catch (Throwable th2) {
                                try {
                                    cursorQuery.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        }
                    } catch (RemoteException unused) {
                    } catch (Throwable th4) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th4;
                    }
                }
                if (matrixCursor != null) {
                    try {
                        if (matrixCursor.moveToFirst()) {
                            int i12 = matrixCursor.getInt(0);
                            if (i12 > 0) {
                                synchronized (DynamiteModule.class) {
                                    try {
                                        f31970i = matrixCursor.getString(2);
                                        int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            f31972k = matrixCursor.getInt(columnIndex);
                                        }
                                        int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            if (matrixCursor.getInt(columnIndex2) == 0) {
                                                z12 = false;
                                            }
                                            f31971j = z12;
                                            z13 = z12;
                                        }
                                    } catch (Throwable th5) {
                                        throw th5;
                                    }
                                }
                                if (i(matrixCursor)) {
                                    matrixCursor = null;
                                }
                            }
                            if (z11 && z13) {
                                throw new a("forcing fallback to container DynamiteLoader impl", null);
                            }
                            if (matrixCursor != null) {
                                matrixCursor.close();
                            }
                            return i12;
                        }
                    } catch (Exception e10) {
                        exc = e10;
                        if (!(exc instanceof a)) {
                            throw exc;
                        }
                        String message = exc.getMessage();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 25);
                        sb2.append("V2 version check failed: ");
                        sb2.append(message);
                        throw new a(sb2.toString(), exc, null);
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new a("Failed to connect to dynamite module ContentResolver.", null);
            } catch (Throwable th6) {
                th = th6;
                cursor2 = cursor;
                if (cursor2 != null) {
                    throw th;
                }
                cursor2.close();
                throw th;
            }
        } catch (Exception e11) {
            exc = e11;
            if (!(exc instanceof a)) {
                throw exc;
            }
            String message2 = exc.getMessage();
            StringBuilder sb3 = new StringBuilder(String.valueOf(message2).length() + 25);
            sb3.append("V2 version check failed: ");
            sb3.append(message2);
            throw new a(sb3.toString(), exc, null);
        } catch (Throwable th7) {
            th = th7;
            if (cursor2 != null) {
                throw th;
            }
            cursor2.close();
            throw th;
        }
    }

    private static boolean i(Cursor cursor) {
        l lVar = (l) f31974m.get();
        if (lVar == null || lVar.f31985a != null) {
            return false;
        }
        lVar.f31985a = cursor;
        return true;
    }

    private static DynamiteModule j(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context);
    }

    private static void k(ClassLoader classLoader) throws a {
        o oVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder == null) {
                oVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                oVar = iInterfaceQueryLocalInterface instanceof o ? (o) iInterfaceQueryLocalInterface : new o(iBinder);
            }
            f31980s = oVar;
        } catch (ClassNotFoundException e10) {
            e = e10;
            throw new a("Failed to instantiate dynamite loader", e, null);
        } catch (IllegalAccessException e11) {
            e = e11;
            throw new a("Failed to instantiate dynamite loader", e, null);
        } catch (InstantiationException e12) {
            e = e12;
            throw new a("Failed to instantiate dynamite loader", e, null);
        } catch (NoSuchMethodException e13) {
            e = e13;
            throw new a("Failed to instantiate dynamite loader", e, null);
        } catch (InvocationTargetException e14) {
            e = e14;
            throw new a("Failed to instantiate dynamite loader", e, null);
        }
    }

    private static n l(Context context) {
        n nVar;
        synchronized (DynamiteModule.class) {
            n nVar2 = f31979r;
            if (nVar2 != null) {
                return nVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    nVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    nVar = iInterfaceQueryLocalInterface instanceof n ? (n) iInterfaceQueryLocalInterface : new n(iBinder);
                }
                if (nVar != null) {
                    f31979r = nVar;
                    return nVar;
                }
            } catch (Exception e10) {
                String message = e10.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 45);
                sb2.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb2.append(message);
                Log.e("DynamiteModule", sb2.toString());
            }
            return null;
        }
    }

    public Context b() {
        return this.f31981a;
    }

    public IBinder d(String str) throws a {
        try {
            return (IBinder) this.f31981a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            throw new a("Failed to instantiate module class: ".concat(String.valueOf(str)), e10, null);
        }
    }
}

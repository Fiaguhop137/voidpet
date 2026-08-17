package W1;

import U1.AbstractC1459a;
import U1.S;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f14556e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private j f14557f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private AssetFileDescriptor f14558g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private InputStream f14559h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f14560i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f14561j;

    public static class a extends g {
        public a(String str) {
            super(str, null, 2000);
        }

        public a(String str, Throwable th, int i10) {
            super(str, th, i10);
        }
    }

    public v(Context context) {
        super(false);
        this.f14556e = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i10) {
        return Uri.parse("rawresource:///" + i10);
    }

    private static AssetFileDescriptor t(Context context, j jVar) throws a {
        Resources resourcesForApplication;
        int identifier;
        Uri uriNormalizeScheme = jVar.f14480a.normalizeScheme();
        if (TextUtils.equals("rawresource", uriNormalizeScheme.getScheme())) {
            resourcesForApplication = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new a("rawresource:// URI must have exactly one path element, found " + pathSegments.size());
            }
            identifier = u(pathSegments.get(0));
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new a("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
            }
            String strSubstring = (String) AbstractC1459a.e(uriNormalizeScheme.getPath());
            if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e10) {
                    throw new a("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e10, 2005);
                }
            }
            if (strSubstring.matches("\\d+")) {
                identifier = u(strSubstring);
            } else {
                identifier = resourcesForApplication.getIdentifier(packageName + ":" + strSubstring, "raw", null);
                if (identifier == 0) {
                    throw new a("Resource not found.", null, 2005);
                }
            }
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resourcesForApplication.openRawResourceFd(identifier);
            if (assetFileDescriptorOpenRawResourceFd != null) {
                return assetFileDescriptorOpenRawResourceFd;
            }
            throw new a("Resource is compressed: " + uriNormalizeScheme, null, 2000);
        } catch (Resources.NotFoundException e11) {
            throw new a(null, e11, 2005);
        }
    }

    private static int u(String str) throws a {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new a("Resource identifier must be an integer.", null, 1004);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x000e */
    /* JADX WARN: Bottom block not found for handler: all -> 0x004e */
    @Override // W1.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() {
        /*
            r5 = this;
            r0 = 0
            r5.f14557f = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.InputStream r3 = r5.f14559h     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
            if (r3 == 0) goto L12
            r3.close()     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
            goto L12
        Le:
            r3 = move-exception
            goto L44
        L10:
            r3 = move-exception
            goto L3e
        L12:
            r5.f14559h = r0
            android.content.res.AssetFileDescriptor r3 = r5.f14558g     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            if (r3 == 0) goto L20
            r3.close()     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            goto L20
        L1c:
            r1 = move-exception
            goto L32
        L1e:
            r3 = move-exception
            goto L2c
        L20:
            r5.f14558g = r0
            boolean r0 = r5.f14561j
            if (r0 == 0) goto L2b
            r5.f14561j = r2
            r5.q()
        L2b:
            return
        L2c:
            W1.v$a r4 = new W1.v$a     // Catch: java.lang.Throwable -> L1c
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L1c
            throw r4     // Catch: java.lang.Throwable -> L1c
        L32:
            r5.f14558g = r0
            boolean r0 = r5.f14561j
            if (r0 == 0) goto L3d
            r5.f14561j = r2
            r5.q()
        L3d:
            throw r1
        L3e:
            W1.v$a r4 = new W1.v$a     // Catch: java.lang.Throwable -> Le
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> Le
            throw r4     // Catch: java.lang.Throwable -> Le
        L44:
            r5.f14559h = r0
            android.content.res.AssetFileDescriptor r4 = r5.f14558g     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            if (r4 == 0) goto L52
            r4.close()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            goto L52
        L4e:
            r1 = move-exception
            goto L64
        L50:
            r3 = move-exception
            goto L5e
        L52:
            r5.f14558g = r0
            boolean r0 = r5.f14561j
            if (r0 == 0) goto L5d
            r5.f14561j = r2
            r5.q()
        L5d:
            throw r3
        L5e:
            W1.v$a r4 = new W1.v$a     // Catch: java.lang.Throwable -> L4e
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L4e
            throw r4     // Catch: java.lang.Throwable -> L4e
        L64:
            r5.f14558g = r0
            boolean r0 = r5.f14561j
            if (r0 == 0) goto L6f
            r5.f14561j = r2
            r5.q()
        L6f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: W1.v.close():void");
    }

    @Override // W1.f
    public Uri e() {
        j jVar = this.f14557f;
        if (jVar != null) {
            return jVar.f14480a;
        }
        return null;
    }

    @Override // W1.f
    public long m(j jVar) throws a {
        this.f14557f = jVar;
        r(jVar);
        AssetFileDescriptor assetFileDescriptorT = t(this.f14556e, jVar);
        this.f14558g = assetFileDescriptorT;
        long length = assetFileDescriptorT.getLength();
        FileInputStream fileInputStream = new FileInputStream(this.f14558g.getFileDescriptor());
        this.f14559h = fileInputStream;
        if (length != -1) {
            try {
                if (jVar.f14486g > length) {
                    throw new a(null, null, 2008);
                }
            } catch (a e10) {
                throw e10;
            } catch (IOException e11) {
                throw new a(null, e11, 2000);
            }
        }
        long startOffset = this.f14558g.getStartOffset();
        long jSkip = fileInputStream.skip(jVar.f14486g + startOffset) - startOffset;
        if (jSkip != jVar.f14486g) {
            throw new a(null, null, 2008);
        }
        if (length == -1) {
            FileChannel channel = fileInputStream.getChannel();
            if (channel.size() == 0) {
                this.f14560i = -1L;
            } else {
                long size = channel.size() - channel.position();
                this.f14560i = size;
                if (size < 0) {
                    throw new a(null, null, 2008);
                }
            }
        } else {
            long j10 = length - jSkip;
            this.f14560i = j10;
            if (j10 < 0) {
                throw new g(2008);
            }
        }
        long jMin = jVar.f14487h;
        if (jMin != -1) {
            long j11 = this.f14560i;
            if (j11 != -1) {
                jMin = Math.min(j11, jMin);
            }
            this.f14560i = jMin;
        }
        this.f14561j = true;
        s(jVar);
        long j12 = jVar.f14487h;
        return j12 != -1 ? j12 : this.f14560i;
    }

    @Override // R1.InterfaceC1350j
    public int read(byte[] bArr, int i10, int i11) throws a {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f14560i;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new a(null, e10, 2000);
            }
        }
        int i12 = ((InputStream) S.i(this.f14559h)).read(bArr, i10, i11);
        if (i12 == -1) {
            if (this.f14560i == -1) {
                return -1;
            }
            throw new a("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j11 = this.f14560i;
        if (j11 != -1) {
            this.f14560i = j11 - ((long) i12);
        }
        p(i12);
        return i12;
    }
}

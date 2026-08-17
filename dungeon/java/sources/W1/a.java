package W1;

import U1.AbstractC1459a;
import U1.S;
import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class a extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AssetManager f14454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Uri f14455f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private InputStream f14456g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f14457h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f14458i;

    /* JADX INFO: renamed from: W1.a$a, reason: collision with other inner class name */
    public static final class C0199a extends g {
        public C0199a(Throwable th, int i10) {
            super(th, i10);
        }
    }

    public a(Context context) {
        super(false);
        this.f14454e = context.getAssets();
    }

    @Override // W1.f
    public void close() {
        this.f14455f = null;
        try {
            try {
                InputStream inputStream = this.f14456g;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f14456g = null;
                if (this.f14458i) {
                    this.f14458i = false;
                    q();
                }
            } catch (IOException e10) {
                throw new C0199a(e10, 2000);
            }
        } catch (Throwable th) {
            this.f14456g = null;
            if (this.f14458i) {
                this.f14458i = false;
                q();
            }
            throw th;
        }
    }

    @Override // W1.f
    public Uri e() {
        return this.f14455f;
    }

    @Override // W1.f
    public long m(j jVar) throws C0199a {
        try {
            Uri uri = jVar.f14480a;
            this.f14455f = uri;
            String strSubstring = (String) AbstractC1459a.e(uri.getPath());
            if (strSubstring.startsWith("/android_asset/")) {
                strSubstring = strSubstring.substring(15);
            } else if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            r(jVar);
            InputStream inputStreamOpen = this.f14454e.open(strSubstring, 1);
            this.f14456g = inputStreamOpen;
            if (inputStreamOpen.skip(jVar.f14486g) < jVar.f14486g) {
                throw new C0199a(null, 2008);
            }
            long j10 = jVar.f14487h;
            if (j10 != -1) {
                this.f14457h = j10;
            } else {
                long jAvailable = this.f14456g.available();
                this.f14457h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f14457h = -1L;
                }
            }
            this.f14458i = true;
            s(jVar);
            return this.f14457h;
        } catch (C0199a e10) {
            throw e10;
        } catch (IOException e11) {
            throw new C0199a(e11, e11 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // R1.InterfaceC1350j
    public int read(byte[] bArr, int i10, int i11) throws C0199a {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f14457h;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new C0199a(e10, 2000);
            }
        }
        int i12 = ((InputStream) S.i(this.f14456g)).read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        long j11 = this.f14457h;
        if (j11 != -1) {
            this.f14457h = j11 - ((long) i12);
        }
        p(i12);
        return i12;
    }
}

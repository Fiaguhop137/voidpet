package W1;

import U1.AbstractC1459a;
import U1.S;
import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes.dex */
public final class o extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RandomAccessFile f14541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Uri f14542f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f14543g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f14544h;

    public static class a extends g {
        public a(String str, Throwable th, int i10) {
            super(str, th, i10);
        }

        public a(Throwable th, int i10) {
            super(th, i10);
        }
    }

    public o() {
        super(false);
    }

    private static RandomAccessFile t(Uri uri) throws a {
        try {
            return new RandomAccessFile((String) AbstractC1459a.e(uri.getPath()), "r");
        } catch (FileNotFoundException e10) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new a(e10, ((e10.getCause() instanceof ErrnoException) && ((ErrnoException) e10.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            throw new a(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e10, 1004);
        } catch (SecurityException e11) {
            throw new a(e11, 2006);
        } catch (RuntimeException e12) {
            throw new a(e12, 2000);
        }
    }

    @Override // W1.f
    public void close() {
        this.f14542f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f14541e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f14541e = null;
                if (this.f14544h) {
                    this.f14544h = false;
                    q();
                }
            } catch (IOException e10) {
                throw new a(e10, 2000);
            }
        } catch (Throwable th) {
            this.f14541e = null;
            if (this.f14544h) {
                this.f14544h = false;
                q();
            }
            throw th;
        }
    }

    @Override // W1.f
    public Uri e() {
        return this.f14542f;
    }

    @Override // W1.f
    public long m(j jVar) throws a {
        Uri uri = jVar.f14480a;
        this.f14542f = uri;
        r(jVar);
        RandomAccessFile randomAccessFileT = t(uri);
        this.f14541e = randomAccessFileT;
        try {
            randomAccessFileT.seek(jVar.f14486g);
            long length = jVar.f14487h;
            if (length == -1) {
                length = this.f14541e.length() - jVar.f14486g;
            }
            this.f14543g = length;
            if (length < 0) {
                throw new a(null, null, 2008);
            }
            this.f14544h = true;
            s(jVar);
            return this.f14543g;
        } catch (IOException e10) {
            throw new a(e10, 2000);
        }
    }

    @Override // R1.InterfaceC1350j
    public int read(byte[] bArr, int i10, int i11) throws a {
        if (i11 == 0) {
            return 0;
        }
        if (this.f14543g == 0) {
            return -1;
        }
        try {
            int i12 = ((RandomAccessFile) S.i(this.f14541e)).read(bArr, i10, (int) Math.min(this.f14543g, i11));
            if (i12 > 0) {
                this.f14543g -= (long) i12;
                p(i12);
            }
            return i12;
        } catch (IOException e10) {
            throw new a(e10, 2000);
        }
    }
}

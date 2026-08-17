package p400w4;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import p274p4.h;
import p382v4.n;
import p382v4.o;
import p382v4.r;

/* JADX INFO: loaded from: classes.dex */
public final class d implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f56597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f56598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f56599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Class f56600d;

    private static abstract class a implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f56601a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class f56602b;

        a(Context context, Class cls) {
            this.f56601a = context;
            this.f56602b = cls;
        }

        @Override // p382v4.o
        public final n d(r rVar) {
            return new d(this.f56601a, rVar.d(File.class, this.f56602b), rVar.d(Uri.class, this.f56602b), this.f56602b);
        }

        @Override // p382v4.o
        public final void e() {
        }
    }

    public static final class b extends a {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    public static final class c extends a {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* JADX INFO: renamed from: w4.d$d, reason: collision with other inner class name */
    private static final class C0725d implements com.bumptech.glide.load.data.d {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String[] f56603k = {"_data"};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f56604a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final n f56605b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final n f56606c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Uri f56607d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f56608e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f56609f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final h f56610g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Class f56611h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private volatile boolean f56612i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private volatile com.bumptech.glide.load.data.d f56613j;

        C0725d(Context context, n nVar, n nVar2, Uri uri, int i10, int i11, h hVar, Class cls) {
            this.f56604a = context.getApplicationContext();
            this.f56605b = nVar;
            this.f56606c = nVar2;
            this.f56607d = uri;
            this.f56608e = i10;
            this.f56609f = i11;
            this.f56610g = hVar;
            this.f56611h = cls;
        }

        private n.a c() {
            if (Environment.isExternalStorageLegacy()) {
                return this.f56605b.a(h(this.f56607d), this.f56608e, this.f56609f, this.f56610g);
            }
            if (p292q4.b.a(this.f56607d)) {
                return this.f56606c.a(this.f56607d, this.f56608e, this.f56609f, this.f56610g);
            }
            return this.f56606c.a(g() ? MediaStore.setRequireOriginal(this.f56607d) : this.f56607d, this.f56608e, this.f56609f, this.f56610g);
        }

        private com.bumptech.glide.load.data.d f() {
            n.a aVarC = c();
            if (aVarC != null) {
                return aVarC.f56232c;
            }
            return null;
        }

        private boolean g() {
            return this.f56604a.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        private File h(Uri uri) {
            Cursor cursor = null;
            try {
                Cursor cursorQuery = this.f56604a.getContentResolver().query(uri, f56603k, null, null, null);
                if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                }
                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                if (!TextUtils.isEmpty(string)) {
                    File file = new File(string);
                    cursorQuery.close();
                    return file;
                }
                throw new FileNotFoundException("File path was empty in media store for: " + uri);
            } catch (Throwable th) {
                if (0 == 0) {
                    throw th;
                }
                cursor.close();
                throw th;
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return this.f56611h;
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            com.bumptech.glide.load.data.d dVar = this.f56613j;
            if (dVar != null) {
                dVar.b();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.f56612i = true;
            com.bumptech.glide.load.data.d dVar = this.f56613j;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public p274p4.a d() {
            return p274p4.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.h hVar, com.bumptech.glide.load.data.d.a aVar) {
            try {
                com.bumptech.glide.load.data.d dVarF = f();
                if (dVarF == null) {
                    aVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.f56607d));
                    return;
                }
                this.f56613j = dVarF;
                if (this.f56612i) {
                    cancel();
                } else {
                    dVarF.e(hVar, aVar);
                }
            } catch (FileNotFoundException e10) {
                aVar.c(e10);
            }
        }
    }

    d(Context context, n nVar, n nVar2, Class cls) {
        this.f56597a = context.getApplicationContext();
        this.f56598b = nVar;
        this.f56599c = nVar2;
        this.f56600d = cls;
    }

    @Override // p382v4.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(Uri uri, int i10, int i11, h hVar) {
        return new n.a(new K4.c(uri), new C0725d(this.f56597a, this.f56598b, this.f56599c, uri, i10, i11, hVar, this.f56600d));
    }

    @Override // p382v4.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && p292q4.b.c(uri);
    }
}

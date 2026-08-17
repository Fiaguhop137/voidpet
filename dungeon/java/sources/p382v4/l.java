package p382v4;

import K4.c;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.h;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f56219a;

    public static final class a implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f56220a;

        public a(Context context) {
            this.f56220a = context;
        }

        @Override // p382v4.o
        public n d(r rVar) {
            return new l(this.f56220a);
        }

        @Override // p382v4.o
        public void e() {
        }
    }

    private static class b implements d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String[] f56221c = {"_data"};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f56222a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Uri f56223b;

        b(Context context, Uri uri) {
            this.f56222a = context;
            this.f56223b = uri;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return File.class;
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public p274p4.a d() {
            return p274p4.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(h hVar, d.a aVar) {
            Cursor cursorQuery = this.f56222a.getContentResolver().query(this.f56223b, f56221c, null, null, null);
            String string = null;
            if (cursorQuery != null) {
                try {
                    string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                    cursorQuery.close();
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }
            if (!TextUtils.isEmpty(string)) {
                aVar.f(new File(string));
                return;
            }
            aVar.c(new FileNotFoundException("Failed to find file path for: " + this.f56223b));
        }
    }

    public l(Context context) {
        this.f56219a = context;
    }

    @Override // p382v4.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(Uri uri, int i10, int i11, p274p4.h hVar) {
        return new n.a(new c(uri), new b(this.f56219a, uri));
    }

    @Override // p382v4.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return p292q4.b.c(uri);
    }
}

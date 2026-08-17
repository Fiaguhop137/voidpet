package p346t4;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class f extends d {

    class a implements d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f54451a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f54452b;

        a(Context context, String str) {
            this.f54451a = context;
            this.f54452b = str;
        }

        @Override // t4.d.a
        public File a() {
            File cacheDir = this.f54451a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f54452b != null ? new File(cacheDir, this.f54452b) : cacheDir;
        }
    }

    public f(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public f(Context context, String str, long j10) {
        super(new a(context, str), j10);
    }
}

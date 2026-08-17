package p166j4;

import android.content.Context;
import com.android.volley.h;
import com.android.volley.o;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    class a implements d.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private File f46846a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f46847b;

        a(Context context) {
            this.f46847b = context;
        }

        @Override // j4.d.c
        public File get() {
            if (this.f46846a == null) {
                this.f46846a = new File(this.f46847b.getCacheDir(), "volley");
            }
            return this.f46846a;
        }
    }

    public static o a(Context context) {
        return c(context, null);
    }

    private static o b(Context context, h hVar) {
        o oVar = new o(new d(new a(context.getApplicationContext())), hVar);
        oVar.g();
        return oVar;
    }

    public static o c(Context context, p166j4.a aVar) {
        return b(context, aVar == null ? new b(new h()) : new b(aVar));
    }
}

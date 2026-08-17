package p277p7;

import android.content.Context;
import com.facebook.soloader.E;
import com.facebook.soloader.p;
import com.facebook.soloader.v;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f50849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f50850b;

    public b(Context context, a aVar) {
        this.f50849a = context;
        this.f50850b = aVar;
    }

    @Override // p277p7.h
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, E[] eArr) {
        String str = this.f50849a.getApplicationInfo().sourceDir;
        if (new File(str).exists()) {
            p.g("soloader.recovery.CheckBaseApkExists", "Base apk exists: " + str);
            return false;
        }
        StringBuilder sb2 = new StringBuilder("Base apk does not exist: ");
        sb2.append(str);
        sb2.append(". ");
        this.f50850b.b(sb2);
        throw new v(sb2.toString(), unsatisfiedLinkError);
    }
}

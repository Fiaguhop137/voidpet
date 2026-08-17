package p277p7;

import android.content.Context;
import com.facebook.soloader.E;
import com.facebook.soloader.p;
import com.facebook.soloader.w;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f50857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f50858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f50859c;

    public g(Context context, a aVar) {
        this.f50857a = context;
        this.f50858b = aVar;
        this.f50859c = aVar.c();
    }

    private boolean b() {
        String strC = c();
        return new File(strC).exists() && this.f50858b.a(strC);
    }

    private String c() {
        return this.f50857a.getApplicationInfo().sourceDir;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void d(E[] eArr) {
        for (int i10 = 0; i10 < eArr.length; i10++) {
            Object[] objArr = eArr[i10];
            if (objArr instanceof w) {
                eArr[i10] = ((w) objArr).b(this.f50857a);
            }
        }
    }

    @Override // p277p7.h
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, E[] eArr) {
        if (b()) {
            d(eArr);
            return true;
        }
        if (this.f50859c == this.f50858b.c()) {
            return false;
        }
        p.g("soloader.recovery.DetectDataAppMove", "Context was updated (perhaps by another thread)");
        return true;
    }
}

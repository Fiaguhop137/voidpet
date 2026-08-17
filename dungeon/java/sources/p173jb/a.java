package p173jb;

import Ad.v;
import java.util.Map;
import kotlin.collections.N;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f47185a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f47186b = N.l(v.a("host.exp.exponent.experience.splashscreen.legacy.SplashScreenPackage", 11), v.a("expo.modules.updates.UpdatesPackage", 10));

    private a() {
    }

    public final int a(String str) {
        Integer num;
        if (str == null || (num = (Integer) f47186b.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }
}

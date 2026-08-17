package p226ma;

import java.sql.Date;
import java.sql.Timestamp;
import p119ga.r;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f49193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p172ja.d f49194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p172ja.d f49195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f49196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final r f49197e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r f49198f;

    class a extends p172ja.d {
        a(Class cls) {
            super(cls);
        }
    }

    class b extends p172ja.d {
        b(Class cls) {
            super(cls);
        }
    }

    static {
        boolean z10;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f49193a = z10;
        if (z10) {
            f49194b = new a(Date.class);
            f49195c = new b(Timestamp.class);
            f49196d = p226ma.a.f49187b;
            f49197e = p226ma.b.f49189b;
            f49198f = c.f49191b;
            return;
        }
        f49194b = null;
        f49195c = null;
        f49196d = null;
        f49197e = null;
        f49198f = null;
    }
}

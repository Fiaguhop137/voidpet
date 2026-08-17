package p236n2;

import W1.j;
import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: n2.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4027y {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final AtomicLong f49875h = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f49876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f49877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f49878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f49879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f49880e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f49881f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f49882g;

    public C4027y(long j10, j jVar, long j11) {
        this(j10, jVar, jVar.f14480a, Collections.EMPTY_MAP, j11, 0L, 0L);
    }

    public C4027y(long j10, j jVar, Uri uri, Map map, long j11, long j12, long j13) {
        this.f49876a = j10;
        this.f49877b = jVar;
        this.f49878c = uri;
        this.f49879d = map;
        this.f49880e = j11;
        this.f49881f = j12;
        this.f49882g = j13;
    }

    public static long a() {
        return f49875h.getAndIncrement();
    }
}

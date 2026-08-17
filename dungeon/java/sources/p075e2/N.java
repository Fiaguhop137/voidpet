package p075e2;

import W1.j;
import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class N extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f40242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f40243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f40244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f40245d;

    public N(j jVar, Uri uri, Map map, long j10, Throwable th) {
        super(th);
        this.f40242a = jVar;
        this.f40243b = uri;
        this.f40244c = map;
        this.f40245d = j10;
    }
}

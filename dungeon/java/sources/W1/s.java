package W1;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class s extends q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f14549e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f14550f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f14551g;

    public s(int i10, String str, IOException iOException, Map map, j jVar, byte[] bArr) {
        super("Response code: " + i10, iOException, jVar, 2004, 1);
        this.f14548d = i10;
        this.f14549e = str;
        this.f14550f = map;
        this.f14551g = bArr;
    }
}

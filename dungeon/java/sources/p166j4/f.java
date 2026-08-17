package p166j4;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f46836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f46837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f46838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InputStream f46839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f46840e;

    public f(int i10, List list) {
        this(i10, list, -1, null);
    }

    public f(int i10, List list, int i11, InputStream inputStream) {
        this.f46836a = i10;
        this.f46837b = list;
        this.f46838c = i11;
        this.f46839d = inputStream;
        this.f46840e = null;
    }

    public final InputStream a() {
        InputStream inputStream = this.f46839d;
        if (inputStream != null) {
            return inputStream;
        }
        if (this.f46840e != null) {
            return new ByteArrayInputStream(this.f46840e);
        }
        return null;
    }

    public final int b() {
        return this.f46838c;
    }

    public final List c() {
        return Collections.unmodifiableList(this.f46837b);
    }

    public final int d() {
        return this.f46836a;
    }
}

package p409wd;

import com.facebook.react.bridge.WritableMap;
import p427xd.a;

/* JADX INFO: loaded from: classes3.dex */
public class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f56828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WritableMap f56829b;

    public b(String str, WritableMap writableMap) {
        this.f56828a = str;
        this.f56829b = writableMap;
    }

    @Override // p427xd.a
    public WritableMap a() {
        return this.f56829b;
    }

    @Override // p427xd.a
    public String getEventName() {
        return this.f56828a;
    }
}

package Fb;

import android.util.Base64;
import com.bumptech.glide.h;
import com.bumptech.glide.load.data.d;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f2999a;

    public a(String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f2999a = data;
    }

    private final String c() {
        String strSubstring = this.f2999a.substring(StringsKt.g0(this.f2999a, ',', 0, false, 6, null) + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    @Override // com.bumptech.glide.load.data.d
    public Class a() {
        return ByteBuffer.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.d
    public p274p4.a d() {
        return p274p4.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public void e(h priority, d.a callback) {
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.f(ByteBuffer.wrap(Base64.decode(c(), 0)));
    }
}

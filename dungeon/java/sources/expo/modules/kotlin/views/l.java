package expo.modules.kotlin.views;

import com.facebook.react.bridge.ReadableMapKeySetIterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements ReadableMapKeySetIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReadableMapKeySetIterator f41057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rb.l f41058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f41059c;

    public l(ReadableMapKeySetIterator iterator, Rb.l filter) {
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.f41057a = iterator;
        this.f41058b = filter;
        a();
    }

    private final void a() {
        while (this.f41057a.hasNextKey()) {
            String strNextKey = this.f41057a.nextKey();
            this.f41059c = strNextKey;
            if (this.f41058b.apply(strNextKey)) {
                return;
            }
        }
        this.f41059c = null;
    }

    @Override // com.facebook.react.bridge.ReadableMapKeySetIterator
    public boolean hasNextKey() {
        return this.f41059c != null;
    }

    @Override // com.facebook.react.bridge.ReadableMapKeySetIterator
    public String nextKey() {
        String str = this.f41059c;
        Intrinsics.c(str);
        a();
        return str;
    }
}

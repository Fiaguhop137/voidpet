package com.facebook.react;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Q f29370a = new Q();

    public static final class a implements Iterable, Nd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f29371a;

        public a(List list) {
            this.f29371a = list;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new b(this.f29371a);
        }
    }

    public static final class b implements Iterator, Nd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f29372a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f29373b;

        b(List list) {
            this.f29373b = list;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ModuleHolder next() {
            List list = this.f29373b;
            int i10 = this.f29372a;
            this.f29372a = i10 + 1;
            return new ModuleHolder((NativeModule) list.get(i10));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f29372a < this.f29373b.size();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private Q() {
    }

    public final Iterable a(P reactPackage, ReactApplicationContext reactApplicationContext) {
        Intrinsics.checkNotNullParameter(reactPackage, "reactPackage");
        Intrinsics.checkNotNullParameter(reactApplicationContext, "reactApplicationContext");
        W4.a.b("ReactNative", reactPackage.getClass().getSimpleName() + " is not a LazyReactPackage, falling back to old version.");
        return new a(reactPackage.createNativeModules(reactApplicationContext));
    }
}

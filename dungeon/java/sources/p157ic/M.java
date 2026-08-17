package p157ic;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import expo.modules.kotlin.types.folly.FollyDynamicExtensionConverter;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.Collection;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p103fc.c;
import p139hc.i;

/* JADX INFO: loaded from: classes2.dex */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final M f43874a = new M();

    public interface a {
        WritableArray a();

        WritableMap b();
    }

    public static final class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f43875a = new b();

        private b() {
        }

        @Override // ic.M.a
        public WritableArray a() {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            Intrinsics.checkNotNullExpressionValue(writableArrayCreateArray, "createArray(...)");
            return writableArrayCreateArray;
        }

        @Override // ic.M.a
        public WritableMap b() {
            WritableMap writableMapCreateMap = Arguments.createMap();
            Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
            return writableMapCreateMap;
        }
    }

    private M() {
    }

    public static /* synthetic */ Object b(M m10, Object obj, a aVar, boolean z10, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            aVar = b.f43875a;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return m10.a(obj, aVar, z10);
    }

    public static /* synthetic */ Object d(M m10, Object obj, a aVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            aVar = b.f43875a;
        }
        return m10.c(obj, aVar);
    }

    public final Object a(Object obj, a containerProvider, boolean z10) {
        Intrinsics.checkNotNullParameter(containerProvider, "containerProvider");
        if (obj == null || (obj instanceof Unit)) {
            return null;
        }
        if (obj instanceof Bundle) {
            return N.k((Bundle) obj, containerProvider);
        }
        if (obj instanceof Object[]) {
            return N.i((Object[]) obj, containerProvider);
        }
        if ((obj instanceof int[]) || (obj instanceof float[]) || (obj instanceof double[]) || (obj instanceof boolean[]) || (obj instanceof long[])) {
            return obj;
        }
        if (obj instanceof byte[]) {
            return FollyDynamicExtensionConverter.INSTANCE.put(obj);
        }
        if (obj instanceof Map) {
            return z10 ? N.u((Map) obj) : N.m((Map) obj, containerProvider);
        }
        if (obj instanceof Enum) {
            return N.n((Enum) obj);
        }
        if (obj instanceof c) {
            return N.l((c) obj, containerProvider);
        }
        if (obj instanceof URI) {
            return N.q((URI) obj);
        }
        if (obj instanceof URL) {
            return N.r((URL) obj);
        }
        if (obj instanceof Uri) {
            return N.o((Uri) obj);
        }
        if (obj instanceof File) {
            return N.p((File) obj);
        }
        if (obj instanceof Pair) {
            return N.d((Pair) obj, containerProvider);
        }
        if (obj instanceof Long) {
            return Double.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof kotlin.time.a) {
            return Double.valueOf(kotlin.time.a.O(((kotlin.time.a) obj).S(), p070df.b.SECONDS));
        }
        if (obj instanceof i) {
            return ((i) obj).a();
        }
        if (obj instanceof Collection) {
            return z10 ? N.s((Collection) obj) : N.c((Collection) obj, containerProvider);
        }
        return obj;
    }

    public final Object c(Object obj, a containerProvider) {
        Intrinsics.checkNotNullParameter(containerProvider, "containerProvider");
        if (obj == null || (obj instanceof Unit)) {
            return null;
        }
        if (obj instanceof Bundle) {
            return N.k((Bundle) obj, containerProvider);
        }
        if (obj instanceof Object[]) {
            return N.i((Object[]) obj, containerProvider);
        }
        if (obj instanceof int[]) {
            return N.g((int[]) obj, containerProvider);
        }
        if (obj instanceof long[]) {
            return N.h((long[]) obj, containerProvider);
        }
        if (obj instanceof float[]) {
            return N.f((float[]) obj, containerProvider);
        }
        if (obj instanceof double[]) {
            return N.e((double[]) obj, containerProvider);
        }
        if (obj instanceof boolean[]) {
            return N.j((boolean[]) obj, containerProvider);
        }
        if (obj instanceof byte[]) {
            return FollyDynamicExtensionConverter.INSTANCE.put(obj);
        }
        if (obj instanceof Map) {
            return N.m((Map) obj, containerProvider);
        }
        if (obj instanceof Enum) {
            return N.n((Enum) obj);
        }
        if (obj instanceof c) {
            return N.l((c) obj, containerProvider);
        }
        if (obj instanceof URI) {
            return N.q((URI) obj);
        }
        if (obj instanceof URL) {
            return N.r((URL) obj);
        }
        if (obj instanceof Uri) {
            return N.o((Uri) obj);
        }
        if (obj instanceof File) {
            return N.p((File) obj);
        }
        if (obj instanceof Pair) {
            return N.d((Pair) obj, containerProvider);
        }
        if (obj instanceof Long) {
            return Double.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof kotlin.time.a) {
            return Double.valueOf(kotlin.time.a.O(((kotlin.time.a) obj).S(), p070df.b.SECONDS));
        }
        if (obj instanceof i) {
            return ((i) obj).a();
        }
        return obj instanceof Collection ? N.c((Collection) obj, containerProvider) : obj;
    }
}

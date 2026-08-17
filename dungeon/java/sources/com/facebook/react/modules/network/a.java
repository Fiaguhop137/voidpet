package com.facebook.react.modules.network;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0384a f29964a = new C0384a(null);

    /* JADX INFO: renamed from: com.facebook.react.modules.network.a$a, reason: collision with other inner class name */
    public static final class C0384a {
        private C0384a() {
        }

        public /* synthetic */ C0384a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            StringBuilder sb2 = new StringBuilder(name.length());
            int length = name.length();
            boolean z10 = false;
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = name.charAt(i10);
                if (Intrinsics.e(cCharAt, 32) <= 0 || Intrinsics.e(cCharAt, 127) >= 0) {
                    z10 = true;
                } else {
                    sb2.append(cCharAt);
                }
            }
            if (!z10) {
                return name;
            }
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
    }
}

package com.facebook.react.uimanager;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class F extends C2275s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f30180b = new a(null);

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        p348t6.b.a("NoSuchNativeViewException", p348t6.a.ERROR);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(String detailMessage) {
        super(detailMessage);
        Intrinsics.checkNotNullParameter(detailMessage, "detailMessage");
    }
}

package io.sentry.android.replay;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p450z0.A;

/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f45561a = new t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final A f45562b = new A("SentryPrivacy", a.f45564a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f45563c = A.f58219e;

    static final class a extends kotlin.jvm.internal.o implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f45564a = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, String str2) {
            Intrinsics.checkNotNullParameter(str2, "<anonymous parameter 1>");
            return str;
        }
    }

    private t() {
    }

    public final A a() {
        return f45562b;
    }
}

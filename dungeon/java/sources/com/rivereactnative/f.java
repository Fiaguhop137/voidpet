package com.rivereactnative;

import app.rive.runtime.kotlin.core.Loop;
import java.util.NoSuchElementException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public enum f {
    OneShot("oneShot"),
    Loop("loop"),
    PingPong("pingPong"),
    Auto("auto");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38709a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f38708h = Gd.a.a(e());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f38702b = new a(null);

    public static final class a {

        /* JADX INFO: renamed from: com.rivereactnative.f$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0425a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f38710a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f38711b;

            static {
                int[] iArr = new int[Loop.values().length];
                try {
                    iArr[Loop.ONESHOT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Loop.LOOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Loop.PINGPONG.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Loop.AUTO.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f38710a = iArr;
                int[] iArr2 = new int[f.values().length];
                try {
                    iArr2[f.OneShot.ordinal()] = 1;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[f.Loop.ordinal()] = 2;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[f.PingPong.ordinal()] = 3;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr2[f.Auto.ordinal()] = 4;
                } catch (NoSuchFieldError unused8) {
                }
                f38711b = iArr2;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(Loop riveLoopMode) {
            Intrinsics.checkNotNullParameter(riveLoopMode, "riveLoopMode");
            int i10 = C0425a.f38710a[riveLoopMode.ordinal()];
            if (i10 == 1) {
                return f.OneShot;
            }
            if (i10 == 2) {
                return f.Loop;
            }
            if (i10 == 3) {
                return f.PingPong;
            }
            if (i10 == 4) {
                return f.Auto;
            }
            throw new Ad.n();
        }

        public final f b(String loopMode) {
            Intrinsics.checkNotNullParameter(loopMode, "loopMode");
            for (f fVar : f.values()) {
                if (Intrinsics.b(fVar.toString(), loopMode)) {
                    return f.valueOf(fVar.name());
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }

        public final Loop c(f rnLoopMode) {
            Intrinsics.checkNotNullParameter(rnLoopMode, "rnLoopMode");
            int i10 = C0425a.f38711b[rnLoopMode.ordinal()];
            if (i10 == 1) {
                return Loop.ONESHOT;
            }
            if (i10 == 2) {
                return Loop.LOOP;
            }
            if (i10 == 3) {
                return Loop.PINGPONG;
            }
            if (i10 == 4) {
                return Loop.AUTO;
            }
            throw new Ad.n();
        }
    }

    f(String str) {
        this.f38709a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f38709a;
    }
}

package com.rivereactnative;

import app.rive.runtime.kotlin.core.Direction;
import java.util.NoSuchElementException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public enum d {
    Backwards("backwards"),
    Auto("auto"),
    Forwards("forwards");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38687a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f38686g = Gd.a.a(e());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f38681b = new a(null);

    public static final class a {

        /* JADX INFO: renamed from: com.rivereactnative.d$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0423a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f38688a;

            static {
                int[] iArr = new int[d.values().length];
                try {
                    iArr[d.Backwards.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[d.Auto.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[d.Forwards.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f38688a = iArr;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a(String direction) {
            Intrinsics.checkNotNullParameter(direction, "direction");
            for (d dVar : d.values()) {
                if (Intrinsics.b(dVar.toString(), direction)) {
                    return d.valueOf(dVar.name());
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }

        public final Direction b(d rnDirection) {
            Intrinsics.checkNotNullParameter(rnDirection, "rnDirection");
            int i10 = C0423a.f38688a[rnDirection.ordinal()];
            if (i10 == 1) {
                return Direction.BACKWARDS;
            }
            if (i10 == 2) {
                return Direction.AUTO;
            }
            if (i10 == 3) {
                return Direction.FORWARDS;
            }
            throw new Ad.n();
        }
    }

    d(String str) {
        this.f38687a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f38687a;
    }
}

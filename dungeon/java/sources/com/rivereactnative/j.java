package com.rivereactnative;

import app.rive.runtime.kotlin.core.RendererType;
import java.util.NoSuchElementException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public enum j {
    Rive("rive"),
    Canvas("canvas");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38744a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f38743f = Gd.a.a(e());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f38739b = new a(null);

    public static final class a {

        /* JADX INFO: renamed from: com.rivereactnative.j$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0426a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f38745a;

            static {
                int[] iArr = new int[j.values().length];
                try {
                    iArr[j.Rive.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[j.Canvas.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f38745a = iArr;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j a(String rendererType) {
            Intrinsics.checkNotNullParameter(rendererType, "rendererType");
            for (j jVar : j.values()) {
                if (Intrinsics.b(jVar.f38744a, rendererType)) {
                    return jVar;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }

        public final RendererType b(j rnRendererType) {
            Intrinsics.checkNotNullParameter(rnRendererType, "rnRendererType");
            int i10 = C0426a.f38745a[rnRendererType.ordinal()];
            if (i10 == 1) {
                return RendererType.Rive;
            }
            if (i10 == 2) {
                return RendererType.Canvas;
            }
            throw new Ad.n();
        }
    }

    j(String str) {
        this.f38744a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f38744a;
    }
}

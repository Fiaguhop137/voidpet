package com.rivereactnative;

import java.util.NoSuchElementException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public enum g {
    Number("number"),
    String("string"),
    Boolean("boolean"),
    Color("color"),
    Trigger("trigger"),
    Enum("enum");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38721a;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f38720j = Gd.a.a(e());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f38712b = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a(String propertyType) {
            Intrinsics.checkNotNullParameter(propertyType, "propertyType");
            for (g gVar : g.g()) {
                if (Intrinsics.b(gVar.toString(), propertyType)) {
                    return g.valueOf(gVar.name());
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    g(String str) {
        this.f38721a = str;
    }

    public static EnumEntries g() {
        return f38720j;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f38721a;
    }
}

package com.facebook.react.uimanager.events;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public enum x {
    START("topTouchStart"),
    END("topTouchEnd"),
    MOVE("topTouchMove"),
    CANCEL("topTouchCancel");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30495a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f30494h = Gd.a.a(e());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f30488b = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(x type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return type.g();
        }
    }

    x(String str) {
        this.f30495a = str;
    }

    public final String g() {
        return this.f30495a;
    }
}

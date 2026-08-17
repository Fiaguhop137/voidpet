package p015ae;

import Gd.a;
import kotlin.enums.EnumEntries;

/* JADX INFO: renamed from: ae.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC1792f {
    CLASS("class"),
    INTERFACE("interface"),
    ENUM_CLASS("enum class"),
    ENUM_ENTRY(null),
    ANNOTATION_CLASS("annotation class"),
    OBJECT("object");


    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f19725i = a.a(e());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19726a;

    EnumC1792f(String str) {
        this.f19726a = str;
    }

    public final boolean g() {
        return this == OBJECT || this == ENUM_ENTRY;
    }
}

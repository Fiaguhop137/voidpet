package p176je;

import Gd.a;
import kotlin.enums.EnumEntries;

/* JADX INFO: renamed from: je.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC3872c {
    METHOD_RETURN_TYPE("METHOD"),
    VALUE_PARAMETER("PARAMETER"),
    FIELD("FIELD"),
    TYPE_USE("TYPE_USE"),
    TYPE_PARAMETER_BOUNDS("TYPE_USE"),
    TYPE_PARAMETER("TYPE_PARAMETER");


    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f47342i = a.a(e());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f47343a;

    EnumC3872c(String str) {
        this.f47343a = str;
    }

    public final String g() {
        return this.f47343a;
    }
}

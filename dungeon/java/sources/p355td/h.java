package p355td;

import Gd.a;
import kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes3.dex */
public enum h {
    Idle("idle"),
    Checking("checking"),
    Downloading("downloading"),
    Restarting("restarting");


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f54680g = a.a(e());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f54681a;

    h(String str) {
        this.f54681a = str;
    }

    public static EnumEntries g() {
        return f54680g;
    }
}

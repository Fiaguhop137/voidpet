package p265od;

import Gd.a;
import kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes3.dex */
public enum b {
    None("None"),
    NoUpdatesAvailable("NoUpdatesAvailable"),
    UpdateAssetsNotAvailable("UpdateAssetsNotAvailable"),
    UpdateServerUnreachable("UpdateServerUnreachable"),
    UpdateHasInvalidSignature("UpdateHasInvalidSignature"),
    UpdateCodeSigningError("UpdateCodeSigningError"),
    UpdateFailedToLoad("UpdateFailedToLoad"),
    AssetsFailedToLoad("AssetsFailedToLoad"),
    JSRuntimeError("JSRuntimeError"),
    InitializationError("InitializationError"),
    Unknown("Unknown");


    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f50574n = a.a(e());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f50575a;

    b(String str) {
        this.f50575a = str;
    }

    public final String g() {
        return this.f50575a;
    }
}

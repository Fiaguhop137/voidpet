package p389vb;

import Gd.a;
import kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes2.dex */
public enum p {
    INITIALIZED(0),
    STARTED(1),
    RESPONSE_RECEIVED(2),
    BODY_COMPLETED(3),
    BODY_STREAMING_STARTED(4),
    BODY_STREAMING_CANCELED(5),
    ERROR_RECEIVED(6);


    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f56337j = a.a(e());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f56338a;

    p(int i10) {
        this.f56338a = i10;
    }

    public final int g() {
        return this.f56338a;
    }
}
